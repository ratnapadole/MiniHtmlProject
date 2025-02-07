
import java.util.*;

class AsendingOrder
{

	public static void main(String []args){
		int a[]={4,5,1,88,22,41,98,18};

		//use predefined method..i.e sort method
		Arrays.sort(a);

		for(int temp : a){
			System.out.print(temp +"   ");
		} 
		
		System.out.println("====================================  ");
		//use own logic
		//int a[]={4,5,1,88,22,41,98,18};  // 4>1    1 4 5
		
		int temp =0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				
				if(a[i] > a[j]){
					temp = a[i];         //temp     a=i     b=j
					a[i] = a[j];     //i=4        j=1    //i=1    j=1
					a[j] = temp;     //i=1     j=1      /// i=1    j=4
				}
			}	
		}
			
		for(int e : a){
			System.out.print(e +"   ");
		} 
		
		
	System.out.println("====================================  ");
	
		
		int m[][] ={ {3,5,7,9,1,2}, {5,42,1,12,46}  };

		for(int i=0;i<m.length;i++){
		   for(int j=0;j<m[i].length;j++){
			System.out.println(m[i][j]+m[i][j]  + "  ");
						
		   }
		}
		
				
	System.out.println("====================================  ");
	
		
		for (int[] row : m) {
		  for (int i : row) {
			System.out.println(i);
		  }
		}
				
		
		
		
		
	}
}