package week3.day3;

public class Samsung extends Androidtv implements Android {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung lm=new Samsung();
		lm.openApp();
		lm.watchviddeo();
	}

	public void anApp() {
		System.out.println("App is Running");
		
	}

	public void watchviddeo() {
	System.out.println("Vidoe is Recorded");
		
	}

}
