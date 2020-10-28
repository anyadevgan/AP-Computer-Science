import java.lang.Character;
public class Decomposition extends ChemicalRxn
{   
   public Decomposition(double c, int diff)
   {
      super(c, diff, "decomposition");
   }
   
   public String chemicalChangeIndication()
   {
      return "temperature decreased because endothermic";
   }
   
   public String findProducts(String reactants)
   {
      int ix = 0;
      for(int k = 1; k < reactants.length(); k++)
      {
         if(reactants.substring(k,k+1).equals(reactants.substring(k,k+1).toUpperCase()) && !Character.isDigit(reactants.charAt(k)))
         {
            ix = k;
            break;
         }
      }
      String prodPart1 = reactants.substring(0, ix);
      String prodPart2 = reactants.substring(ix);
      
      //get elemental form of products
      for(int j = 0; j < prodPart1.length(); j++)
      {
         if(Character.isDigit(prodPart1.charAt(j)))
         {
            prodPart1 = prodPart1.substring(0,j);
         }
      }
      for(int j = 0; j < prodPart2.length(); j++)
      {
         if(Character.isDigit(prodPart2.charAt(j)))
         {
            prodPart2 = prodPart2.substring(0,j);
         }
      }
      
      //ensure that elements that correspond to diatomic molecules are written as diatomic moleulces in products
      if(prodPart1.equals("H") || prodPart1.equals("O") || prodPart1.equals("N") || prodPart1.equals("F") || prodPart1.equals("Cl") || prodPart1.equals("Br") || prodPart1.equals("I"))
      {
         prodPart1 = prodPart1 + "2";
      }
      if(prodPart2.equals("H") || prodPart2.equals("O") || prodPart2.equals("N") || prodPart2.equals("F") || prodPart2.equals("Cl") || prodPart2.equals("Br") || prodPart2.equals("I"))
      {
         prodPart2 = prodPart2 + "2";
      }

      return "" + prodPart1 + "+" + prodPart2;
   }
}