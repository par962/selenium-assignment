package week2.day1;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] data={3,2,11,4,6,7};
Arrays.sort(data);

int secondlargest=data[data.length-2];

 System.out.println("The Second Largest Number is  "+secondlargest);
 

	}

}
