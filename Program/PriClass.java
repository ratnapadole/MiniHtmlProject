import java.util.*;
import java.io.*;

public class PriClass {
  
    private void m1(){
   System.out.println("this m1 method"); 
  }
  
    public static void main(String[] args) {
      System.out.println("Hello, World!");
	  PriClass obj = new PriClass();
     obj.m1();
	 
	 
	// File obj1 =new File("p2.xlsx");  //"C:foldername/folder/filename.pdf"
	// obj1.mkdir();
	 // File obj1 =new File("p2.txt");
	 try{
		 
	// obj1.createNewFile();
	 
	  FileWriter myWriter = new FileWriter("p2.txt");
     
	 myWriter.write("1234567890");
	  myWriter.write("asdfghjkl");
	 
	 
      myWriter.close();
	  
      System.out.println("Successfully wrote to the file.");
	 
		System.out.println("===========================");
	 
	 FileReader fr =new FileReader("p2.txt");  
		String a="";
		System.out.println("Read data"+fr.read());	 
          int i;    
          while((i=fr.read())!=-1)   
          System.out.println((char)i);   
		
          fr.close();
		 
	  
	 }catch(Exception e){
		 
	 }
	  System.out.println("file is created");
	 
  }
}










