package com.legends.javayoutube;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // создаем обьект класса сканер с входным потоком данных
		System.out.println("Введите возраст");
		int age = scanner.nextInt();
		// String age = scanner.nextLine() так же с switch можем использовать и стринговые данные
		
		switch(age) { // в условии указываем переменную которую хотим проверить на наличие введенной информации
		case 0: 
			System.out.println("Ты родился");
			break; // break становится для того, чтобы цикл закончился, если было введено условие, которое ждет кейс
		case 8:
			System.out.println(" Ты пошел в школу");
			break;

		case 18: 
			System.out.println("Ты идешь в коледж");
			break;
			
		default :  // default - выводится, если ни одно из введенных условий не подходиьт
			System.out.println("Не понятно где ты");
		}
		

	}

}
