import java.util.ArrayList;

public class Lab
{
   private ChemicalRxn[] labs;
   int numExp;
  
   public Lab(int num)
   {
      labs = new ChemicalRxn[num];
      numExp = num;
   } 
     
   public ChemicalRxn[] rankDifficulty() //ranked in ascending order (1=easy, 2=medium, 3=hard)
   {
      ChemicalRxn[] labs2 = new ChemicalRxn[labs.length];
      for(int k = 0; k < labs2.length; k++)
      {
         ChemicalRxn temp = labs2[k];
         int possibleIndex = k;
         while(possibleIndex > 0 && temp.getDifficulty() < labs2[possibleIndex-1].getDifficulty())
         {
            labs2[possibleIndex] = labs2[possibleIndex - 1];
            possibleIndex--;
         }
         labs2[possibleIndex] = temp;  
      }
      return labs2;
   }
   
   public ChemicalRxn[] rankCost() //ranked in ascending order (low to high cost)
   {
      ChemicalRxn[] labs2 = new ChemicalRxn[labs.length];
      for(int j = 0; j < labs2.length; j++) //bubble sort
      {
         for(int b = 0; b < labs2.length-1; b++)
         {
            if(labs2[b].getCost() > labs2[b+1].getCost())
            {
               ChemicalRxn saved = labs2[b];
               labs2[b] = labs2[b+1];
               labs2[b+1] = saved;
            }
         }
      }
      return labs2;
   }
   
   public String toString()
   {
      String content = "";
      for(int k = 0; k < labs.length; k++)
      {
         content += labs[k].getEquation() + "(" + labs[k].getRxnType() + ", " + labs[k].getCost() + ", " + labs[k].getDifficulty() + ")" + '\n';
      }
      return content;
   }
   
   public ChemicalRxn[] getLabsList()
   {
      return labs;
   }

}