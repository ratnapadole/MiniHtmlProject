//wap to store value into ArrayList class


import java.util.*;

class ArrayEx{

public static void main(String args[]){

int a[]={56,23,89,12};

ArrayList obj =new ArrayList();


obj.add(23);
obj.add(67);
obj.add("ABC");
obj.remove(1);
obj.add(null);
obj.add(23);
System.out.println("output of arrayList= "+obj);
System.out.println("output of Contains= "+obj.contains(67));

System.out.println("output of size= "+obj.size());



//    [23,67]


}


}
