package com.legends.javayoutube;

public class If { // Это условный оператор

	public static void main(String[] args) {
		
		int myInt = 15;
		if(myInt < 10) { // он срабатывает если в условии True, если False тогда будет работать else
		System.out.println("yes");
		} else if(myInt > 20) { // и в такой вариации тоже не сработаетае, потому что вернет false
			System.out.println("no");
		} else {
			System.out.println("noyes"); // тут уже выведет, потому что все условия дали false
		}

	} // если первое условие возвращает true - все остальные условия программа уже не проверяет

}
