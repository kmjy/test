package p16;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번째학생점수를 입력해 주세요");
			String str = s.nextLine();
			list.add(Integer.parseInt(str));
		}
		for (int i = 0; i < 5; i++) {

			sum += list.get(i);
		}
		System.out.println("총점은 :" + sum);
		System.out.println("평점은 :" + (sum/5));
	

	for(int i = 0;i<5;i++) {
			for (int j = i + 1; j < 5; j++) {
				if (list.get(i) > list.get(j)) {
					int tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
	
	for(Integer a:list){
		System.out.println(a);
	}
}

}

// 총 5명의 학생점수 스캔클래스의 nextLine()함수 사용 입력받아 총점 과 평균 구하고 점수가 낮은 순서대로 출력

//
