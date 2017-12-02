package p02;

public class Exam {

	public static void main(String[] args) {

		int i = 1;
		int a = 3;
		for (; i < 10; i++) {
			a = 6;
			System.out.println(i);
		}
		System.out.println(a); // 포문끝나고 밑으로 내려오니까 a는 6으로유지
		System.out.println(i); // 여기선 10이야 , 왜냐면 포문이 끝날대는 10이니까
	}
}
