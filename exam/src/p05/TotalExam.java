package p05;

import java.util.Scanner;

public class TotalExam {

	int a;
	
	
	public static void main (String args[]) {
	
		TotalExam te = new TotalExam();
		
		
		if(te.a ==1 || te.a ==2 || te.a ==3) {
			System.out.println("a가0이 아니네요");
		}else if (te.a ==0) {
			System.out.println("a가 0 이네요");
		}
		System.out.println(Integer.parseInt("167")==167);
		
		System.out.println("스트링배열변수의 방객수를 입렵해주세요");
	
		Scanner s = new Scanner (System.in);
		int length = s.nextInt();
		String[] strArr= new String[length];           //******중요 이건 배열변수이다
	
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println((i+1)+ "번재 방의 값을 입렵해 주세요");
			strArr[i] = s.nextInt() + "";
		}
	}

}
