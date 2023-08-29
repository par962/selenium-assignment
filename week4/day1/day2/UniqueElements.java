package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[] nums= {10,2,3,4,3,4,5,2,7,1};
		Set<Integer> unique =new LinkedHashSet<Integer>();
		
 for (Integer integer : nums) {
	 unique.add(integer);
	 
	
}
 System.out.println("unique:");
 System.out.println(unique);
 
	}

}
