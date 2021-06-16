package com.olympic.cis143.lab1.remove;

import com.olympic.cis143.lab1.contains.IntArrayContains;

public class IntArrayRemove
{

    private int[] data;

    public IntArrayRemove(int[] values)
    {
        if (values == null) {
            throw new RuntimeException("Values passed cannot be null");
        }
        this.data = values;
    }

    public int[] getData() 
    {
        return this.data;
    }

    /**
     * This method will remove the value passed to it. 
     * If the value does not exist in the array, 
     * nothing is done.
     *
     * Note that, for this exercise, a value can only exist, 
     * at a maximum, one time within an array.
     *
     * @param value The value to remove.
     */
    public void remove(int value) 
    {
        int size = data.length;
        int index = 0;
        int temp[] = new int[size];
        boolean isPresent = false;
    	for(int i = 0; i<data.length; i++)
		 {
			 if(value == data[i])
			 {
				 isPresent = true;
				 continue;
			 }
        temp[index] = data[i];
        index++;
        //This wasn't as hard as add (because I didn't play with ArrayList) but it took
        //me some time to figure out I needed to move the value to the next index in
        //order to remove the desired value
		}
        if(isPresent)
        {
        	data = new int[this.data.length-1];
        	for (int j =0; j<temp.length-1; j++)
        	{
        		data[j] = temp[j];
        	}
        }
	}
}

