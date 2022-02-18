package project;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		
		System.out.println("Please enter value and press Enter");
		int num1=num.nextInt();
		System.out.println("Please enter value and press Enter");
		int num2=num.nextInt();
		System.out.println("Please enter value and press Enter");
		int num3=num.nextInt();
		System.out.println("Please enter value and press Enter");
		int num4=num.nextInt();
		System.out.println("Please enter value and press Enter");
		int num5=num.nextInt();
		
		int [] numbers= {num1, num2, num3, num4, num5};
		int size=numbers.length;
		int sum=0;
		for(int i=0;i<size;i++) {
			sum+=numbers[i];
		}
		System.out.println("Sum of all elements in the array= "+sum);
			
		}
		
	}