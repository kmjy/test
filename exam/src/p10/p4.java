package p10;

public class p4 extends p3 {

	public String toString() {
		return "p4클래스의 toString ()메써드";
	}

	public static void main(String[] args) {

		Object p2 = new p2();
		Object p3 = new p3();
		Object p4 = new p4();
		
		Object[] ObjectArr = new Object[3];
		ObjectArr[0] = p2;
		ObjectArr[1] = p3;
		ObjectArr[2] = p4;

		for (int i = 0; i < ObjectArr.length; i++) {
			System.out.println(ObjectArr[i]);
		}
	}

}
