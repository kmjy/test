package p13;

//꼭 보기
//새로 인스턴스가 생성되면 참조변수 이름은 같지만 주소값이 달라서 계속 다른 값을 갖는다는걸 예제로 풀어준거.  
//set 을 어케 쓰는지 
//for 이치문 쓰는법

import java.util.ArrayList;

public class Excute {

	public static void main(String[] args) {

		// 정해져 있지 않는 데이타타입의 디폴트는 null 또 이 타입은 리턴값이 있어서 String.머머 를 할수있따 //또 그래서 정해져있지 않은
		// 데이터타입은 선언을할때 String str;요럽게 못하고 꼭 String str = "123"; 요런게 값을넣어주어야 한다.
		// 즉 정해져 있는 데이터타입의 디폴트는 0 이타입은 리턴값이 없어서 .머머를 못해 그래서 래퍼클래스가 잇는거야 래퍼클라스는 .머머 를
		// 할수있게 해준다 ex)Intger 과같은것들 //또 그래서 정해져있는 데이터 타입은 선언할때 int a; 이렇게 해줄수있다.
		
		
		//요건 Person 클래스를 데이터 타입처럼 쓰는예제
		
		
		ArrayList<Person> alPerson = new ArrayList<Person>();

		Person p = new Person(); //// 꼭 요렇게 인스턴스를 계속 다시 생성해 줘야 한다.
		p.setName("Ryan");
		p.setAge(22);
		alPerson.add(p); // 꼭이렇게 다시 리스트에 추가를 해주고

		// p.name = "111";

		p = new Person(); //// 꼭 요렇게 인스턴스를 계속 다시 생성해 줘야 한다.
		p.setName("Tyan");
		p.setAge(33);
		alPerson.add(p); // 꼭이렇게 다시 리스트에 추가를 해주고

		p = new Person(); //// 꼭 요렇게 인스턴스를 계속 다시 생성해 줘야 한다.
		p.setName("Ayan");
		p.setAge(11);
		alPerson.add(p); // 꼭이렇게 다시 리스트에 추가를 해주고

		for (int i = 0; i < alPerson.size(); i++) {
			for (int j = i + 1; j < alPerson.size(); j++) {
				if (alPerson.get(i).getAge() > alPerson.get(j).getAge()) {    //getAge()는 Person클래스에서 설정해놓은 메소드이다.
					Person tmp = alPerson.get(i);
//					alPerson.get(i) =alPerson.get(j);       //여기다 이짓 하지 마라 ....( 3=4 다 라는게 말이됨?)
//					alPerson.get(j) = tmp;
					alPerson.set(i, alPerson.get(j)); // set사용법(index,value) set은 그 인덱스에 원래있던 값 을 지금 넣은 값으로 대입한다
					alPerson.set(j, tmp);
				}
			}
		}
		
		
		for (Person pr : alPerson) {           //클래스 자체를 데이터타입으로 써서 포이치문 이렇게 Person pr이라고 쓸수있어 
			System.out.println(pr); // pr 만해도 출력이 되는 이유는 pr이 선언댄 Person클래스(Person 클래스에 가봐 toString메소드 만들어놨어)에
									// toString()을 안써도 출력하기때문이다. 그럼 pr.toString()이 사실 맞는건데 안써줘도 괜찮은거야그냥.
		}

		// 1 System.out.println(alPerson.get(0).name);
		// 1 System.out.println(alPerson.get(0).age);
		// 2 System.out.println(alPerson.get(0).getName());
		// 2 System.out.println(alPerson.get(0).getAge());
	}
}
