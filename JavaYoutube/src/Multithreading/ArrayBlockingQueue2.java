package Multithreading;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueue2 {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> que = new ArrayBlockingQueue<Integer>(4);
		
		//Producer - добавляет в конец очереди елементы
		
		new Thread(() -> { // этот поток добавляет елементы в конец очереди
			int i = 0; // переменная в которую добавляем елементы
			while(true) {
				try {
					que.put(++i); // добавляем число с каждой итерацией
					System.out.println("Producer add number: " + i); // выводим цифру которую добавили
					Thread.sleep(1000); // спит 1 секунду
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}).start(); // сразу запускаем
		
		//Consumer - удаляет елементы в начале очереди
		
		new Thread(() -> { // этот поток удаляет елементы в начале очереди
	
			while(true) {
				try {
					Integer j = que.take(); // Integer j - использовано для того чтобы в переменную поместить метод вызванный на очереди
					System.out.println("Consumer delete number: " + j); // выводим цифру которую удалили
					Thread.sleep(3000); // спит 3 секунды
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}).start(); // сразу запускаем

	}

}
