package p10;

public class Son extends Father {
	Son() {
		super(1, 2);
		
		public static void main(String[] args) {
			Father f = new Father(1,2);
			System.out.println(f);
			
			
			Father f1 = new son();
			Father f2 = new Excute(1,2);
			
			Father [] fs = new Father[3];
			fs[0] = new Father(1,2);
			fs[1] = new son();
			fs[2] = new Excute(1,2);
			System.out.println( f2.instanceof Excute);
		}
	}
}
