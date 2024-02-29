package Collection;

import java.util.ArrayList;
import java.util.Objects;

public class MethodsArray2 {

	public static void main(String[] args) {
		
		Student st1 = new Student("John", 'm', 20, 2, 5.5);
		Student st2 = new Student("Maria", 'f', 25, 4, 7.5);
		Student st3 = new Student("Bordy", 'm', 21, 2, 4.5);
		Student st4 = new Student("Rim", 'm', 21, 3, 6.5);
		Student st5 = new Student("Helen", 'f', 20, 2, 2.5);
		
		ArrayList<Student> studentList = new ArrayList(); // помещаем в лист студентов
		studentList.add(st1);
		studentList.add(st2);
		studentList.add(st3);
		studentList.add(st4);
		studentList.add(st5);

		System.out.println(studentList);
		
		Student st6 = new Student("Maria", 'f', 25, 4, 7.5);
		
		//studentList.remove(st6); // пытаясь удалить мы не сможем этого сделать потому что ст5 и ст6 ссылаются на разные обьекты в памяти и чтобы удалить нужно переопределитть метод equels в классе student
		
		int index = studentList.indexOf(st6); // indexOf позволяет узнать под каким индексом находится ст6 в листе.Он смотрит по обьекту. Метод иквелс для работы нужно переопределять
		
		System.out.println(studentList);
		System.out.println(index); // находится под  ндекс 1 потому что инфа такая же как и в ст2
	}

}

class Student {
	
	private String name;
	private char sex;
	private int age;
	private int course;
	private double avgGrade;
	
	public Student(String name, char sex, int age, int course, double avgGrade) { // создаем конструктор
		
		this.name = name; // зис для доступа к приватным полям
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
		
	}
	
	public String toString() { // переопрелеляем тустринг для того чтобы все вывелось в строке
		
		return "Student(" +
		        "name = "  + name + '\'' +
		        ", sex = "+ sex +
		        ", age = "+ age +
		        ", course = " + course +
		        ", avgGrade = " + avgGrade +
		        ")";
		
	} 

	@Override
	public boolean equals(Object obj) { // переопределенный метод сформирован самими еклипсом. В методе просто приравниваются все поля и они сравниваеются. теперь если в разных обьектах будут одинаково заполнены поля - метод remove будет работать
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Double.doubleToLongBits(avgGrade) == Double.doubleToLongBits(other.avgGrade)
				&& course == other.course && Objects.equals(name, other.name) && sex == other.sex;
	}
}