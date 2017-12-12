package p16;

public class Excute {

	public void printAction(Action act) {
		//eat 호출시 누구누구가 먹습니다.
		act.eat();
		//sleep호출시 누구누구가 잡니다.
		act.sleep();
		//walk호출시 누구누가 걷습니다
		act.walk();
	}

	public static void main(String[] args) {
		Hong hong = new Hong("Hong", 20, 173, "hong@gamil.com");
		Excute e = new Excute();
		//동물도 이름 나이  몸길이 갖게 만들어 
		//cat생성자 호출시 이름나이 몸길이 저장하게 만들어
		Cat c = new Cat("mjpet",100,200);
		
		e.printAction(c);
		
	}
}
