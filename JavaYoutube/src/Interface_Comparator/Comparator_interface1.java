package Interface_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparator_interface1 { // ЗА ПРИМЕР ВЗЯТЬ КОД С COMPARABLE. Итог по коду - комбинация испольщования
										// comparable и comparator. Это удобно, если КОМПЕРЕБЛ сравнвиает по айди, а
										// КОМПАРАТОР по имени и зарплате, чтобы постоянно не менять код. Раскоментируй
										// если надо только КОМПАРАТОР. Интерфейс Comparator испольщуют для сравнения,
										// он не испольщует ествественный порядок.

	public static void main(String[] args) {

		List<Worker> list = new ArrayList<Worker>();

		Worker em1 = new Worker(1, "John", "Fill", 1450);
		Worker em2 = new Worker(10, "Brad", "Stack", 1700);
		Worker em3 = new Worker(5, "Kondrad", "Buket", 2500);

		list.add(em1);
		list.add(em2);
		list.add(em3);

		System.out.println("Before sorting \n" + list); // \n - перенос на новую строку

		Collections.sort(list);
		// Collections.sort(list, new IdComparator()); // метод сорт будет работать
		// только после того как передадим в
		// параметр обьект класса new IdComparator

		System.out.println("After sorting \n" + list);

		// Collections.sort(list, new NameComparator()); // сраниваем по имени
		// Collections.sort(list, new SalaryComparator()); // сравниваем по зарпалте

	}

	static class Worker implements Comparable<Worker> { // чтобы испольщовать сравнение мы исплементируем интерфейс COMPARATOR, смотри
							// ниже, там есть класс

		int id;
		String name;
		String surname;
		int salary;

		public Worker(int id, String name, String surname, int salary) {

			this.id = id;
			this.name = name;
			this.surname = surname;
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [ id = " + id + ", name = " + name + ", surname = " + surname + ", salary = " + salary
					+ " ]";
		}

		@Override
		public int compareTo(Worker anotherEm) { // КЛАССИЧЕСКИЙ ВАРИАНТ СРАВНЕНИЯ

			if (this.id == anotherEm.id) { // если айди равны - верни 0
				return 0;
			} else if (this.id < anotherEm.id) {
				return -1;
			} else {
				return 1;
			}

		// return this.id - anotherEm.id; - ВТОРОЙ ВАРИАНТ, БОЛЕЕ КОРОТКИЙ(ПОД КАПОТОМ
		// ТОЖЕ САМОЕ ЧТО И В ПЕРВОМ

		// return this.name.compareTo(anotherEm.name); - ТРЕТИЙ ВАРИАНТ ДЛЯ СТРИНГОВ,
		// ТАК КАК В СТРИНГЕ МЕТОД УЖЕ ПЕРЕОПРЕДЕЛЕН КАК И В Integer

		// ПРИМЕР СРАВНЕНИЯ ПО ИМЕНИ, А ЕСЛИ ИМЯ ОДИНАКОВОЕ - СРАВНИВАЕМ ПО ФАМИЛИИ

		// int result = this.name.compareTo(anotherEm.name);

		// if(result == 0) { // если имена одинаковые
		// result = this.surname.compareTo(anotherEm.surname); // сравниваем через
		// фамилию
		// }
		// return result; // возвращаем в переменную

	}

//	static class IdComparator implements Comparator<Worker> { // имплементриуем интерфейс comparator
//
//		@Override
//		public int compare(Worker em1, Worker em2) { // метод compare в параметрах сравнивает двух работников, а метод
//														// compareTo сравнивает обьект с обьектом заданным в параметре
//
//			if (em1.id == em2.id) { // переопределение метода такое же как и в Comparable, только вместо this сразу
//									// подставляем обьект
//				return 0;
//			} else if (em1.id < em1.id) {
//				return -1;
//			} else {
//				return 1;
//			}
//		}
//
//	}

	static class NameComparator implements Comparator<Worker> { // имплементриуем интерфейс comparator

		@Override
		public int compare(Worker em1, Worker em2) { // метод compare в параметрах сравнивает двух работников, а метод
														// compareTo сравнивает обьект с обьектом заданным в параметре

			return em1.name.compareTo(em2.name); // теперь сравниваем по имени, берем короткий вариант так как стринг

		}
	}

	static class SalaryComparator implements Comparator<Worker> { // имплементриуем интерфейс comparator

		@Override
		public int compare(Worker em1, Worker em2) { // метод compare в параметрах сравнивает двух работников, а метод
															// compareTo сравнивает обьект с обьектом заданным в параметре
			return em1.salary - em2.salary; // hсавнивааем по зп
	
}
		
	}
}
