import java.util.*; 

public class NumberGuesser
{   
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Do you want to enter a number (1) or use the default value (2)? "); 
      int input = sc.nextInt();
      
      if(input == 1)
      {
         System.out.println("Enter an integer: ");
         int answer = sc.nextInt();
         Lab04Resource round1 = new Lab04Resource(answer);
         int hiddenNum = round1.getHiddenNumber();
         
         System.out.println("Guess a number between 1 and " + answer + ": ");  
         int guess = sc.nextInt();
         round1.guess(guess);
         
         
         while(guess != hiddenNum)
         {
            System.out.println("Guess a number between 1 and " + answer + ": ");  
            guess = sc.nextInt();
            round1.guess(guess);
         }
         
         System.out.println(round1.getGuesses());
      }
      
      if(input == 2)
      {
         Lab04Resource round1 = new Lab04Resource();
         int hiddenNum = round1.getHiddenNumber();
         
         System.out.println("Guess a number between 1 and 25 inclusive: ");
         int guess = sc.nextInt();
         round1.guess(guess);
         
         while(guess != hiddenNum)
         {
            System.out.println("Guess a number between 1 and 25 inclusive: ");
            guess = sc.nextInt();
            round1.guess(guess);
         }
         System.out.println(round1.getGuesses());
      }
      
   }
   

}