class App{
int a=45;
}

class T1 extends App{
	int b=11;
	
public static void main(String args[]){

System.out.println("this child class");

App obj=new App();
System.out.println("value = "+obj.a);
T1 o=(T1) obj;

System.out.println("value = "+o.b);

App obj1 = new T1();//Upcasting
System.out.println("value 2 = "+obj1.a);

//App obj2 = new T1();//
//System.out.println("value 3 = "+obj2.b);

T1 obj3 =new T1();  ///1



App obj4 = new T1();
T1 obj5  = (T1) obj4;//downCasting 

System.out.println("value 3 = "+obj5.b);










}


}