package Collection;

import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class MethodsArray3 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("John");
		arrayList.add("Sofa");
		arrayList.add("Constantin");
		arrayList.add("John");
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.indexOf("John")); // покажет индекс обьекта и если есть дубликат - индекОф показывает первый оригинал
		
		System.out.println(arrayList.lastIndexOf("John")); // если есть дубликат он покажет индекс последнего дубликата
		
		System.out.println(arrayList.size()); // показывает количество елементов в массиве
		
		System.out.println(arrayList.isEmpty()); // Если массив пуст - покажет true, если не пуст - покажет false
		
		System.out.println(arrayList.contains("Sofa")); // contains - ищет и сравнивает обьект на наличие его в массиве и возвращает true/false. Работает через метод иквелс поэтому его нужно будет переопределять
		
        System.out.println(arrayList.toString()); // toString применяется автоматически когда мы хотим вывести массив на экран поэтому писать его необязатально
		
		ArrayList<String> arrayList2 = new ArrayList<>();

		arrayList2.add("!!!");
		arrayList2.add("???");

		arrayList.addAll(arrayList2); // addAll - добалвяет все елементы с другого листа в конец того куда нужно переместить
		
		arrayList.addAll(1, arrayList2); // если указать индекс елемента - вставится на его место и все остальные елементы сместятся вправо
		
		System.out.println(arrayList);
		
		arrayList.clear(); // очищает лист
		
		System.out.println(arrayList);
	}

}
