package week2.day1;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,6,7,8,};
		int j=0;
		for (int i = arr[0]; i <=arr[ arr.length-1]; i++) {
			if (j<arr.length && i==arr[j]) {
				j++;
			} else {
				System.out.println("The missing element is " + i);

			}
			
		}

	}

}
