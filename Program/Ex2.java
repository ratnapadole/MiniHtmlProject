
//wap to create 2 Thread using implements keyword ,
//in 1st print no from 6 to 12 and 2nd print
// no from 22 to 32.it execute both process parallelly.


class Ex1 implements Runnable {
public void run(){
for(int i=6 ; i<=12;i++){
System.out.println("Thread Process1= "+i);
}
}

}

class Ex2 implements Runnable {

public void run(){
for(int i=22 ; i<=32;i++){
System.out.println("Thread Process2 = "+i);
}
}


public static void main(String args[]){
Ex1 e =new Ex1();
Thread obj =new Thread(e);

Ex2 e2  =new Ex2();
Thread obj2 =new Thread(e2);

obj.start();
obj2.start();
}


}

