import java.util.*;

class SetEx{

void m1(){

Set  obj1 =new HashSet();

obj1.add(34);
obj1.add("aaa");
obj1.add(34);
obj1.add(null);
obj1.add(77);
obj1.add(null);
System.out.println(obj1);

System.out.println(obj1.size());


System.out.println("==============================");



LinkedHashSet obj2 =new LinkedHashSet();

obj2.add(34);
obj2.add(67);
obj2.add(11);



System.out.println(obj2);

System.out.println(obj2.size());




System.out.println("==============================");



TreeSet obj3 =new TreeSet();

obj3.add(34);
obj3.add(67);
obj3.add(11);
//obj3.add(null);
obj3.add(11);
//obj3.add("bb");



System.out.println(obj3);

System.out.println("size= "+obj3.size());


System.out.println("====================forEach loop==========");

for(Object tm: obj3){

System.out.println(tm);
}


System.out.println("===============for loop===========");

ArrayList obj5 =new ArrayList();
obj5.add(33);
obj5.add(55);

for(int i=0;i< obj5.size() ; i++){

if(obj5.get(i)  %2 == 0){
	System.out.println("even no"+obj5.get(i) );
}
else{
	System.out.println("odd no"+obj5.get(i) );
}
System.out.println(obj5.get(i) );
	
}

System.out.println("================while loop==========");

Iterator ir= obj5.iterator();

while(ir.hasNext() ){
	System.out.println(ir.next() );
}




























System.out.println("==========================");


PriorityQueue  queue=new PriorityQueue();  
queue.add(222);  
queue.add(33); 
queue.add(33);
//queue.add(null); 



System.out.println(queue);

System.out.println(queue.size());







}

public static void main(String args[]){
SetEx  obj =new SetEx();
obj.m1();
}
}