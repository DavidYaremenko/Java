package Interface_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.lang.model.element.NestingKind;

public class Comparable2 {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();

		Employee em1 = new Employee(1, "John", "Fill", 1450);
		Employee em2 = new Employee(10, "Brad", "Stack", 1700);
		Employee em3 = new Employee(5, "Kondrad", "Buket", 2500);

		list.add(em1);
		list.add(em2);
		list.add(em3);

		System.out.println("Before sorting \n" + list); // \n - перенос на новую строку

		Collections.sort(list); // метод сорт будет работать только после того как переопределили метод
								// compareTo

		System.out.println("After sorting \n" + list);

	}

}

class Employee implements Comparable<Employee> { // чтобы испольщовать сравнение мы исплементируем интерфейс Comparable
													// и в параметры передаем наш класс. У него есть единственный метод
													// compareTo, который мы переопределяем и указываем по чему будем
													// сравнивать обьекты.(смотри ниже)

	int id;
	String name;
	String surname;
	int salary;

	public Employee(int id, String name, String surname, int salary) {

		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [ id = " + id + ", name = " + name + ", surname = " + surname + ", salary = " + salary + " ]";
	}

	@Override
	public int compareTo(Employee anotherEm) { // КЛАССИЧЕСКИЙ ВАРИАНТ СРАВНЕНИЯ

		if (this.id == anotherEm.id) { // если айди равны - верни 0
			return 0;
		} else if (this.id < anotherEm.id) {
			return -1;
		} else {
			return 1;
		}
		
		//return this.id - anotherEm.id; - ВТОРОЙ ВАРИАНТ, БОЛЕЕ КОРОТКИЙ(ПОД КАПОТОМ ТОЖЕ САМОЕ ЧТО И В ПЕРВОМ
		
		// return this.name.compareTo(anotherEm.name); - ТРЕТИЙ ВАРИАНТ ДЛЯ СТРИНГОВ, ТАК КАК В СТРИНГЕ МЕТОД УЖЕ ПЕРЕОПРЕДЕЛЕН КАК И В Integer
		
		// ПРИМЕР СРАВНЕНИЯ ПО ИМЕНИ, А ЕСЛИ ИМЯ ОДИНАКОВОЕ - СРАВНИВАЕМ ПО ФАМИЛИИ
		
		//int result = this.name.compareTo(anotherEm.name);
		
		//if(result == 0) { // если имена одинаковые
		//	result = this.surname.compareTo(anotherEm.surname); // сравниваем через фамилию
		//}
		//return result; // возвращаем в переменную
		

	}

}
