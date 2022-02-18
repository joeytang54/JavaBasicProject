package project;

public class Question8 {

	public static void main(String[] args) {
		// Maximum and minimum number in the array
		
		int [] num= {29, 55, 73, 62, 90, 104}; 
		int largest=num[0]; 
		
		for (int x=1; x<num.length; x++) {
			if (num[x]>largest) {
				largest=num[x]; 
			}
		}System.out.println("The maximum number in the array is "+largest);
		
		int smallest=num[0]; 
		for (int y=1; y<num.length; y++) {
			if (num[y]<smallest) {
				smallest=num[y];
			}
		}System.out.println("The minimum number in the array is "+smallest);
		

	}

}
