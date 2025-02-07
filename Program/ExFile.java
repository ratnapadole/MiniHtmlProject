import java.io.*;

// wap to create file using IO package
class ExFile {


static void m1() throws Exception{
File obj = new File("F:\\New\\m1.txt");
obj.createNewFile();

File obj2 = new File("F:\\New\\m2.pdf");
obj2.createNewFile();
}

public static void main(String args[])  throws Exception{
File obj = new File("F:\\New\\music.txt");
obj.createNewFile();

File obj2 = new File("F:\\New\\music.pdf");
obj2.createNewFile();
System.out.println(obj.exists());


//wap to create folder 
File obj1 =new File("F:\\New\\ABC");
obj1.mkdir();

System.out.println("The file is created");
m1();

}


}
