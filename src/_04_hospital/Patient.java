package _04_hospital;

public class Patient {
	private boolean feelCaredFor = false;
	
	public void checkPulse() {
		setFeelCaredFor(true);
	}
	
	public void setFeelCaredFor(boolean b) {
		feelCaredFor = b;
	}
	
	public boolean feelsCaredFor() {
		return feelCaredFor;
	}
}
