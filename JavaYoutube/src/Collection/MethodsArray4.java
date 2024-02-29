package Collection;

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsArray4 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("A");
		StringBuilder sb2 = new StringBuilder("B");
		StringBuilder sb3 = new StringBuilder("C");
		StringBuilder sb4 = new StringBuilder("D");
		
		StringBuilder [] array = { sb1, sb2, sb3, sb4}; // создаем массив стрингов и помещаем в него стринги
		
	    List<StringBuilder> list = Arrays.asList(array); // Arrays.asList(array) - метод позволяет создать из массива лист. Arrays - класс
//Длина листа всегда будет равна длине массива, изменится она уже не может. Все что меняется в массиве - автоматически меняется в листе
	    
	    System.out.println(list);
	    
	    array[0].append("!!!"); // добавили знаки после нулевого елемента
	    
	    System.out.println(list);
	    
	    array[0] = new StringBuilder("F"); // заменили нулевой елемент
	    
	    System.out.println(list);
	    
	    //Метод removeAll - удаляет елементы из листа указанные в параметрах
	    
	    ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("John");
		arrayList.add("Sofa");
		arrayList.add("Constantin");
		arrayList.add("Kolin");
		
		System.out.println(arrayList);
		
		ArrayList<String> arrayList2 = new ArrayList<>();

		arrayList2.add("John");
		arrayList2.add("Sofa");
		arrayList2.add("Constantin");
		
		arrayList.removeAll(arrayList2); // то есть если в двух листах есть одинаковые елементы - он удаляет их и осталвяет те которых нет
		arrayList.retainAll(arrayList2); // retainAll - такой же метод но делает наоборот
		
		System.out.println(arrayList);
		
		//метод containsAll - проверяет содержит ли лист1 елеенты лист2. Этот метод boolean
		
		boolean x = arrayList.containsAll(arrayList2);
		
		System.out.println(x);
		
		
	    
	}
	

}
