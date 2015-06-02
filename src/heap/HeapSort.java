package heap;

public class HeapSort
{
  private int heap[]; 
  private int nextEmpty;
  
  public HeapSort()
  {
      nextEmpty = 0;
  }
  
  public int[] sort(int [] array)
  {   
    heap = array;
    
    for(int i = 0; i < heap.length; i ++)
    {
      insert(heap[i]);  
    }
    for(int i = heap.length - 1; i >= 0; i--)
    {
        heap[i] = remove();
    }
    return heap;
  }

  
  private boolean insert(int data)
  {
      if(nextEmpty >= heap.length)
      {
          return false;
      }
      else
      {
          heap[nextEmpty] = data; 
          int child = nextEmpty++;
          if(child > 0)
          {
              int parent = (child - 1)/2; 
              while(parent >= 0 && heap[parent] > heap[child])
              {
                  swap(parent, child);
                  child = parent;
                  parent = (child - 1)/2;
              }
          }
          return true;
      }
  }
  
  private void swap(int parent, int child)
  {
      int temp = heap[parent];
      heap[parent] = heap[child];
      heap[child] = temp; 
  }

  private int remove()
  {
      int value = heap[0];
      if(!isEmpty())
      {          
          heap[0] = heap[--nextEmpty];
          int parent = 0; 
          while(true)
          {
            int leftChild = 2 * parent + 1;
            int rightChild = leftChild + 1;
            if(leftChild >= nextEmpty)
            {
                break;
            }
            if(rightChild >= nextEmpty)
            {
              if(heap[parent] < heap[leftChild]) 
              {
                 break;
              }
              else
              {
                 swap(parent, leftChild);
                 parent = leftChild;
              }
            }
            else
            {
                int minChild = leftChild;
                if(heap[leftChild] > heap[rightChild])
                {
                    minChild = rightChild;
                }
                if(heap[parent] > heap[minChild])
                {
                  swap(parent,minChild);
                  parent = minChild;
                }
                else
                {
                    break;
                }
            }         
          }
          heap[nextEmpty] = 0;
      }
      return value;
  }
  
  private boolean isEmpty()
  {
      return nextEmpty == 0;
  }
}


  