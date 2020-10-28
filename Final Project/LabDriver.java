import java.io.*;       
import java.util.*; 

public class LabDriver
{
   public static void main(String[] args) throws IOException
   {
      Scanner sc = new Scanner(System.in); 
      File f = new File("PossibleLabs.txt");
      Scanner sc2 = new Scanner(f);
      
      //create ArrayList of all 10 reactions recommended for AP Chemistry students 
      Lab allLabs = new Lab(10);
      ArrayList<ChemicalRxn> fullList = new ArrayList<ChemicalRxn>();
      sc2.useDelimiter(" |\n");
      for(int k = 0; k < 10; k++)
      {
         double budget = sc2.nextDouble();
         int diffLevel = sc2.nextInt();
         String type = sc2.next();
         String eqn = sc2.next();
         if(type.equals("synthesis"))
            fullList.add(new Synthesis(budget, diffLevel));
         if(type.equals("decomposition"))
            fullList.add(new Decomposition(budget, diffLevel));
         if(type.equals("single_replacement"))
            fullList.add(new SingleReplacement(budget, diffLevel));
         if(type.equals("combustion"))
            fullList.add(new Combustion(budget, diffLevel));
        
         fullList.get(k).setRxnType(type);
         fullList.get(k).setEquation(eqn);
      }
      allLabs.setLabs(fullList);
      System.out.println("The following is a list of the 10 recommended labs for AP Chemistry students to do:" + '\n' + allLabs); 
      allLabs.rankDifficulty();
      System.out.println("The following is a list of the same 10 labs, however, they are ranked by \nincreasing difficulty level: \n" + allLabs);
      System.out.println("The following is a list of the same 10 labs, however, they are ranked by \nincreasing cost: \n" + allLabs);
      
      //find number of labs with the specified requirements
      System.out.println("Many teachers are unable to cover all 10 labs in a year. So, in order to find the best \nlabs for you, please input the following information: ");
      System.out.print("1. The maximum amount of money you want to spend per lab: ");
      double money = sc.nextDouble();
      
      System.out.print("2. The difficulty level you want your labs to be (1=easy, 2=medium, & 3=hard): ");
      int diff = sc.nextInt(); 
      
      System.out.print("3. The type of chemical reaction you want. Possible reaction types include synthesis, \ndecomposition, single_replacement, and combustion (please write answer as \nwritten in previous sentence): ");
      String type = sc.next();
      
      allLabs.findSuitableRxns(money, diff, type);
      System.out.println('\n' + "Of the 10 recommended labs, the following are have reactions match your specified \nreaction type: " + '\n' + allLabs);
      System.out.print("Of these labs, how many do you want your students to complete? (enter a number between \n1 and the number of labs listed above): ");
      int num = sc.nextInt();
      
      //edit suitable list further to fit the number of labs specified
      allLabs.changeList(num);
      //print final list of labs
      System.out.println("\nA recommended list of lab(s) for your students to complete is: \n" + allLabs);
      System.out.print("As a challenge for your students, use the reactants and reaction type of each lab to determine \nits products. ");
      for(int ix = 0; ix < allLabs.getLabs().size(); ix++)
      {
         System.out.print("To see the products formed in lab #" + (ix+1) + ", type the reactants of the reaction as printed \nabove: ");
         String reactants = sc.next();
         String products = allLabs.getLabs().get(ix).findProducts(reactants);
         System.out.println(reactants + "=" + products + '\n');
         
      }           
   }

}