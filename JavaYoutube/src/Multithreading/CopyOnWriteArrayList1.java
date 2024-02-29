package Multithreading;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList1 { // CopyOnWriteArrayList имплементирует интерфейс List. Используется когда нужна
										// потокобезопасность, небольшое количество операций по изменению елементов и
										// большое их количество по чтению елементов. При каждом изменении елементов,
										// создается клон этого листа, поэтому и нежелательно часто что то менять.

	public static void main(String[] args) throws InterruptedException {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();

		list.add("John");
		list.add("Brad");
		list.add("Lili");
		list.add("Jensen");
		list.add("Johan");

		System.out.println(list);

		Runnable runnable1 = () -> {
			Iterator<String> iterator = list.iterator(); // помещаем лист в итератор
			while (iterator.hasNext()) { // находит елемент
				try {
					Thread.sleep(100); // спит
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(iterator.next()); // выводит елемент и переходит к селдующему
			}
		};

		Runnable runnable2 = () -> {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.remove(4); // при этом действии создается копия листа
			list.add("Sofa"); // и после этого действия тоже создается копия листа. Это все затратно по
								// времени и памяти.
		};

		Thread thread1 = new Thread(runnable1);
		Thread thread2 = new Thread(runnable2);
		thread1.start();
		thread2.start();
		thread1.join();
		thread2.join();

		System.out.println(list);

	}

}
