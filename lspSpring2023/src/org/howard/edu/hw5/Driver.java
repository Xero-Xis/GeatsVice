package org.howard.edu.hw5;

import org.howard.edu.hw5.IntegerSet.IntegerSetException;
/** 
 * 
 * @author milesadedjouma
 *This is the Driver in which we test cases for Image set. 
 * @return set
 */
public class Driver {
	public static void main(String[] args) {
		IntegerSet setA = new IntegerSet();
		IntegerSet setB = new IntegerSet();
		//This is to test how the program add and remove elements from a set
		setA.add(1);
		setA.add(2);
		setA.add(3);
		setA.add(4);
		setA.add(5);
		System.out.println("Set A after we add 1, 2, 3, 4, and 5:" +setA.toString());
		setA.remove(2);
		setA.remove(3);
		System.out.println("Set A after we remove 2 and 3:" + setA.toString());
		
		//Testing union, intersection and difference operations
		setB.add(3);
		setB.add(4);
		setB.add(5);
		setB.add(6);
		System.out.println("Set B:" + setB.toString());
		setA.union(setB);
		System.out.println("Set A united with Set B:" + setA.toString());
		setA.intersection(setB);
		System.out.println("Set A's intersection with Set B:" + setA.toString());
		setA.difference(setB);
		System.out.println("Set A's differnece wih Set B:" + setA.toString());
		
		// Testing the largest and he smallest elements operatiors
		setA.add(7);
		setA.add(8);
		setA.add(9);
		try {
			System.out.println("Largest in set A is:" + setA.largest());
			System.out.println("Smallest in set B is:" + setA.smallest());		
		} catch (IntegerSetException e) {
			System.out.println(e.getMessage());
			
		}
		// Testing the equals and is Empty Operators
		setB.clear();
		setB.add(8);
		setB.add(9);
		setB.add(7);
		System.out.println("Set B after adding 8, 9, 7 : " + setB.toString());
		System.out.println("Is Set A = Set B?" + setA.equals(setB));
		System.out.println("Is Set A empty or not?" + setA.isEmpty());
	} 
}
