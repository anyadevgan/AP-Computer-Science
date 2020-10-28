public class TheSimulation
{
   public static void main(String[] args) throws Exception
   {
      char[][] grid = new char[40][60];
      
      for (int r=0; r<40; r++)
      {
         for(int c=0; c<60; c++)
         {
            grid[r][c] = ' ';
         }
         
      }
      
      String phrase = "© Finder File Edit View Go Window Help             Spotlight";
      for(int c=0; c<60; c++)
      {
            grid[0][c] = phrase.charAt(c);
      }

      for (int r=1; r<40; r++)
      {
         grid[r][0] = '|';  
      }
      
      for(int r=1; r<40; r++)
      {
         grid[r][59] = '|';
      }
      
      for(int c=1; c<59; c++)
      {
         grid[39][c] = '_';
      }
      
      int a;
      String phrase2 = "=== Test Window ====";
      for(int c=25; c<44; c++)
      {
         for(a=0; a<19; a++)
         {
            grid[5][c] = phrase2.charAt(a);
         }
      }
      
      int b;
      String phrase3 = "+Blah de da blah bl+";
      for(int c=25; c<44; c++)
      {
         for(b=0; b<19; b++)
         {
            grid[6][c] = phrase3.charAt(b);
         }
      }

      int d;
      String phrase4 = "++++++++++++++++++++";
      for(int c=25; c<44; c++)
      {
         for(d=0; d<19; d++)
         {
            grid[7][c] = phrase4.charAt(d);
         }
      }

      for(int r=0; r<40; r++)
      {
         for(int c=0; c<60; c++)
         {
         System.out.print(grid[r][c]);
         }
      System.out.println();
      }
   
   }

}