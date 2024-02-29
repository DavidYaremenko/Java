package Lambda2_povtor;

import java.util.ArrayList;

public class LambdaStud {

	public static void main(String[] args) {

		Student2 st1 = new Student2("John", 'M', 25, 4, 5.5); // создаем обьекты класса студент2
		Student2 st2 = new Student2("Lili", 'F', 19, 3, 7.4);
		Student2 st3 = new Student2("Brad", 'M', 21, 4, 4.8);
		Student2 st4 = new Student2("Sofi", 'F', 23, 3, 5.1);
		Student2 st5 = new Student2("Jensen", 'M', 30, 5, 8.0);

		ArrayList<Student2> stud = new ArrayList<Student2>(); // создаем лист и указываем что в нем будут студенты

		stud.add(st1); // добавляем студентов в лист
		stud.add(st2);
		stud.add(st3);
		stud.add(st4);
		stud.add(st5);

		LambdaStud info = new LambdaStud(); // Это создает обьект нашего ГЛАВНОГО класса LambdaStud, на котором мы будем
											// вызывать метод testStudents и использовать ЛЯМБДУ

		info.testStudents(stud, (Student2 s) -> {
			return s.age < 30;
		}); // (Student2 s) -> {return s.age < 30;} это короткая запись этой ЛЯМБДЫ,
			// занимает меньше строк и удобнее

		info.testStudents(stud, s -> s.age < 30); // второй вариант записи кода сверху, но еще короче

		System.out.println("-------------------- ");
		info.testStudents(stud, (Student2 s) -> {
			return s.avgGrade < 8;
		});
		System.out.println("-------------------- ");
		info.testStudents(stud, (Student2 s) -> {
			return s.age > 19 && s.avgGrade < 8 && s.sex == 'M';
		});

		StudentChekInterface sc = (Student2 s) -> {
			return s.age < 30;
		}; // третий вариант записи лямбды. Мы сразу присваем переменной выражение. Плюс в
			// таком присвоении что можем использовать много раз, а не только один
		info.testStudents(stud, sc); // так мы вызываем лямбду выше которая

	}

	void testStudents(ArrayList<Student2> al, StudentChekInterface sc) { // ArrayList<Student2> al = указываем лист со
																			// студентами, StudentChekInterface sc - это
																			// создаем обьект который имплементриует
																			// интерфейс StudentChekInterface.
																			// Переменная al, sc - по сути в эти
																			// переменные передаем так раз таки лист и
																			// обьект интерфейса

		for (Student2 s : al) { // s - пустая переменная в которую записываем al - лист со студентами
			if (sc.check(s)) { // ЕСЛИ(тут мы вызываем обьект интерфейсаТОЧКАвызываем его метод check(в
								// параметры передаем наших студентов по которым он будет проверять и искать
								// студентов с баллом выше 6)
				System.out.println(s); // метод проверяет, есть ли студенты с балом выше 6 и если да, возраващает ТРУ и
										// выводит их, если нет возвращает ФОЛС и не выводит
			}
		}
	}

}
