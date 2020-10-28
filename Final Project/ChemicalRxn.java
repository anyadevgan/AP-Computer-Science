import java.util.ArrayList;

public abstract class ChemicalRxn
{
   private String rxnType;
   private double cost;
   private int difficulty;
   private String equation;
   
   public ChemicalRxn(double c, int diff, String type)
   {
      cost = c;
      difficulty = diff;
      rxnType = type;
      equation = ""; 
   }
   public abstract String findProducts(String reactants);
   
   public String getEquation()
   { 
      return equation;
   }
   public void setEquation(String str)
   {
      equation = str;
   }
   public double getCost()
   {
      return cost;
   }
   public void setCost(double co)
   {
      cost = co;
   }
   public int getDifficulty() 
   {
      return difficulty;
   }
   public void setDifficulty(int di) 
   {
      difficulty = di;
   }
   public String getRxnType()
   {
      return rxnType;
   }
   public void setRxnType(String rType) 
   {
      rxnType = rType;
   }
   
   public String chemicalChangeIndication()
   {
      return "something changed";
   }
      
}