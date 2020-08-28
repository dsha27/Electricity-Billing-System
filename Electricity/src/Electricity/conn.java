package Electricity;

import java.sql.*;



public class conn {
	
	Connection con;
	Statement s;
	
	public conn(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql:///project","root","");
			s = con.createStatement();
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	public static void main(String args){
		
	}

}
