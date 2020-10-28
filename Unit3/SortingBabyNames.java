import java.util.*;
import java.io.*;
public class SortingBabyNames
{
   private ArrayList<String> arr;
   public SortingBabyNames()
   {
      arr = new ArrayList<String>(); //set to size 200?
      Scanner sc = null;
      try{
         sc = new Scanner(new File("popularNames.txt"));
      }
      catch (Exception e)
      {
         System.out.println(e);
      }
      // for(int k=0; k<arr.size(); k++)
//       {
//          arr.add(k,sc.nextLine());
//       }
      //insertion sort
      for(int k=0; k < arr.size(); k++)
      {
         arr.add(k,sc.nextLine());
         String temp = arr.get(k);
         int ix = k;
         while(ix > 0 && temp.compareTo(arr.get(ix-1)) == -1)
         {
            arr.set(ix, arr.get(ix - 1));
            ix--;
         }
         arr.set(ix, temp);  
      }
    
   }
   public String toString()
   {
      String s = "";
      for(int k=0; k<arr.size(); k++)
      {
         s = s + arr.get(k) +", ";
      }
      s = s.substring(0,s.length()-2);
      return s;
   }
   public void selectionSort()
   {
      for(int i = arr.size()-1; i >=1 ; i--)
      {
         int index = i;  
         for (int j = 0 ; j < i; j++){  
            if (arr.get(j).compareTo(arr.get(index))>0){  
               index = j;//searching for lowest index  
            }
         }
         String smallerNumber = arr.get(index);
         arr.set(index, arr.get(i));
         arr.set(i, smallerNumber);
      }
   }
}