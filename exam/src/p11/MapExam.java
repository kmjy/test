package p11;

import java.util.HashMap;

public class MapExam {
	
	
	
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name", "박경훈");
		hm.put("name", "김경훈");
		System.out.println(hm.get("name"));//하면 키값 name 에 덮어씌어짐(값은 같을수있지만 키값은 같을수 없다)

	}
}
