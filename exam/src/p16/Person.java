package p16;

public class Person implements Action {
	
	public String name;
	public int age;
	public int height;
	public String email;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", email=" + email + "]";
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat()호출");
	}
	public void eat(String spam) {
		System.out.println("스팸은 저질이야");
	}


	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("sleep()호출");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walk()호출");
	}
	
	
	
}
