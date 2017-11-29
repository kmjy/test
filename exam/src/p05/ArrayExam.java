package p05;

import java.util.Scanner;

public class ArrayExam {
	
	int num1;
	int num2;
	int[][]numArr;
	
	void inputNums() {
		Scanner s = new Scanner(System.in);                            
		System.out.println("첫번째 숫자를 입렵해주세요 :");
		num1 = s.nextInt();									
		System.out.println("첫번째 숫자를 입렵해주세요 :");
		num2 = s.nextInt();
	}
 
		

	void initNumArr() {
		
		numArr = new int[num1][num2];
		for(int i=0; i<numArr.length;i++) {
			for(int j=0; j<numArr[i].length;j++) {
				numArr[i][j] =(i*numArr[i].length)+j+1;
		
	}
		
		
			}
		}

//		System.out.println(numArr.length);                        //numArr의[][] 중 첫번재 [] 의 방개수.
//		System.out.println(numArr[0].length);                     //numArr의[0]의 방개수

		
		void printNumArr() {
			for(int i=0; i<numArr.length; i++) {
				for(int j=0; j<numArr[i].length; j++) {
					System.out.print(numArr[i][j]);
				if(j != numArr[i].length-1) {
					System.out.print(",");
				}else{
					System.out.println();
					
					}
				}
			}	
		}
	
	public static void main (String[]args) {
		
ArrayExam ae = new ArrayExam(); 					//ArrayExam(클래스 에서)의 함수  " ae" 를 생성하기
 													//(클래스에서 함수를 생성해야 그클래스 안에 선언한것들을 불러올수있다)
ae.inputNums();
ae.initNumArr();
ae.printNumArr();

		}
}
	
