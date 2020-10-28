import java.util.Scanner;
import java.lang.Character;
import java.io.*; 

public class Synthesis extends ChemicalRxn
{   
   Scanner sc;
   Scanner sc2;
   
   public Synthesis(double c, int diff)
   {
      super(c, diff, "synthesis");
      
      try   
      {
         File f = new File("PeriodicTable.txt");
         sc = new Scanner(f);
         
         File f2 = new File("PeriodicTable2.txt");
         sc2 = new Scanner(f2);
         
      }
      catch(Exception e)   
      {
         System.out.println("Unknown Error: " + e);
      }

   }
   
   public String chemicalChangeIndication()
   {
      return "change in color/odor because new substance formed";
   }
   
   public String findProducts(String reactants)
   {
      //find elemental forms of each of the reactants
      int ix = reactants.indexOf("+");
      String part1 = reactants.substring(0, ix);
      for(int a = 0; a < part1.length(); a++)
      {
         if(Character.isDigit(part1.charAt(a)))
         {
            part1 = part1.substring(0,a);
            break;
         }
      }
      String part2 = reactants.substring(ix+1);
      for(int b = 0; b < part2.length(); b++)
      {
         if(Character.isDigit(part2.charAt(b)))
         {
            part2 = part2.substring(0,b);
            break;
         }
      }
      //get charges of both reactants' elemental forms
      String part1Charge = "";
      String part1ChargeNum = "";
      for(int j = 0; j < 93; j++)
      {
         String elementAbout = sc.nextLine();
         int idSpace = elementAbout.indexOf(" ");
         if (part1.equals(elementAbout.substring(0 ,idSpace)))
         {
            part1Charge = elementAbout.substring(idSpace+1);
            part1ChargeNum = part1Charge.substring(0,1); //all charges are single digit numbers
            break;           
         }
      } 
      String part2Charge = "";
      String part2ChargeNum = "";
      for(int j = 0; j < 93; j++)
      {
         String elementData = sc2.nextLine();
         int ixSpace = elementData.indexOf(" ");
         if (part2.equals(elementData.substring(0 ,ixSpace)))
         {
            part2Charge = elementData.substring(ixSpace+1);
            part2ChargeNum = part2Charge.substring(0,1); //all charges are single digit numbers
            break;           
         }
      }
 
      //combine elements together
      if(part2ChargeNum.equals(part1ChargeNum))
      {
         return "" + part1 + part2;
      }
      return "" + part1 + part2ChargeNum + part2 + part1ChargeNum;
   }
   
}