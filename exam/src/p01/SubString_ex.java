package p01;

public class SubString_ex {

	public static void main(String[]args) {
		String str = "123가 456";
		int idx = str.indexOf("가");    					//indexof  문자열의 자릿수 찾기 (0부터시작)        근데 만약에 "가"가 없지 ?그럼 -1 int  를 출력하게된다.
		System.out.println(idx);  						//3이라고 나오면 0부터 시작이기때문에 사람로직의 4번재자리라는것!!
		System.out.println(str.substring(0,idx));       //substring 은 문자열을 자르는거 //파리미터 첫번재꺼는 몇번째부터 자르라. 두번재파라미터는"몇개"문자열을 출력해라!!
		System.out.println(str.substring(idx)); 		//파라미터가 하나면 몇번째부터(그자리수도 포함해서 출력)자르고 쭉다 출력해라
		System.out.println(str.replace("3",""));  		//가를 빈문자열로 대체해라 (요걸쓰면 문자열에 가를 그냥 빼버릴수있는 가장쉬운 방법이다)
		//trim  은 양옆의 빈문자열을 삭제하는거다.
		
	}
}
