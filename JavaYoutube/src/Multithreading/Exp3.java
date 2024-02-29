package Multithreading;

public class Exp3 { // Если созданный класс уже наследуется от какого то другого и мы не можем его
					// наследовать от Thread, то мы можем использовать интерфейс Runnable. Так как
					// наследоваться мы можем только от одного класса, а интерфейсы испольщзовать
					// множество

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new MyThread3());
		Thread thread2 = new Thread(new MyThread4());
		
		thread1.start();
		thread2.start();

	}

}

class MyThread3 implements Runnable { // Есть интерфейс Runnable - который содержит только один метод - run. B в еле
										// метода мы пишем то что должен делать поток

	public void run() { // переопределяем метод run интерфейс Runnable
		for (int i = 1; i < 1000; i++) {
			System.out.println(i);
		}
	}
}

class MyThread4 implements Runnable { // этот поток выводит числа от 1000

	public void run() {
		for (int i = 1000; i > 1; i--) {
			System.out.println(i);
		}
	}
}
