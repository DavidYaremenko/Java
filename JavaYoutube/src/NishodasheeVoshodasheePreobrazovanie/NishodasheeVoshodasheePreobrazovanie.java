package NishodasheeVoshodasheePreobrazovanie;

public class NishodasheeVoshodasheePreobrazovanie {

	public static void main(String[] args) {
		// Upcasting - Восходящее преобразование
		Animal animal = new Dog(); 
		//\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		Dog dog = new Dog();
		Animal animal2 = dog; // то есть класс ДОГ уходит вверх по иерархии наследования переходя ближе к родителю
		
		// Downcasting - Нисходящее преобразование
		
		Animal a = new Animal();
		Dog dog2 = (Dog) a; //даем понять джаве, что в переменной а лежит обьект улвччв дог
		dog2.bark(); // эти преобразование не меняют сам обьект, а меняют ссылку на обьект
		
	
	}
}
