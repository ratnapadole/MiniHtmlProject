class IName implements Runnable{

public static void main(String args[]){
IName obj= new IName();

Thread t = new Thread(obj);
t.start();
}

public void run(){
System.out.println("this is run Method");
}

}


//


//1) print 1 to 5
//2) print 20 to 30
