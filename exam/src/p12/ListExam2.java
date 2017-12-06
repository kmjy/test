package p12;

import java.util.ArrayList;
import java.util.Scanner;
//문제
//String 으로 구성된 ArrayList를 선언해주세요.
// 스캐너 클래스를 사용하여 숫자를 입력받아
// 해당 숫자만큼 반복해서 ArrayList의 값을
// 스캐너 변수로 문자열숫자를 입력받아주세요.
// 중복값이 없어야 합니다.
// 만약 중복값을 입력할 경우 중복값이 있다고 알려주고
// 다시 돌아야 합니다.
// ArrayList안에 값을 출력하는 함수를 2개 만들어주시고
// 첫번재 함수는 짝수일때만 출력
// 두번째 함수는 홀수일때만 출력해주세요.

public class ListExam2 {

	ArrayList<String> al = new ArrayList<String>();

	ListExam2(){
		
		Scanner s = new Scanner(System.in);
		System.out.println("리스트 방의 갯수를 입력해주세요");
		int max = s.nextInt();
		for(int i=1; i<max; i++) {
			System.out.println(i+"번재숫자를 입력해");
			int n = s.nextInt();
			if(al.indexOf(n+"") !=-1) {
				System.out.println(n+"중복 다시");
				i--;
			}else {
				al.add(n+"");	
			}
		}
	}

	void printOdd() {							//홀수 출력하는법 
		for(String s : al) {					//배열안에 수를 하나하나씩 s에 대입
			int num = Integer.parseInt(s);      //형변환
			if(num%2 == 1) {
				System.out.println(num);
			}
		}
	}


	void printEven() {
		for(String s : al) {
			int num = Integer.parseInt(s);
			if(num%2 == 0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {

		ListExam2 l = new ListExam2();
		l.printEven();
		l.printOdd();
	}
}