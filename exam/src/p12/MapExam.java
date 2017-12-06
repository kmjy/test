package p12;

import java.util.HashMap;
import java.util.Random;

public class MapExam {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();

	void add(int idx) {
		hm.put(idx, (hm.size() + 1) + "번째값");
	}
	
	public static void main(String[] args) {

		MapExam me = new MapExam();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int n = r.nextInt(10);

			if (me.hm.get(n) == null) { // 맵은 키값이 생겻을때 값을 대입하지 않으면 null로 나온다.
				me.add(n);
			} else {
				i--;
			}
			
		}
		System.out.println(me.hm);
	}
}