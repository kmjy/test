package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam {
	public static void main(String[] args) {
		// ArrayList<> 는 순차적으로 값을 입력하려면 퍼포먼스가 가장빠름 하지만 중간의 값은 부를땐 느리다.
		// <데이터타입지정> 하지만 이 안에 정해져 있는타입은 넣지 못한다(int못넣은 대신 Integer)
		// 방개수를 지정해주지 않는다 . add하는 만큼 넣을수있다.

		// ArrayList<String> al = new ArrayList<String>(); // ArrayList는 임폴트해야하는거야
		// al.add("test");
		// System.out.println(al.get(0));

		ArrayList<Integer> al = new ArrayList<Integer>(); // 숫자를 넣고 싶을때 Integer 사용
		
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			int n =r.nextInt(10) + 1;
			if(al.indexOf(n)==-1) {						//순차적으로 추가를 하게되니까 이렇게 중복을 체크할수있다.그냥 배열보다 리스트가 쉽다
				al.add(n);
			}else {
				i--;
			}
		}
			
//			System.out.println(al.indexOf(n));  //lastindexOf 뒤에서 부터 찾을때
		
		for (Integer i : al) {
			System.out.println(i);
		}

	}
}
