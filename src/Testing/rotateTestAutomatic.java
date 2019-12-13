package Testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

import org.junit.jupiter.api.Test;

class rotateTestAutomatic {

	// CATEGORIES: 10,2,1,6,3,7 Testing Metamorphic Relation 2.1
	@Test
	void test1() {
		for(int i = 1000; i > 0; i--) {
			linkedListGenerator l = new linkedListGenerator();
			numGen n = new numGen();
			int distance = n.negIntGen(1000);
			Random r = new Random();
			int listLength = r.nextInt(50)+1;
			int maxEl = r.nextInt(listLength)+1;
			LinkedList<Double> input = l.lListGen1(listLength,maxEl);
			LinkedList<Double> output1 = input;
			LinkedList<Double> output2= input;
			Collections.rotate(output1,distance);
			Collections.rotate(output2,distance+output1.size());
			assertEquals(output1, output2);			
		}
	}
	
	// CATEGORIES: 12,9,1,5 Testing Metamorphic Relation 2.2
	@Test
	void test2() {
		linkedListGenerator l = new linkedListGenerator();
		numGen n = new numGen();
		
		Random r = new Random();
		int listLength = r.nextInt(999)+1;
		int maxEl = r.nextInt(listLength)+1;
		stringGenerator s = new stringGenerator();
		ArrayList<String> input = s.generate(listLength,maxEl);
		int distance = n.negIntGen(input.size());
		ArrayList<String> output1 = input;
		ArrayList<String> output2 = input;
		Collections.rotate(output1,distance);
		Collections.rotate(output2,0);
		assertEquals(output1, output2);
	}

	// CATEGORIES: 12,15,4,5,8,9 Testing Metamorphic Relation 2.2
	@Test
	void test3() {
		linkedListGenerator l = new linkedListGenerator();
		Random r = new Random();
		numGen n = new numGen();
		int distance = n.multipGen(1000);
		int listLength = r.nextInt(999)+1;
		int maxEl = r.nextInt(listLength)+1;
		stringGenerator s = new stringGenerator();
		ArrayList<String> input = s.generate2(listLength,maxEl);
		ArrayList<String> output1 = input;
		ArrayList<String> output2 = input;
		Collections.rotate(output1,distance);
		Collections.rotate(output2,0);
		assertEquals(output1, output2);
	}
	
	// CATEGORIES: 10,2,1,6,3,7 Testing Metamorphic Relation 2.2
	@Test
	void test4() {
		linkedListGenerator l = new linkedListGenerator();
		numGen n = new numGen();
		int distance = n.negIntGen(1000);
		Random r = new Random();
		int listLength = r.nextInt(50)+1;
		int maxEl = r.nextInt(listLength)+1;
		LinkedList<Double> input = l.lListGen1(listLength,maxEl);
		LinkedList<Double> output1 = input;
		LinkedList<Double> output2= input;
		Collections.rotate(output1,distance);
		Collections.rotate(output2,0);
		assertEquals(output1, output2);
	}
	
	// CATEGORIES: 12,9,1,5 Testing Metamorphic Relation 2.1
	@Test
	void test5() {
		linkedListGenerator l = new linkedListGenerator();
		numGen n = new numGen();
		
		Random r = new Random();
		int listLength = r.nextInt(999)+1;
		int maxEl = r.nextInt(listLength)+1;
		stringGenerator s = new stringGenerator();
		ArrayList<String> input = s.generate(listLength,maxEl);
		int distance = n.negIntGen(input.size());
		ArrayList<String> output1 = input;
		ArrayList<String> output2 = input;
		Collections.rotate(output1,distance);
		Collections.rotate(output2,distance+output1.size());
		assertEquals(output1, output2);
	}

	// CATEGORIES: 12,15,4,5,8,9 Testing Metamorphic Relation 2.1
	@Test
	void test6() {
		linkedListGenerator l = new linkedListGenerator();
		Random r = new Random();
		numGen n = new numGen();
		int distance = n.multipGen(1000);
		int listLength = r.nextInt(999)+1;
		int maxEl = r.nextInt(listLength)+1;
		stringGenerator s = new stringGenerator();
		ArrayList<String> input = s.generate2(listLength,maxEl);
		ArrayList<String> output1 = input;
		ArrayList<String> output2 = input;
		Collections.rotate(output1,distance);
		Collections.rotate(output2,distance+output1.size());
		assertEquals(output1, output2);
	}
}
