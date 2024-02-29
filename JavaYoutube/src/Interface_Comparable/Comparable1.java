package Interface_Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable1 { // Интерфейс Comparable - служит для сравнения обьектов, сохраняя естественный порядок

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("John");
		list.add("Brad");
		list.add("Lola");
		
		System.out.println("Before sorted");
		System.out.println(list);
		
		Collections.sort(list); // сортировка будет по алфавиту. Со стрингами и числами джава знает как сортировать, а с обьектами работать не умеет. Смотри урок 2
		
		System.out.println("After sorted");
		System.out.println(list);
		

	}

}
