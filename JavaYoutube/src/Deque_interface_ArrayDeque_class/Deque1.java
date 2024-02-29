package Deque_interface_ArrayDeque_class;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 { // Deque - двусторонняя очередь. Мы можем работать с елемнатми в конце и вначале
						// очереди. Тут есть FIFO и LIFO - последний елемент. Интерфейс Deque
						// реализиуется классами LinkedList и arrayDeque

	public static void main(String[] args) {
		
		Deque<Integer> ad = new ArrayDeque<Integer>();

		// addFirst, addLast, offerFirst, offerLast - методы добавляеют елементы в начало или конец.
		ad.addFirst(5);
		ad.addFirst(7);
		ad.addLast(10);
		ad.offerFirst(8);
		ad.offerLast(3);
		
		System.out.println(ad);
		
		//getFirst, getLast, peekFirst, peekLast - позволют получить елемент из очереди. get выкидывает екзепшион, а peek нет.
		
		System.out.println(ad.getFirst());
		System.out.println(ad.getLast());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		//removeFirst, removeLast, pollFirst, pollLast - методы удаляют в конце или начале очереди елементы
		
		System.out.println(ad.removeFirst());
		System.out.println(ad);
		System.out.println(ad.removeLast());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);
	}

}
