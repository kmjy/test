package p20;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Excute {
	Service s= new Service();
	Scanner scan = new Scanner(System.in);
	
	public int update(LinkedHashMap<String,Object> hm,int option) {
		hm = new LinkedHashMap<String,Object>();
		System.out.println("변경 할 클래스 넘버를 입력해주세요");
		scan.nextLine().trim();
		hm.put("cino",scan.nextLine().trim());
		System.out.println("변경 할 클래스 정보를 입력해주세요");
		scan.nextLine().trim();
		hm.put("cidesc",scan.nextLine().trim());
		int result = s.makeSql(option,hm);
		return result;
	}
	public int insert(LinkedHashMap<String,Object> hm,int option) {
		hm = new LinkedHashMap<String,Object>();
		System.out.println("추가할 클래스 이름을 입력해주세요");
		scan.nextLine().trim();
		hm.put("ciname",scan.nextLine().trim());
		System.out.println("클래스 정보를 입력해주세요");
		scan.nextLine().trim();
		hm.put("cidesc",scan.nextLine().trim());
		int result = s.makeSql(option,hm);
		return result;
	}
	public int delete(LinkedHashMap<String,Object> hm,int option) {
		hm = new LinkedHashMap<String,Object>();
		System.out.println("추가할 클래스 번호를 입력해주세요");
		scan.nextLine().trim();
		hm.put("cino",scan.nextLine().trim());
		int result = s.makeSql(option,hm);
		return result;
	}
	public int select(LinkedHashMap<String,Object> hm,int option) {
		hm = new LinkedHashMap<String,Object>();
		System.out.println("출력 할 클래스 번호를 입력해주세요");
		scan.nextLine().trim();
		hm.put("cino",scan.nextLine().trim());
		return s.makeSql(option,hm);
	}
	public static void main(String[] args) {
		LinkedHashMap<String,Object> hm = new LinkedHashMap<String,Object>();
		
		Excute ex = new Excute();
		int result =0;
		
		System.out.println("1.목록보기 2.삽입 3.삭제 4.편집 ");
		int option = ex.scan.nextInt();
		if(option==1) {
			ex.select(hm,option);
		}else if(option ==2) {
			result=ex.insert(hm,option);
		}else if(option ==3) {
			result=ex.delete(hm,option);
		}else if(option ==4) {
			result=ex.(hm,option);
		}else {
			System.out.println("잘못입력");
		}
		if(result==1 || result==4) {
			System.out.println("실행되었습니다");
		}
	}
}
