

//1) print 1 to 5
//2) print 20 to 30

//create multiple process execute it.


 class MultiProcess1 extends Thread {
//1) print 1 to 5


public void run(){

for(int i=1; i<=5 ; i++){
System.out.println(i);
}


}
}

 class MultiProcess2 extends Thread{
//2) print 20 to 30


public void run(){
for(int i=20; i<=30 ; i++){
System.out.println(i);
}
}

public static void main(String args[]){

MultiProcess1 obj1 = new MultiProcess1();   //new State
MultiProcess2 obj2 = new MultiProcess2();

obj1.start();  // first execute completely
obj2.start();   //Runnable
}

}