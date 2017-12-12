package p16;

public class Animal implements Action{

	public String name;
	public int age;
	public int height;
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(name+"은 사료를 먹는다");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(name+"은 잠을 잔다");
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(name+"은 걷는다");
	}
	
}
