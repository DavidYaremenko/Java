package Multithreading;

public class GetNameSetName implements Runnable {

	public void run() { // getName позволяет узнать имя потока
		System.out.println("Name1 = "+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {

		Thread thread1 = new Thread(new GetNameSetName());
		Thread.currentThread().setName("Поток main"); // setName позвоялет установить имя потоку
		thread1.start();

		System.out.println("Name2 = "+Thread.currentThread().getName());

	}

}
