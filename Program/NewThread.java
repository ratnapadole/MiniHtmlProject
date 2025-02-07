


//wap to set new thread name  and print that thread name using thread class

class NewThread  extends Thread{

public static void main(String args[]) throws Exception{

NewThread obj =new NewThread();

obj.start();
System.out.println("thread name="+obj.getName());


obj.setName("New Thread");

System.out.println("thread name="+obj.getName());



System.out.println("thread Priority="+obj.getPriority());

obj.setPriority(3);


System.out.println("thread Priority="+obj.getPriority());


obj.sleep(2000);

System.out.println("thread name="+obj.getName());


}


public void run() {

try{
System.out.println("thread name="+getName());


Thread.currentThread().setName("New Thread");

System.out.println("thread name="+Thread.currentThread().getName());



System.out.println("thread Priority="+getPriority());

sleep(2000);

System.out.println("thread name="+Thread.currentThread().getName());
}catch(Exception ex){
	
}



}



}