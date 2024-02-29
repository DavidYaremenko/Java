package com.legends.carmanager;

import java.util.Objects;

public class Motorcycle {

	String name;
	int yearOfProduction;
	int price;
	int weight;
	Color color;
	String engineType;
	int distance = 0;
	int distanceService = 0;
	
	public Motorcycle(String name, int yearOfProduction, int price, int weight, Color color, String engineType,
			boolean isReadyToDrive) {
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
		this.engineType = engineType;
	
	}
	
	public void addMotoDistance(int addMotorDistance) {
		distance += addMotorDistance;
		distanceService += addMotorDistance;
	}
	
	public boolean IsReadyToServiceMoto() {
		if(distanceService > 8000)
			return true;
		return false;
	}
	
	
	public int getDistance() {
		return (int) distance;
	}

	public int getDistanceService() {
		return distanceService;
	}

	@Override
	public String toString() {
		return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", engineType=" + engineType + ", distance=" + distance
				+ ", distanceService=" + distanceService + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, distance, distanceService, engineType, name, price, weight, yearOfProduction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorcycle other = (Motorcycle) obj;
		return color == other.color && distance == other.distance && distanceService == other.distanceService
				&& Objects.equals(engineType, other.engineType) && Objects.equals(name, other.name)
				&& price == other.price && weight == other.weight && yearOfProduction == other.yearOfProduction;
	}
	
	
	

}
 