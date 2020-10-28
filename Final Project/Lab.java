import java.util.ArrayList;

public class Lab
{
   private ArrayList <ChemicalRxn> labs;
   private int numExp;
  
   public Lab(int num)
   {
      labs = new ArrayList<ChemicalRxn>(num);
      numExp = num;
   } 
   
   public ArrayList<ChemicalRxn> getLabs()
   {
      return labs;
   }
   
   public void setLabs(ArrayList<ChemicalRxn> arrList)
   {
      labs = arrList;
   }
   
   public String toString()
   {
      ArrayList<ChemicalRxn> arrList = getLabs();
      String content = "";
      for(int k = 0; k < arrList.size(); k++)
      {
         content += arrList.get(k).getEquation() + "(" + arrList.get(k).getRxnType() + ", " + arrList.get(k).getCost() + ", " + arrList.get(k).getDifficulty() + ", " + arrList.get(k).chemicalChangeIndication() + ")" + '\n';
      }
      return content;
   }
   
   public void changeList(int num)
   {
      int max = labs.size()-num;
      int index = 0;
      for(int n = 0; n < max; n++)
      {
         index = (int)(Math.random()*(labs.size()));
         labs.remove(index);
      }
   }
   
   public ArrayList<ChemicalRxn> rankDifficulty()
   {
      //sort by difficulty (1=easy to 2=medium to 3=hard)
      for(int k = 0; k < labs.size(); k++)
      {
         ChemicalRxn temp = labs.get(k);
         int possibleIndex = k;
         while(possibleIndex > 0 && temp.getDifficulty() < labs.get(possibleIndex-1).getDifficulty())
         {
            labs.set(possibleIndex, labs.get(possibleIndex - 1));
            possibleIndex--;
         }
         labs.set(possibleIndex, temp);  
      }
      return labs;
   }
   
   public ArrayList<ChemicalRxn> rankCost()
   {
      //sort by cost (low to high)
      for(int k = 0; k < labs.size(); k++)
      {
         for(int b = 0; b < labs.size()-1; b++)
         {
            if(labs.get(b).getCost() > labs.get(b+1).getCost())
            {
               ChemicalRxn saved = labs.get(b);
               labs.set(b, labs.get(b+1));
               labs.set(b+1, saved);
            }
         }
      }
      return labs;
   }
   
   public void findSuitableRxns(double c, int diff, String type)
   {
      ArrayList<ChemicalRxn> suited = new ArrayList<ChemicalRxn>();
      for(int k = 0; k < labs.size(); k++)
      {
         if((labs.get(k).getRxnType().equals(type)) && (labs.get(k).getCost() <= c || labs.get(k).getDifficulty() == diff))
         {
            suited.add(labs.get(k));
         }
      }
      labs = suited;
   }


}