package P03;

public class Test {
	
	void print(String str) {
		System.out.println(str);
	}
	//raw.githubusercontent.com/cnfree/eclipse/master/decompiler/update/"
public static void main (String[]args) {
	Test t = new Test();
	String str = " 나 여깄어요~~";
	t.print(str);
	t.print(str.replace("나","박경훈"));
	t.print(str);
	}
}

