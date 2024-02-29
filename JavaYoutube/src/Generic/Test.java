package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// Java 5
		
		//List это интерфейс, ArrayList - это класс который реализует динамический массив который сам рассширятеся при добавлении элемнтов в него
		List animals = new ArrayList(); // пример создания коллекции. ArrayList хранит обьекты класса Object и поэтому придется делать нисходящее преобразование
		animals.add("cat"); // пример добавления обьекта в коллекцию
		animals.add("dog");
		animals.add("frog");
		
		String animal = (String) animals.get(1); // чтобы поместить обекты в String, нужно сделать Downcasting - добавить (String), потому что по умолчанию animals.get обращается к родителю
		System.out.println(animal);

		// С появлением Generic\ Параметризация классов
		List<String> animals2 = new ArrayList<String>(); // в <> мы указываем какой тип данних будет в динамическом массиве и после не нужно будет делать Downcasting, ДЖАВА понимает после <> какой тип данних будет храниться
		animals2.add("cat"); //в данном варианте м дали понять джаве что в листе находятся обьекты класса СТРИНГ благодаря дженерикам не нужно делать нисходящее преобр
		animals2.add("dog");
		animals2.add("frog");
		
		String animal2 = animals2.get(1);
		System.out.println(animal2);
		
		// Java 7 
		List<String> animals3 = new ArrayList<>();  // с 7 джави можно не указывать справа тип данных, достаточно указать только слева <String>
		animals3.add("cat");
		animals3.add("dog");
		animals3.add("frog");
		
		String animal3 = animals3.get(2);
		System.out.println(animal3);
		
	}

}
