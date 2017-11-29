package p04;

import p03.GuGuDAn;
import p03.ObjectExam;

public class Excute {

	public static void main (String[]args) {
	
	ObjectExam oe = new ObjectExam();
	oe.inputNums();
	GuGuDAn ggd = new GuGuDAn();
	ggd.printLoop(oe);
	}
}
