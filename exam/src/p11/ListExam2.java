
//	public String getStr(){          //요렇게 리턴하려는 타입과 생성할때 써주는 타입이 같아야한다.
//		return "123";
//		}
// 	public int getStr(){          //요렇게 리턴하려는 타입과 생성할때 써주는 타입이 같아야한다는거야 return 할타입이 int니까 위에 생성할때도 int로 생성하기
//		return 123;
//		}
//public void getStr(){            //요건 반환값이 "없는"반환타입이 없는거야! 
//		System.out.println("123"); //반환값 타입이 없는 메소드자나 그래서 System.out.println(le.getStr())는 컴파일 에러가 난다.
//		}
package p11;

import java.util.ArrayList;

public class ListExam2 {
	// 정해져 잇지 않은 타입이라 생성할때 꼭 new 를 해줘야한다
	// 예를 들어 정해져 있는 타입 int는 int a; 요렇게 할수있어 왜냐면 int는 정해져 있는 타입이라서
	
	ArrayList<String> alStr;

	// 원래는 보통 ArrayList<String> alStr = new ArrayList<String>(); 이라고 해줘야한다. 머 밑에처럼
	// 기본생성자를 호출하는식으로 할수도 있다는거 알기
	// 요렇게 기본생성자에 new인스턴스화 하면 le.alStr.size()런타인 오류가 안난다 . 왜냐면 기본생성자에서 인스턴스화를 해줘서
	ListExam2() {
		alStr = new ArrayList<String>();
	}

	public static void main(String[] args) {
		ListExam2 le = new ListExam2();
		System.out.println(le.alStr.size());
	}
}

