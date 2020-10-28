public class Combustion extends ChemicalRxn
{   
   public Combustion(double c, int diff)
   {
      super(c, diff, "combustion");
   }
   
   public String chemicalChangeIndication()
   {
      return "temperature increased because exothermic";
   }
   
   public String findProducts(String reactants)
   {
      return "CO2+H2O";
   }
}