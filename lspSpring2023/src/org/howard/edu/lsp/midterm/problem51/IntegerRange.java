package org.howard.edu.lsp.midterm.problem51;

import org.howard.edu.lsp.midterm.problem51.Range.EmptyRangeException;

public class IntegerRange implements Range { 
	 private int lower; 
	 private int upper; 
	// Hint: implement getters for lower and upper 
	 IntegerRange(int lower, int upper) { // Constructor 
	 this.lower = lower; 
	 this.upper = upper; 
	 } 
	public boolean contains(int value) { 
		if (lower <=  value && value <= upper) {
	        return true;
	    } else {
	        return false;
	    }
	} 
	public boolean overlaps(Range other) throws EmptyRangeException { 
		if (other == null) {
			throw new EmptyRangeException("An Unknown Error has occured");
		}
		IntegerRange other_range = (IntegerRange) other;
		if (lower <= other_range.upper && other_range.lower <= upper) {
			return true;
			} 
		else {
			return false;
		}
		}
	public int size() { 
		return upper - lower;
	} 
	} 
