package AnonimnieClassi;

interface AbleToEat {
	public void eat();
}

public class Test2 { // применение анонимних классов с интерфейсами

	public static void main(String[] args) {

		AbleToEat abletoeat = new AbleToEat() { // ми не можем создавать обьекти интерфейсов. Тут создается класс
												// который реализует методы интерфейса и обьект этого класса
												// присваивается интерфейсу в переменную abletoeat

			@Override
			public void eat() { // можем так делать если метод нужно испольщовать только один раз
				System.out.println("He is eating...");

			}

		};

		abletoeat.eat();

	}

}
