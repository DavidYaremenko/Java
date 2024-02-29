package AnonimnieClassi;

//class OtherAnimal extends Animal{
//	public void eat() {
//		System.out.println("Other animal eating...");
//	}
//}
//OtherAnimal otheranimal = new OtherAnimal();
//otheranimal.eat();

public class Test {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();

		
		Animal animal2 = new Animal() { // тут создали анонимний класс,которий является наследником обьекта класса Animal для переопределения метода eat, чтобы не создавать отдельно новый класс(как выше в комментах)
			public void eat() {
				System.out.println("Other animal eating...");
			}
		};
		animal2.eat();
	}

}
