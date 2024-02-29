package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test2Wildcards {

	public static void main(String[] args) {
		List<Animal> ListOfAnimal = new ArrayList<>(); // лист, которриий содержит обьекти только класса Animal
		ListOfAnimal.add(new Animal(1)); // добавляем 2 обекта класса Animal
		ListOfAnimal.add(new Animal(2)); // в аргумент мы передали номер животного, которое обработает метод в классе Animal
		
		List<Dog> ListOfDogs = new ArrayList<>();
		ListOfDogs.add(new Dog());
		ListOfDogs.add(new Dog());
		
		test(ListOfAnimal); // вызвали метод ниже для перебора и отображения животних
		test(ListOfDogs);

	}

	/*private static void test(List<Animal> list) { 

		for (Animal animal : list) { // чтобы вывести всех животных. В данном примере test(ListOfDogs); не сработает, такак в метод помещаются только обьекти класса Animal
			System.out.println(animal);
     */
	
	private static void test(List<? extends Animal> list) {// Wildcards - это <?>, который позволяет добавлять в этот метод в List любые обьекти, а не только одного класса, а extends позволяет добавлять еще и наследников. Если заменить extends на super - будут все класси которые выше Animal(родители Animal)

		for (Animal animal : list) { 
			animal.eat(); // вот теперь на всех обьектах разних классов вызывается метод, который есть тольько в классе Animal потому что класс Dog наследован от него
		}

	}

}
