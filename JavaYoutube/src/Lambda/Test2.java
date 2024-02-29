package Lambda;

public class Test2 {

	public static void main(String[] args) {

		def((String s) -> {
			return s.length();
		}); // передаем строку из метода и возвращаем длину этой строки.Мы указали в
			// интерфейсе int и поэтому джава будет ждать именно этот тип данных. Переменная
			// s видная только в теле лямбды выражения

	}

	static void def(I i) {
		System.out.println(i.abc("Privet")); // i - это обьект I, на нем мы вызываем метод abc
	}

}

interface I {
	int abc(String s);
}