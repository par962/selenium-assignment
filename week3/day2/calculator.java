package week3.day2;

public class calculator {
	public void add(int x,int y) {
	       System.out.println(x+y);
		}


		public void add(int x,int y,int z) {
			 System.out.println(x+y+z);
		}
public void mul(double x,double y) {
	System.out.println(x*y);
	
	
}

public void mul(float x,float y) {
System.out.println(x*y);	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
calculator cal=new calculator();
cal.add(7, 4);
cal.add(5, 8, 6);
cal.mul(10, 20);
cal.mul(0.5, 0.8);
	}

}
