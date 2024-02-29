package com.legends.javayoutube;

public class Multidimensional_arrays {

	public static void main(String[] args) {
		
		//int[] numbers = {1,2,3}; - одномерный массив. Чтобы вывести - нужно указать только один индекс
		
		int[][] matrice = {{1,2,3}, // двумерный массив - массив массивов.
				           {4,5,6},
				           {7,8,9}};
		
		
		System.out.println(matrice[2][0]); //[2] обращаемся к последней строке\массиву, [0] обращаемся к числу, которое находится в третьем массиве по индексу 0
		System.out.println(matrice[1][1]);
		
		System.out.println();
		
		String[][] strings = new String[5][2]; // массив с пустыми строкми. [5] - строки, [2] - столбца
		strings[2][0] = "you can"; // помещаем строку по индеку во вторую строку, 0 стобец
		System.out.println(strings[2][0]);
		
		int[][] matrice1 = {{1,2,3,4,5},
		                   {4,5,6},
		                   {7,8,9}};
		for(int i = 0; i < matrice1.length; i++) {  // первый цикл проходится по внешнему массиву(проходится по строкам)
			for(int j = 0; j < matrice1[i].length; j++) {  // вложенный цикл проходится по внутреннему массиву(количество ячеек)
				System.out.print(matrice1[i][j] + " ");  // выводим элемент после каждой итерации 
			}
			System.out.println();   // после каждого выполненного внутрненнго цикла мы переходим на новую строку
		}

	}

}
