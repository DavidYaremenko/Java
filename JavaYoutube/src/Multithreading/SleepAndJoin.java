package Multithreading;

public class SleepAndJoin {
	
	public static void main(String[] args) throws InterruptedException {

		for (int i = 5; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000); // после каждой итерации, поток будет засыпать на 1 секундку(1000 милисекунд).
		}
		System.out.println("Go!");

	}

}
