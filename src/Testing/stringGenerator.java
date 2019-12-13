package Testing;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class stringGenerator {
	// CATEGORIES 9,1,5
	public static ArrayList<String> generate(int listLength, int elementMaxLength) {
		Random r = new Random(); // Create a random object
		
		ArrayList<String> listofStrings = new ArrayList<String>(); // This is the list that will eventually be returned
		
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"; // We take values from this string.

		while (listLength-- != 0) { // Cycle through each potential element in the final list
			
			StringBuilder builder = new StringBuilder(elementMaxLength); // Create a blank builder that we will add characters to
			
			// Determine a random element length, less than the max and cycle through that number
			for (int index = 0; index <= r.nextInt(elementMaxLength); index ++) { 
				
				// Add a random character from the string bank to the blank string
				builder.append(AlphaNumericString.charAt(r.nextInt(AlphaNumericString.length()))); 
			}
			
			listofStrings.add(builder.toString()); // Add the newly created string to the array
		}

		return listofStrings;
	}
	
	// CATEGORIES 4,5,8,9
	public static ArrayList<String> generate2(int listLength, int elementMaxLength) {
		Random r = new Random(); // Create a random object
		
		ArrayList<String> listofStrings = new ArrayList<String>(); // This is the list that will eventually be returned
		
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"; // We take values from this string.

		while (listLength-- != 0) { // Cycle through each potential element in the final list
			
			StringBuilder builder = new StringBuilder(elementMaxLength); // Create a blank builder that we will add characters to
			
			if(r.nextInt(10) > 5) {
				// Determine a random element length, less than the max and cycle through that number
				for (int index = 0; index <= r.nextInt(elementMaxLength); index ++) { 
					
					// Add a random character from the string bank to the blank string
					builder.append(AlphaNumericString.charAt(r.nextInt(AlphaNumericString.length()))); 
					listofStrings.add(builder.toString()); // Add the newly created string to the array
				}	
			}
			else {
				listofStrings.add("");
			}
		}

		return listofStrings;
	}
	
	
	
	public static void main(String[] args) {
		
//		for(String value : generate2(50,5)) {
//			System.out.println(value);
//		}
		
	      TreeSet hs = new TreeSet();
	      
	      // add elements to the hash set
	      hs.add("B");
	      hs.add("A");
	      hs.add("D");
	      hs.add("E");
	      hs.add("C");
	      hs.add("F");
	      System.out.println(Collections.min(hs));

	}
	
	
	
	
	
	
	

}
