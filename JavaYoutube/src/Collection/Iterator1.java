package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 { // аналог forEach но позволяет удалять елементы внутри итераций

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("John");
		arrayList.add("Sofa");
		arrayList.add("Constantin");

		Iterator<String> iterator = arrayList.iterator();
		while (iterator.hasNext()) { // hasNext провреяет есть ли елемент 
			System.out.println(iterator.next()); // next срабатывает после того как hasNext его нашел и выводит его

		}
		// как удалить
		while (iterator.hasNext()) { // hasNext провреяет есть ли елемент
			iterator.next(); // next срабатывает после того как hasNext его нашел
			iterator.remove(); // удаляет этот елемент
		}
		
		System.out.println(arrayList);

	}
}
