package ChtenieIzFaila;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import AnonimnieClassi.Test;

public class ChtenieFaila {

	public static void main(String[] args) throws FileNotFoundException { // filenotfoundexeption будет видно пользователю, если путь к файлу другой
		
		String separator = File.separator; // separator позволит джаве адаптировать поиск к файлу на любой операционной системе
		String path = separator + "Users" + separator + "davidaremenko" + separator + "Desktop" + separator + "test.rtf"; // если на другом комп путь будет такой же - программа сработает
		File file = new File(path); // path переменная с указанным путем к файлу
		
		Scanner scanner = new Scanner(file); // указываем тип потока файл
		while(scanner.hasNextLine()) { // метод возвращет true если есть строки для чтения и false если уже таких строк нет

			System.out.println(scanner.nextLine()); // метод nextLine будет выводить строки в консоль из файла
	}
		
		scanner.close(); // нужно закрывать сканнер каждый раз, чтобы освобождать ресурсы и закрывать поток
		
	} 

}
