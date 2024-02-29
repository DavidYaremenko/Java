package Stream_interface;

import java.util.Arrays;

import javax.lang.model.element.Element;

public class Stream_forEach { // forEach метод ничего не возвращает, он void(не возвращает ничего).То есть
								// вернуть елементы в новый лист не выйдет, как это можно с другими методами. С
								// его помощью можем пройтись по елементам и вывести их.

	public static void main(String[] args) {

		int[] array = { 5, 9, 3, 8, 1 };
		Arrays.stream(array).forEach(Element -> {
			Element *= 2;
			System.out.println(Element);
		}); // каждый елемент умножаем на 2 и выводим
		Arrays.stream(array).forEach(Element -> System.out.println(Element)); // просто выводим елементы
		Arrays.stream(array).forEach(System.out::println); // метод РЕФЕРЕНС - то есть мы даем ссылку на наш метод
															// println. Джава под капотом понимает, что она должна
															// вставить каждый елемент со стрима в метод println и тем
															// самым вывести его. Это короткая запись варианта выше. До
															// двуеточие указывается КЛАСС, а после двуеточия
															// указывается метод.
		Arrays.stream(array).forEach(Utils::myMethod); // еще один пример. Тут идет прибавление 5 к каждому елементу
														// массива. Utils - класс, myMethod - метод.
		Arrays.stream(array).forEach(el -> Utils.myMethod(el)); // запсиь ЛЯМБДА выражения варианта выше

	}

}

class Utils {

	public static void myMethod(int a) {
		a = a + 5;
		System.out.println("Element = " + a);
	}

}
