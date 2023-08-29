package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name= "parthasaradi";
 char[] charArray=name.toCharArray();
 Set<Character>unique=new LinkedHashSet<Character>();
 
 for (Character ch : charArray) {
	if (unique.contains(ch)) 
unique.remove(ch);
	 else 
		 unique.add(ch);
}
 System.out.println("Unique Character :");
 System.out.println(unique);
}
	}


