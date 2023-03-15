package org.howard.edu.hw5;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.hw5.IntegerSet.IntegerSetException;

public class IntegerSetTest {
	@Test // Test #1 : Clear
	@DisplayName("Testing clear Method")
	public void testClear(){
		IntegerSet my_set = new IntegerSet();
		my_set.add(1);
		my_set.clear(); 
		assertTrue(my_set.isEmpty());
	}
	@Test // Test #2: Length
	@DisplayName("Testing length method")
	public void testlength() {
		IntegerSet my_set = new IntegerSet();
		my_set.add(1);
		my_set.add(5);
		my_set.add(7);
		my_set.add(10);
		int my_set_length = my_set.length();
		assertEquals(4, my_set_length);
		
	}
	@Test // Test# 3 : Equal
	@DisplayName("Testing the Equal Method")
	public void testEqual() {
		IntegerSet the_set = new IntegerSet();
		IntegerSet my_set = new IntegerSet();
		the_set.add(3);
		the_set.add(3);
		the_set.add(5);
		
		my_set.add(3);
		my_set.add(3);
		my_set.add(5);
		
		assertTrue(the_set.equals(my_set));
		
	}
	
	@Test // Test#4 : Add
	@DisplayName("Testing add method")
	public void testAdd() {
		IntegerSet new_set = new IntegerSet();
		new_set.add(1);
		new_set.add(1);
		new_set.add(2);
		new_set.add(2);
		
		String last_string = new_set.toString();
		
		assertEquals("1 2 ", last_string);
		
		
	}
	@Test // Test #5 : Contains
	@DisplayName("Testing Contains Method")
	public void testContains() {
		IntegerSet new_set = new IntegerSet();
		new_set.add(1);
		new_set.add(2);
		new_set.add(3);
		
		assertTrue(new_set.contains(3));
	}
	
	@Test // Test #6 : Largest
	@DisplayName("Testing Largest Method")
	public void testLargest() {
		IntegerSet current_set = new IntegerSet();
		current_set.add(10);
		current_set.add(1);
		current_set.add(8);
		
		try {
			assertEquals(10, current_set.largest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test // Test #7 : Smallest
	@DisplayName("Testing Smallest Method")
	public void testSmallest() {
		IntegerSet my_set = new IntegerSet();
		my_set.add(50);
		my_set.add(25);
		my_set.add(1);
		
		try {
			assertEquals(1, my_set.smallest());
		} catch (IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test // Test #8 :Remove
	@DisplayName("Testing Remove Method")
	public void testRemove() {
		IntegerSet my_set = new IntegerSet();
		my_set.add(2);
		my_set.add(0);
		my_set.add(19);
		my_set.remove(19);
		
		String last_string = my_set.toString();
		
		assertEquals("2 0 ", last_string);
	}
	
	@Test // Test #9 : Union
	@DisplayName("Testing Union Method")
	public void testUnion() {
		IntegerSet set_1 = new IntegerSet();
		IntegerSet set_2 = new IntegerSet();
		
		set_1.add(1);
		set_1.add(2);
		
		set_2.add(3);
		set_2.add(4);
		
		set_1.union(set_2);
		
		String unite = set_1.toString();
		
		assertEquals("1 2 3 4 ", unite);
	}
	@Test // Test #10 : Intersection
	@DisplayName("Testing Intersection Method")
	public void testIntersection() {
		IntegerSet set_1 = new IntegerSet();
		IntegerSet set_2 = new IntegerSet();
		
		set_1.add(3);
		set_2.add(3);
		
		set_1.add(4);
		set_2.add(5);
		
		set_1.intersection(set_2);
		
		String check = set_1.toString();
		
		assertEquals("3 ", check);
		
	}
	@Test // Test #11 : Difference
	@DisplayName("Testing Difference Method")
	public void testDifference() {
		IntegerSet set_A = new IntegerSet();
		IntegerSet set_B = new IntegerSet();
		
		set_B.add(4);
		set_A.add(4);
		
		set_A.add(5);
		set_B.add(6);
		
		set_A.difference(set_B);
		String check = set_A.toString();
		
		assertEquals("5 ", check);
				
	}
	@Test // Test #12 : isEmpty
	@DisplayName("Testing isEmpty Method")
	public void testisEmpty() {
		IntegerSet not_void = new IntegerSet();
		not_void.add(1);
		not_void.remove(1);

		assertTrue(not_void.isEmpty());
		
	}
	@Test // Test # 13: String To String
	@DisplayName("Testing String to String Method")
	public void testStringtoString() {
		IntegerSet words = new IntegerSet();
		
		words.add(20);
		words.add(19);
		
		String finale = words.toString();
		
		assertEquals("20 19 ", finale);
		
	}
}

