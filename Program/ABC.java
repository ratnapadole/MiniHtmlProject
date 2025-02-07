class ABC extends Thread{

public static void main(String args[]){

ABC obj = new ABC();

obj.start();

System.out.println(obj.getName()  );  //Thread-0   Thread-1  

obj.setName("ABC");

System.out.println(obj.getName()  );  //ABC

System.out.println(obj.getPriority()  );
obj.setPriority(1);


System.out.println(obj.getPriority()  );

}


public void run(){

try{
System.out.println("this is run method");

int a=12+66;

System.out.println("addition of no="+a);

System.out.println("addition of no="+Thread.currentThread().getName() );
Thread.currentThread().sleep(2000);

System.out.println("addition of no="+Thread.currentThread().getPriority());

}catch(Exception ex){
	
	
}
}













}