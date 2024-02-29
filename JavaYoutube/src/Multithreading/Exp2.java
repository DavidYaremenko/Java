package Multithreading;

public class Exp2 {

	public static void main(String[] args) {

		MyThread1 myThread1 = new MyThread1(); // создается обьект класса
		MyThread2 myThread2 = new MyThread2();

		myThread1.start(); // запускается поток
		myThread2.start(); // эти два потока не синхронизированы, поэтому числа будут выводится с паузами,
							// потому что каждый будет перехватывать другого. ОНи независимы друг от друга. Мы не знаем какой будет выполняттся первый.

	}

}

class MyThread1 extends Thread { // Есть класс Thread - если от него наследоваться то можно создавать поток. Этот
									// поток выводит числа до 1000

	public void run() { // переопределяем метод run класса Thread
		for (int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

class MyThread2 extends Thread { // этот поток выводит числа от 1000

	public void run() {
		for (int i = 1000; i > 1; i--) {
			System.out.println(i);
		}
	}
}