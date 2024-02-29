package Synchronized_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class synch_collection {

	public static void main(String[] args) throws InterruptedException {

//		ArrayList<Integer> source = new ArrayList<Integer>(); 
//
//		for(int i = 0; i < 5; i++) {
//			source.add(i);
//		}
//		
//		ArrayList<Integer> target = new ArrayList<Integer>(); // в данном варианте создания результат мы не сможем предугадать, потому что потоки внизу не синхронны, смотри ниже как делать правильно
//		
//		Runnable runnable = () -> {target.addAll(source);};  // это lambda выражение. До нее дойдет потом. Тут мы указываем, что в target помещаем все елементы с source
//		
//		Thread thread1 = new Thread(runnable); // поток 1
//		
//		Thread thread2 = new Thread(runnable); // поток 2. Двумя потоками мы добавляем в таргет елементы соурс
//		
//		thread1.start(); // запуск потоков
//		thread2.start();
//	    thread1.join(); // join говорит главному методу и потоку main, чтобы тот дождался окончания работы thread
//	    thread2.join();
//	    
//	    System.out.println(target);

		ArrayList<Integer> source = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			source.add(i);
		}

		List<Integer> synchAr = Collections.synchronizedList(new ArrayList<>()); // так мы создаем синхронизированныую
																					// коллекцию с помощью обертки
																					// класса collections. В скобки поместили новый arrayList

		Runnable runnable = () -> {synchAr.addAll(source);}; // это lambda выражение. До нее дойдет потом. Тут мы указываем, что в synchAr
			// помещаем все елементы с source

		Thread thread1 = new Thread(runnable); // поток 1. Пока работает один поток, всем остальным доступ закрыт, они ждут пока закончит он

		Thread thread2 = new Thread(runnable); // поток 2. Двумя потоками мы добавляем в synchAr елементы соурс

		thread1.start(); // запуск потоков
		thread2.start();
		thread1.join(); // join говорит главному методу и потоку main, чтобы тот дождался окончания
						// работы thread
		thread2.join();

		System.out.println(synchAr);
	}

}
