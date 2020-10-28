import java.io.*; 
import java.util.Scanner;
import java.lang.Character;

public class SingleReplacement extends ChemicalRxn
{      
   Scanner sc;
   Scanner sc2;
   Scanner sc3;
   
   public SingleReplacement(double c, int diff)
   {
      super(c, diff, "single_replacement");
      
      try   
      {
         File f = new File("PeriodicTable.txt");
         sc = new Scanner(f);
         
         File f2 = new File("PeriodicTable2.txt");
         sc2 = new Scanner(f2);
         
         File f3 = new File("PeriodicTable3.txt");
         sc3 = new Scanner(f3);
      }
      catch(Exception e)   
      {
         System.out.println("Unknown Error: " + e);
      }
   }  
       
   public String chemicalChangeIndication()
   {
      return "precipitate or gas formed";
   }
    
   public String findProducts(String reactants)
   {
      //for SR equations in the text file, A + BC = C + AB (i.e. replacer first)
      String replacer = reactants.substring(0,reactants.indexOf("+"));
      //find elemental form of replacer
      for(int x = 0; x < replacer.length(); x++)
      {
         if(Character.isDigit(replacer.charAt(x)))
         {
            replacer = replacer.substring(0,x);
            break;
         }
      }
      //find information on charge of replacer
      String replacerCharge = "";
      String replacerChargeNum = "";
      String replacerCatOrAn = "";
      for(int b = 0; b < 93; b++)
      {
         String elementInfo = sc.nextLine();
         int ixSpace = elementInfo.indexOf(" ");
         if (elementInfo.substring(0 ,ixSpace).equals(replacer))
         {
            replacerCharge = elementInfo.substring(ixSpace+1);
            replacerChargeNum = replacerCharge.substring(0,1); //all charges are single digit numbers
            replacerCatOrAn = elementInfo.substring(ixSpace+2); 
            break;
         }           
      } 
      //find possible elements replaced
      String secondReact = reactants.substring(reactants.indexOf("+")+1);
      String opt1 = "";
      String opt2 = "";
      for(int a = 1; a < secondReact.length(); a++)
      {
         if(secondReact.substring(a,a+1).equals(secondReact.substring(a,a+1).toUpperCase()) && !Character.isDigit(secondReact.charAt(a)))
         {
            opt1 = secondReact.substring(0,a);
            opt2 = secondReact.substring(a);
            break;
         }
      }
      //find elemental form of both options
      for(int q = 0; q < opt1.length(); q++)
      {
         if(Character.isDigit(opt1.charAt(q)))
         {
            opt1 = opt1.substring(0,q);
            break;
         }
      }
      for(int w = 0; w < opt2.length(); w++)
      {
         if(Character.isDigit(opt2.charAt(w)))
         {
            opt2 = opt2.substring(0,w);
            break;
         }
      }
      //gather information on charges of both options
      String opt1Charge = "";
      String opt1ChargeNum = "";
      String opt1CatOrAn = "";
      for(int j = 0; j < 93; j++)
      {
         String elementAbout = sc2.nextLine();
         int idSpace = elementAbout.indexOf(" ");
         if (opt1.equals(elementAbout.substring(0 ,idSpace)))
         {
            opt1Charge = elementAbout.substring(idSpace+1);
            opt1ChargeNum = opt1Charge.substring(0,1); //all charges are single digit numbers
            opt1CatOrAn = elementAbout.substring(idSpace+2); 
            break;           
         }
      } 
      String opt2Charge = "";
      String opt2ChargeNum = "";
      String opt2CatOrAn = "";
      for(int j = 0; j < 93; j++)
      {
         String elementData = sc3.nextLine();
         int iSpace = elementData.indexOf(" ");
         if (opt2.equals(elementData.substring(0 ,iSpace)))
         {
            opt2Charge = elementData.substring(iSpace+1);
            opt2ChargeNum = opt2Charge.substring(0,1); //all charges are single digit numbers
            opt2CatOrAn = elementData.substring(iSpace+2); 
            break;           
         }
      }
      //decide which element is to be replaced
      if(opt1CatOrAn.equals(replacerCatOrAn)) //opt1 is being replaced
      {
         if(opt2ChargeNum.equals(replacerChargeNum))
         {
            return "" + opt1 + "+" + replacer + opt2;
         }
         return opt1 + "+" + replacer + opt2ChargeNum + opt2 + replacerChargeNum;
      }
      else //opt2 is being replaced
      {
         if(opt1ChargeNum.equals(replacerChargeNum))
         {
            return opt2 + "+" + replacer + opt1;
         }
         return opt2 + "+" + replacer + opt1ChargeNum + opt1 + replacerChargeNum;
      }
   }
   
}