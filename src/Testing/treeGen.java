package Testing;

import java.util.Random;
import java.util.TreeSet;

public class treeGen {
	
	// CATEGORIES 17,21
	public static TreeSet<Integer> tset(int setLength){
		Random r = new Random();
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		while(setLength-- !=0) {
			treeSet.add(r.nextInt(50));
		}
		return treeSet;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(tset(30));
	}

}
