
import java.util.*;
class SelectionSort
{

	public static void main(String [] args){
	
		System.out.println("Selection Sort ");	
		
		int a[]= {60,55,88,22,1,33,99};
		int min=0;
		System.out.println("Length = "+ a.length);
		System.out.println("Before value="+Arrays.toString(a));
		
		for(int i=0;i< a.length  ; i++){
			min	= i;		
			for(int j = i+1;j<a.length ;j++){
				
				if(a[j]   <  a[min]   ){ // 44 > 2
					min = j;
				}
			}
			
			int temp = a[i];    //temp ,a   b--  temp =a  a=b  b=temp 
			a[i] = a[min];
			a[min] = temp;
		}
		
		for(int t : a){
			System.out.println("Sort Value="+t);
		}
		System.out.println("After value="+Arrays.toString(a));

		
	}
		
}




