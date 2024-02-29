package Projects;

import java.security.PublicKey;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		int number = input.nextInt();

		System.out.print("Что хотим сделать: ");
		char operation = input.next().charAt(0);
		
		System.out.print("Введите второе число: ");
		int number2 = input.nextInt();

		if (operation == '+') {
			int result = number + number2;
			System.out.println("Результат: " + result);
		} else if (operation == '-') {
			int result = number - number2;
			System.out.println("Результат: " + result);
		} else if (operation == '/') {
			int result = number / number2;
			System.out.println("Результат: " + result);
		} else if (operation == '*') {
			int result = number * number2;
			System.out.println("Результат: " + result);
		} else {
			System.out.println("Нет, нужно ввести: +, -, /, *");
		}

	}
}