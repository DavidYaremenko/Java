package Multithreading;

public class SleepAndJoin2 extends Thread { // метод sleep заставляет уснуть поток на определенное время.

	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread(new MyRunnable()); // создаем поток ит передаем обьект классa MyRunnable
		SleepAndJoin2 thread2 = new SleepAndJoin2(); // создали обьект главного класса
		thread1.start();
		thread2.start();

		// Так как поток main выполняет работу быстрее через остальные два потока, мы
		// можем вызвать метод join на потоках, что даст понять main ждать сначала
		// выполнение потоков на которых был вызван метод join, а только потом уже
		// выполнять свою работу main. То есть потоки на которых вызван метод join
		// выполняются быстрее, чем те, на которых он не вызван
		thread1.join();
		thread2.join();
		System.out.println("Konec");

	}

	public void run() { // при переопределенгии метода ран мы не можем указать просто throws
		// InterruptedException, нужно использовать try/catch

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " " + i); // будем выводить имя потока после каждой
																			// итерации
		}

	}

}

class MyRunnable implements Runnable {

	public void run() { // при переопределенгии метода ран мы не можем указать просто throws
						// InterruptedException, нужно использовать try/catch

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " " + i); // будем выводить имя потока после каждой
																			// итерации
		}

	}

}
