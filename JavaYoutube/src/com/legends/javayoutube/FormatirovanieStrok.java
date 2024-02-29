package com.legends.javayoutube;

public class FormatirovanieStrok {

	public static void main(String[] args) {
		System.out.print("Auch"); // метод print не переносит на следующую строку
		System.out.println("Hello");
		System.out.println();
		
		System.out.printf("%fThis is %s a string, %d", 5.2, "NICE", 10); // %s - место вставляемого значение(в данном случае NICE становиться на место %s.
		// %d - вставка цифр, %f - число с запятой, 

		System.out.println();
		
		System.out.printf("String %10d \n", 652 ); // %10d - создает место в 10 символов окончательного числа. Только 10 символов может поместится
		System.out.printf("String %10d \n", 5 ); // \n - делает перенос на новую строку
		System.out.printf("String %10d \n", 100000 );
		System.out.printf("String %10d \n", 10000000);
		
		System.out.println();
		
		System.out.printf("String %d \n", 652 ); // %10d - создает место в 10 символов окончательного числа. Только 10 символов может поместится
		System.out.printf("String %d \n", 5 ); // \n - делает перенос на новую строку
		System.out.printf("String %d \n", 100000 );
		System.out.printf("String %d \n", 10000000);
		
		System.out.println();
		
		System.out.printf("String %.2f \n", 45.2 ); // %.2f - задает правило, что после точки будет максимум 2 числа и округляет в плюс
		System.out.printf("String %.2f \n", 45.2555 );

	}

}
