package Collection;

import java.util.ArrayList;
import java.util.List;

public class MethodArray5 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("John");
		arrayList.add("Sofa");
		arrayList.add("Constantin");
		arrayList.add("Kolin");
		
		System.out.println(arrayList);
		
		//subList - метод берет несколько елементов и является представлением! листа и после его создания все изменения должны делаться через subList, иначе если делать через лист - будет ошибка
		
		List<String> myList = arrayList.subList(0, 2); // 0 - первый елемент, 2 - последний елемент но не включительно
		
		System.out.println(myList);
		
		// toArray - метод позволяет сделать из листа массив класса Object
		
		ArrayList<String> arrayList2 = new ArrayList<>();

		arrayList2.add("John");
		arrayList2.add("Sofa");
		arrayList2.add("Constantin");
		arrayList2.add("Kolin");
		
		Object [] array = arrayList2.toArray(); // создает массив обьектов
		
		String [] array2 = arrayList2.toArray(new String[0]); // так метод может создать массив строк а не обьектов что позволит их вівести на єкран
// если указать количество елементов меньше чем в листе - джава сама создаст массив на все елементы. Можно писать просто 0 и не думать о размере массива
		
		for(String s : array2) { 
			
			System.out.println(s);
		}
		
	}

}
