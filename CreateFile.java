package filehandling;
import java.io.File;  // Import the File class
import java.io.FileWriter; 
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
        FileWriter obj = new FileWriter("filename.txt");
        obj.write("Files in Java might be tricky, but it is fun enough!");
        obj.close();
        System.out.println("Successfully wrote to the file.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      //e.printStackTrace();
      System.out.println(e);
    }
  }
}
