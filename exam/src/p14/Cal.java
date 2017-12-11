package p14;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal {

	public int add(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {

		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		return a - b;
	}

	public int multi(int a, int b) {

		return a * b;
	}

	public int division(int a, int b) {

		if (a < b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		return a / b;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
	
		
		for (int i=0; i<al.size()+1;i++) {
			
			Scanner s = new Scanner(System.in);
			int sum;
			Cal cc = new Cal();
			System.out.println("첫번재 숫자를 입력해주세요");
			int a = s.nextInt();
			System.out.println("두번재 숫자를 입력해주세요");
			int b = s.nextInt();

			s.nextLine();
			System.out.println("연산자를 입력해주세요 연산자는 +,-,*,/ 만 입력가능합니다.");
			System.out.println("한번더 ,그만하고 싶으면 esc 입력해");
			String c = new String();
			c = s.nextLine();

			if (c.equals("+")) {
				System.out.println("정답은:" +cc.add(a,b)+"입니다");
				al.add(cc.add(a, b));
				System.out.println("");
			} else if (c.equals("-")) {
				System.out.println("정답은:" +cc.minus(a,b)+"입니다");
				al.add(cc.minus(a, b));
				System.out.println("");
			} else if (c.equals("*")) {
				System.out.println("정답은:" +cc.multi(a,b)+"입니다");
				al.add(cc.multi(a, b));
				System.out.println("");
			} else if (c.equals("/")) {
				System.out.println("정답은:" +cc.division(a,b)+"입니다");
				al.add(cc.division(a, b));
				System.out.println("");
			}else if (c.equals("esc")) {
				i=al.size();
			
			}


			}
		}

	}

