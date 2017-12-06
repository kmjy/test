package p12;

public class Excute {

	public static void main(String[] args) {

		ListExam le = new ListExam();

		for (int i = 0; i < 11; i++) {
			le.add(i + "");
			if (i % 2 == 0) {
				i++;
			} else {
				le.printAlStr();
			}
		}
	}
}
