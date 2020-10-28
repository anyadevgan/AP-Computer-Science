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
      for (int r = 0; r < h; r++)
      {
         for (int c = 0; c < w; c++)
         {
            frame[r][c] = ' ';
         }
      }
      
      for (int r = 0; r < h; r++)
      {
         for (int c = 0; c < w; c++)
         {
            if (r == 0)
            {
               int equalsigns = (w - (title.length()+ 2));
               int equalsignsLeft = equalsigns/2;
               int equalsignsRight = equalsigns - equalsignsLeft;
            
               if (c < equalsignsLeft)
               {
                  frame[r][c] = '=';
               }
               else if (c == equalsignsLeft || c == (equalsignsLeft + title.length() + 1))
               {
                  frame[r][c] = ' ';
               }
               else if (c > equalsignsLeft && c <  (equalsignsLeft + title.length() + 1))
               {
                  frame[r][c] = title.charAt(c - equalsignsLeft - 1);
               }
               else
               {
                  frame[r][c] = '='; // = is for setting and == is for checking
               }      
            }
            else if(c == 0 || c == (w - 1) || r == (h - 1))
            {
               frame[r][c] = '+';
            }
            for(int k = 0; k < text.length(); k++)
            {
               System.out.print(frame[r][c] = text.charAt(k));         
            }
         }
      }
   }
   
   public void printWindow()
   {
      // complete the printWindow method to print out the frame character by character
      // this method simply prints the frame so it can be checked/verified
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
