package shell;

public class ShellSort 
{
	public static int[] sort(int [] array)
	{
		int gap = array.length/2;
		
		while(gap > 0)
		{
			for(int i = 0; i < gap; i++)
			{
				sort(array, gap, i);
			}	
			gap = (int) (gap/2.2);
			if(gap == 2)
			{
				gap =1;
			}
		}
		return array;
	}
	
	private static void sort(int[] array, int gap, int offset)
	{
		int savedValue;
		for(int i = gap + offset; i < array.length; i = i + gap)
		{
			savedValue = array[i];
			int j = i;
			while(j > offset && array[j-gap] > savedValue)
			{
				array[j] = array[j - gap];
				j = j - gap;
			}
			array[j] = savedValue;
		}
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
	        sort(array);
	         
	        System.out.println("Sorted array" + "\n");       
	        for(int i = 0; i < array.length; i++)
	        {
	            System.out.println(array[i]);
	        }
	        System.out.println("**************************");
	        System.out.println();
	        
	  }
}
