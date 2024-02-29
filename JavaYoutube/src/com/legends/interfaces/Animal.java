package com.legends.interfaces;

public class Animal implements Info { // каждый созданный метод в интерфейсе, классы обязаны реализовать в себе, куда
	//                                    имплементируем
	// класс может имплементировать много интерфейсов через запятую, но наследовать
	// класс может только один класс
	public int id; // идентификатор животного

	public Animal(int id) {
		this.id = id;
	}

	public void sleep() { // метод класса Animal
		System.out.println("I am sleeping");
	}

	public void showInfo() { // метод интерфейса который реализуется в классе
		System.out.println("Id is " + this.id);
	}

}
