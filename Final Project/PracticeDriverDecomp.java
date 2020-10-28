public class PracticeDriverDecomp
{
   public static void main(String[] args)
   {
      ChemicalRxn anya = new Decomposition(20.0, 1);
      String products = anya.findProducts("Ni2O3");
      System.out.println(products);
   }
}
