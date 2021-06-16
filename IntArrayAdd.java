package com.olympic.cis143.lab1.add;

public class IntArrayAdd 
{

    private int[] data;

    public IntArrayAdd() 
    {
        this.data = new int[0];
    }

    public int[] getData() 
    {
        return this.data;
    }

    /**
     * This method will need to add an element to the end of an array.
     *
     * @param value The value to be added.
     */
    public void add(int value)
    //I tried to use ArrayList to add which I could not then use to change data
    //I really struggled with this one until I realized I just needed to make a 
    //intermediate array. This one really hurt my brain
    {
    	int size = data.length;
    	int temp[] = new int[size + 1];
    	for(int i=0; i<size; i++) 
    		{
    			temp[i] = data[i];
    		}
    	temp[size] = value;
    	data = temp;
    } 	
}
