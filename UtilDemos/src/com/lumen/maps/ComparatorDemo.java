package com.lumen.maps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
	public static void main(String[] args) {
		VehicleClass Vehicle1 = new VehicleClass("car","bmw",12344.99);
		VehicleClass Vehicle2 = new VehicleClass("bike","ktm",1278.00);
		VehicleClass Vehicle3 = new VehicleClass("jeep","jh",12346.00);
		VehicleClass Vehicle4 = new VehicleClass("boat","jth",15644.00);
		

	
	List<VehicleClass> Vehicles=new ArrayList<>();
	Vehicles.add(Vehicle1);
	Vehicles.add(Vehicle2);
	Vehicles.add(Vehicle3);
	Vehicles.add(Vehicle4);
	
	for(  VehicleClass vehicle : Vehicles) {
		System.out.println(vehicle);
		
		Collections.sort(Vehicles,(Vehicle o1,Vehicle o2)->{
			return o1.getbrand().compareTo(o2.getBrand());
			
		}new ModelSort());
	}
	
	System.out.println("List of vehicles");
	Comparator<VehicleClass> comparator = new BrandSort();
	Collections.sort(Vehicles, comparator);
	for(VehicleClass vehicle : Vehicles) {
		System.out.println(vehicle);
		
	}
	System.out.println("sorting using model"); 
	Collections.sort(Vehicles, new ModelSort());
	for(VehicleClass vehicle : Vehicles) {
		System.out.println(vehicle);
		
	
	}
	System.out.println("sorting using price"); 
	Collections.sort(Vehicles, new PriceSort());
	for(VehicleClass vehicle : Vehicles) {
		System.out.println(vehicle);
		
	
	
	}
}
}




