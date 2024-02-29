package Map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 { // Элементами HashMap являются пары ключ/значение. HashMap не запоминает порядок добавления елементов и его методы работают очень быстро
    // Когда нет необходимости хранить пары в ключ/значение в отсортированном виде - хэшмап отлично подходит
// Ключи ДОЛЖНЫ быть уникальными, а значение может повторяться. так же они могут содержать null
	public static void main(String[] args) {
		
		Map<Integer, String> map1 = new HashMap<>(); // <ключ, значение> так создаем hashmap
		
		map1.put(245768, "Joshua"); // метод put(ключ, значение) добавляет елемент
		map1.put(243432, "Kira");
		map1.put(567754, "Pedro");
		map1.put(345632, "Tim");
		map1.put(345632, "Tom"); // если добавить елемент с одинаковым ключом - одино из одинаковых значений удалится и останется одно
		map1.put(null, "Tom");
		map1.put(123232, null);
		map1.putIfAbsent(567754, "Pedro"); // метод putIfAbsent добавляет елемент если такого еще нет. проверяет ключ/значение
		
		System.out.println(map1);
		System.out.println(map1.get(245768)); // get выводит елемент по ключу
		
		map1.remove(345632); // remove удаляет по ключу
		
		System.out.println(map1);
		
		System.out.println(map1.containsValue("Kira")); //containsValue возвращает true если есть елемент с указанным значением
		System.out.println(map1.containsKey(245768));//containsKey возвращает true если есть елемент с указанным ключом
		
		System.out.println(map1.keySet()); // keySet выводит все ключи которые есть в хэшмапе
		System.out.println(map1.values()); // values выводит все значения которые есть в хэшмапе
		
		Map<String, String> map2 = new HashMap<>(); // КЛЮЧ/ЗНАЧЕНИЕ могут быть одинакового типа
		map2.put("John", "Weeck");
		
		System.out.println(map2);
	}

}
