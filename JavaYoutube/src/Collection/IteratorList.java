package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class IteratorList { // ListIterator - имеет больше методов чем простой iterator

	public static void main(String[] args) { // тут пример на полиндром - когда слово читается с разных сторон одинаково
		String s = "madam";
		
		List<Character> charList = new LinkedList<>();
		
		for(char ch : s.toCharArray()) { // метод toCharArray - переводит строку в массив из символов
			
			charList.add(ch); // тут мы массив из символов добавляем в лист
			
		}
		
		ListIterator<Character> iterator = charList.listIterator(); // этот ЛистИтератор начинает перебирать символы сначала
		
		ListIterator<Character> reverseiterator = charList.listIterator(charList.size()); // этот ЛистИтератор начинает перебирать символы с конца так как мы указали метод size - он начнет с конца то есть 5 елемента

		 boolean isPolindrom = true;
		 
		 while(iterator.hasNext() && reverseiterator.hasPrevious()) { //iterator.hasNext() ищет елемент вначале и reverseiterator.hasPrevious() ищет елемент в конце
			 if(iterator.next() != reverseiterator.previous()) { // если первый елемент next() не равен первому елементу в конце previous() - закончить проверку
				 isPolindrom = false;
				 break;
			 }
		 }
		 if(isPolindrom) {
			 System.out.println("Polindrom");
		 }else {
			 System.out.println("NOT Polindrom");
		 }
	}
	
	

}
