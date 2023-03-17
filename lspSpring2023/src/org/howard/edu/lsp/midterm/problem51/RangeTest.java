package org.howard.edu.lsp.midterm.problem51;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.midterm.problem51.Range.EmptyRangeException;


public class RangeTest {
	
	@Test // Test #1
	@DisplayName("Testing Contains Method")
	public void testContains(){
		IntegerRange my_set = new IntegerRange(2, 7);
	
		assertTrue(my_set.contains(3));
		assertFalse(my_set.contains(10));
	}
	
	@Test // Test #2
	@DisplayName("Testing Overlaps Method")
	public void testOverlaps(){
		IntegerRange my_set = new IntegerRange(2, 7);
		IntegerRange the_set = new IntegerRange(2,20);
		IntegerRange our_set = new IntegerRange(8,10);
		try {
			assertTrue(my_set.overlaps(the_set));
		} catch (EmptyRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			assertFalse(my_set.overlaps(our_set));
		} catch (EmptyRangeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test // Test #3
	@DisplayName("Testing Size Method")
	public void testSize(){
		IntegerRange my_set = new IntegerRange(2, 10);
	
		assertEquals(8 , my_set.size());
	}
	
}
