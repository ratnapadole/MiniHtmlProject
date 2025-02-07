//ex of Daemon thread 



class Daemon1 extends Thread{

public void run(){
	if(Thread.currentThread().isDaemon() ){
System.out.println("this is run method");


	}else{  
  System.out.println("user thread work");  
 }  
}


public static void main(String args[])  {
Daemon1 obj= new Daemon1();
Daemon1 obj1= new Daemon1();


obj.setDaemon(true);

obj.start();

obj1.start();


}

}