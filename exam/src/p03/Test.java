package p03;

public class Test {
	
	String str;           	 //인스턴트 변수
	
	Test(String str){     	 //인스턴트메소드
		str = str;			//지역변수
	}
	void print () {			//
		System.out.println(str);
	}

public static void main (String[]args) {
	
	ObjectExam oe = new ObjectExam();
	oe.inputNums();
	GuGuDAn ggd = new GuGuDAn();
	ggd.printLoop(oe);
	
	}
}

