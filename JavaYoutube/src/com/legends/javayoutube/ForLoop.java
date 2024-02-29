package com.legends.javayoutube;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) { // i - переменная счетчик, которая будет изменятся после каждого цикла.  i <= 10; - это условие, а последнее - что мы будем делать с переменной
			System.out.println("hello "+i);
		}

		for(int i = 9; i >= 1; i--) { // тоже самое только в обратную сторону
			System.out.println("Hello "+i);
		}
	}

}
