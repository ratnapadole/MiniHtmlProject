

import java.util.*;

class DateEx {
 public static void main(String[] args) 
    { 
        Date d1 = new Date(); 
        System.out.println( d1); 
		System.out.println( d1.getTime()); 
		System.out.println( d1.getDate()); 
		System.out.println( d1.getYear());
		System.out.println( d1.getMonth()); 
				
		
       // Date d2 = new Date(2323223232L); 
       // System.out.println("Date represented is "+ d2 ); 
	   
	   System.out.println("================Date Pattern========"); 
		
		
		//SimpleDateFormat obj =new SimpleDateFormat("DD-MM-YYYY");
		
		//System.out.println(obj.format(d1) );
		 SimpleDateFormat ft =   new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

      System.out.println("Current Date: " + ft.format(d1));
    } 
}
