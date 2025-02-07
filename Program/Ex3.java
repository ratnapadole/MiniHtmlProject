class Ex3 extends Thread{

public void run(){
System.out.println("this run method");
m1();
}

 synchronized void m1(){
   System.out.println("this m1 method");
}

public static void main(String args []){
Ex3 obj =new Ex3();
Ex4 obj1 =new Ex4();


obj.start();
obj1.start();

}
}

class Ex4 extends Thread{
public void run(){
m2();
}

void m2(){
 System.out.println("this m2 method");
}



}
