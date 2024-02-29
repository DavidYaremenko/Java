package Lambda;

public class Student {

	String name;
	char sex;
	int age;
	int course;
	double avgGrade;

	public Student(String name, char sex, int age, int course, double avgGrade) {

		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;

	}

	public String toString() {
		return "( Student - " + name + ", Sex - " + sex + ", Age - " + age + ", Course - " + course + ", AvgGrade - "
				+ avgGrade + " )";

	}

}
