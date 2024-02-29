package Stream_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.lang.model.element.Element;

public class Stream_filter { // метод filtr - фильтрует елементы по заданным параметрам

	public static void main(String[] args) {

		Student st1 = new Student("John", 'M', 25, 4, 5.5);
		Student st2 = new Student("Lili", 'F', 19, 3, 7.4);
		Student st3 = new Student("Brad", 'M', 21, 4, 4.8);
		Student st4 = new Student("Sofi", 'F', 23, 3, 5.1);
		Student st5 = new Student("Jensen", 'M', 30, 5, 8.0);

		List<Student> st = new ArrayList<Student>();

		st.add(st1);
		st.add(st2);
		st.add(st3);
		st.add(st4);
		st.add(st5);

		st = st.stream().filter(Element -> Element.getAge() > 21 && Element.getAvgGrade() < 7.4)
				.collect(Collectors.toList() ); // фильтурем у кого возраст
		// больше 21 вывести и
		// вывести у кого балл
		// меньше 7.4. filter
		// возращает СТРИМ с
		// отсортированными
		// студентами
		System.out.println(st);
		
		// Пример создания стрима с нуля
		Stream<Student> stream = Stream.of(st1,st2,st3,st4,st5); //создаем стрим и добавляем стуентов из листа
		
		stream.filter(Element -> Element.getAge() > 21 && Element.getAvgGrade() < 7.4)
		.collect(Collectors.toList() ); // применяем метод из выше. ТАкой вариант редко испольщуется

	}

}

class Student {

	private String name;
	private char sex;
	private int age;
	private int course;
	private double avgGrade;

	public Student(String name, char sex, int age, int course, double avgGrade) {

		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
		this.setCourse(course);
		this.setAvgGrade(avgGrade);
	}

	@Override
	public String toString() {
		return "Student [name=" + getName() + ", sex=" + getSex() + ", age=" + getAge() + ", course=" + getCourse()
				+ ", avgGrade=" + getAvgGrade() + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public void setAvgGrade(double avgGrade) {
		this.avgGrade = avgGrade;
	}

	public String getName() {
		return name;
	}

	public char getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

	public int getCourse() {
		return course;
	}

	public double getAvgGrade() {
		return avgGrade;
	}

}