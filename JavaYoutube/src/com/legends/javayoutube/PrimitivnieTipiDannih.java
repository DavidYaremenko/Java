package com.legends.javayoutube;

public class PrimitivnieTipiDannih {

	public static void main(String[] args) {
	  //Примитивніе типи данних: int(32 bit\4 byte), short(16bit), byte(128 - 127),long(64bit),double(64bit),float(32bit)
		// они просто хранят данніе, а ссилочній тип данних на что то ссілаются
		
		float f = 123.2F; // F нужно добавлять чтобы не было ошибки
		
		long l = 12322L;
		int x = (int)l; // чтобі поместить данніе из long нужно конвертировать с помощью (int), (float), (double)
		
		double a = 125.6;
		int y = (int)a; // віведет только целую часть (125), а вещественную (.6) нет
		long r = Math.round(a); // с помощью метода Math получится вівести число которое округлится до 126
		
		byte e = (byte)128;
		
		char c = 'a'; // символочный тип данных который пишем в одинарных ковычках
		
		boolean b = true; // логический тип данных
		
		System.out.println(r);
	}

}