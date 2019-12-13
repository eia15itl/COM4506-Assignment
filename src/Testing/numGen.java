package Testing;

import java.util.Random;

public class numGen {

	// CATEGORIES: 10
	public static int negIntGen(int range) {
		Random r = new Random();
		int randomNum = r.nextInt(range)*-1;
		return randomNum;
	}
	
	// CATEGORIES: 12, 15
	public static int IntGen(int minSize) {
		Random r = new Random();
		int randomNum = r.nextInt(minSize*r.nextInt(4))+minSize;
		return randomNum;
	}
	
	// CATEGORIES: 12, 15
	public static int multipGen(int listLength) {
		Random r = new Random();
		int randomNum = listLength*r.nextInt();
		return randomNum;
	}
}
