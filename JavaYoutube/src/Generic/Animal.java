package Generic;

public class Animal {
	
	private int id;
	
	public Animal() { // пустой конструктор нужен чтобы не было ошибки в классе ДОГ
		
	}
	
	public Animal(int id) { // конструктор для приема айди животного
		
		this.id = id;
	}
	
	public void eat() { // специфический метод только для класса анимал
		System.out.println("Animal is eating");
	}
	
	public String toString() { // переопределяем дефолтний метод toString чтобы он возвращал id животного
		return String.valueOf(id); // благодаря этому методу целое число конвертируется в строку
	}

}
