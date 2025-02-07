
//wap to create 2 process ,in 1st print no 
//from 45 to 50  and 2nd print no from 80 to 90 
//.it execute both process parallelly.


class Process1 extends Thread{

public void run(){

for(int i=45;i<=50;i++){
	setPriority(1);
System.out.println("Process1 = "+i);
System.out.println("Process1 thread name = "+getName());

}
}

}

class Process2 extends Thread{
public void run(){
	
	
for(int i=80;i<=90;i++){
	setPriority(7);
System.out.println("Process2= "+i);
System.out.println("Process2 thread name = "+getName());

}
}

public static void main(String args[]){
Process1 obj1 =new Process1();
Process2 obj2 =new Process2();


obj1.start();
obj2.start();


}




}


