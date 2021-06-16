package com.olympic.cis143.lab1.contains;

public class IntArrayContains {

    private int[] data;

    public IntArrayContains(int[] values) 
    {
        if (values == null) {
            throw new RuntimeException("Values passed cannot be null");
        }
        this.data = values;
    }

    /**
     * Check to see if the data array contains the value that is passed.
     *
     * @param value The value to see if its contained in the array.
     * @return True if the value is found, else, false.
     */
    // This was fairly easy, I did something very similar in Java 1 where it checked
    // to find a number and return the index value. 
    public boolean contains(int value) 
    { 
		 for(int i = 0; i<data.length; i++)
		 {
			 if(value == data[i])
			 {
				 return true;
			 }
		 }
		return false;
    	
    }
}
