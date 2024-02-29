package Map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap1 { // Элементами TreeMap являются пары ключ/значение. В TreeMap елементы хранятся в
						// ОТСОРТИРОВАННОМ по возрастанию порядке. Сортировка идет по ключу
// в основе ТриМап лежит красно-черное дерево что позволяет методам работать быстро но не быстрее чем методы ХэшМап
	// Ключи должны быть уникальны а значение повторяться
	// Для сравнение обьектов ключа в тримап не нужно переопределять методы
	// hashCode/equals, потому что все операции идут через метод compareTo, но при
	// работе с значениями это не подходит нужно переопределять НО ЛУЧШЕ ВСЕГДА
	// ПЕРЕОПРЕДЕЛЯТЬ!!!!
	public static void main(String[] args) {

		TreeMap<Double, Student> treeMap = new TreeMap<>();

		Student st1 = new Student("John", "Weeck", 3);
		Student st2 = new Student("John", "Wabovski", 2);
		Student st3 = new Student("Cillian", "Broke", 4);
		Student st4 = new Student("Cillian", "Broke", 4);
		Student st5 = new Student("Tomy", "Broke", 5);
		Student st6 = new Student("Tomy", "Broke", 5); // добавив студента с дублированием предыдущего мы получим двух
														// разных студнтов но только если ключи разные

		treeMap.put(8.9, st1);
		treeMap.put(6.7, st3);
		treeMap.put(5.6, st5);
		treeMap.put(3.2, st2);
		treeMap.put(4.8, st4);
		treeMap.put(6.0, st6);

		System.out.println(treeMap);

		System.out.println(treeMap.get(8.9)); // get позволяет получить елемент по ключу

		treeMap.remove(6.0); // удаляем елемент по ключу

		System.out.println(treeMap);

		System.out.println(treeMap.descendingMap()); // descendingMap метод позволяет выводить елементы по убыванию а не
														// по возрастанию как идет по умолчанию в тримап

		System.out.println(treeMap.tailMap(5.6)); // tailMap выводит часть ключей елементов которые больше указанного
													// ключа (5.6)

		System.out.println(treeMap.headMap(5.6)); // headMap выводит часть ключей елементов которые меньше указанного
													// ключа (5.6)

		System.out.println(treeMap.lastEntry()); // lastEntry выводит последний елемент коллекции

		System.out.println(treeMap.firstKey()); // firstEntry выводит первый елемент коллекции

		TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() { // если нужно передать елементы в
																						// виде ключа - можно
																						// использовать такой метод
			public int compare(Student o1, Student o2) {
				return 0;
			}
		});

	}

}
