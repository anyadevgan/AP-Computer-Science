public class Book implements Product
{
   private double cost; 
   private String title; 
   private int pages; // # pages in book
   
   public Book(String t, double c, int p)
   {
      cost = c;
      title = t;
      pages = p;
   }
   public boolean equals(Book x)
   {
      if(x instanceof Book == false)
         return false;
      Book b = (Book) x;
      if(b.title.equals(title))
         return true;
      return false; 
   }
   public String toString()
   {
      return "\"" + title + "\"" + " $" + cost + " has " + pages + " pages";
   }
   public int getPages()
   {
      return pages;
   }
   public double getPrice()
   {
      return cost;
   }
   public void setPrice(double x)
   {
      cost = x;
   }
}

