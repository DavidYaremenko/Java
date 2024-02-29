package com.legends.javayoutube;

public class ClassOBJECTandToString {
// КЛАСС OBJECT есть у всех классов, ОНИ ОТ НЕГО НАСЛЕДУЮТСЯ
	public static void main(String[] args) {
		
		Humans2 human = new Humans2("Boba", 20);


		System.out.println(human); // когда ми пытаемся напечатать обьект - вызывается hashCode - универсальное его имя которое вызывается методом toString(), а он автоматически вызывается классом OBJECT
	    // все обьекти после создания относятся к классу Object, к которому относится метод toString
	}

}

class Humans2 {

	private String name;
	private int age;
	
	public Humans2(String name, int age) {
											
		this.name = name;
		this.age = age;
	}
	
	public String toString() { // если хотим вывести обьект - нужно переопределить метод toString. Нужно повторить СИГНАТУРУ метода !!!public String toString()!!!
	// предназначение метода toString - представлять обьект в виде строки
		return name + ", " + age;
	// РАСКОМЕНТИРУЙ ЧТОБІ РАБОТАЛО	
	}
}
