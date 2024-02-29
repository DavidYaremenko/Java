package com.legends.javayoutube;

public class Constructor {

	public static void main(String[] args) {

		Humans humans1 = new Humans(); // при создании обьекта без параметров констурктора, джава создает пустой
										// констурктор по умолчанмю который мы не видим
		Humans humans2 = new Humans("Viva");// в зависимости от того какие параметры мы передаем в конструктор - тот
											// коснтруктор джава и вызывает
		Humans humans3 = new Humans("Viva", 19);//

	}

} // Перегрузка методов - это когда мы можем иметь в классе несколько методов c одинаковым названием но разными параметрами
	//
class Humans {

	private String name;
	private int age;

	public Humans() { // разница между констр и методом - у конструктора должно быть такое имя как и
						// класс и у него нет метода void возвращающего значения.
		this.name = "Default"; // если человек ничего не ввел, появится строка по дефолту
		this.age = 0;
		System.out.println(this.name + ", " + this.age);
	}

	public Humans(String name) { // создание конструктора, где задаются параметры String name, int age). Всегда
		// визивается тот конструктор, где заданы параметры(перегрузка методов)
		this.name = name;
		System.out.println(this.name); // визов конструктора в консоль без метода. С методом тоже самое
	}

	public Humans(String name, int age) { // создание конструктора, где задаются параметры String name, int age). Всегда
											// визивается тот конструктор, где заданы параметры(перегрузка методов)
		this.name = name;
		this.age = age;
		System.out.println(this.name + ", " + this.age); // визов конструктора в консоль без метода. С методом тоже
															// самое
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
