package com.legends.javayoutube;

public class Static { // Static - это переменные и методы класса

	// Для чего нужны static методы и переменные: 1) если методу не нужно знать переменные обьекта. То есть не нужно создавать обьект класса, чтобы обратиться к нему(пример Math)
	
	public static void main(String[] args) {
		
		Humans1 human = new Humans1("Boba", 20);
		Humans1 human1 = new Humans1("Biba", 30);
		/*Humans1.description = "Nice";  //  тут мы обращаемся к переменной класса Humans1, а не к обьетку класса
		human.getAllField();
		human1.getAllField();
		Humans1.description = "Bad";
		human.getAllField();
		human1.getAllField();
		*/
		human.printNumberOfPeople();
		human1.printNumberOfPeople();
		Humans1 human2 = new Humans1("Baba", 80);
		human2.printNumberOfPeople();
		

		System.out.println(Math.pow(2,4)); //Math это класс содержащий в себе методы. Это статический класс, которому не нужно создавать обьекты этого класса для работы
	}

}

class Humans1 {  // Static - это переменные и методы класса

	private String name;
	private int age;
	private static int countPeople; // создали переменную для подсчета количества людей в офисе(количества созданних обьектов). Эта одна переменная доступна всем обьектам класса благоадря СТАТИК

	//public static String description; // ключевое слово static делает переменную видной всем классам и обьектам, и мы можем к ней обращаться везде, а не только в классе.
	
	
	
	public Humans1(String name, int age) {
											

		this.name = name;
		this.age = age;
		
		countPeople++; // с каждым созданием обьекта увеличивается на 1
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/*public void getAllField() {
		System.out.println(name + ", " + age + ", " + description);
	}
	
	public static void printAllFields(){ создавая статический метод, мы не можем обращаться к НЕ статическим переменным, джава этого не даст сделать
	   System.out.println(name)  статический метод может работать только с статическими переменными
		*/
	
	public void printNumberOfPeople() {
		System.out.println("Number of people is " + countPeople); // выводим количество
	}
}
