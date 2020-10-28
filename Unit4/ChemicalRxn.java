import java.util.ArrayList;

public abstract class ChemicalRxn
{
   private String rxnType;
   private double cost;
   private int difficulty;
   private String equation;
   private String reactants;
   
   public ChemicalRxn(double c, int diff, String type)
   {
      cost = c;
      difficulty = diff;
      rxnType = type;
      equation = ""; 
   }
      
   public abstract String findProducts(String reactants);
   
   public void setEquation(String str)
   {
      equation = str;
   }
   
   public String getEquation()
   {
      return equation;
   }
      
   public double getCost()
   {
      return cost;
   }
   
   public int getDifficulty() 
   {
      return difficulty;
   }
   
   public String getRxnType()
   {
      return rxnType;
   }
   
   public String toString(ArrayList<ChemicalRxn> list)
   {
      String content = "";
      for(int j = 0; j < list.size(); j++)
      {
         content += list.get(j).getEquation() + "(" + list.get(j).getRxnType() + ", " + list.get(j).getCost() + ", " + list.get(j).getDifficulty() + ")" + '\n';
      }
      return content;
   }
      
}