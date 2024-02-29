package Lambda2_povtor;


public class CheckOverInterface implements StudentChekInterface { // Класс который обзяуется реализовать метод интерфейса
	
	
	public boolean check(Student2 s) {
		return s.avgGrade > 6; // указываем выше какой оценки нужно вывести студентов. То есть метд нам вернет ТРУ и выведет студентов с оценкой выше 6 если они есть, (!указав, что S - студенты.поле по которму проввреям)
								
	}

}
