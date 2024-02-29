package Exeptions;

public class CheckedUnchecked {

	public static void main(String[] args) { // Исключения деляться на два больших типа:
		// Checked Exception(Compile time exception) - проверенные исключения которые возникают во время компиляции. это были исключения из классов Exception 1\2
		// Unchecked(Runtime Exception) - исключения которые возникают во время выполнения программы
		
		// Unchecked Exceptions = ошибка в роботе программы и поэтому ошибку не нужно обробатывать, а исправлять
		
		int x = 1/0; // ошибка не высвечивается, пока программа не была запущенна. Поэтому это исключение анчекд, потому что возникает в процессе роботи программи

		String name = null; // null в джаве обозначает НИЧТО
		name.length(); // во время выполнения будет ошибка
		
		int[] arr = new int [2]; 
		System.out.println(arr[2]); // во время выполнения будет ошибка потому что нет 2 индекса в массиве, есть только 0, 1
	}

}
