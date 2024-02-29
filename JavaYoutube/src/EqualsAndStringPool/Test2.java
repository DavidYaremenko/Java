package EqualsAndStringPool;

public class Test2 {

	public static void main(String[] args) {
		
		String string1 = "Hello"; // String string1 = new String(Hello) аналог написания
		String string2 = "Hello"; // String pool(где хранятся все данные джавы под капотом) - это когда джава автоматически ссылает второй(string2) на обьект "Hello" первого(string1), потому что первый обьект с таким же названием зарезервировал память в компе первее

		System.out.println(string1.equals(string2));
		
		String a = "hello";
		String b = "hello123".substring(0, 5); // метод substring вырезает элементы. первое число - откуда оставить элемент, второе - на каком элементе закончить. все остальное будет вырезано
		
		System.out.println(b);
	}

}

class Animal2 {
	private int id;
	
	public Animal2(int id) {
		this.id = id;
	}
	
	public boolean equals(Object obj) { // переобпределенре метода строго по его сигнатуре
		Animal2 otheranimal = (Animal2) obj; // применяем Downcasting 
		
		return this.id == otheranimal.id; // сравниваем два примитива обьекта
	}
}
