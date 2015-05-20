package main;

import java.util.UUID;

public class TestVehicle {

	person a = new person("Joe", "Smith",UUID.randomUUID() );
	Car car1 = new Car(4, a);
	Truck truck1 = new Truck(2, a);
	person b = new person("Jason", "Berger", UUID.randomUUID());
	void transferOwnership(person b) {
	}
	MotorCycle motor1 = new MotorCycle(false);
}
