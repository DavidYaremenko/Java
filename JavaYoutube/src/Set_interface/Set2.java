package Set_interface;

import java.util.HashSet;

public class Set2 {

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<Integer>();

		set.add(5);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(8);

		HashSet<Integer> set2 = new HashSet<Integer>();

		set2.add(7);
		set2.add(4);
		set2.add(3);
		set2.add(5);
		set2.add(8);

		// Union - обьединение множества. Метод addAll
		HashSet<Integer> union = new HashSet<Integer>(set); // new HashSet<Integer>(set) поместили в union первый сет. В
															// третьем сете делаем обьединение множества(елементы) с
															// двух сетов в один

		union.addAll(set2); // добавляем в union ndорой сет, тем самым обьединяем сеты

		System.out.println(union); // при обьединении и наличии дубликатов - в конечном итоге их не будет

		// Intersect - пересечение. Выводит общие елементы. Метод retainAll

		HashSet<Integer> intersect = new HashSet<Integer>(set); // new HashSet<Integer>(set) поместили в intersect
																// первый сет. В
		// третьем сете делаем пересечение елементов с
		// двух сетов в один

		intersect.retainAll(set2); // retainAll - оставляет елементы которые есть общие в двух сетах, то есть
									// делает пересечение
		System.out.println(intersect); // ывведет те елементы которые общие для двух сетов

		// Subtract - разность. Метод removeAll. показывает елементы, которые есть в
		// первом сете но нет во втором

		HashSet<Integer> subtract = new HashSet<Integer>(set); // new HashSet<Integer>(set) поместили в union первый
																// сет. В
																// третьем сете делаем обьединение множества(елементы) с
																// двух сетов в один

		subtract.removeAll(set2); // показывает елементы, которые есть в
		// первом сете но нет во втором

		System.out.println(subtract); //
	}

}
