package VLOZHENIEKLASSI;

// В джаве есть три типа вложенных классов

public class Electrocar {
	
	private int id;
	
	// 1.Нестатический вложенный класс
	
	private class Motor{ // чаще они бывают приватными. Часто в них создаются методы под обьекты этого класса. Создали класс внутри класса Electrocar. Нестатические это часть классародителя.Поэтому создается обьект класса в методе.(смотри метод Старт)
		public void startMotor() {
			System.out.println("Motor is starting...");
		}
	}
	
	// 2.Статический вложенный класс
	
	public static class Battery{ // чаще они бывают публичними. Статический классы имеют меньший доступ к классу Electrocar(не имеют доступ к приватным полям, но к полям с доступом static могут). В целом, они нужны для группировки классов и использования их извне. Они не являются частью классародителя
		
		public static void charge() {
			System.out.println("Battery is charging...");
		}
	}
	
	public Electrocar(int id) {
		this.id = id;
	}

	public void start() {
		Motor motor = new Motor(); // так мы создали обьект класса мотор в методе старт и вызвали его, так как класс мотор относится к большому и сложному классу Електрокар(сложный и большой потому что это один обьект который в себе имеет много составляюзих - мотор коробка и тд)
		motor.startMotor();
		
		final int x = 1; 
		
		// 3.Вложенный класс в методе. У них есть доступ к классу Електрокар и приватным полям без static и переменным метода,только чтобы они были константой final
		
		class SomeClass{
			public void someMethod() {
				System.out.println(x);
				System.out.println(id);
			}
		}
		
		System.out.println("Electrocar " + id + " is starting...");
	}


}
