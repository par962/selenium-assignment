package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="PayPal India";
		
		char[] charArray=text.toCharArray();
		 Set<Character> charname=new LinkedHashSet<Character>();
		 Set<Character> dupname=new LinkedHashSet<Character>();
		  for (Character character : charArray) {
			  if (charname.contains(character)) {
				  dupname.add(character);
				
			}
			  else {
				charname.add(character);
				
			}
			
		}
		  charname.removeAll(dupname);
		  for (Character character : charname) {
			  if (character != ' ') {
				System.out.println(" Removed Duplicate Char are:" +character);
				
			}
			
		}
		 
	}

}
