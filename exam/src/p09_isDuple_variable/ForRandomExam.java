package p09_isDuple_variable;

import java.util.Random;

public class ForRandomExam {

	private static boolean isDupl(int[] nums, int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == num) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// 3 X 3 개의 방갯수를 가진 2차원 인트형 배열변수를 선언해주세요.
		// 각 방에 랜던함 숫자를 넣어 주시는데
		// 중복 불가
		// 랜덤한 숫자의 미니멈값은 1 맥시멈값은 20
		// 0번째층의 0번째 방부터 큰수가 들어갈 수 있도록 프로그램을
		// 만들어서 출력해주세요.
		Random r = new Random();
		int nums[][] = new int[3][3];
		int checkNums[] = new int[9];
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				int num = r.nextInt(10) + 1;
				if (isDupl(checkNums, num)) {
					j--;
				} else {
					checkNums[cnt] = num;
					nums[i][j] = num;
					cnt++;
				}
			}
		}

		for (int i = 0; i < checkNums.length; i++) {
			for (int j = i + 1; j < checkNums.length; j++) {
				if (checkNums[i] > checkNums[j]) {
					int tmp = checkNums[i];
					checkNums[i] = checkNums[j];
					checkNums[j] = tmp;
				
				}
			}
		}
		for(int a : checkNums) {
			 System.out.print(a+",");
		}
	}
}

