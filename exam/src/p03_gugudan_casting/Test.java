package p03_gugudan_casting;


public class Test {
	public static void main(String[] args) {		
		ObjectExam oe = new ObjectExam();
		oe.inputNums();
		
		GuGuDan ggd = new GuGuDan();
		ggd.printLoop(oe);
	}
}
