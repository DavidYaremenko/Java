package AbstraktnieClassi;

public class Test {

	public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.makeSound(); // метод который реализовали в классе Кэт
		cat.eat(); // метод который реализуем в родителе Энимал
		
		Dog dog = new Dog();
		dog.makeSound();// метод который реализовали в классе Дог
		dog.eat();// метод который реализуем в родителе Энимал
			
		
	}
}
