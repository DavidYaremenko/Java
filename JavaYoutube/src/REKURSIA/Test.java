package REKURSIA;

public class Test { // Рекурсия - вызов метода в самом методе

/*	public static void main(String[] args) {
		someMethod();
	
	}
	
	private static void someMethod() {
		System.out.println("Hello");
		someMethod();
	}
*/
	
/*	public static void main(String[] args) {
		
		counter(3); // сначала выводится три отсюда, потом проверяет if и идет дальше, где уменьшает на 1
	
	}
	
	private static void counter(int n) {
		
		if (n == 0)
			return;
		
		System.out.println(n);
		
		counter(n - 1);
		
	}
	*/
        public static void main(String[] args) {
        	
        	// факторил ОТ:
        	
        	// 4! = 4*3*2*1
        	// 1! = 1
        	// 15! = 15*14*13*12...*1
        	// 0! = 1
        	
		
        	System.out.println(fac(4));
		
	}
        // fac(4)
        // 4 * fac(3)
        // 3 * fac(2)
        // 2 * fac(1)
        // fac(1) = return 1; и поднимаемся теперь вверх
        private static int fac(int n) { // на вход ставим число
        	if (n == 1) // проверка - если число уже равно 1 то вернуть 1
        		return 1; // возвращаем единицу
        	
        	return n * fac(n - 1); // вернуть число(которое ввели и передали в аргумент), умножить на число которое ввели но при это отнимем от него один. И так выходит что умножаем 4 на 3 и тд
        }
	
}
