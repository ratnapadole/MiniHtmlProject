class CheckUper{
	public static void main(String args[]){
		String s="RamEsh chAndan KalE";   //R C Kale
		
		//1)StringUtils.capitalize(a);
		//2)chartAt(0)
		//3) Array   with Character 
	
	System.out.println("new String= "+s);
		String arr[] = s.split(" ");// arr[-1]--->h arr[0]--->c  ///arr[1]--h
		
				//{"RamEsh","chAndan","KalE"};
			
		System.out.println("First= "+Character.toUpperCase(arr[0].charAt(0))+" " +Character.toUpperCase(arr[1].charAt(0)) 
		+" " +Character.toUpperCase(arr[2].charAt(0)) 
		+arr[2].substring(1).toLowerCase() ); 

			//System.out.println("First= "+n);
				
		for(String temp : arr){
			System.out.println("new String="+Character.toUpperCase(temp.charAt(0)) + temp.substring(1).toLowerCase()  );
		
		}
		
		
		//System.out.println("new String= "+s);
	}
}