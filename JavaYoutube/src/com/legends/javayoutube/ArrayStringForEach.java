package com.legends.javayoutube;

public class ArrayStringForEach {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		numbers[0] = 10; // сразу проинициализировали.
		
		String[] strings = new String[3]; //массив содержит 3 обьекта класса стринг
		strings[0] = "hey";
		strings[1] = "you";
		strings[2] = "can";
		
		for(int i = 0; i < strings.length; i++) { // выводим массив с помощью цикла
			System.out.println(strings[i]);
		}
		
		System.out.println();
		
		////////цикл For Each - проходится по каждому елементу массива последовательно и в теле этого цикла мы можем что то делать с каждым из елементов/////////////////
		
		for(String string : strings) {  // for(тип данных переменная внутри цикла  : имя массива)
			System.out.println(string); // вывод массива
		}
		
		System.out.println();
		
		int[] numbers1 = {1,2,3}; // массив с занятыми ячейками
		int sum = 0; 
		
		for(int number : numbers1) { // после каждой итерации в number заходит елемент массива
			sum = sum + number; // и после каждой итерации в sum записывается число из number. После этого в sum переписывается и плюсуется число поступившее в number и sum
		}
		System.out.println(sum);
		
	}

}
