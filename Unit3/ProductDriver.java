public class ProductDriver
{
   public static void main(String [] args)
   {
      Fruit apple = new Fruit("fuji apple", 4);
      Fruit orange = new Fruit("mandarin orange", 7);
      
      System.out.println(apple.toString());
      System.out.println(apple.equals(orange));
      
      Book one = new Book("outliers", 10.5, 312);
      Book two = new Book("clapatron", 5.5, 220);
      
      System.out.println(one.toString());
      System.out.println(one.equals(two));
      
   }
}
      
