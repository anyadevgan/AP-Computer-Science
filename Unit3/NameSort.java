import java.util.*;
import java.io.*;

public class NameSort
{
   private String[] arr;
   
   public NameSort() throws IOException
   {
      int count = 0;
      Scanner sc1 = new Scanner("popularNames.txt");
      
      while(sc1.hasNextLine())
      {
         count++;
      }
      sc1.close();
      
      arr = new String[count];
      
      Scanner sc2 = new Scanner("popularNames.txt");
      if(sc2.hasNextLine())
      {
         String name =sc2.nextLine();
      }
   }
   
   public interface Comparable
   {
      public int compareTo(Object other);
   }
   
   public void printNames()
   {
      for(int i = 0; i < arr.length; i++)
      {
         System.out.println(arr[i]);
      }
   }
      
   public void swap(int index1, int index2)
   {
      String saved = arr[index1];
      arr[index1] = arr[index2];
      arr[index2] = saved;
   }

   public int findMax(int maxIndex) //maxIndex is the number of values to look at
   {
      int k = 0;
      for(int i = 1; i < maxIndex; i++)
      {
         if (((arr[i].substring(0,1)).compareTo(arr[k].substring(0,1))) > 0)
         {
            k = i;
         }
      }  
      return k;
   }
   
   public void selectionSort()
   {
      for(int k = 1; k < arr.length; k++)
      {
         if(((arr[findMax(arr.length-k)].substring(0,1)).compareTo(arr[arr.length-k].substring(0,1))) > 0)
         {
            swap(findMax(arr.length-k),arr.length-k);
         }
      }
   }  
}