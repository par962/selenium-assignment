package Package.org;

public class Axisbank extends Bankinfo {
	public void deposit() {
		System.out.println("Fixed depoit for senior citizen 8%");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Axisbank info=new Axisbank();
     info.savings();
     info.fixed();
     info.deposit();
	}

}
