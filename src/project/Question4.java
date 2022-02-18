package project;

public class Question4 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */
		
		int [][] nums= {{ 12, 44, 53, 58}, 
				{120, 39, 79, 31, 95}
		}; 
		
		int sum = 0; 
		for (int row=0; row<nums.length; row++) {
			for (int col=0; col<nums[row].length; col++) {
				if (nums[row][col]%2==0) {
					sum+=nums[row][col]; 
				}else {
					sum+=nums[row][col]; 
				}
				
				
				
				
			}System.out.println(sum);
		}
	}

}
