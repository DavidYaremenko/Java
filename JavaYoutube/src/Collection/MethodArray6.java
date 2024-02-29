package Collection;

import java.util.ArrayList;
import java.util.List;

public class MethodArray6 {

	// методы List.of и List.copyOf - эти листы не изменяемые и не могут содержать значение null
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();

		arrayList.add("John");
		arrayList.add("Sofa");
		arrayList.add("Constantin");
		arrayList.add("Kolin");
		
		List<String> list2 = List.copyOf(arrayList); // так мы копируем лист в неизменяемый лист
		
		System.out.println(list2);
		
		List<Integer> list = List.of(2, 15,30); // так создается такой лист и сразу помещаются елементы без метода add.
		
		System.out.println(list);

	}

}
