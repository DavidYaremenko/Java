package com.legends.carmanager;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {
	
		Car prius = new PassengerCar("Toyota Prius", 2008, 15000, 1200, Color.GREEN);
				
		Car renault = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		Car renault2 = new Bus("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(prius);
		cars.add(renault);
		cars.add(renault2);
		
		System.out.println(cars);
		
		Motorcycle suzuki = new Motorcycle("Suzuki GSX-R1000", 2021, 16000, 600, Color.BLACK, "diesel", true);
		
		Motorcycle yamaha = new Motorcycle("Yamaha  FZ1", 2007, 9000, 700, Color.ORANGE, "gas", false);
		
		prius.addDistance(15000);
		renault.addDistance(15000);
		
		
		System.out.println(prius);
		System.out.println(renault);
		System.out.println(renault2);
	
		
		suzuki.addMotoDistance(10000);
		yamaha.addMotoDistance(5000);
		

		
		System.out.println(suzuki);
		System.out.println(yamaha);
		
		System.out.println(yamaha.equals(suzuki));
		System.out.println(renault.equals(renault2));
		
		System.out.println(prius.IsReadyToService());
		System.out.println(renault.IsReadyToService());
		
		System.out.println(suzuki.IsReadyToServiceMoto());
		System.out.println(yamaha.IsReadyToServiceMoto());
		


	}
	
}
