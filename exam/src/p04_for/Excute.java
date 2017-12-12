package p04_for;

import p03_gugudan_casting.GuGuDan;
import p03_gugudan_casting.ObjectExam;

public class Excute {
	int num1;
	void getInt() {
		
	}

	public static void main(String[] args) {
		ObjectExam oe = new ObjectExam();
		oe.inputNums();
		
		GuGuDan ggd = new GuGuDan();
		ggd.printLoop(oe);
	}
}
