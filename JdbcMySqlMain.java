package com.JDBC;
import java.sql.*;
import java.sql.Statement;
public class JdbcMySqlMain {

	public static void main(String[] args) throws Exception {
		  String id="5";
		    String Name="ABC";
		    String Phone="000";
		
		    String sql = "update newtable set name='raju' where id=1";
		    String q1 = "insert into newtable values('" +id+ "', '" +Name+  "', '" +Phone+ "')";
		    String q2 = "DELETE from userid WHERE id = 1"; 
		  
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mona1998");
		System.out.println("connection estableshed\n");
			Statement stmt=dbcon.createStatement();
			
			
				ResultSet rs=stmt.executeQuery("SELECT * FROM newtable");
				
				while(rs.next())
				{
					int id1=rs.getInt("Id");
					String name=rs.getString("Name");
					double phone=rs.getDouble("Phone");
					System.out.println(id+"-"+name+"-"+phone);
				}
				//stmt.executeUpdate(sql);
				 //stmt.executeUpdate(q1);
				 stmt.executeUpdate(q2);
				rs.close();
				stmt.close();
				dbcon.close();
	}

}
