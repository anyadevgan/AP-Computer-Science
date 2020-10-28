public class Lab04Resource
{
   //fields
   private int hiddenNumber;
   private int[] guesses;
   
   //constructors
   public Lab04Resource()
   {
      hiddenNumber = (int)(Math.random() * 25 + 1);
   }
   public Lab04Resource(int number)
   {
      hiddenNumber = (int)(Math.random() * number + 1);
   }
   
   //methods
   public int getHiddenNumber()
   {
      return hiddenNumber;
   }
   
   public boolean guess(int input)
   {            
      if(input > hiddenNumber)
      {
         System.out.println("Too high");
         return false;   
      }
      
      else if(input < hiddenNumber)
      {
         System.out.println("Too low");
         return false;
      }
            
      else
      {
         System.out.println("You won!");
         return true;
      }  
   }
   
   public int[] getGuesses()
   {
      return guesses;
   }
}