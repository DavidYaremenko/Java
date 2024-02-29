package Set_interface;

import java.util.HashSet;
import java.util.Set;

public class Set1 { // Set - коллекция, хранящая уникальные елементы без дубликатов. Методы этой коллекции очень быстрые. Сет в основе содержит Мап, но не хранит пары ключ\значения, а только одно значние
	// Когда мы создаем HashSet - в его основе создается HashMap и для него значение помещенное в ХэшСет будет ключом, а в виде значения будет хранить константу, просто какую то заглушку
	// HashSet не запоминает порядок добавления елементов. Может содержать null
	// Методы equal and hashcode тоже нужно переопредлять
	// Set это множество

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("John"); // !!!Когда мы вызываем метод add - то внутри под капотом он вызывает метод put - который принадлежит HashMap
		set.add("Brad");
		set.add("Lili");
		set.add("Brauni"); 
		set.add("Brauni"); // При попытке создать дубликат, джава это видит и не создаст его
		set.add(null); 
		
		System.out.println(set); // классический вывод
 
		for(String s : set) { // вывод елементов через фор ич
			System.out.println(s);
		}
		
		set.remove("Brauni"); // удаляем елемент
		
		System.out.println(set);
		
		System.out.println(set.size()); // узнаем размер коллекции
		System.out.println(set.isEmpty()); // метод проверяет пустая ли коллекция. Вернет ТРУ если пустая, ФОЛС если в ней есть елементы
		System.out.println(set.contains("Lili")); // метод ищет елемент и вернет ТРУ - если есть, ФОЛС - если нет
		
		//System.out.println(set.get); // метода ГЕТ в СЕТЕ нет
	}

}
