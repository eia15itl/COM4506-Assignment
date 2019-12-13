package Testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class rotateTest {

	// CATEGORIES: 10,2,1,6,3,7 Testing Metamorphic Relation 2.1
	@Test
	void test1() {
		linkedListGenerator l = new linkedListGenerator();
		numGen n = new numGen();
		int distance = n.negIntGen(1000);
		LinkedList<Double> input = l.lListGen1(50,5);
		LinkedList<Double> output1 = input;
		LinkedList<Double> output2= input;
		Collections.rotate(output1,distance);
		Collections.rotate(output2,distance+output1.size());
		assertEquals(output1, output2);
	}
	
	// CATEGORIES: 12,9,1,5 Testing Metamorphic Relation 2.2
	@Test
	void test2() {
		linkedListGenerator l = new linkedListGenerator();
		numGen n = new numGen();
		
		stringGenerator s = new stringGenerator();
		ArrayList<String> input = s.generate(301,20);
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
		numGen n = new numGen();
		int distance = n.multipGen(1000);
		stringGenerator s = new stringGenerator();
		ArrayList<String> input = s.generate2(400,20);
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
		LinkedList<Double> input = l.lListGen1(50,5);
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
		
		stringGenerator s = new stringGenerator();
		ArrayList<String> input = s.generate(301,20);
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
		numGen n = new numGen();
		int distance = n.multipGen(1000);
		stringGenerator s = new stringGenerator();
		ArrayList<String> input = s.generate2(400,20);
		ArrayList<String> output1 = input;
		ArrayList<String> output2 = input;
		Collections.rotate(output1,distance);
		Collections.rotate(output2,distance+output1.size());
		assertEquals(output1, output2);
	}
}
