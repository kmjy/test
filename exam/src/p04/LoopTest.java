package p04;

public class LoopTest {
	
	void func1 (int num1, int num2) {
		
		int sum= 0;
		for(int i=1; i<=100; i++) {
			sum +=1;
		}
		System.out.println(sum);
	}
	
	void func2 (int num1, int num2) {
		
		for(int i=1; i<101; i++) {
			  if(i%2==1) 	{	
		System.out.print(i);
			 }
		}
	}
	
	void func3 (int num1, int num2, int num3) {
		if(num1>num2) {
			int tmp =num1;
			num1 = num2;
			num2 = tmp;
		}
		for(int i = num1; i <=num2; ) {
				System.out.print(i+ ",");
			}
		
			}
	
	
public static void main (String[]args) {
	
	
LoopTest lt = new LoopTest();

	lt.func1();
	lt.func2();
	lt.func3(1,10,2);
		
	}

}







