public class SortingClass
{
   private double[] arr;
   
   public SortingClass(int numValues, double maxVal, double minVal)
   {
      arr = new double[numValues];
     
      for(int k = 0; k < arr.length; k++)
      {
         arr[k]= (Math.random()*(maxVal - minVal)) + minVal;
      }
   }
   
   public String toString()
   {
      String content = "";
      for(int k = 0; k < arr.length; k++)
      {
         content += arr[k] + " "; 
      }
      return content;
   }
   
   public void bubble()
   {
      for(int k = 0; k < arr.length; k++)
      {
         for(int b = 0; b < arr.length-1; b++)
         {
            if(arr[b] > arr[b+1])
            {
               swap(b, b+1);
            }
            System.out.println(toString());
         }
      }
   }
      
   public void swap(int index1, int index2)
   {
      double saved = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = saved;
   }
   
   public int findMax(int maxIndex) //maxIndex is the number of values to look at
   {
      int ix = 0;
      for(int k = 0; k < maxIndex; k++)
      {
         if (arr[k] > arr[ix])
         {
            ix = k;
         }
      }  
      return ix;
   }
   
   public void selectionSort()
   {
      for(int k = arr.length; k > 0; k--)
      {
         int x = findMax(k);
         swap(x, k-1);
         System.out.println(toString());
      }
   }
     
   public void insertionSort() //2 5 1 18 7
   {
      for(int k=0; k < arr.length; k++)
      {
         double temp = arr[k];
         int possibleIndex = k;
         while(possibleIndex > 0 && temp < arr[possibleIndex-1])
         {
            arr[possibleIndex] = arr[possibleIndex - 1];
            possibleIndex--;
            System.out.println(toString());
         }
         arr[possibleIndex] = temp;  
      }
   }
}