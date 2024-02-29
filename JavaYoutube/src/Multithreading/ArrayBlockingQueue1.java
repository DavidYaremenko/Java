package Multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue1 { // ArrayBlockingQueue - потокобезопасная очередь с ограниченным
									// размером(capacity restricted). Поимом своих методов, он имеет все методы
									// Queue. Обычно один или несколько потоков добавляют елементы в конец очереди,
									// а другой или другие потоки забирают елементы из начала очереди.

	public static void main(String[] args) {

		ArrayBlockingQueue<Integer> que = new ArrayBlockingQueue<>(4); // при ее создании ОБЯЗАТЕЛЬНО нужно указывать
																		// количество елементов в парметрах.
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		// que.add(5);
		que.offer(5); // если попробовать добавить пятый елемент через метод add - будет ошибка про то
						// что очередь полна, но если добавить с помощью offer - он просто не добавиться
						// и ошибки не будет.

		System.out.println(que);
	}

}
