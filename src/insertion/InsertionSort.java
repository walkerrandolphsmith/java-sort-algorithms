package insertion;

public class InsertionSort 
{
	public static int[] insertionSort(int[] array)
	{
		int savedValue;
		for(int i = 1; i < array.length; i++)
		{
			savedValue = array[i];
			int j = i;
			while(j > 0 && array[j-1] > savedValue)
			{
				array[j] = array[j - 1];
				j--;
			}
			array[j] = savedValue;
		}
		return new int[10];
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
		insertionSort(array);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("**************************");
		
	}
}
