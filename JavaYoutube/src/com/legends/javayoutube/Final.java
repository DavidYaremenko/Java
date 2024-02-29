package com.legends.javayoutube;

public class Final { // слово FINAL обозначает переменную, которую нельзя изменить. То есть константа

	public static void main(String[] args) {
		
		final int X = 5;
		System.out.println(X);
		

	}

}

class Test{
	
	public static final int CONSTANT = 10; // переменным с final нужно давать static для того, чтобы ми могли обращаться к ней. Переопределить ее мы никак не можем после инициализации

	
}
