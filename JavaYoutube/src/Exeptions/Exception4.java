package Exeptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception4 {

	public static void main(String[] args) {

		/*
		 * try { // можно в методе указать исключения и обрабатывать их во время вызова этого метода. 
		 *     run(); 
		   } catch (IllegalArgumentException | IOException | ParseException e) { // мультикэтч - когда через | перечисляем все исключения чтобы не писать много catch 
		     e.printStackTrace(); 
		 * }
		 * 
		 * }
		 * 
		 * public static void run() throws IOException, ParseException, IllegalArgumentException {
		 * 
		 * }
		 * 
		 */

		try {
			run();
		} catch (Exception e) { // Exception e родитель всех исключение и если его поставить то все исключение можно обработать в этом блоке
			e.printStackTrace();
		}

	}

	public static void run() throws IOException, ParseException, IllegalArgumentException {

	}

}
