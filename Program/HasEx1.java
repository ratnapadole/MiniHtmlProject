import java.util.*;


class HasEx1{

public static void main(String args[]){


HashSet obj=  new HashSet();

obj.add(23);
obj.add("ABC");

  for (Object element : obj) {
      
      System.out.println(element);
   
   }
   
    System.out.println("==================================");
  ArrayList<Object> res = new ArrayList<>();
  
   for(int i=0;i<=res.size();i++){
	   Object o =res.get(1);
	   System.out.println(o);
   }
   
   

	 

}
}