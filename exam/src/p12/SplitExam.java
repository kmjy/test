package p12;

import java.util.Scanner;

public class SplitExam {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("숫자를  , 기준으로 입렵해주세요.");
		String str = s.nextLine(); 			//타이핑할때 1,2,44,53,634 이라고 타이핑하면 알아서 스플릿이 배열을 만든다
		String strs[] = str.split(",");			////스플릿//  "," 를 기준으로 배열을 만들어준다
		for (int i = 0; i < strs.length; i++) {
			System.out.println("strs[" + i + "]=" + strs[i]);
		}
	}
}
