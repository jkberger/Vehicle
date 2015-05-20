package main;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public interface Vehicle{
	public abstract class vehicle {
	String	Name;
	String	Color;
	int 	Weight;
	person Owner;
	
	
	Map<String, vehicle> map = new HashMap<String,vehicle>();
	map.put("a", new Car());
	map.put("b", new Truck());
	map.put("c", new MotorCycle());
	

	}	
	abstract void transferOwnership(person newOwner);
	
}

