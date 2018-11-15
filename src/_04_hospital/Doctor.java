package _04_hospital;

import java.util.ArrayList;

public class Doctor {

	private boolean performSurgery = false;
	private boolean makeHouseCalls = false; 
	ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public Doctor() {
		
	}
	
	
	public void setPerformsSurgery(boolean b) {
		performSurgery = b;
	}
	
	public boolean performsSurgery() {
		return performSurgery;
	}
	
	public void setMakesHouseCalls(boolean b) {
		makeHouseCalls = b;
	}
	
	public boolean makesHouseCalls() {
		return makeHouseCalls;
	}
	
	public void assignPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}
}
