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