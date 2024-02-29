package com.legends.carmanager;

import java.util.Objects;

public abstract class Car implements Serviceable  {

	String name;
	int yerOfProduction;
	int price;
	int weight;
	Color color;
	protected int distanceOnService = 0;
	private double distance = 0.0;
	

	public Car(String name, int yerOfProduction, int price, int weight, Color color) {
		this.name = name;
		this.yerOfProduction = yerOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = color;
	}
	

	@Override
	public String toString() {
		return "Car [name=" + name + ", yerOfProduction=" + yerOfProduction + ", price=" + price + ", weight=" + weight
				+ ", color=" + color + ", distanceOnService=" + distanceOnService + ", distance=" + distance + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price, weight, yerOfProduction);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return color == other.color && Objects.equals(name, other.name) && price == other.price
				&& weight == other.weight && yerOfProduction == other.yerOfProduction;
	}

}
