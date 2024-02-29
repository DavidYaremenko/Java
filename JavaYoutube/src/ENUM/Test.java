package ENUM;

public class Test { // ЕНАМ - это перечисление. По сути список 
	

	public static void main(String[] args) {
		
	Animal animal = Animal.CAT; // так мы обращаемся к енам и помещаем его в переменную
	animal.getTranslation(); // вызываем метод перевода животного
	
	System.out.println(animal);
		
		switch(animal) { // методом перебора джава находит то, что поместили в переменную
		
		case DOG:
			System.out.println("This dog");
			break;
		case CAT:
			System.out.println("This cat456");
			break;
		case FROG:
			System.out.println("This frog");
			break;
		default:
			System.out.println("This animal");
			break;
		
		}
		
		
		//Season season = Season.AUTUMN;
		
		// Object -> Enum -> Season это иерархия наследования
		
	//	switch(season) {
		//case AUTUMN:
		//System.out.println("Rain on street");
			//break;
		//case WINTER:
		//	System.out.println("Its cold outside");
		//	break;
		//}


	Season season = Season.AUTUMN;
	season.getTemp();
	
	System.out.println(season.name()); // метод name возвращает название енама в виде строки
	
	Season winter = Season.valueOf("WINTER"); // valueOf метод показывает содержимое енама. НАпример когда нам нужно из строки получить енам
	System.out.println(winter.getTemp());
	
	Season autumn = Season.AUTUMN;
	System.out.println(autumn.ordinal()); // ordinal метод показывает индекс енама в списке
	
	}

}
