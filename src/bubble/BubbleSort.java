package bubble;

public class BubbleSort 
{
	private static int numberOfSwaps = 0;
	
	public static int[] bubbleSort(int[] array)
	{
		int swaps = numberOfSwaps;
		boolean swapped = true;
		for(int i = array.length - 1; i > 0 && swapped; i--)
		{
			swapped = false;
			for(int j = 0; j < i; j++)
			{
				if(array[j+1] < array[j])
				{
					swap(array, j, j+1);
					swaps++;
					swapped = true;
				}
			}
		}
		numberOfSwaps = swaps;
		return array;
	}
	
	public static void swap(int[] array, int posA, int posB)
	{
		int tempInt = array[posA];
		array[posA] = array[posB];
		array[posB] = tempInt; 
	}
	
	public static int getSwaps()
	{
		return numberOfSwaps;
	}
	
	
	public static void main (String [] arsg)
	{
		//Create array
		int[] array = new int[10];
		int length = array.length;
		
		//Fill array
		for(int i = 0; i< array.length; i++)
		{
			array[i]= length - i;
		}
		
		//Print original array
		System.out.println("Original array" + "\n");
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("**************************");
		
		//Sort and print sorted array
		System.out.println("Sorted array" + "\n");
		bubbleSort(array);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("**************************");
		System.out.println("Number of swaps: " + getSwaps());
		
		System.out.println("**************************");
		System.out.println("**************************");
		System.out.println("**************************");
		//Create sorted array
		int[] sortedArray = new int[10];
				
		//Fill sorted array
		for(int i = 0; i< sortedArray.length; i++)
		{
			sortedArray[i]= i;
		}
				
		//Print original sorted array
		System.out.println("Original array" + "\n");
		for(int i = 0; i < sortedArray.length; i++)
		{
			System.out.println(sortedArray[i]);
		}
		System.out.println("**************************");
				
		//Sort and print sorted array
		System.out.println("Sorted array" + "\n");
		bubbleSort(sortedArray);
		for(int i = 0; i < sortedArray.length; i++)
		{
			System.out.println(sortedArray[i]);
		}
		System.out.println("**************************");
		System.out.println("Number of swaps: " + getSwaps());
					
	}
}
