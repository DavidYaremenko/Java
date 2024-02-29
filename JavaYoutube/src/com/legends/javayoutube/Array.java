package com.legends.javayoutube;

public class Array { // по дефолту, все пустые ячейки массива содержат цифру 0

	public static void main(String[] args) {
		//int number = 10; //примитивный тип данных
		//char charachter = 'a'; //примитивный тип данных
		//String s = "Hello"; // вообще стринг это класс, а ХЕЛЛО обьект - ссылочний тип данных \\ String s = new String("Hello") можно и так
	    int number = 10;                            // [10] - тут переменная содержит 10 b 'nj ghbvbnbdysq nbg lfyys[
	    int[] numbers = new int[5];               // А тут переменная numbers ссылается на массив new int[5] - переменная ссылается на массив, поэтому ссsлочний тип данних
	    
	    for(int i = 0; i < numbers.length; i++) { // Сейчас массив пустой и содержит пустых 5 ячеек.Чтобы поместить в него числа проводится инициализация с помощью цикла. 
	    	numbers[i] = i*10; // numbers[i] - обращается к каждой ячейке массива и записывает в нее число i*10 - первая итерация 0 умножается на ноль, значит i не больше длины массива и тд
	    }
	    
	    for(int i = 0; i < numbers.length; i++) { // вывод масива
	    	System.out.println(numbers[i]);
	    }
	    System.out.println();
	    int[] numbers1 = {1,2,3,4}; // пример инициализации масива если знаем какие числа должны быть в ячейках
	    for(int i = 0; i < numbers1.length; i++) {
	    	System.out.println(numbers1[i]);
	    }
	}

}
