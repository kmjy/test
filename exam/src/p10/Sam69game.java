package p10;

public class Sam69game {

	public static void main(String[] args) {

		int[] num = new int[1000];

		for (int i = 0; i < num.length; i++) {
			String str = i + 1 + "";          //숫자를 문자열로바꿔주는 법 
			str = str.replace("3", "짝");
			str = str.replace("6", "짝");
			str = str.replace("9", "짝");

			if (str.indexOf("짝") > -1)  {
				if (str.equals("짝짝")) {
					System.out.print("짝");
				}
				System.out.print("짝,");
			} else {
				System.out.print(str + ",");
			}if(i%10==0) {
			 System.out.println();
		}
	}
	}
}

