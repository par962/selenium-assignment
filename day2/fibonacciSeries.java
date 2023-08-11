package week1.day2;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=0,n2=1,i,range =10, sum=0;

System.out.println("First 10 number fibonacci series");
System.out.println(n1);
System.out.println(n2);
for (i=2;i<=range;i++) {
	sum=n1+n2;
	System.out.println(sum);
	n1=n2;
	n2=sum;
}
	}

}
