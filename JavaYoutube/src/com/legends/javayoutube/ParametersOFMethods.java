package com.legends.javayoutube;

public class ParametersOFMethods {

	public static void main(String[] args) {

		class Person {
            String name;
			int age;
			
			void setName(String username) { // в круглых скобках параметры метода, их может быть не один string,int,[][]. Создается переменна username, в которую метод будет записывать имя, помещенное в переменную name
				name = username; // МЕТОД воспринимает имя "Рома" как username и записыввет его в переменную name
			}
			
			void setNameAndAge(String username, int userage) { // в круглих скобках параметрі метода, их может біть не один string,int,[][]. Создается переменна username, в которую метод будет записівать имя, помещенное в переменную name
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
		
		Person person1 = new Person(); // новий обьект класса Person
		person1.setName("Рома"); // Поле обьекта
		person1.age = 18; // Поле обьекта
		person1.speak(); //  визов метода
		person1.sayHello(); // визов метода

		Person person2 = new Person();
		person2.setNameAndAge("Vova", 12);
		person2.speak();
		int years1 = person2.calculateYearsToRetirement();
		System.out.println("До пенсии осталось - " + years1);

	}

}
