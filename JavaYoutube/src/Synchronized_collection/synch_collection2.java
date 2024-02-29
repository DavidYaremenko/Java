package Synchronized_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class synch_collection2 {

	public static void main(String[] args) throws InterruptedException {
//Данный вариант не рабочий, с ошибкой, но для понимания надо
//		ArrayList<Integer> al = new ArrayList<Integer>();
//
//		for (int i = 0; i < 1000; i++) { // добавляем 1000 елементов
//			al.add(i);
//		}
//
//		Runnable runnable1 = () -> { // этот поток с помощью итератора проходится по елементам и выводит их на экран
//			Iterator<Integer> iterator = al.iterator();
//			while (iterator.hasNext()) {
//				System.out.println(iterator.next());
//			}
//
//		};
//
//		Runnable runnable2 = () -> al.remove(10); // этот поток удаляет каждый елемент с инлексом 10
//
//		Thread thread1 = new Thread(runnable1);
//		Thread thread2 = new Thread(runnable2);
//		
//		thread1.start();
//		thread2.start();
//		thread1.join();
//		thread2.join();
// Правильынй вариант и рабочий
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < 1000; i++) { // добавляем 1000 елементов
			al.add(i);
		}

		List<Integer> synch = Collections.synchronizedList(al); // создаем лист с оберткой и делаем его
																// синхронизированным, помещаем в него уже заполненый
																// АррейЛист

		Runnable runnable1 = () -> { // этот поток с помощью итератора проходится по елементам и выводит их на экран

			synchronized (synch) { // Если один поток перебирает, а другой удаляет - мы не можем предсказать что не
									// будет ошибки. Потому что прохождение по коллекции с помощью итератора во
									// время того как другой поток может изменять коллекцию может вызывать ошибку,
									// поэтому нужно испоьзовать этот метод

				Iterator<Integer> iterator = synch.iterator(); // меняем на synch
				while (iterator.hasNext()) {
					System.out.println(iterator.next());
				}

			}

		};

		Runnable runnable2 = () -> synch.remove(10); // этот поток удаляет каждый елемент с инлексом 10

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);

		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();

		System.out.println(synch);

	}

}
