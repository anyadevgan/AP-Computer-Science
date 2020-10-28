public class Recursion
{ 
   /**
   Write a recursive method named factorial that accepts an integer n as a parameter
   and returns the factorial of n, or n!. A factorial of an integer is defined as the
   product of all integers from 1 through that integer inclusive. For example, the
   call of factorial(4) should return 1 * 2 * 3 * 4, or 24. The factorial of 0 and 1
   are defined to be 1. You may assume that the value passed is non-negative and that
   its factorial can fit in the range of type int.
   **/
   public int factorial(int n)
   {
      if(n == 1 || n == 0)
         return 1;
      else
      {
         return n*factorial(n-1);
      }
   }
   
   /**
   Write a recursive method named sumOfSquares that accepts an integer parameter n 
   and returns the sum of squares from 1 to n. For example, the call of sumOfSquares(3)
   should return 12 + 22 + 32 = 14. If your method is passed 0, return 0. If passed a
   negative number, your method should throw an int as an exception.  
   **/
   public int sumOfSquares(int n)
   {
      if(n == 0)
         return 0;
      else if(n < 0)
         throw new IllegalArgumentException("");
      else
         return (n*n) + sumOfSquares(n-1);
   }
   
   /**
   Write a recursive method named repeatString that accepts a string and an integer
   n as parameters and that returns the string concatenated ntimes. For example, the
   call of repeatString("hello", 3) returns "hellohellohello". Do not use any loops;
   you must use recursion.
   **/
   public String repeatString(String a, int n)
   {
      if(n < 0)
         throw new IllegalArgumentException("");
      else if(n == 0)
         return "";
      else
         return a + "" + repeatString(a, n-1);
   }
   
   /**
   Write a recursive method named starString that accepts an integer parameter n 
   and returns a string of stars (asterisks) 2n long (i.e., 2 to the nth power). 
   **/
   public String starString(int n)
   {
      if(n < 0)
         throw new IllegalArgumentException("");
      else if(n == 0)
         return "*";
      else
         return starString(n-1) + starString(n-1);
   }

}