package project;

public class Question3 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array or integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */

		int [][] numbers= { { 9, 10, 13, 21, 40 }, { 51, 74, 59, 44 } };
		for (int[] oddEven:numbers) {
			for (int even:oddEven) {
				if(even%2==0) {
					System.out.print(even+" ");
	
				}
			}
			
		}
	}
}
