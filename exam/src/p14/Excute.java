package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute {

	public static void main(String[]args) {
		
		
		ArrayList<MapExam> al = new ArrayList<MapExam>();
		
		MapExam me = new MapExam();
		Random r = new Random();
		
		
		for(int i=0; i<101; i++) {
			me = new MapExam();            //요렇게 새로 생성을 해줘야 중복되지 않는 me를 만들수 있다.
			me.put("name", "r"+i);
			int age= r.nextInt(100)+1;
			me.put("age", age+"");
			al.add(me);
		
		}
		for(MapExam m : al) {
			System.out.print(m);
		
			
		}
	}
}
