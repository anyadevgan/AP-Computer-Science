public class PracticeDriverSR
{
   public static void main(String[] args)
   {
      ChemicalRxn anya = new SingleReplacement(20.0, 1);
      String products = anya.findProducts("Al+CuCl2");
      System.out.println(products);
   }
}