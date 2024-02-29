package Exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeptions1 { //ОБРОБОТКА ИСКЛЮЧЕНИЙ - это обработка ошибки программы для более ясного восприятия - вместо красного уведомления вывести четкий текст
// Исключения - обьект класса exeption
	public static void main(String[] args){
		File file = new File("asdasd");
		
	try { // в данном варианте обработки исключения идет попытка джавы выполнить задачу, и если не получается то идем в catch
		Scanner scanner = new Scanner(file); 
		
		System.out.println("после сканнер"); // если в сканере встречается ошибка то все что в блоке try не видно
	} catch (FileNotFoundException e) { // обрабатываем исключение. автоматически создается обьект и переменная
		System.out.println("Файл не найден"); //ТУТ ми можем писать свою обработку и выводим если появиться исключение
	}

	}
	
	//public void readFile() { создав метод и поместив в него методы чтения файлов, после вызвав это все в мейне, нужно будет в самом мейне так же обработать исключение как и сделали выше с помощью try\cath точно так же
	//File file = new File("asdasd");
	//Scanner scanner = new Scanner(file); 
	
}
