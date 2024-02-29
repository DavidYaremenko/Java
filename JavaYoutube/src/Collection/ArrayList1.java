package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 { // ArrayList - массив который может изменять свою длину. можно добавлять, удалять элементы. В основе листа оежит массив типа Object

	public static void main(String[] args) {
		
		ArrayList<String> arraylist1 = new ArrayList<>(); // Указав тип данных СТРИНГ в лист примитивы не поместишь. При создании листа создается массив типа обжект из 10 мест
		// Если все 10 ячеек заняты и мы хотим добавить еще - джава будет создавать новый массив, копировать все предыдущие данные в него и добавлять новые
		
		ArrayList<String> arraylist2 = new ArrayList<>(200); // указав ArrayList<>(200); мы просим джаву создать сразу 200 ячеек чтобы потом при добавлении данных меньше грузить под капотом и чтобы джава не копировала массивы в массив
		
		List<String> arraylist3 = new ArrayList<>(); // еще один вариант написания. Поттому лист List - интерфейс который имплементирует arrayList
		
		//Size list - то сколько элементов в листе. Capacity - на сколько ячеек создан лист
		
		arraylist1.add("John");
		arraylist1.add("Johny");
		arraylist1.add("Johnaaa");
		
		ArrayList<String> arraylist4 = new ArrayList<>(arraylist1); // так можно скопировать эелементы. Мы указываем ссылку на первы лист, но этот лист4 - новый обьект, он не ссылкается на лист1

		ArrayList arraylist5 = new ArrayList(); // если не указывать дженерики - в лист можем помещать все что угодно, потому что это массив класса Object который содержит в себе все классы. но делать так не желательно
		
		arraylist5.add("Admin"); // стринг
		arraylist5.add(20); // примитив
		arraylist5.add(new Car()); // обьект класса кар
		
		System.out.println(arraylist1);
		
		System.out.println(arraylist4);
	}

}

class Car{
	
}