
import java.util.*;
class LinearSearch
{

	public static void main(String [] args){
	
		//System.out.println("LinearSearch");	
		
		//int a[]={1,55,88,22,33,99};
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter arrays size");	
		
		int size= sc.nextInt();
		
		System.out.println("value ="+size);	
		
		int array[]=  new int [size];
		
		System.out.println("Enter the value");	
		
		for(int i=0; i<size;i++){
			array[i]  = sc.nextInt();
		}
		
		System.out.println("Enter search element");	
		int searchValue   = sc.nextInt();

		
		for(int temp : array){
			System.out.println("Array = "+temp);	
		}
		
		
			//int a[]={1,55,88,22,33,99};
		boolean isFound= false;
		
		for(int i= 0;i< array.length;i++){
			if(array[i] == searchValue){
				
				System.out.println("Searching value at index = "+(i));
				isFound=true;
				break;	
			}
		}	
		
		if (!isFound) {
			System.out.println("Searching value is not present = " + searchValue);
		}
	}

}