package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {

	private ArrayList<String> alStr = new ArrayList<String>(); // 꼭 new를 해줘야 private 일대 다른 클래스에서 호출하여 쓸수있다

	void add(String str) {
		// if (alStr.isEmpty()) { // isEmpty :alStr 이 비어있을때 즉 []일때 트루값을 반환한다.
		// System.out.println("여긴 처음이지?");
		// } else {
		// System.out.println(alStr.get(alStr.size() - 1)); // "size()-1" 하면 그 방사이즈보다 하나
		// 작은거
		// }
		alStr.add(str);
	}

	String get(int idx) {
		return alStr.get(idx);
	}

	void remove(int idx) {
		alStr.remove(idx);
	}
	
	void inputAlStr() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자스트링을 넣어주세요. 구분자는 , 입니다.");
		String str = s. nextLine();
		
		str= "1,2,3,4";
		String[] strs = str.split(",");			//스플릿//  "," 를 기준으로 배열을 만들어준다
		for(String ss:strs) {
			System.out.println(ss);
		}
	}
	

	void printAlStr() {
		for (int i = 0; i <alStr.size(); i++) {
			if(Integer.parseInt(alStr.get(i))%2==0) {		//alStr.get() 의리턴타입은str 이라서 int 로 형변환!!!
			remove(i);										//Integer.parseInt 요걸로 String>>int 로 형변환
			i--;
		} else {
			System.out.println(i+"번째 값"+alStr.get(i));
		}
	}
}
	
	// 총 합을 구할대 integer.parseInt 로 int로 형변환 해주기
	void printAlStr2() {
		int sum = 0;
		for (int i = 0; i <alStr.size(); i++) {
			String numStr = alStr.get(i);
			int num = Integer.parseInt(numStr);
			sum += num;
			System.out.println(i+"번째 값"+numStr);
		}
		System.out.println("입력하신 숫자의 총 합은 : "+sum);
	}
}
