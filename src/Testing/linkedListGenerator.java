package Testing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class linkedListGenerator {
	
	// CATEGORIES 2,1,6,3,7
	public static LinkedList<Double> lListGen1(int listLength, int maxRepeats) {
		
		Random r = new Random();
		
		LinkedList<Double> listofDoubles = new LinkedList<Double>(); // Creates list that will eventually be returned
		
		while (listofDoubles.size() <= listLength) { // Loop stops when listLength is reached
			Double ranDouble = r.nextDouble(); // A random double is created
			int decider = r.nextInt(10); // A random integer who's value will determine whether to add a repeat or negative is created.
			int repeatTimes = r.nextInt(maxRepeats); // A random amount of repeat times, no more than the max specified is created.
			
			if (r.nextInt(7) > 4) { // Introduce negative values randomly
				ranDouble = ranDouble*-1;
			}
			
			if (decider > 5) { // If the repeat is triggered, the same value is added to the list severally.
				for (int numberOfRepeats = 0; numberOfRepeats <= repeatTimes; numberOfRepeats ++) {
					int addAtIndex = r.nextInt(listofDoubles.size()+1); // An int that will determine where to add a repeat is created
					listofDoubles.add(addAtIndex,ranDouble);
				}
			}
			else {
				listofDoubles.add(ranDouble);	// If no repeat is triggered, a random double is added to the end of the list.
			}	
		}
		return listofDoubles;
		
	}
	
	public static void main(String[] args) {
		
		for(Double value : lListGen1(50,5)) {
			System.out.println(value);
		}
		
		
	}

}
