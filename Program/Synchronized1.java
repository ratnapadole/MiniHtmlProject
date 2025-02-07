
//wap to create one class extends Thread class.
//in that create 3 method with synchronized keyword.
//call all that method one by one.


class Synchronized1 extends Thread{


synchronized void m1(){
 System.out.println("this is m1 method");
}

synchronized void m2(){
System.out.println("this is m2 method");
}


synchronized void m3(){
System.out.println("this is m3 method");
}

public void run(){
m2();
m1();
m3();
}


public static void main(String args[]){

Synchronized1 obj =new Synchronized1();

obj.start();

}

}