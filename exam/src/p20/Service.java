package p20;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Service {

	DBCon dbcon;
	Service(){
		dbcon = new DBCon();
	}
	

	public ArrayList<HashMap<String,Object>> searchClassInfo(LinkedHashMap<String,Object>hm) {	
		ArrayList<HashMap<String,Object>> result=null;
		String sql="select cino from class_info\r\n" + 
				"where cino=?";
			
			try {
			result=dbcon.executeQuery(sql,hm);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return result;
	}
	
	public int insetClassInfo(LinkedHashMap<String,Object>hm) {
		int result=0;
		
		String sql="insert into class_info(ciname,cidesc)\r\n" + 
				"values (?,?)\r\n" ;
			
		try {
			result=dbcon.executeUpdate(sql,hm);
			dbcon.commit(); 
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}   
			System.out.println("수정 이미했어");
		}finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
			return result;
	}
	
	
	public int deleteClassInfo(LinkedHashMap<String,Object>hm) {
		int result=0;
		
		String sql="delete from class_info\r\n" + 
				"where cino=?\r\n" ;
		try {
			result=dbcon.executeUpdate(sql,hm);
			dbcon.commit(); 
		} catch (SQLException e) {
			try {
				dbcon.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}   
			System.out.println("삭제 이미했어");
		}finally {
			try {
				dbcon.closeAll();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
			return result;
		
				
	}
	
	public int updateClassInfo(LinkedHashMap<String,Object>hm) {   			//4         //5-2 괄호안에 LinkedHashMap<String,Object>hm 요거넣어주기
		int result =0;											//1
		String sql="update class_info " + 
				"set cidesc=? " +   		 	//1-1 		//4 내용바꾸기    //5-1 물음표로 바꿔주기?는 절대 홑따옴표 붙으면 안댐
				"where cino=?";
		try {
			result=dbcon.executeUpdate(sql,hm);     			  	//1-2 트라이태치         //5-2,hm 써주기
			dbcon.commit(); 									//2
		} catch (SQLException e) {
			try {
				dbcon.rollback();         						//3  트라이캐치
			} catch (SQLException e1) {
				
				System.out.println("업데이트 이미 했어");
			}
			e.printStackTrace();
		}finally {                							//4-1 파이널리 써주고 
			try {
				dbcon.closeAll();          				  //5 트라이캐치  여까지하고    >>익스큐트 클래스만들기
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;                             	//1-3
	}
}
