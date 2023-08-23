package week3.day3;

public class Automation extends MultipleLanguage implements Language,Testtool{

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium is automation Language");
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java is programming Language");
		
	}
	public void Ruby() {
		System.out.println("Ruby is automated language ");
	}
	public static void main(String[] args) {
		

	Automation cls=new Automation();
     cls.Selenium();
     cls.java();
     cls.python();
     cls.Ruby();
	}
}
