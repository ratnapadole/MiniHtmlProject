class SwapProgram extends Thread{

public static void main(String args[]){
SwapProgram obj =new SwapProgram();
obj.start();
//obj.start();
obj.setName("swap Thread");
obj.setPriority(2);

int n=4279;
int d;

while(n  > 0){
d=n%10;     //9   2
System.out.println(d);    //9     2

n=n/100;    //  4279/100 =   42.79        ===42        42/100  ==  0.42     =====   n=  0  


int v;
for( v=5;v>10;v++)
System.out.println(v);

System.out.println(v*4);  //5*4



if(a>4)
int s=55;




}

}


//9     2     

public void run(){
System.out.println("This is SwapProgram == "
+Thread.currentThread().getName()  +"===="+Thread.currentThread().getPriority() );
}




}