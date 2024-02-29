package Set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSet2 { // деревья работаю используя compareTo, поэтому обязательно должны
						// имплементировать COMPARABLE(смотри ниже в класс). Если это все не сделать -
						// вывести сет не получится

	public static void main(String[] args) {

		TreeSet<Student> st = new TreeSet<Student>();

		Student st1 = new Student("John", 4);
		Student st2 = new Student("Brad", 2);
		Student st3 = new Student("Lili", 3);
		Student st4 = new Student("Sofi", 5);
		Student st5 = new Student("Jensen", 2);

		Student st6 = new Student("Geek", 2);
		Student st7 = new Student("Kevin", 6);

		st.add(st1);
		st.add(st2);
		st.add(st3);
		st.add(st4);
		st.add(st5);

		System.out.println(st);

		System.out.println(st.first()); // метод firs выводит первый елемент сета. То есть по возрасанию и это будет
										// самый мелкий курс студента
		System.out.println(st.last()); // выведет последнего студента на старшем курсе
		System.out.println(st.headSet(st6)); // метод выведет елементы, которые учатся на ниже курсе чем ст6
		System.out.println(st.tailSet(st6)); // метод выведет елементы, которые учатся на выше курсе чем ст6 и его в том
												// числе
		System.out.println(st.subSet(st6, st7)); // метод выведет елементы, которые учатся на курсе ниже чем ст7 и выше
													// чем ст6(он включительно)

		System.out.println(st5.equals(st6)); // проверка переопределенного метода equal. если все ок - должно вернуть
												// ТРУ
		System.out.println(st5.hashCode() == st6.hashCode()); // проверка переопредеелнного метода хэшкод. Так как
																// сравнение идет только по курсу, должно вернуть ТРУ
																// потому что хжшкоды у студентов одинаковы в таком
																// случае

	}

}

class Student implements Comparable<Student> { //Имплементируем для того чтобы сортировать обьекты по порядку и сравнивать их. При имплементации сразу нужно переопределить метод compareTo.
	String name;
	int course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	@Override
	public int compareTo(Student other) { // пример переопределения чтобы сравнивать студентов по курсу

		return this.course - other.course;
	}

	@Override
	public String toString() { // для отображения все в строке
		return "Student [name=" + name + ", course=" + course + "]";
	}

	// ПРАВИЛО!!!!! Если в методе compareTo мы сравниваем по course - то в методах
	// equal and hashcode тоже мы должны сравнивать только поле course, поэтому поле
	// nаmе удаляем

	@Override
	public int hashCode() {
		return Objects.hash(course, name); // не удалил, чтобы ты понимал о чем речь
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course; // тут уже удалил
	}
}
