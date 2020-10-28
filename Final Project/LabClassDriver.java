import java.util.ArrayList;
public class LabClassDriver
{
   public static void main(String[] args)
   {
   Lab practice = new Lab(3);

   ArrayList<ChemicalRxn> test = new ArrayList<ChemicalRxn>();
   test.add(new Synthesis(12.00, 1));
   test.get(0).setEquation("Na+Cl2");
   test.add(new Combustion(5.50, 3));
   test.get(1).setEquation("CH4+O2");
   test.add(new Decomposition(17.38, 2));
   test.get(2).setEquation("H2O");
   
   practice.setLabs(test);
   System.out.println("Print all labs: \n" + practice);//check toString() method

   practice.rankDifficulty();
   System.out.println("Rank in difficulty: \n" + practice);//check rankDifficulty() method
   
   practice.rankCost();
   System.out.println("Rank in cost: \n" + practice);//check rankCost() method
   
   practice.findSuitableRxns(15.12, 1, "combustion");
   System.out.println("Suitable labs: \n" + practice);//check findSuitableRxns() method
   }
}