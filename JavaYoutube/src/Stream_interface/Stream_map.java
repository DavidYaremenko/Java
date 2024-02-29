package Stream_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import javax.lang.model.element.Element;

public class Stream_map { // Stream - это последовательность елеиентов, поддержтвающих последовательные и
							// параллельные перации над ними. По сути это поток данных, которые содержит наш
							// массив или коллекция. Его методы не меняют коллекцию или массив.

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("privet");
		list.add("kak dela");
		list.add("ok");
		list.add("poka");

		// старый способ
		// for (int i = 0; i < list.size(); i++) { // пример кода чтобы вывести не
		// слова, а количество букв из которых
		// состоит каждое слово
		// list.set(i, String.valueOf(list.get(i).length()));
		// }
//------------------------------------------
		// способ с помощью Stream
		// вызвав метод stream на коллекции, мы создаем поток, в который передаем
		// елементы коллекции, и таким образом у нас уже stream содержит елементы, после
		// мы вызываем метод map(), он берет каждый елемент со стрима и сопоставляет ему
		// елемент который из него получается после тех действий, которые мы описываем в
		// map() с помощью лямбды выражения. Метод мап возвращает стрим(поток) поэтому мы
		// не можем результат чему то присвоить, потому что стрим - это поток

		list.stream().map(element -> element.length());// element - это каждый елемент коллекции. Мы узнаем так длину
														// каждого елемента

		List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList()); // .collect(Collectors.toList())
																											// - метод
																											// позволяет
																											// преобразовать
																											// поток в
																											// лист

		System.out.println(list2);

		// пример с массивом

		int[] array = { 5, 9, 8, 1 };
		array = Arrays.stream(array).map(element -> { // узнаем в лямбде делится ли число нацело на 3 и если да - делим
														// его три
			if (element % 3 == 0) {
				element = element / 3;
			}
			return element; // если нет - вернуть число обратно
		}).toArray(); // преобразовываем поток в массив

		System.out.println(Arrays.toString(array));

		// Пример с Set коллекцию

		Set<String> set = new TreeSet<String>();
		set.add("privet");
		set.add("kak dela");
		set.add("ok");
		set.add("poka");

		Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet()); // e - это елементы,
																							// переменная может
																							// называться по разному.
																							// Узнали длину слов и
																							// преобразовали поток в сет
		List<Integer> set3 = set.stream().map(e -> e.length()).collect(Collectors.toList()); // так же мы можем преобразовать поток сет в лист
		
		System.out.println(set2);
	}

}
