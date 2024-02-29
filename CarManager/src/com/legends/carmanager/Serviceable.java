package com.legends.carmanager;

public interface Serviceable {
	
	public boolean IsReadyToService();
	public void addDistance(int additinalDistance);
	public void addDistance(double additinalDistance);
	public int getDistanceOnService();
    public int getDistance();

}
