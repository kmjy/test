package p11;

import java.util.Random;
import java.util.Scanner;

public class Lotto_Master {

	int lottoCnt;
	int joinCnt;

	Lotto_Master() {
		Scanner s = new Scanner(System.in);
		System.out.println("참여인원을 입력해주세요=>");
		joinCnt = s.nextInt();
		lottoCnt = new Random().nextInt(joinCnt)+1;
		s.close();     //스캐너를 꼭클로즈 해줘야해!!!!!!그래서 랜덤은 짧게 줄였는데 스캐너는 안줄인거야.
	}

//즉joinCnt값을받을때  int[] joins = l.getJoins();밑에서 이렇게 호출을 해줬기 때문에. 
//int[] joins = new int[받은값];요런식으로 되어서 joins 배열의 방갯수가 지정이 되고
//  joins 배열 각각 방의 값은 0으로 초기화 된다.(null 이 아니라0으로 된다는것도 굉장히 중요하다!)
	int[] getJoins() {
		return new int[joinCnt];
	}

	
	int[] getLottos() {
		return new int[lottoCnt];
	}


	
//------중복되지 않는참가자 배열을 만들거------
//밑에 호출하는부분을 가면 joins 배열을 int[] joins = l.getJoins()요걸로이미 방의갯수값도 받아두고 모든방의 배열값을 0으로 초기화해놓은 상태이기에 
//지금메소드는 그 초기화 해놓은 방에 중복되지 않는 값을 대입시키는 메소드이다.
		void initJoins(int[] joins) {
			Random r = new Random();
			for (int i = 0; i < joins.length; i++) {
				int n = r.nextInt(joinCnt*2) + 1;
				joins[i] = n;
				if (isDupl(joins, n, i)) {
					i--;
				}
			}
		}
	
	
	
//---------참가자와 중복된!!  당첨자 배열을 만들거----------
//호출 부분을보면 l.initLottos(lotts,joins) 되어있자나 그럼 요메소드의 두번째 인자int[] joins에 joins 를 대입시키겠다는건데
//이 말은 그 배열 자체 전부를 방과 각방의 값을 전부다 가져오는 것이다.첫번째 인자 int[] lottos에 lottos를 대입시키는건 아직 0이라는 값을 갖고만 있어서
//요 메소드를 실행시키면 lottos 배열 각방에 값을대입해주려는 메소드이다
//여기서 또 중요한것은 Exlude라고이름을 지은부분인데 중복을 하게 만들어 주는거야 
//당첨자번호는 꼭 이미 만들어진 joins배열과 중복을 해야하니까 
//요 메소드에서 만들어지는 lottos 배열의각 숫자들도 중복이 되고 or joins배열과도 중복이 안된다면!안된다면!i-- 를 해서 다시 숫자를 생성해 줘야한다.
	void initLottos(int[] lottos, int[] joins) {
		Random r = new Random();
		for (int i = 0; i < lottos.length; i++) {
			int n = r.nextInt(joinCnt*2) + 1;
			lottos[i] = n;
			if (isDupl(lottos, n, i) || isExclude(joins, n)) {      
				i--;
			}
		}
	}



	boolean isExclude(int[] joins, int num) {
		for (int i = 0; i < joins.length; i++) {
			if (joins[i] == num) {    //여기서 joins[i]  는 
				return false;        //여기가 꼭 false야!! 중요 !!!
			}
		}
		return true;
	}

	

	boolean isDupl(int[] lottos, int num, int maxNum) {
		for (int i = 0; i < maxNum; i++) {
			if (lottos[i] == num) {     //
				return true;
			}
		}
		return false;
	}

	//밑에에 출력되는 순서를 꼭 먼저 보고 그 순서대로 위에 선언된것들을 봐야
	public static void main(String[] args) {
		Lotto_Master l = new Lotto_Master();
		int[] lottos = l.getLottos();   //1
		int[] joins = l.getJoins();		//2
		
		System.out.println("당첨인원 : " + l.lottoCnt);
		System.out.println("비당첨인원 : " + (l.joinCnt - l.lottoCnt));
		
		l.initJoins(joins);    					//3꼭 이순서야해 
		l.initLottos(lottos, joins);				//4
		System.out.print("참가한 사람 번호 : ");
		for (int j = 0; j < joins.length; j++) {
			System.out.print(joins[j]+ ",");
		}
		System.out.println();
		System.out.print("당첨된 사람 번호 : ");
		for (int j = 0; j < lottos.length; j++) {
			System.out.print(lottos[j]+ ",");
		}
		System.out.println();
		
		System.out.print("당첨 안된 사람 번호 : ");
		for (int j = 0; j < joins.length; j++) {
			if(l.isExclude(lottos, joins[j])) {
				System.out.print(joins[j]+ ",");
			}
		}
	}
}
