package Map_interface;

import java.lang.annotation.AnnotationTypeMismatchException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class equalsANDhashcode {
	// правило: Если переопределил equals - то переопредели и hashcode.
	// хеширование - преобразование с помощью метода hashcode любого обьекта в int
	// сравнение в HashMap идет сначала по хэшкоду а потом по иквелс, поэтому нужно
	// переопределять оба
	// при выозове нескольких раз hashCode на обьекте - хэшкод должен быть
	// одинаковый каждый раз
	// если при методе equal обьекты равны - то и хэшкод их должен быть одинаков
	// ОБЯЗАТЛЕЬНО. И наоборот - если иквелс не равен то и хэшкод не обязательно
	// должен быть одинаков
	// метод hashCode работает быстрее чем equals

	public static void main(String[] args) {

		Map<Student, Double> map = new HashMap<Student, Double>(); // создаем мап где будет хранится студент и его
																	// оценка

		Student st1 = new Student("John", "Weeck", 3);
		Student st2 = new Student("John", "Wabovski", 2);
		Student st3 = new Student("Cillian", "Broke", 4);

		map.put(st1, 5.0);
		map.put(st2, 3.0);
		map.put(st3, 4.7);

		System.out.println(map);

		Student st4 = new Student("Cillian", "Broke", 4);

		boolean result = map.containsKey(st4); // проверяем есть ли ст4 в коллекции мап. Будет фолс потому что HashMap,
												// HashSet сравнивает обьекты по хешированию и чтобы было корректное
												// сравнение нужно переопределять метод hashcode
		System.out.println(result); // после переопределения метода hashcode(смотри ниже) придет тру

		Student st5 = new Student("Tomy", "Broke", 5);

		System.out.println(st4.hashCode()); // узнаем хэшкод обектов
		System.out.println(st5.hashCode()); // если хэшкод одинаковый - это называется колизия

		for (Map.Entry<Student, Double> entry : map.entrySet()) { // entrySet возвращает множество entry(внутренний
																	// интерфейс для map), который имплементируется
																	// внутренним классом Node, который содержит: ключ,
																	// значение, хэшкод елемента и ссылку на следующий
																	// елемент

			System.out.println(entry.getKey() + ": " + entry.getValue()); // метод позволяет вывести ключ и значение
																			// через двоеточие

		}

		System.out.println(st4.hashCode());
		System.out.println(map.containsKey(st4));
		st4.course = 5; // после изменения какого то поля в обекте, меняется и его хжшкод, а значит по
						// ключу мы его больше не найдем в хэшмапе, потмоу что сначала проверка идет по
						// хэшкоду, а потом по equals.
		// Чтобы этого избежать, поля нужно делать final, чтобы они стали immutable - неизменяемыми

		System.out.println(st4.hashCode());
		System.out.println(map.containsKey(st4));
	}

}

final class Student {
	final String name;
	final String surname;
	int course;

	public Student(String name, String surname, int course) {
		this.name = name;
		this.surname = surname;
		this.course = course;
	}

	public String toString() { // переопределяем метод лля вывода все в строке
		return " Student - | name = " + name + ", surname = " + surname + ", course = " + course + " | ";
	}

	@Override
	public int hashCode() { // вариант переопределения от среды разработки
		return Objects.hash(course, name, surname); // return 3 - если так поставить то у всех добавляемых елементов
													// хэшкод будет 3 и индекс тоже будет равен 3 и тогда скорость
													// выполнения будет медленной и это плохо
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}
}