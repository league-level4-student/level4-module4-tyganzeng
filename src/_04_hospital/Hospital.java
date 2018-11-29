package _04_hospital;

import java.util.ArrayList;

public class Hospital {

	ArrayList<Doctor> doctors;
	ArrayList<Patient> patients;
	
	public Hospital() {
		doctors = new ArrayList<Doctor>();
		patients = new ArrayList<Patient>();
	}
	
	public void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	public ArrayList<Doctor> getDoctors(){
		return doctors;
	}
	
	public void addPatient(Patient p) {
		patients.add(p);
	}
	
	public ArrayList<Patient> getPatients(){
		return patients;
	}
	
	public void assignPatientsToDoctors() {
		int count = 0;
		for(Patient p : patients) {
			try {
				doctors.get(count).assignPatient(p);
			} catch (DoctorFullException dfe) {
				count++;
				try {
					doctors.get(count).assignPatient(p);
				} catch (DoctorFullException e) {
					
				}
			}
		}
	}
	
}
