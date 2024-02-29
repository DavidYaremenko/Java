package Collection;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListCollection { // LinkedList имеет такие же методы как и arrayList. в основе линкеда лежит не
									// массив, а цепочка. елементы связаны друг с дургом
	// Linkedlist - это звенья одной цепочки. Эти елементы хранят определенные
	// данные, а так же ссылки на предыдущий и следующие елементы.
// Послдений и первый елемент в листе имеет ссылку на null, так он понимает что это конец и начало листа
	// Если на нужен елемент под индексом 100 в списке с 500 елементами - лист будет
	// проходить через каждый елемент так как они связаны цепочкой а это нагрузка на
	// память
	// Разница в том что линкедлист быстрее вставляет новые елементы чем эррэйлист в массив. Но если нужно получить елемент(метод get) то тут быстрее работает эрэйлист и лучше использовать его
	// Если в проекте нужно постоянно получать елемент(get) - нужен arrayList, если нужно добавлять и удалять часто - LinkedList будет лучше
	
	public static void main(String[] args) {

		Student2 st1 = new Student2("John", 21);
		Student2 st2 = new Student2("Tesla", 21);
		Student2 st3 = new Student2("Sofa", 21);
		Student2 st4 = new Student2("Brad", 21);
		Student2 st5 = new Student2("Silvia", 21);

		LinkedList<Student2> linkedList = new LinkedList<>();

		linkedList.add(st1);
		linkedList.add(st2);
		linkedList.add(st3);
		linkedList.add(st4);
		linkedList.add(st5);

		System.out.println("LinkedList = " + linkedList);

		System.out.println(linkedList.get(3));

		Student2 st6 = new Student2("Pito", 21);
		Student2 st7 = new Student2("Olivia", 21);

		linkedList.add(st6); // так добавиться елемент в конец

		System.out.println("LinkedList = " + linkedList);

		linkedList.add(1, st7); // тут мы уже указали ему под каким индексом стать

		System.out.println("LinkedList = " + linkedList);
		
		linkedList.remove(6); // при удалении елемента соседние начнут ссылаться друг на друга. Елемент остается в памяти но исчезает из цепочки
		
		System.out.println("LinkedList = " + linkedList);
	}

}

class Student2 {
	String name;
	int course;

	public Student2(String name, int course) {
		this.name = name;
		this.course = course;
	}

	@Override
	public String toString() { // опять таки переопределелил для вывода в виде строки
		return "Strudent2 [name = " + name + ", course = " + course + "]";
	}

}
