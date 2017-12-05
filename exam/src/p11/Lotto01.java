package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto01 {

	int lottoCnt = 0;
	int joinCnt = 0;

	Lotto01() {
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원을 입력해주세요=>");
		joinCnt = s.nextInt();
		System.out.println("당첨인원을 입력해주세요=>");
		lottoCnt = s.nextInt();
		s.close();

	}
//요렇게도 return 할수잇다는걸 알아둬라
	int[] getLottos() {
		return new int[lottoCnt];
	}

	// 참여인원에 대한 배열변수를 받는거
	int[] getJoins() {
		return new int[joinCnt];
	}
	// 담청인원에 대한 배열변수를 받는거

	void setLottos(int[] lottos) {
		Random r = new Random();
		for (int i = 0; i < lottos.length; i++) {
			int n = r.nextInt(joinCnt) + 1;
			lottos[i] = n;
			if (isDupl(lottos, n,i)) {
				i--;
			} 
		}
	}
	
	boolean isExclude(int[] joins, int num) {
		for(int i=0; i<joins.length; i++) {
			if(joins[i] ==num) {
				re
			}
		}
	}

//요렇게 ()안에 인자를선언하고 함수 안에서 바로 쓸수있다)
	boolean isDupl(int[] lottos, int num,int maxNum) {	//maxNum:을해서 더간단하게한다//isDupl 은 만든함수()괄호안에 몇개를 선언해도 상관없어
		for (int i = 0; i < maxNum; i++) {
			if (lottos[i] == num) {
				return true;   				//return의 특징으로서 맞으면 바로 끝나버림
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Lotto l = new Lotto();
		int[] lottos = l.getLottos();
		int[] joins = l.getJoins();
		System.out.println("당첨인원:" + l.lottoCnt);
		System.out.println("비당첨인원:" + (l.joinCnt - l.lottoCnt));

		l.setLottos(lottos);    //랜덤수를 순서대로 입력하기 위해
		for (int i =0; i < joins.length; i++) {
			for (int j = 0; j < lottos.length; j++) {
				if ((i+1) == lottos[j]) {
					
					System.out.print((i+1) + ",");
				}
			}
		}
	}
}
