package Queue_interface;

import java.security.PublicKey;
import java.util.Objects;
import java.util.PriorityQueue;

import javax.lang.model.element.NestingKind;

public class Priority_Queue2 {

	public static void main(String[] args) {
		
		Student st1 = new Student("John", 3);
		Student st2 = new Student("Lili", 5);
		Student st3 = new Student("Brad", 4);
		Student st4 = new Student("Lola", 1);
		Student st5 = new Student("Kyle", 6);
		
		PriorityQueue<Student> pq = new PriorityQueue<>();
		
		pq.add(st1);
		pq.add(st2);
		pq.add(st3);
		pq.add(st4);
		pq.add(st5);
		
		System.out.println(pq.peek());
		
	}

}

class Student implements Comparable<Student>{ // если бы не имплеминтировали - выкидывалась бы ошибка
	
	String name;
	int course;
	
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	public int compareTo(Student other) {
		return this.course - other.course; // рсавнивать будем по курсу. 
	}
	
	public String toString() {
		return "( Student - " + name + " at course " + course + " )";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(course); // переопределяем для сравниения
	}

	@Override
	public boolean equals(Object obj) { // переопределяем для сравниения
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course;
	}
	
	

}
