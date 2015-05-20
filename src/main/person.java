package main;

import java.util.UUID;

public class person {
	String FirstName;
	String LastName;
	UUID PersonID;
	public person(String FirstName, String LastName, UUID PersonID) {
		this.PersonID = PersonID;
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public UUID getPersonID() {
		return PersonID;
	}
	public void setPersonID(UUID personID) {
		PersonID = personID;
	}
	
}
