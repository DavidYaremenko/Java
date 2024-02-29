package com.legend.nasledovanie;

public class Dog extends Animal{ // extends - говорит о том, что класс Dog наследуется от класса  Animal и может брать от него методы

	public void barg() {
		System.out.println("I am bark, barking"); // каждый класс может иметь только свои методы. А так же может переопределять методы родителя(в данном случае класса Animal)
	}
	
	public void eat() { // переопределяем метод eat который есть у родителя Animal с помощью повторения сигнатуры
		System.out.println("Dog is eating");
	}
	
	public void name() { // поля тоже могут наследоваться
		System.out.println(name);
	}
}
