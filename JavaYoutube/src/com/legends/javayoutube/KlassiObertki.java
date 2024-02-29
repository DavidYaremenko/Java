package com.legends.javayoutube;

public class KlassiObertki {

	public static void main(String[] args) { // у примитивних типов данних нет методов, и чтобі можно біло к ним их применить и нужні КЛАСС-ОБЕРТКА
		// КЛАССІ ОБЕРТКИ: Double, Float, Long, Integer, Short, Byte, Character, Boolean каждій соответствует своему типу данніх
		
		int x = 2;
		Integer x2 = new Integer(123); // таким образом создается класс
		x2.parseInt("123");  // метод позволяет перевести строку в целое число
		
		//АВТОУПАКОВКА и АВТОРАСПОКОВКА
		Integer x3 = 123; // єто АВТОУПАКОВКА, аналог Integer x2 = new Integer(123);
		int a = x3; // АВТОРАСПАКОВКА - то есть распаковали в int a, то что упаковали в Integer
			

	}

}
