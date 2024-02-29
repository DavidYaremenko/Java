package Set_interface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 { // TreeSet хранит элементы в отсортированном по возрастанию порядке. В основе
						// ТриСет лежит ТриМап. Элемент ТриСет - это ключи в ТриМап, а значение -
						// заглушка. Не хранит дубликаты. В основе лежит красно-черное дерево.

	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(5);
		set.add(1);
		set.add(20);
		set.add(14);
		set.add(8);
		//set.add(null); null в treeset не хранится 
		
		set.remove(1); // удаляем
		
		set.contains(20); // проверяем есть ли елемент
		// в трисет все методы что и в сет
		
		System.out.println(set);

	}

}
