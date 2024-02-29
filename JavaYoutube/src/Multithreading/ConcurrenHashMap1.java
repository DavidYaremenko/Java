package Multithreading;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenHashMap1 { // ConcurrentHashMap имплементриует интерфейс ConcurrentMap, который в свою
									// очередь происходит от интерфейса Map. В ConcurrentHashMap любое количество
									// потоков может читать элементы не блокируя его. В ConcurrentHashMap благодаря
									// его сегментированию(деление), при изменении какого либо элемента блоктруется
									// только bucket, в котором он находится. В нем ни ключи ни значение не могут
									// быть null.

	public static void main(String[] args) throws InterruptedException {

		ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>(); // С помощью ConcurrentHashMap созданные
																			// ниже потоки будут работать параллельно

		map.put(1, "John");
		map.put(2, "Brad");
		map.put(3, "Zola");
		map.put(4, "Lili");
		map.put(5, "Jensen");

		System.out.println(map);

		Runnable runnable1 = () -> { // ЭТОТ ПОТОК БУДЕТ ВЫВОДИТЬ ВСЕ ЕЛЕМЕНТЫ МАПА - КЛЮЧИ И ЗНАЧЕНИЕ
			Iterator<Integer> iterator = map.keySet().iterator(); // создаем итератор на множестве ключей
			while (iterator.hasNext()) {
				try {
					Thread.sleep(100); // ПЕРЕД ТЕМ КАК ВЫВЕСТИ НА ЭКРАН ОН БУДЕТ СПАТЬ 100 миллисекунд
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Integer i = iterator.next(); // получаем ключ елемента
				System.out.println(i + " : " + map.get(i)); // выводим ключ и map.get(i) - значение, которое полуаем с
															// помощью этого ключа
			}
		};

		Runnable runnable2 = () -> { // ЭТОТ ПОТОК СПИТ 300 миллисекунд И ПОТО ДОБАВЛЯЕТ НОВЫЙ ЕЛЕМЕНТ В МАПУ

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.put(6, "Helen"); // добавляем елемент
		};

		Thread thread1 = new Thread(runnable1); // в парметры мы передаем раннебл - это по сути имплементация интерфейса
												// которую мы передаем в поток чтобы ее запустить
		Thread thread2 = new Thread(runnable2);

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		System.out.println(map);

	}

}
