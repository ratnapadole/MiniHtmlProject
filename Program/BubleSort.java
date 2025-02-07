
import java.util.*;
class BubleSort
{
	public static void main(String [] args){
	
		System.out.println("Bubble Sort ");	
		
		int a[]= {1,55,88,22,33,99};
		
		System.out.println("Length = "+ a.length);
		System.out.println("Before value="+Arrays.toString(a));
		
		for(int i=0;i< a.length - 1 ; i++){	
			for(int j=0;j<a.length - 1 ;j++){
				if(a[j]  >  a[j+1]){ // 44 > 2
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int t : a){
			System.out.println("Sort Value="+t);
		}
		System.out.println("After value="+Arrays.toString(a));
	}
		
}




