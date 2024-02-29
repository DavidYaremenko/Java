package Set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSet1 { // LinkedHashSet - наследник HashSet, хранит информацию о порядке добавления
								// елементов.Производительность методов немного ниже, чем у HashSet.В его основе
								// лежит HashMap. у элементов данного hashMap ключи - елемент ЛинкедХэшСет, а
								// значение - заглушка. Он не запоминает порядок использования элементов как это делает LinkedHashMap

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
		lhs.add(5);
		lhs.add(2);
		lhs.add(7);
		lhs.add(12);
		
		System.out.println(lhs );

		lhs.remove(2); // удаляем
		
		System.out.println(lhs);
		
		System.out.println(lhs.contains(2)); // проверяем на наличие елмента
	}

}
