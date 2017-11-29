package p06;

import java.util.Scanner;



public class Exam01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int min =s.nextInt();
		int max =s.nextInt();
		
		System.out.println();
		
		for (int i = 9; i > 0; i--) {
			for (int j = 9; j > 0; j--) {
				System.out.print(i + "x" + j + "=" + i * j + ",");
				if (i * j % 3 == 0) {
					System.out.print("3의 배수");
				}
				if (j == 1) {
					System.out.print(i + "x" + j + "=" + i * j);
				}
			}
			System.out.println("");
		}
	}
}
