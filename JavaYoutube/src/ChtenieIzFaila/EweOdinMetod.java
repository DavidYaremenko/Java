package ChtenieIzFaila;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class EweOdinMetod {

	public static void main(String[] args) throws FileNotFoundException { // filenotfoundexeption будет видно пользователю, если путь к файлу другой
		
		String separator = File.separator; // separator позволит джаве адаптировать поиск к фалу на любой операционной системе
		String path = separator + "Users" + separator + "davidaremenko" + separator + "Desktop" + separator + "test.rtf"; // если на другом комп путь будет такой же - программа сработает
		File file = new File(path);
		
		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine(); // считиваем строку 1 строку из файла. Цикл while не нужен потому что одна строка, а не три
		String[] numbersString = line.split(" "); // создаем массив и split для разделения пробелом
		int[] numbers = new int[3]; // все что ниже сделано для того, чтобі преобразовать строку в числа
		int count = 0;
		for(String number : numbersString) {
			numbers[count++] = Integer.parseInt(number); // метод parseInt преобразовивает строку в число
		}
		
		System.out.println(Arrays.toString(numbers));
		
		scanner.close(); // нужно закривать сканнер каждій раз, чтобі освобождать ресурси и закривать поток
		
	} 
	
	File file = new File("название файла"); // если файл лежит в корне папки проекта, тогда указівать путь нужно так. Без сканера и сепаратора

}
