
//wap to create one class extends Thread class 
//,find out duplicate no from int array,
//use join() method


class Join extends Thread {

public void run(){

int a[]={2,4,5,6,77,2,3,4};


for(int i=0 ;i<a.length;i++){
	for(int j=i+1 ;j<a.length;j++){
		if(a[i]  == a[j]){
			System.out.println("Duplicate no = "+a[i]);
		}
	}
}

}

public static void main(String args[])  {
Join obj =new Join();

obj.start();

try{
obj.join();
}catch(Exception ex){
System.out.println("it is Exception");
}
}


}