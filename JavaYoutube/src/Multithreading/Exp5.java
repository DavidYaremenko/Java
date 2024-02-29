package Multithreading;

public class Exp5 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() { // вариант создания потока с помощью анонимного класса
			
			@Override
			public void run() { // переопределяем метод
				
				System.out.println("Hello"); // что должен делать поток
				
			}
		}).start(); // запускаем поток
		
		// создание потока с еще меньшим кодом
		new Thread(() -> System.out.println("hi")).start(); // лямбда выражение

	}

}
