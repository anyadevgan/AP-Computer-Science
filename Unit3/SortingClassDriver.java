public class SortingClassDriver
{
   public static void main(String[] args)
   {
      SortingClass arr2 = new SortingClass(5, 50, 3);
      System.out.println(arr2.toString());
      arr2.insertionSort();
      System.out.println(arr2.toString());
   }


}