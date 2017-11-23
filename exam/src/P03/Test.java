package P03;

public class Test {
	String str;
	
	Test(String str){
		str = str;
	}
	void print () {
		System.out.println(str);
	}

public static void main (String[]args) {
	Test t = new Test("가나다abc123");
	t.print();

	}
}

