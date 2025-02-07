import java.util.*;

class MapEx{

public static void main(String args[]){

HashMap obj=  new HashMap();

obj.put(1,"ABC");
obj.put(2,"XYZ");

obj.put(3,55);

obj.put(2,"MH");
obj.put(4,"MH");

System.out.println(obj);


obj.replace(3,55,"tata");


System.out.println("contain key="+obj.containsKey(5)  );
System.out.println(obj);

System.out.println("size="+obj.size() );


System.out.println("==========================" );

obj.clear();
System.out.println(obj);

System.out.println("size="+obj.size() );


}

}