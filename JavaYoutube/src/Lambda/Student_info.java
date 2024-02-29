package Lambda;

import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Collections;

import org.w3c.dom.ls.LSOutput;

public class Student_info { // ИЩИ ПО ЦИФРАМ

	public static void main(String[] args) {

		Student st1 = new Student("John", 'M', 25, 4, 5.5);
		Student st2 = new Student("Lili", 'F', 19, 3, 7.4);
		Student st3 = new Student("Brad", 'M', 21, 4, 4.8);
		Student st4 = new Student("Sofi", 'F', 23, 3, 5.1);
		Student st5 = new Student("Jensen", 'M', 30, 5, 8.0);

		ArrayList<Student> st = new ArrayList<Student>();

		st.add(st1);
		st.add(st2);
		st.add(st3);
		st.add(st4);
		st.add(st5);

		Student_info info = new Student_info();
		
		Collections.sort(st, (stt1, stt2) -> st1.course - st2.course); // переопределили метод compare для сортировки студентов от меньшего курса к большему 

		info.testStudents(st, new CheckOverGrade()); // вызываем метод,передаем
		// студентов и обьект класса CheckOverGrade
		// для того чтобы метод check работал
		System.out.println("-------------------- ");
//3. ПРАВИЛЬНЫЙ ВАРИАНТ С ПОМОЩЬЮ анонимного класса
		info.testStudents(st, new StudentChecks() { // передаем студентов и сам интерфейс

			@Override
			public boolean check(Student s) { // так дает возможность и удобство указывать каждый раз критерии
												// сортировки, но анонимные классы мы можем использовать оидн раз

				return s.age < 30;
			}
		});

		System.out.println("-------------------- ");

//4. ЛУЧШИЙ ВАРИАНТ С Lambda выражением - это функциональный подход. По сути это метод, который не имеет названия, но может принимать параметры и имеет тело метода
		info.testStudents(st, (Student s) -> {
			return s.age < 30;
		}); // (Student s) -> {r eturn s.age < 30;} это короткая запись метода ВЫШЕ,
			// занимает меньше строк и удобнее

		info.testStudents(st, s -> s.age < 30); // второй вариант записи кода сверху, но еще короче

		System.out.println("-------------------- ");
		info.testStudents(st, (Student s) -> {
			return s.avgGrade < 8;
		});
		System.out.println("-------------------- ");
		info.testStudents(st, (Student s) -> {
			return s.age > 19 && s.avgGrade < 8 && s.sex == 'M';
		});

		StudentChecks sc = (Student s) -> {
			return s.age < 30;
		}; // третий вариант записи лямбды. Мы сразу присваем переменной выражение. Плюс в
			// таком присвоении что можем использовать много раз, а не только один
		info.testStudents(st, sc); // так мы вызываем лямбду выше которая

//		info.printStudentOverGrade(st, 5.1); 
//		System.out.println();
//		info.printStudentOverAge(st, 30);
//		System.out.println( );
//		info.printStudentMixCondition(st, 20, 5.5, 'F');

	}

//////////////////////////////////////////////////////////////////// переданный лист  // обьект который имплементирует интерфейс studentChecks
	void testStudents(ArrayList<Student> al, StudentChecks sc) { // ArrayList<Student> al, StudentChecks sc

		for (Student s : al) {
			if (sc.check(s)) { // на обьекте StudentChecks вызываем метод check и передаем в его параметры
								// студентов
				System.out.println(s); // метод проверяет, есть ли студенты с балом выше 6 и если да, возраващает ТРУ и
										// выводит их, если нет возвращает ФОЛС и не выводит
			}
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// 1. ЭТО ИЗНАЧАЛЬНЫЙ ВАРИАНТ СОРТИРОВАКИ СТУДЕНТОВ, ВЫШЕ С ПОМОЩЬЮ ИНТЕРФЕЙСА
//	void printStudentOverGrade(ArrayList<Student> al, double grade) { // создаем метод для сортировки студентов по
//																		// баллам.
//
//		for (Student s : al) { // испоьзуем фор ич чтобы поместить лист в переменную
//			if (s.avgGrade > grade) { // если заданный балл студента выше который мы передаем в методе
//				System.out.println(s);// выведи на экран тех студентов у кого он выше указанного
//			}
//		}
//
//	}
//
//	void printStudentOverAge(ArrayList<Student> al, int age) { // метод для сортировки по возрасту
//
//		for (Student s : al) {
//			if (s.age < age) { // выведи стулентов у которых возраст меньше чем мы передали в метод
//				System.out.println(s);
//			}
//		}
//
//	}
//
//	void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//
//		for (Student s : al) {
//			if (s.age > age && s.avgGrade < grade && s.sex == sex) { // выведи тех студентов кто старше указанного в
//																		// методе возраста, у кого меньше балл
//																		// указанного и кто относится к указанному полу
//																		// переданному в метод
//				System.out.println(s);
//			}
//		}
//
//	}

}

// 2. ВТОРОЙ ВАРИАНТ, НО ТОЖЕ НЕ ПРАВИЛЬНО ПОТОМУ ЧТО СОРТИРОВКА ТОЛЬКО ПОСЛЕ : И ПОТОМ ВОЗВРАЩАТЬСЯ К ЭТОМУ НЕ УДобНО
interface StudentChecks { // создали интерфес который содержит сигнатуру метода для проверки студента
	boolean check(Student s); // Для лямбды нужен только один абстакртный метод, чтобы она работала. Если в
								// интерфейсе больше 1 метода - лямбда работать не будет
}

class CheckOverGrade implements StudentChecks { // класс который будет реализовывать метод из интерфейса

	@Override
	public boolean check(Student s) {
		return s.avgGrade > 6; // указываем выше какой оценки нужно вывести студентов. НО ТАК ДЕЛАТЬ ТОЖЕ НЕ
								// ПРАВИЛЬНО
	}

}
