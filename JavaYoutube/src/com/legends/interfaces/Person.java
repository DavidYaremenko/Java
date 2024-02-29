package com.legends.interfaces;

public class Person implements Info { // каждый созданный метод в интерфейсе, классы обязаны реализовать в себе, куда
										// имплементируем

	public String name;

	public Person(String name) {
		this.name = name;
	}

	public void sayHello() {// метод класс

		System.out.println("Hello");
	}

	public void showInfo() { // метод интерфейса который реализуется в классе
		System.out.println("Name is " + this.name);
	}

}
