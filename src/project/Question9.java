package project;

public class Question9 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array

		
		int [] num= {23, 44, 57, 90, 72}; 
		
		int largest=num[0]; 
		int second = 0; 
		
		for (int x=0; x<num.length; x++){
			if (num[x]>largest) {
				largest=num[x];	
		}else if (num[x]>second) {
			second=num[x];
		}
	}System.out.println("The second largest number in the array is "+second);
	}
}
