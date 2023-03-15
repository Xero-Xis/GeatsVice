// Name: Miles Adedjouma
package org.howard.edu.hw5;
import java.util.*;
public class IntegerSet {

	//makes the  integerset class
    private List<Integer> my_set;
    
    public IntegerSet(){ //creates public set
        my_set = new ArrayList<Integer>();
    }
    public class IntegerSetException extends Exception { // Makes an integer exception for largest and smallest function
        private static final long serialVersionUID = 1L;

		public IntegerSetException(String error) {
            super(error);
        }
    }
    public List<Integer> get_set() {
        return my_set;
    }
    
    public void set_set(List<Integer> new_set){
        my_set = new_set;
    }
    
    public void clear(){ // This it so it clears the array
        my_set.clear();
    }
    
    public int length() { //returns length of array(set)
        return my_set.size();
    }
    
    public boolean equals(IntegerSet set) { 
        if(my_set.size() != set.length()) {//This compares the sets to make sure if it's the same
            return false;
        }else {
            return my_set.containsAll(set.my_set); //If the values are the same, it will return true or false
        }
    }
    
    public boolean contains(int value) { // Returns value of set it's looking for. If it can't it declare it false.
    	return my_set.contains(value);
    }
    
    public int largest() throws IntegerSetException {
        int maxValue = Integer.MIN_VALUE; //Set the value to min
        if (my_set.isEmpty()) {
                throw new IntegerSetException("Set is Empty");
            }
            else {
                for (Integer integer : my_set) {
                    if (integer > maxValue) { //To check if integer is greater than maxValue. If so, it updates.
                        maxValue = integer;
                    }
                }
            }
        return maxValue;
    }
        
    public int smallest() throws IntegerSetException { //It does the same thing as largest function, just for smallest
        int minValue = Integer.MAX_VALUE;
        if (my_set.isEmpty()) {
                throw new IntegerSetException("Set is Empty");
            }
            else {
                for (Integer integer : my_set) {
                    if (integer < minValue) {
                        minValue = integer;
                    }
                }
            }
        return minValue;
    }
    
    public void add(int item) {
        if (my_set.contains(item) == false) { //It checks if the element is already in set, and adds if it's not
        my_set.add(item);
        }
    }
    
    public void remove(int item) {
        if (my_set.contains(item) == true) { //It checks if element is in set. If it is, it removes it.
            my_set.remove(my_set.indexOf(item));
        }
    }
    
    public void union(IntegerSet intsetb) {
        for(int i = 0; i < intsetb.my_set.size(); i++) {
            if(my_set.contains(intsetb.my_set.get(i)) == false){ // It checks if element is already in set. If not it adds element
                my_set.add(intsetb.my_set.get(i));
            }
        }
    }
    
    public void intersection(IntegerSet intsetb) {
        my_set.retainAll(intsetb.my_set); //It keeps the values that both sets share.
    }
    public void difference(IntegerSet intsetb) {
        for(int i = 0; i < intsetb.length();i++) {
            if(my_set.contains(intsetb.my_set.get(i)) == true){// It verifies if the element is in both sets, then removes said element/
                my_set.remove(intsetb.my_set.get(i));
            }
        }
    }
    
    public boolean isEmpty() {//It checks if the set is empty, then returns true or false.
        if(my_set.isEmpty() == true){
            return true;
        }
        else {
            return false;
        }
    }
    
    public String toString() { // It iterates over set and adds each element to a string that is returned. 
        String setString = "";
        for(int i = 0; i < my_set.size(); i++) {
            setString += my_set.get(i).toString() + ' ';
        }
        return setString;
    }
}