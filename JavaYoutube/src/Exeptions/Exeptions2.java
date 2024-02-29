package Exeptions;

import java.io.IOException;
import java.util.Scanner;

public class Exeptions2 { // відаем исключение

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(System.in); // человек должен ввести 0

		while (true) { // while(true) означает бесконечный цикл который будет крутится пока программу
						// не остановим
			int x = Integer.parseInt(scanner.nextLine()); // переобразовываем строки в числа. В переменную Х помещаем то
															// что ввел человек

			if (x != 0) { // если человек не ввел 0 - выдать ошибку

				try {
					throw new IOException(); // добавляем новое исключение в случае если прведение человека не по
												// плану(введет не ноль) и выведет оишбку. IOException() исклюение на
												// ввод и вывод данных
				} catch (IOException e) {
					System.out.println("Введено что то кроме 0");
				}

			}
		}

	}

}

class Exeptions6 { // Используем свое созданное исключение с класса Сканнер

	public static void main(String[] args) throws ScannerException {

		Scanner scanner = new Scanner(System.in); // человек должен ввести 0

		while (true) { // while(true) означает бесконечный цикл который будет крутится пока программу
						// не остановим
			int x = Integer.parseInt(scanner.nextLine()); // переобразовываем строки в числа. В переменную Х помещаем то
															// что ввел человек

			if (x != 0) { // если человек не ввел 0 - выдать ошибку

				throw new ScannerException("Error"); // в качестве аргумента передаем сообщение
			}

		}
	}
}
