package Testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

class CollectionTest {

	@Test
	// CATEGORIES 18,20 testing metamorphic relation 3.1
	void test1() {
		hashGen h = new hashGen();
		HashMap<String, Integer> hm = h.hmapGen(500, 70);
		HashMap<String, Integer> hm2 = h.hmapGen(500, 140);
		assertEquals(Collections.min(hm2.values()),2*Collections.min(hm.values()));
	}
	
	@Test
	// CATEGORIES 17,21 testing metamorphic relation 3.1
	void test2() {
		treeGen t = new treeGen();
		TreeSet<Integer> ts = t.tset(5);
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
	    for (int value : ts) {
	    	int val = value*2;
	    	ts2.add(val);
	    }
	    
	    int tsmin = Collections.min(ts);
	    int ts2min = Collections.min(ts2);
	    
	    assertEquals(tsmin*2,ts2min);
	}
	
	@Test
	// CATEGORIES 22,19 testing metamorphic relation 3.1
	void test3() {
		hashGen h = new hashGen();
		LinkedList<Integer> list = h.linkedListGen(10, 3, 40);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
	    for (Integer value : list) {
	    	Integer val = value*2;
	    	list2.add(val);
	    }
		assertEquals(Collections.min(list)*2,Collections.min(list2));
	}
	
	@Test
	// CATEGORIES 18,20 testing metamorphic relation 3.2
	void test4() {
		hashGen h = new hashGen();
		HashMap<String, Integer> hm = h.hmapGen(500, 70);
		HashMap<String, Integer> hm2 = h.hmapGen(500, 80);
		assertEquals(Collections.min(hm2.values()),10+Collections.min(hm.values()));
	}
	
	@Test
	// CATEGORIES 17,21 testing metamorphic relation 3.2
	void test5() {
		treeGen t = new treeGen();
		TreeSet<Integer> ts = t.tset(5);
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
	    for (int value : ts) {
	    	int val = value+10;
	    	ts2.add(val);
	    }
	    
	    int tsmin = Collections.min(ts);
	    int ts2min = Collections.min(ts2);
	    
	    assertEquals(tsmin+10,ts2min);
	}
	
	@Test
	// CATEGORIES 22,19 testing metamorphic relation 3.2
	void test6() {
		hashGen h = new hashGen();
		LinkedList<Integer> list = h.linkedListGen(10, 3, 40);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
	    for (Integer value : list) {
	    	Integer val = value + 10;
	    	list2.add(val);
	    }
		assertEquals(Collections.min(list)+10,Collections.min(list2));
	}

}
