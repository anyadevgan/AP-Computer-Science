import java.io.*;      //the File 
import java.util.*;    //the Scanner 
public class Searches_Driver
{
   private static int amount=1325;
   public static void main(String[] args) throws Exception
   {
      String[] apple = input("declaration.txt");
      Arrays.sort(apple);
   	
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a word: ");
      String target = sc.next();   //Liberty  
      
      int found = Searches.linear(apple, target);
      if(found == -1)
         System.out.println(target + " was not found by the linear search.");
      else
         System.out.println("Linear Search found it at location "+found+" in " + Searches.getLinearCount()+" comparisons.");
   	
      int found2 = Searches.binary(apple, target);
      if(found2 == -1)
         System.out.println(target + " was not found by the binary search.");
      else
         System.out.println("Binary Search found it at location "+found2+" in " + Searches.getBinaryCount()+" comparisons.");
   }
   public static String[] input(String filename) throws Exception
   {
      Scanner infile = new Scanner( new File(filename) );
      String[] array = new String[amount];
      for (int k =0; k<amount; k++)    
         array[k] = infile.next();
      infile.close();
      return array;
   }
}
/////////////////////////////////////////////////////////
class Searches
{
   private static int linearCount = 0;
   private static int binaryCount = 0;      
   public static int getLinearCount()
   {
      return linearCount;
   }
   public static int getBinaryCount()
   {
      return binaryCount;
   }
   @SuppressWarnings("unchecked")//this removes the warning for Comparable
   public static int linear(Comparable[] array, Comparable target)
   { 
      for(int k = 0; k < array.length; k++)
      {
         if(array[k].compareTo(target) == 0)
         {
            linearCount++;
            return k;
         }
         linearCount++;
      }
      return -1;
   }
   
	//write an iterative solution to binary search.
   @SuppressWarnings("unchecked")//this removes the warning for Comparable
   public static int binary(Comparable[] array, Comparable target)
   {
      int low = 0;
      int high = array.length - 1;
      int mid = (low + high) / 2;
      while(low <= high)
      {
         if(array[mid].compareTo(target) == 0)
         {
            binaryCount++;
            return mid;  
         }
         else if(target.compareTo(array[mid]) > 0) //target on right of mid (target > mid)
         {
            high = mid - 1; 
            binaryCount++;
         }
         else
         {
            low = mid + 1; //target on left of mid (target < mid)
            binaryCount++;
         }
      }
      return -1;
   }
  
	
	//optional: write a RECURSIVE solution to binary search.
   @SuppressWarnings("unchecked")//this removes the warning for Comparable
   public static int binaryRecursive(Comparable[] array, Comparable target)
   {
      return binaryHelper(array, target, 0, array.length);
   } 
   
	//This is the header for the RECURSIVE binary helper method. This is only here if you choose to write this recursively.
   @SuppressWarnings("unchecked")//this removes the warning for Comparable
   private static int binaryHelper(Comparable[] array, Comparable target, int start, int end)
   {
      return -99;
   }
}