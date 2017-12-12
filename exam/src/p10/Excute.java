package p10;

public class Excute extends Father{
//	int a = 4;
	Excute(int num1, int num2){
		super(num1,num2);
		
	}

	public void print() {
		String[] strs = {"3","6","9"};
		String prinStr = "";
		for(int i = minNum; i<=maxNum; i++) {
			String str= i +"";
			for(String s : strs) {              
				str = str.replace(s,"짝");
				
			}
			if(str.indexOf("짝")>-1) {
				for(char c : str.toCharArray()) {      //toCharArray 처음보는 함수 ㄷㄷ ㄷ ㄷ ㄷ ㄷ ㄷ
					if(c=="짝") {
						printStr += c;  
					}
				}else {
					printStr += str;
				}
				printStr += ",";
				if(i%10==0) {
					printStr += "/n";
					System.out.println(Str);
					.
					.
					.
					.
					.
					.
					.
			
				}
				
			}
		}
	}
