package Queue_interface;

import java.util.PriorityQueue;

public class Priority_Queue { // Priority_Queue - это специальный вид очереди, в котором используется
								// натуральная сортировка или та, которую мы описываем с помощью comparator или
								// comparable. Таким образом используется тот елемент из очереди, приоритет
								// которого выше.

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(4);
		pq.add(2);
		pq.add(6);
		pq.add(10);
		pq.add(8);
		
		// 2, 4, 6, 8, 10 - это натуральная соритировка для этих елементов
		// Для PriorityQueue, НАИВЫСШИЙ елемент - это НАИМЕНЬШИЙ елемент
		
		System.out.println(pq.peek()); // выведет елемент с наивысшим приоритетом
		System.out.println(pq.remove()); // удалит елемент с наивысшим приоритетом

	}

}
