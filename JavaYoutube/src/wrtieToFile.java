import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class wrtieToFile { // запись в файл

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("testFile2"); // создаем обьект класса файла
		
		PrintWriter pw = new PrintWriter(file); // обьект класса принтврайтер через который будем записывать в файл. PrintWriter в этот класс мы можем записать только текст не цифры
		
		pw.println("row 1"); // вызов метода чтобы записывать в файл
		pw.println("row 2");
		pw.println("Fuck yeah");
		
		pw.close(); // всегда нужно закривать
		
	}

}
