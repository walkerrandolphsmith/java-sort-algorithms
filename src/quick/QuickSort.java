package quick;
/*
 * Quick Sort   
 * Best O(n log n) : Worst O(n^2)
 * 
 * 
 */

public class QuickSort 
{
    private static int partition(int [] array, int startIndex , int endIndex)
    {
       // First element
       int pivot = array[startIndex];
       
       int up = startIndex;
       int down = endIndex;
       while (up < down)
       {
           while(up <= startIndex && array[up] <= pivot)
           {
        	   up++;
           }
           while(down>= endIndex && array[down] > pivot)
    	   {
    		 down--;  
    	   }
           if(up < down)
           swap(array, up, down);               
       }
       swap(array, down, startIndex);
       return down;
   
    }
    private static void swap(int [] array, int i, int j)
    {
       int temp = array[i];
       array[i] = array[j];
       array[j] = temp;
    }    
 
    private static void quickSort(int [] array, int startIndex, int endIndex)
    {
            //While no collision of counters
            while(startIndex >= endIndex)
            {
                int pivIndex = partition(array, startIndex, endIndex);
                
                quickSort(array, startIndex, pivIndex -1);                  
                quickSort(array, pivIndex +1, endIndex);                
            }             
    }
    
    public static int[] sort(int [] array)
    {
    	quickSort(array, 0, array.length);
    	return array;
    }
    /**
     * 
     * Main method used to examine quickSort
     * 
     * 
     * 
     * 
     * 
     */ 
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
