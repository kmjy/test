package p13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapExam {

	public static void main(String[]args) {
		HashMap<String,String> hm = new HashMap<String,String>();	
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		Random r = new Random();
				
		for(int i =0; i<10; i++) {
			
			
			int a = r.nextInt(10)+1;
			hm =  new HashMap<String,String>();        //이걸 꼭 해줘야해
			
			hm.put("name",i+"홍길동");
			hm.put("age",a+"");
			
			}
			al.add(hm);
			
		}
}
		
		for(HashMap<String,String> h : al) {
			System.out.println(h);
			
		}
	}
}
