package com.legends.javayoutube;

import java.util.Scanner; // при использовании класса Scanner нужно сделать импорт

public class Scannerr {

	public static void main(String[] args) {

		//Scanner s = new Scanner(System.in); // Создаем обьект класса Scanner. System.in - входной поток данных
		//System.out.println("Введите что нибудь");
		//String string = s.nextLine(); // тут мы вызываем метод класса Scanner - nextLine(), который считает одну строчку с клавиатуры чего либо. И в переменной string будет храниться то что ввели с клавиатуры
		//System.out.println("Вы ввели "+ string);

		Scanner s = new Scanner(System.in); // Создаем обьект класса Scanner. System.in - входной поток данных
		System.out.println("Введите какое нибудь число");
		int x = s.nextInt(); // тут мы вызываем метод класса Scanner - nextInt(), который считает целые числа с клавиатуры. И в переменной х будет храниться то что ввели с клавиатуры
		System.out.println("Вы ввели "+ x);
	}

}

