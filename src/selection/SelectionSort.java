package selection;

public class SelectionSort 
{
	public static int[] selectionSort(int[] array)
	{
		for(int i = 0; i < array.length - 1; i++)
		{
			int smallest = i;
			for(int j = i; j < array.length; j++)
			{
				if(array[j] < array[smallest])
				{
					smallest = j;
				}
			}
			swap(array, i, smallest);
		}
		return array;
	}
	
	public static void swap(int[] array, int posA, int posB)
	{
		int tempInt = array[posA];
		array[posA] = array[posB];
		array[posB] = tempInt; 
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
		selectionSort(array);
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("**************************");
		
	}
}
