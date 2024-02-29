package Reflection_java;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection1 {

	public static void main(String[] args)
			throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException {

		Class testClass = Class.forName("Reflection_java.Test_class"); // В джаве есть главный класс Class, от которого
																		// идут все остальые классы. Это ПЕРВЫЙ вариант
																		// создания такого класса и в параметры мы
																		// указываем путь к классу, обьект которого
																		// хотим тут создать. В переменной testClass
																		// хранится обьект в виде класса Test_class
		Class testClass2 = Test_class.class; // это ВТОРОЙ вариант создания

		Test_class cl = new Test_class(); // это ТРЕТИЙ вариант создания с созданием сначала обьекта класса test_class,
											// а только
											// потом уже создаем обьект класса Class
		Class testClass3 = cl.getClass();

		testClass.getField("id"); // с помощью метода getField мы получаем поле id из класса Test_class, потому
									// что переменная testClass содержит в себе обьект класса Test_class. getField
									// возвращает FIELD, есть такой класс.
		Field someField = testClass.getField("id"); // передаем в переменную someFiled полученное поле id
		System.out.println("Type of id field = " + someField.getType()); // так мы можем увидеть ТИП поля, вызвав метод
																			// на обьекте getType
		System.out.println(someField);// так можем посмотртеть общую инфу

		Field[] fieldsArray = testClass.getFields(); // метод getFields возвращает массив со всеми полями класса
														// Test_class, поэтому создается переменная fieldsArray в
														// которую запишем массив
		for (Field field : fieldsArray) { // forEachLoop - создаем переменнную field в которую записываем массив
			System.out.println("Type of " + field.getName() + " = " + field.getType()); // field.getName() получаем имя
																						// поля, field.getType()
																						// получаем тип поля
		}

		System.out.println("-----------------------");

		Field[] arrayFields = testClass.getDeclaredFields(); // getDeclaredFields() метод позволяет получить не только
																// публичные поля, но и приватные

		for (Field field1 : arrayFields) {
			System.out.println("Type of " + field1.getName() + " = " + field1.getType());
		}

		System.out.println("-----------------------");

		Method soMethod = testClass.getMethod("increaseSalary"); // getMethod возвращает обьект Method. Метод позвляет
																	// получить методы класса

		System.out.println("Return type of method increaseSalary = " + soMethod.getReturnType()
				+ " - Parameter types = " + Arrays.toString(soMethod.getParameterTypes())); // выводим инфу о типе
																							// метода и его параметры.
																							// Так как
																							// метод getParameterTypes()
																							// возвращает массив, мы
																							// вызываем метод
																							// Arrays.toString чтобы
																							// можно было
																							// прочесть содержимое
																							// массива

		Method soMethod2 = testClass.getMethod("setSalary", double.class); // getMethod возвращает обьект Method. Метод
																			// позвляет
		// получить методы класса. Если в методе есть параметры, мы должны тут в
		// параметрах метода getMethod указать кроме имени метода, еще и тип параметров,
		// которые он принимает

		System.out.println("Return type of method setSalary = " + soMethod2.getReturnType() + " - Parameter types = "
				+ Arrays.toString(soMethod2.getParameterTypes()));
	}

}
