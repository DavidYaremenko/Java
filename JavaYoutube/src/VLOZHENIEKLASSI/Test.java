package VLOZHENIEKLASSI;

public class Test {

	public static void main(String[] args) {
		Electrocar electrocar = new Electrocar(1);
		electrocar.start();
		
		Electrocar.Battery battery = new Electrocar.Battery(); // так мы обращаемся к вложенному статическому классу
		battery.charge();

	}

}
