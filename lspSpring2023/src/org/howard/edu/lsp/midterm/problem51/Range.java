package org.howard.edu.lsp.midterm.problem51;

public interface Range {  

	public boolean contains( int value );  
	// returns true if v is ≥ lower bound and ≤ upper bound,  
 // and false otherwise  
	
	public class EmptyRangeException extends Exception {
		 private static final long serialVersionUID = 1L;

			public EmptyRangeException(String error) {
	         super(error);
	     }
	 }
	
 
	public boolean overlaps( Range other ) throws EmptyRangeException;  
 // returns true if the receiver contains at least  
 // one value in common with other, and false otherwise  
 // EmptyRangeException is thrown when a null Range object is passed to the method 
	public int size();  
 // returns the number of integers in the range 
} 
