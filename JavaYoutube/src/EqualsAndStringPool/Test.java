package EqualsAndStringPool;

public class Test {

	public static void main(String[] args) { 
		
		// animal -> (1) несмотря на то что обькты одинаковые под капотом они хранятся в разных участках памяти
		// animal2 -> (1) указатели(animal) разные и указывают на разные участки памяти
		
		
		Animal animal = new Animal(1);
		Animal animal2 = new Animal(1);
		
		//System.out.println(animal == animal2); // знак "==" сравнивает указатели(ссылки) на обьекты, а не сами обьекты
		
		System.out.println(animal.equals(animal2)); // метод так же сравнивает ссылки и для того, чтобы можно было сравнить обьекти структурно, нужно переопределить метод в классе Animal

	}

}

// equals определен в классе Object, Для того чтобы сравнивать обьекты стурктурно нужно переопределить метод в классе Animal

class Animal {
	private int id;
	
	public Animal(int id) {
		this.id = id;
	} 
	
	public boolean equals(Object obj) { // переопределенре метода строго по его сигнатуре. в аругменты передаем то с чем он себя будет сравнивать в данном случае обьекты класса анимал
		Animal otheranimal = (Animal) obj; // применяем Downcasting. Создаем обьект класса анимал и приравниваем класс анимал к классу обжект
		
		return this.id == otheranimal.id; // сравниваем два обьекта
	}
}
