package Map_interface;

import java.util.Hashtable;

public class HashTable1 {

	public static void main(String[] args) { // HashTable - устаревший класс, который работает по принципу HashMap. в
												// отличии от ХэшМап он является synhronied(можно работать в
												// многопоточности), по этому причине его методы
												// не такие быстрые.
		// в HashTable ни ключ, ни значение не могут быть null в отличии от ХжшМап
		// ЕСЛИ НУЖНА ПОДДЕРЖКА МНОГОПОТОЧНОСТИ ЛУЧШЕ ИСПОЛЬЗОВАТЬ !!!ConcurrentHashMap!!! а не HashTable

		Hashtable<Double, Student> ht = new Hashtable<>();
		
		Student st1 = new Student("John", "Weeck", 3);
		Student st2 = new Student("John", "Wabovski", 2);
		Student st3 = new Student("Cillian", "Broke", 4);
		Student st4 = new Student("Tomy", "Broke", 5);

		ht.put(8.9, st1);
		ht.put(5.6, st3);
		ht.put(6.7, st2);
		ht.put(3.2, st4);
		
		System.out.println(ht);
	}

}
