//Synchronized block ex


class Synchronized2 extends Thread{

public void run(){
 m1();
}


void m1(){

synchronized(this){

System.out.println("this is Synchronized block");

}
}



public static void main(String args[]){
Synchronized2 obj =new Synchronized2();

obj.start();

obj.setDaemon(true);
}
}








