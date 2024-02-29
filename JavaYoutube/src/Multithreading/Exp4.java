package Multithreading;

public class Exp4 implements Runnable { // еще один вариант создания потоков. Гланвый класс имплементрует интерфейс и
										// переопределеяет метод с кодом, а класс main выполняет другой код, так как он
										// является тоже потоком. На выходе у нас два потока но в другой вариации

	public void run() { // переопределяем метод run интерфейс Runnable
		for (int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Exp4());
		thread1.start();

		for (int i = 1000; i > 1; i--) {
			System.out.println(i);
		}

	}

}
