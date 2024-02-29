package Stream_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Stream_reduce { // метод reduce - возвращает со стрима всегда только один елемент. То есть с ним
								// удобно искать сумму всех елементов и тд. Метод возвращает optional, чтобы с
								// него получить и вывести елемент нужно использовать get()

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(5);
		list.add(8);
		list.add(2);
		list.add(4);
		list.add(3);

		// ПЕРВЫЙ ВАРИАНТ РАБОТЫ МЕТОДА reduce
		int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();

		System.out.println(result);

		// есть елементы - 5, 8, 2, 4, 3
		// accumulator = 5, 40, 80, 320, 960 - после первого умножения(5*8), accumulator будет содержать в себе сумму после умножения елементов
		// element = 8, 2, 4, 3
		// акк(5) * еле(8) = 40(записывается в акк). После идет - 2*40 = 80(записали в
		// акк). После 4*80 = 320. После 3*320 = 960
		
		
		//ВТОРОЙ ВАРИАНТ РАБОТЫ МЕТОДА reduce
		int result2 = list.stream().reduce(1,(accumulator, element) -> accumulator * element); // 1 - это цифра будет стоять в accumulator первой

		System.out.println(result2); // в этом варианте не нужно использовать get потому что reduce вернет integer из за того что мы указали в него сразу 1
		
		// accumulator = 1, 5, 40, 80, 320, 960
			// element = 5, 8, 2,   4,  3
		
		//ТРЕТИЙ ВАРИАНТ РАБОТЫ СО СТРИНГАМИ
		
		List<String> list3 = new ArrayList<String>();
		
		list3.add("privet");
		list3.add("kak dela");
		list3.add("ok");
		list3.add("poka");
		
		String result3 = list3.stream().reduce((accumulator, element) -> accumulator+ " " + element).get(); // тут мы делаем конкотинацию строк
		System.out.println(result3);
		
		// КАК РАБОТАЕТ OPTIONAL
		//Optional полезен там, где значение может быть null, и вы хотите предотвратить NullPointerException и явно обработать ситуацию отсутствия значения. 
		//Вместо того чтобы возвращать null или проверять на null каждый раз, когда вы используете метод или функцию, вы можете использовать Optional, 
		//чтобы сделать ваш код более чистым и явно обозначить, что метод может возвращать отсутствие значения.
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		Optional<Integer> op = list1.stream().reduce((accumulator, element) -> accumulator * element); // так у нас ошибка не выскачит 
		
		if(op.isPresent()) { // метод sPresent поверяет есть ли елементы в листе
			System.out.println(op.get()); // выведи если есть
		}else {
			System.out.println("Not present"); // выведи если нет
		}
		
		int result1 = list1.stream().reduce((accumulator, element) -> accumulator * element).get(); // если лист пустой, то из за get будет ошибка, чтобы ее не было СМОТРИ DЫШЕ
		
		
	}

}
