package Testing;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

public class hashGen {

	// CATEGORIES 18,20
	public static HashMap hmapGen(int mapSize, int consVal){
		HashMap<String, Integer> hashy = new HashMap<String, Integer>();
		
		Random r = new Random();
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz"; // We take values from this string.
		while (mapSize-- != 0) { 
			int keyLength = r.nextInt(5)+1; // Set the max key length to 6 and min to 1.
			StringBuilder builder = new StringBuilder(keyLength); // Create a blank builder that we will add characters to
			for (int index = 0; index <= keyLength; index ++) { 
				// Add a random character from the string bank to the blank string
				builder.append(AlphaNumericString.charAt(r.nextInt(AlphaNumericString.length()))); 
			}	

			hashy.put(builder.toString(), consVal); // make an entry to the map with constant value and the new string as the key.

		}
		return hashy;

	}
	
	// CATEGORIES 22,19
	public static LinkedList linkedListGen(int setSize, int minVal , int maxIntSize){
		LinkedList<Integer> hashy = new LinkedList<Integer>();
		
		Random r = new Random();
		
		while (hashy.size() <= setSize) { 
			int ranNum = r.nextInt(maxIntSize);
			if (ranNum < minVal) {
				ranNum = ranNum + Math.abs(ranNum) + Math.abs(r.nextInt());
			}
			int decider = r.nextInt(20);
			
			if(decider>10) {
				ranNum = minVal;
			}	
			hashy.add(ranNum);
		}
		return hashy;
		


	}

	public static void main(String[] args) {
	
	}

}
