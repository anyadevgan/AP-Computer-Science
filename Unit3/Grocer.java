import java.util.*;

public class Grocer
{
   private List<Product> inventory; // contains all the products the grocer has
   
   public Grocer()
   {
	   inventory = new ArrayList<Product>(); //instantiate inventory
   }
   public void add(Product p)
   {
      inventory.add(p);
   }
   public void remove(Product p)
   {
      for(int k = 0; k < inventory.size(); k++)
      {
         if(inventory.get(k).equals(p))
         {
            inventory.remove(k);
         }
      }
   }
   public void increasePrices(double p)
   {
      for(int k=0; k < inventory.size(); k++)
      {
         inventory.get(k).setPrice(inventory.get(k).getPrice() * (p+1));
      }
   }
   public String toString() 
   {
      String content = "";
      for(int k=0; k < inventory.size(); k++)
      {
         content += inventory.get(k).toString() + '\n';
      }
      return content;
   }
   public int totalPages()
   {
      int pages = 0;
      for(int k=0; k<inventory.size(); k++)
      {
         if(inventory.get(k) instanceof Book)
         {
            Book b = (Book)inventory.get(k);
            pages += b.getPages();
         }
      }
      return pages;
   }
}

