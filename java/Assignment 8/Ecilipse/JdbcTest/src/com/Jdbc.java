package com;
import java.sql.*;
public class Jdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","7278Rimi@");
		System.out.println("Connected");
		Statement stmt=con.createStatement();
		System.out.println("Created");
		/*ResultSet rs=stmt.executeQuery("select * from employees");
		while(rs.next()) {
			System.out.println("Id is: " +rs.getInt(1) + "Name is: "+rs.getString(2));
		}
		int res1=stmt.executeUpdate("insert into emp values (2,'ramesh',12000)");
		if (res1>0) {
			System.out.println("inserted");
		}*/
		int res1=stmt.executeUpdate("delete from emp where id=2");
		if (res1>0) {
			System.out.println("deleted");
		}
		else {
			System.out.println("Not found");
		}
		//rs.close();
		//stmt.close();
		//con.close();
	}

}