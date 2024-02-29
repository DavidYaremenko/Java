package com.legends.javayoutube;

public class IncapsulseGetAndSet {

	public static void main(String[] args) {

		Person1 person1 = new Person1(); // новий обьект класса Person
		person1.setName("вова"); // передаем параметр "Vova" в метод setName
		person1.setAge(15);// передаем параметр 12 в метод setAge
		System.out.println("Еще один вариант вывода " + person1.getName()); // тут уже работает возвращение значения
																			// напрямую
		System.out.println("Еще один вариант вывода " + person1.getAge());
		person1.speak();
	}
}

class Person1 {
	private String name; // создаем закрытые данные от пользователя с помощью private. Потому что поля
							// должни быть видны только в пределе одного класса
	private int age;

	// с помощью Set Get мы получаем доступ к закрытым полям
	public void setName(String userName) { // Обращаемся к закритим полям через Set и Get/ тут помещается в переменную
											// userName
		if (userName.isEmpty()) { // метод isEmpty проверяет не пустое ли поле ввода имени оставил пользователь
			System.out.println("Ты ввел не правильно имя"); // if проверяет true или false. Если пусто - выводит ошибку,
															// если ввел - показывает имя из переменной
		} else {
			name = userName;
		}
	}

	public String getName() { // возвращаемый значение метод будет возвращать то что ввел пользователь в
								// закртую переменную name и показывать
		return name;
	}

	public void setAge(int userAge) {
		if (userAge < 0) {
			System.out.println("Не может быть");
		} else {
			age = userAge;
		}
	}

	public int getAge() {
		return age;
	}

	void setNameAndAge(String username, int userage) {
		name = username;
		age = userage;
	}

	void speak() {
		for (int i = 0; i < 3; i++)
			System.out.println("Меня зовут " + name + " Мне " + age + " Лет");
	}

	void sayHello() {
		System.out.println("i Hello");
	}

	int calculateYearsToRetirement() {
		int years = 65 - age;
		return years;
	}

}
