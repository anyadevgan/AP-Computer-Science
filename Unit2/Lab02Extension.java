import java.util.*; 
import java.io.File;

public class Lab02Extension
{
   public static void main(String[] args) throws Exception 
   {
      Scanner sc = new Scanner(System.in);
   
      System.out.println("Enter an integer for the number of bytes: ");
      int bytes = sc.nextInt();
      
      int gigabytes = bytes/1073741824; //number of gigabytes
      int gbRemain = bytes%1073741824;
      int megabytes = gbRemain/1048576; //number of megabytes
      int mbRemain = gbRemain%1048576;
      int kilobytes = mbRemain/1024; //number of kilobytes
      int bytesRemain = mbRemain%1024;
      
      System.out.println(gigabytes + " gigabytes " + megabytes + " megabytes " + kilobytes + " kilobytes " + bytesRemain + " bytes ");
   }

}