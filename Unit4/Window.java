public class Window
{      
   private static final char BLANK = ' ';
   private static final char WINDOW_BAR = '=';
   private static final char WINDOW_EDGE = '+';
   private String title;
   private String text;
   private int x;
   private int y;
   private int h;
   private int w;
   private char[][] frame;
   
   public Window()
   {
      title = "Default";
      text = "    ";
      x = 1;
      y = 1;
      h = 10;
      w = 20; 
      frame = new char [h][w];
      fillFrame();
   }
   
   public Window(String titl, String txt, int xCoord, int yCoord, int height, int width)
   {
      title = titl;
      text = txt;
      x = xCoord;
      y = yCoord;
      h = height;
      w = width;
      frame = new char [h][w];
      fillFrame();
   }
   
   private void fillFrame()
   {
      // complete the fillFrame method including the title bar, outline and text
      // if the text does not completely fill the frame then extra space should be filled with blanks
      
      //first fill with blanks
      for (int r= 0; r < h; r++)
      {
         for (int c = 0; c < w; c++)
         {
            frame[r][c] = BLANK;
         }
      }
   
      //outline bottom row
      for (int a = 0; a < w; a++)
      {
         frame[h-1][a] = WINDOW_EDGE;
      }
      //outline left and right columns
      for (int b = 1; b < h-1; b++)
      {
         frame[b][0] = WINDOW_EDGE;
         frame[b][w-1] = WINDOW_EDGE;
      }
     
      //title
      int m = title.length();
      int t = (w-(m + 2))/2;
      for (int e = 0; e < t; e++)
      {
         frame[0][e] = WINDOW_BAR;
      }
      frame[0][t] = BLANK;
      for (int f = 0; f < m; f++)
      {
         frame[0][t+f+1] = title.charAt(f);
      }
      frame[0][m+t+1] = BLANK;
      if ((2*t) + m + 2==w)
      {
         for (int g = t+m+2; g < w; g++)
         {
            frame[0][g]= WINDOW_BAR;
         }
      }
      else if ((2*t) + m + 2 < w)
      {
         for (int h = 0; h < t+1; h++)
         {
            frame[0][h+m+t+2]= WINDOW_BAR;
         }
      }
      
      //text
      int strIX = 0;
      for (int r = 1; r < (h-2); r++)
      {
         for (int c = 1; c < (w-2); c++)
         {
            if (strIX < text.length())
            {
               frame[r][c] = text.charAt(strIX);
               strIX++;
            }
            else
            {
               frame[r][c] = BLANK;
            }
         }
      }
       
               
   }
      
   public void printWindow()
   {
      // complete the printWindow method to print out the frame character by character
      // this method simply prints the frame so it can be checked/verified
      System.out.println();
      for(int r = 0; r < h; r++)
      {
         for(int c = 0; c < w; c++)
         {
            System.out.print(frame[r][c]);
         }
         System.out.println();
      }
   }
   
   // get and set methods for all instance variables (data elements) for the Window class
   public char[][] getFrame()
   {
      return frame;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String newTitle)
   {
      title = newTitle;
   }
   
   public String getText()
   {
      return text;
   }
   
   public void setText(String newText)
   {
      text = newText;
   }
   
   public int getX()
   {
      return x;
   }
   
   public void setX(int newX)
   {
      x = newX;
   }
   
   public int getY()
   {
      return y;
   }
   
   public void setY(int newY)
   {
      y = newY;
   }
   
   public int getW()
   {
      return w;
   }
   
   public void setW(int newW)
   {
      w = newW;
   }
   
   public int getH()
   {
      return h;
   }
   
   public void setH(int newH)
   {
      h = newH;
   }
   
}
