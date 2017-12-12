package p16;

import java.util.Scanner;

public class ExceptionExam {

	public void convertAndPrint(String numStr) throws Exception {

		System.out.println(Integer.parseInt(numStr));

	}

	public static void main(String[] args) {
		ExceptionExam ee = new ExceptionExam();

		Scanner s = new Scanner(System.in);
		System.out.println("출력할 숫자입력해");
		String str = s.nextLine();
		try {ee.convertAndPrint(str);
		} 
			catch (Exception e) {
			System.out.println("숫자를 적으라고");
			System.out.println("제발 숫자를 적으라고");
			str = s.nextLine();
			try {
				ee.convertAndPrint(str);
			} catch (Exception e1) {
				System.out.println("숫자를 적으라고");
			}

		}
	}
}
