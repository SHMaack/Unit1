public class FizzBuzzConverter
{

    public int[] data;

    public FizzBuzzConverter(int[] values)
    {
        if (values == null) 
        {
            throw new RuntimeException("Values passed cannot be null");
        }
        this.data = values;
    }
 
    public Object[] convertToFizzBuzz() 
    {
    	Object [] converted = new Object[data.length];
        for(int i = 0; i < data.length; i++)
        {
        	if (data[i] == 0)
        	{
        		converted[i] = 0;
        	}
        	else if (data[i] % 15 == 0)
        	{
        		converted[i] = "FizzBuzz";
        	}
        	else if(data[i] % 3 == 0)
        	{
        		converted[i] = "Fizz";
        	}
        	else if(data[i] % 5 == 0)
        	{
        		converted[i] = "Buzz";
        	}
        	else
        	{
        		converted[i] = (data[i]);
        	}
        }   
        return converted;
    }

}