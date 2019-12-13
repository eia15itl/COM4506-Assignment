package Testing;

import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

class sortTestAutomatic {
	// CATEGORIES: 2,1,6,3,7 Testing Metamorphic Relation 1.1
	@Test
	void test1Automated() {
		for(int i = 1000; i > 0; i--) {
			Random r = new Random();
			int listLength = r.nextInt(50)+1;
			int maxEl = r.nextInt(listLength)+1;
			linkedListGenerator l = new linkedListGenerator();
			LinkedList<Double> input = l.lListGen1(listLength,5);
			LinkedList<Double> reversedInput = input;
			Collections.reverse(reversedInput);
			LinkedList<Double> output1 = input;
			LinkedList<Double> output2 = reversedInput;
			Collections.sort(output1);
			Collections.sort(output2);
			assertEquals(output1, output2);			
		}
	}
	
	// CATEGORIES: 9,1,5 Testing Metamorphic Relation 1.1
	@Test
	void test2Automated() {
		for(int i = 1000; i > 0; i--) {
			Random r = new Random();
			int listLength = r.nextInt(999)+1;
			int maxEl = r.nextInt(listLength)+1;
			stringGenerator s = new stringGenerator();
			ArrayList<String> input = s.generate(listLength,maxEl);
			ArrayList<String> reversedInput = input;
			Collections.reverse(reversedInput);
			ArrayList<String> output1 = input;
			ArrayList<String> output2 = reversedInput;
			Collections.sort(output1);
			Collections.sort(output2);
			assertEquals(output1, output2);	
		}
	}
	
	// CATEGORIES: 4,5,8,9 Testing Metamorphic Relation 1.1
	@Test
	void test3Automated() {
		for(int i = 1000; i > 0; i--) {
			Random r = new Random();
			int listLength = r.nextInt(999)+1;
			int maxEl = r.nextInt(listLength)+1;
			stringGenerator s = new stringGenerator();
			ArrayList<String> input = s.generate2(listLength,maxEl);
			ArrayList<String> reversedInput = input;
			Collections.reverse(reversedInput);
			ArrayList<String> output1 = input;
			ArrayList<String> output2 = reversedInput;
			Collections.sort(output1);
			Collections.sort(output2);
			assertEquals(output1, output2);			
		}
	}
	
	
	
	// CATEGORIES: 2,1,6,3,7 Testing Metamorphic Relation 1.2
	@Test
	void test4Automated() {
		for(int i = 1000; i > 0; i--) {
			Random r = new Random();
			int listLength = r.nextInt(50)+1;
			int maxEl = r.nextInt(listLength)+1;
			
			linkedListGenerator l = new linkedListGenerator();
			LinkedList<Double> input = l.lListGen1(listLength,maxEl);
			
			int endIndex = r.nextInt(input.size()-1)+1;
			int startIndex = r.nextInt(endIndex);
			List<Double> subInput = input.subList(startIndex, endIndex);

			LinkedList<Double> output1 = input;
			List<Double> output2 = subInput;
			Collections.sort(output1);
			Collections.sort(output2);
			assert(output1.containsAll(output2));	
		}
	}
	
	// CATEGORIES: 9,1,5 Testing Metamorphic Relation 1.2
	@Test
	void test5Automated() {
		
		for(int i = 1000; i > 0; i--) {
			Random r = new Random();
			int listLength = r.nextInt(999)+2;
			int maxEl = r.nextInt(listLength)+1;
			
			stringGenerator s = new stringGenerator();
			ArrayList<String> input = s.generate(listLength,maxEl);
			
			int endIndex = r.nextInt(input.size()-1)+1;
			int startIndex = r.nextInt(endIndex);
			List<String> subInput = input.subList(startIndex, endIndex);

			ArrayList<String> output1 = input;
			ArrayList<String> output2 = new ArrayList<>(subInput);
			Collections.sort(output1);
			Collections.sort(output2);
			assert(output1.containsAll(output2));
		}
	}
	
	
	// CATEGORIES: 4,5,8,9 Testing Metamorphic Relation 1.2
	@Test 
	void test6Automated() {
		for(int i = 1000; i > 0; i--) {
			Random r = new Random();
			int listLength = r.nextInt(999)+2;
			int maxEl = r.nextInt(listLength)+1;
			
			stringGenerator s = new stringGenerator();
			ArrayList<String> input = s.generate2(listLength,maxEl);
			
			int endIndex = r.nextInt(input.size()-1)+1;
			int startIndex = r.nextInt(endIndex);
			List<String> subInput = input.subList(startIndex, endIndex);

			ArrayList<String> output1 = input;
			ArrayList<String> output2 = new ArrayList<>(subInput);
			Collections.sort(output1);
			Collections.sort(output2);
			assert(output1.containsAll(output2));		
		}
	}
}
