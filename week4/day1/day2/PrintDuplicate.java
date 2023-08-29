package week4.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {


		public static void main(String[] args) {
			int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };
			Set<Integer> duplicate = new HashSet<Integer>();
			System.out.println("Duplicates numbers are: ");
			for (int i = 0; i < data.length; i++) {
				if (duplicate.contains(data[i]))
					System.out.println(data[i]);
				else
					duplicate.add(data[i]);
			
			
			
			
			}
			
			
			

		}

	}

