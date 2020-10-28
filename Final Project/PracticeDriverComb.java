public class PracticeDriverComb
{
   public static void main(String[] args)
   {
      ChemicalRxn anya = new Combustion(20.0, 1);
      String products = anya.findProducts("C6H12O6+O2");
      System.out.println(products);
   }
}