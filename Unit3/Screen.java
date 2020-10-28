public class Screen
{
   private static final int HEIGHT = 40;  // vertical height in rows of the screen (in char)
   private static final int WIDTH = 60;  // horizontal height in columns of the screen (in char)
   private static final char BLANK = ' ';
   private static final char VERTICAL_BAR = '|';
   private static final char HORIZONTAL_BAR = '_';
   private static final String HEADER = " Finder File Edit View Go Window Help             Spotlight";
   
   private char[][] desktop;
   private Window activeWindow;
   
   // default constructor which creates a Screen which is blank including the lines and header
   public Screen()
   {
      desktop = new char[HEIGHT][WIDTH];
      for (int r = 0; r < HEIGHT; r++)
      {
         for (int c = 0; c < WIDTH; c++)
         {
            if (r == 0)
            {
               desktop[r][c] = HEADER.charAt(c);
            }
            else
            {
               if ((c == 0) || (c == WIDTH-1))
                  desktop[r][c] = VERTICAL_BAR;
               else if (r == HEIGHT-1)
                  desktop[r][c] = HORIZONTAL_BAR;
               else
                  desktop[r][c] = BLANK;
            }
         }
      }
      activeWindow = new Window();
   }
   
   public void printScreen()
   {
      System.out.println();
      for(int r = 0; r < HEIGHT; r++)
      {
         for(int c = 0; c < WIDTH; c++)
         {
            System.out.print(desktop[r][c]);
         }
      System.out.println();
      }
   }
      
   // method to build an empty window using the default constructor for testing
   public void openWindow()
   {
      activeWindow = new Window();
      activeWindow.printWindow();   // print the new Window to check that it has been built correctly
      //addWindow(activeWindow);
   }
   
   public void openWindow(String title, String text, int x, int y, int h, int w)
   {
      activeWindow = new Window(title, text, x, y, h, w);
      activeWindow.printWindow();   // print the new Window to check that it has been built correctly
      //addWindow(activeWindow);
   }
   
   
   
   /* When ready, remove this comment block and build the addWindow method below to add a window to the desktop
   private void addWindow(Window newWindow)
   {
      char[][] win = newWindow.getFrame();   // get the whole Window frame to copy it into the desktop
      for (int r = 0; r < newWindow._____(); r++)
      {
         for (int c = 0; c < newWindow._____(); c++)
         {
            // copy each char from win into the right location of the desktop
            // be careful that you do not go outside of either 2D array 
            
            
         }
      }
   }
   
   */
}
