package p05;         //구구단 예제 

import java.util.Scanner;

public class ArrayExam2 {
	
	static 	int num1;
	static  int num2;
	

	
	public static void main (String[] args) {
	
		Scanner s = new Scanner(System.in);      
		
		System.out.println("몇 단 까지 계산 할까요? :");
		num2 = s.nextInt();									
		System.out.println("몇 까지 곱할 까요? :");
		num1 = s.nextInt();
		
	
		
		for(int i=0; i<num1; i++) {
			for(int j=0; j<num2; j++) {
				System.out.print((j+1) + "x" + (i+1) + "=" + (i+1)*(j+1) + ",");
			}
			System.out.println();
			}
		}
	}
	

		

	

