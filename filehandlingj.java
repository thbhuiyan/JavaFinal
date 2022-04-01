package filehandlingj;
import java.io.*;
import java.util.Scanner;

public class FileHandlingJ {
  public static void main(String args[]) {
      int x;
      Scanner scan = new Scanner(System.in);//user theke input nibe amn define kore
try{
      // Creates a FileWriter
       FileWriter file = new FileWriter("D:\\input.txt"); 
       //Scanner scan = new Scanner(System.in);//user theke input nibe amn define kore
       String userInput = scan.nextLine();//String ney user theke
     file.write(userInput);
     file.close();
        } catch (IOException e) {
    System.out.println("Error in closing the file");
    System.out.println("Error is "+e);
      //e.getStackTrace();
    }
 Scanner option = new Scanner(System.in);
 x= option.nextInt();
System.out.println("Do you want to read from the file ? \nIf yes enter 1 if no enter anything else");
 if(x==1){
     while(scan.hasNextLine()){
      String data = scan.nextLine();
      System.out.println(data);
     }
  }
  else{
    System.out.println("Sorry you've choose to not to read.");
 }
}
}
