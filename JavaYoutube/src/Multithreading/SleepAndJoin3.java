package Multithreading;

public class SleepAndJoin3 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Method main begins");

		Thread thread1 = new Thread(new Worker());

		System.out.println(thread1.getState()); // getState поыказывает состояние потока, их три(NEW, Runnable,
												// Terminated)

		thread1.start();

		System.out.println(thread1.getState());

		thread1.join(1500); // join так же может принимать параметры. Если мы укажем время - это значит, что
							// мы просим поток main ждать 1,5 секунды и тогда выполнять свою работу либо же
							// без указанного времени он будет ждать пока полностью поток не выполнит свою
							// работу

		System.out.println(thread1.getState());
		System.out.println("Method main ends");

	}

}

class Worker implements Runnable {

	@Override
	public void run() {
		System.out.println("Work begins");

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Work ends");

	}

}
