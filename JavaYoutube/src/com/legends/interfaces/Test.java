package com.legends.interfaces;

public class Test {

	public static void main(String[] args) {

		/*
		 * Animal animal1 = new Animal(1); 
		 * Person person1 = new Person("Vlad");
		 * 
		 * animal1.sleep(); 
		 * person1.sayHello();
		 * 
		 * System.out.println();
		 * 
		 * animal1.showInfo(); 
		 * person1.showInfo();
		 * 
		 * System.out.println();
		 */
		/*
		 * Info info1 = new Animal(1);
		 *  // ми может обращаться к классам и так. Обращаясь
		 * к обьекту Info ми можем // визивать классі Animal,Person, Только лишь потому,
		 * что эти классы ссылаются // на интерфейс из за созданного метода(showInfo -
		 * общий методов который их // обьединяет). Еще это називается ПОЛИМОРФИЗМ Info
		 * 
		 * info2 = new Person("Vlad");
		 * 
		 * info1.showInfo(); 
		 * info2.showInfo();
		 */

		Info info1 = new Animal(1); // такой вариант обращения к классам возможен только если они имплеминтируют интерфейс с его методами
		Info info2 = new Person("Vlad");
		Animal animal1 = new Animal(1);
		Person person1 = new Person("Vlad");

		outputInfo(info1);
		outputInfo(info2);

		System.out.println();

		outputInfo(animal1); // методу outputInfo не важно что передаем в качестве аргумента (anmail1,person1 или
								// info1,info2), он все равно будет рабоатьт из за того, что реализуют эти
								// классы интерфейс
		outputInfo(person1);

	}

	public static void outputInfo(Info var) { // этот метод принимает в качестве аргумента то, что реализует класс
												// Info(метод showInfo)
		var.showInfo(); // теперь ми можем обращаться к любому обьекту, который имплементирован с
							// интерфейсом(реализует его)
	}

}
