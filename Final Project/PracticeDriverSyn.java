public class PracticeDriverSyn
{
   public static void main(String[] args)
   {
      ChemicalRxn anya = new Synthesis(20.0, 1);
      String products = anya.findProducts("Na+Cl2");
      System.out.println(products);
   }
}