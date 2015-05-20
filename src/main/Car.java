package main;

import java.util.UUID;

public class Car implements Vehicle {
	int NumberOfDoors;
	
	public Car(int NumberOfDoors, person a) {
		this.NumberOfDoors = NumberOfDoors;
	}

	
	@Override
	public
	void transferOwnership(person newOwner) {
		
		
	}
}
