package com.legends.javayoutube;

public class WhileLoop { // while работает с булеан значениями. То есть в данном примере если переменная больше 5 то логически будет тру и тогда выведет хелло

	public static void main(String[] args) {
		
		//int value = 10;
		
		//while(value > 5) { // while работает с булеан значениями. То есть в данном примере если переменная больше 5 то логически будет тру и тогда выведет хеллоd
		//	System.out.println("Hello");
		//}
		
		int value = 0;
		
		while(value < 5) { // цикл работает пока в условии будет тру
			System.out.println("hello");
			value = value+1; //каждый раз когда прозодит один цикл, переменная увеличивается на 1
		}
	}

}
