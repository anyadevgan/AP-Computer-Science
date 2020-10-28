public class Combustion extends ChemicalRxn
{
   public Combustion(double c, int diff)
   {
      cost = c;
      difficulty = diff;
      rxnType = "synthesis";
   }
   
   public String findProducts()
   {
      return "CO2 + H2O";
   }
   
}