package merge;

public class MergeSort 
{
	public static int[] sort(int [] array)
	{
		int [] result;
		//Split array in half
		int firstHalf = array.length/2;
		int secondHalf = array.length - firstHalf;
		
		int [] left = new int [firstHalf];
		int [] right = new int [array.length - firstHalf];
		
		for(int i = 0; i < firstHalf; i++)
		{
			left[i] = array [i];
		}	
		for(int i = firstHalf; i < array.length; i++)
		{
			right[i - firstHalf] = array [i];
		}
		
		if(firstHalf <= 1 && secondHalf <= 1)
		{
			result = merge(left, right);
		}
		else
		{
			left = sort(left);
			right = sort(right);
			result = merge(left, right);
		}
		return result;
		
	
	}
	
	private static int [] merge(int [] array1, int [] array2)
	{
		int [] array = new int [array1.length + array2.length];
		int index = 0;
		int index1 = 0; 
		int index2 = 0;
		
		while(index1 < array1.length && index2 < array2.length)
		{
			if(array1[index1] < array2[index2])
			{
				array[index++] = array1[index1++];
			}
			else
			{
				array[index++] = array2[index2++];
			}
		}
		while(index2 < array2.length)
		{
			array[index++] = array2[index2++];
		}
		while(index1 < array1.length)
		{
			array[index++] = array1[index1++];
		}
		
		return array;
	}	
	
	
	
	public static void main (String [] arsg)
	{
	        System.out.println("Create an array of length 10");
	        System.out.println();
	        
	        //Create array
	        int[] array = new int[10];
	        int newLength = array.length;
	        
	        //Fill array in descending order
	        for(int i = 0; i< array.length; i++)
	        {
	            array[i]= newLength - i;
	        }
	        
	        //Print original array
	        System.out.println("Original array" + "\n");
	        for(int i = 0; i < array.length; i++)
	        {
	            System.out.println(array[i]);
	        }
	        System.out.println("**************************");
	        System.out.println("**************************");
	        
	        //Sort and print sorted array
	        array = sort(array);
	         
	        System.out.println("Sorted array" + "\n");       
	        for(int i = 0; i < array.length; i++)
	        {
	            System.out.println(array[i]);
	        }
	        System.out.println("**************************");
	        System.out.println();
	        
	  }
}
