package p20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Excute {
	public static void main(String[] args) {
		Service s = new Service(); // 1
		LinkedHashMap<String, Object> hm = new LinkedHashMap<String, Object>(); // 4

		// update.

		hm = new LinkedHashMap<String, Object>();

		hm.put("cidesc", "테스트반뉴뉴");
		hm.put("cino", 4);
		int result = s.updateClassInfo(hm); // 2

		if (result == 1) { // 3
			System.out.println("업데이트 잘됐음");
		} 

		// delete
		hm = new LinkedHashMap<String, Object>();
		hm.put("cino", 1);
		int result1 = s.deleteClassInfo(hm);

		if (result1 == 1) {
			System.out.println("삭제가  잘됐음");
		}else if (result1 == 0) {
			System.out.println("삭제가  안댐");
		}

		// insert
		hm = new LinkedHashMap<String, Object>();
		hm.put("ciname", "doit2");
		hm.put("cidesc", "werteam2");
		int result2 = s.insetClassInfo(hm);
		if (result2 == 1) {
			System.out.println("수정이 잘됐음");
		}

		// select
		hm = new LinkedHashMap<String, Object>();
		hm.put("cino", 1000);
		ArrayList<HashMap<String, Object>> result3 = s.searchClassInfo(hm);

		if (result3 != null) {
			System.out.println("검색 잘됐음");
		}else if (result3.size()==1) {
			System.out.println("검색 안댐");
		}
	
	}

}
