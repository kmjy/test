package p14;

import java.util.ArrayList;

public class MapExam {

	private ArrayList<String> alKey;
	private ArrayList<String> alValue;

	public MapExam() {

		alKey = new ArrayList<String>();
		alValue = new ArrayList<String>();

	}

	public void put(String key, String value) {

		alKey.add(key);
		alValue.add(value);

	}
	
	
	public int size() {
		return alKey.size();
	}
	
	public boolean remo(String key) {
		int idx = alKey.indexOf(key);
		if(idx==-1) {
			return false;
		}else {
			alKey.remove(idx);
			alValue.remove(idx);
		}
		return true;
	}
	
	
	
	
	public String get(String key) {
		int idx = alKey.lastIndexOf(key);
		if(idx ==-1) {
			return "null" ;
		}
		return alValue.get(idx);
	}
	
	public String toString() {	
		String str = "{";		
		 for(int i =0; i<alKey.size(); i++) {
			 str += alKey.get(i) + "=" +alValue.get(i) +",";
		 }
			str += "}";
	}
}

	


