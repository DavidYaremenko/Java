package com.legends.javayoutube;

public class This {

	public static void main(String[] args) {
		
		Human human1 = new Human();
		human1.setName("David");
		human1.setAge(25);
		human1.getInfo();
		

	}
}
	class Human{ // так же  this - способ обратиться к обьекту класса и вызвать его
		String name; // this указывает имеено на эту переменную
		int age;
		
		public void setName(String name) { // в set испозуют всегда this - для того чтобы назначить одинаковое имя переменной в параметрах(name) потому что так удобнее. А если два одинаковых имени переменной - джаава не понимает к какой обращаться и обращается к ближайшей, поэтому this.name обращается именно к переменной в поле обьекта
			this.name = name; // обращается к переменной созданной в классе
		}
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public String getName() {
			return name;
		}
		
		public int getAge() {
			return age;
		}
		
		public void getInfo() {
			System.out.println("Зовут " + name + ", " + age + " лет");
		}
	}


