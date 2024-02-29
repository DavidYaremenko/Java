package Collection;

import java.util.ArrayList;

public class MethodsArray {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("John");
		arrayList.add("Sofa");
		arrayList.add("Constantin");
		
		arrayList.add( 1,"Wek"); // добавив индекс мы поместим имя на указанное место  и сметим все предыдщуее вправо
		
		for(String string : arrayList) { // применяем цикл for each для отображения массива
			System.out.println(string);
		}
		
		System.out.println(arrayList.get(0)); // get позволяет вывести или получить елемент под конкретным инлексом

		for(int i = 0; i < arrayList.size(); i++) { // выведет все елементы по очереди
			System.out.println(arrayList.get(i)); // в гет передаем переменную в которую помещаем размер массива
		}
		
		arrayList.set(1, "Week"); // set вставляет новый елемент вместо того который был под указанным индексом
		
		arrayList.remove(1); // remove удаляет елемент и при удален ии все остальные елементы смещаются влево
		
		System.out.println(arrayList);
	}

}
