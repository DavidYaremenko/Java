package ENUM;

public enum Animal {
	DOG("собака"),CAT("кот"),FROG("жаба");
	
	//Animal animal = new DOG("собака") эквивалент этому при создании обьекта как делаем обычно
	
	private String translation;
	
	private Animal(String translation) { // создаем конструктор для создания перевода животних. При создании конструктора обьекти ЕНАМА не доступны и чтобы работали в их аргументы мы передаем перевод животних
		this.translation = translation;
	}
	
	public String getTranslation() { // метод возвращает перевод
		return translation;
	}
	
	public String toString() { // в енамах можно переопределять методы. Переопределение метода toString(метод выводится автоматически на экран при вызове строк)
		return "Перевод на русский язык " + translation;
	}

}
