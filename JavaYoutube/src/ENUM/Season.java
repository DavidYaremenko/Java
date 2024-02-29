package ENUM;

public enum Season {
	
	WINTER(-20),SPRING(15),SUMMER(30),AUTUMN(10); // это обьекти ЕНАМА по сути обьекты класса season
	
	private int temperature;
	
	private Season(int temperature) {
		this.temperature = temperature;
	}
	
	public int getTemp() {
		return temperature;
	}

}
