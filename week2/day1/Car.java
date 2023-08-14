package week2.day1;

public class Car {
	public void drivecar() {
		System.out.println("Car is being Driven");
	}
	public void applybrake() {
		System.out.println("Brake Applied");
				
	}
	public void soundhorn() {
		System.out.println("Horn played ");
			
	}
public boolean ispuncture(boolean a ) {
	System.out.println(a);
	return false;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car hp=new Car();
		hp.drivecar();
		hp.applybrake();
		hp.soundhorn();
		hp.ispuncture(true);
		

	}

}
