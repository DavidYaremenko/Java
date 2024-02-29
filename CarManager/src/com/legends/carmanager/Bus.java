package com.legends.carmanager;

public class Bus extends Car {

	public Bus(String name, int yerOfProduction, int price, int weight, Color color) {
		super(name, yerOfProduction, price, weight, color);
		
	}

	@Override
	public boolean IsReadyToService() {
		if(distanceOnService > 50000) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public void addDistance(int additinalDistance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addDistance(double additinalDistance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDistanceOnService() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
