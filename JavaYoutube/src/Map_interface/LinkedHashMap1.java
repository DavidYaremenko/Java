package Map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMap1 { // LikedHashMap - это наследник ХэшМап. Он хранит информацию о порядке
								// добавления елементов или порядке их использования, чего нет в обычном ХэшМап.
								// Производительность методов немного хуже чем у ХэшМап.
	// Он так же имеет ссылку на предыдущий и следующий елемент.

	public static void main(String[] args) {

		LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true); // new LinkedHashMap<>(capacity,
																					// коэфицент заполнения, порядок
																					// отображения елементов - false -
																					// отображение по порядку
																					// добавляние, true - по порядку
																					// использования)

		Student st1 = new Student("John", "Weeck", 3);
		Student st2 = new Student("John", "Wabovski", 2);
		Student st3 = new Student("Cillian", "Broke", 4);
		Student st4 = new Student("Tomy", "Broke", 5);

		lhm.put(8.9, st1);
		lhm.put(5.6, st3);
		lhm.put(6.7, st2);
		lhm.put(3.2, st4);

		System.out.println(lhm);

		System.out.println(lhm.get(6.7)); // метод ПУТ и ГЕТ - это использование елементом, поэтому после использование,
											// если в порядке отображения стоит true, эти использованные елементы будут
											// выводится последними по порядку их использования
		System.out.println(lhm.get(5.6));

		System.out.println(lhm);
	}

}
