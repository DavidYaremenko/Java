package Reflection_java;

public class Test_class { // Рефлексия - это механизм исследования данных о программе во время ее
							// выполнения. Рефлексия помогает исследовать информацию о полях, методах,
							// конструкторах и других состовляющх класса.
	
	public int id;
	public String name;
	public String department;
	private double salary;
	
	public Test_class() {} // пустой конструктор
	
	

	public Test_class(int id, String name, String department) { // конструктор с полями кроме salary
		
		this.id = id;
		this.name = name;
		this.department = department;
		
	}



	public Test_class(int id, String name, String department, double salary) { // констурктор со всеми полями
		
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}



	public double getSalary() { // создали гет и сет для приватного поля salary
		return salary;
	}



	public void setSalary(double salary) {// создали гет и сет для приватного поля salary
		this.salary = salary;
	}

	private void changeDepartment(String newDepartment) { // private метод который перезаписывает переменную department
		
		department = newDepartment;
		System.out.println("New department is "+department);
		
	}
	
	public void increaseSalary() {
		salary*=2;
	}
	

	@Override
	public String toString() {
		return "Reflection1 [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}


}
