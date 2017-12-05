package p11;

import java.util.ArrayList;

public class StringList extends ArrayList{

public String toString() {
	return "난 내가 뭘 직어야 할지 모르겠다."
}
	StringList(){
		alStr = new ArrayList<String> ();
	}
	public static void main(String[] args) {
		StringList sl = new StringList();
		int len =sl.alStr.size();    // size()방개수 타입은 int
		System.out.println(len);
	}
}
