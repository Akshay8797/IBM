package com.JDBC;
import java.sql.*;
import java.sql.Statement;
public class PrepStatement {

	public static void main(String[] args) throws Exception {
		 String id="5";
		    String Name="ABC";
		    String Phone="000";
		
		  //  String sql = "update newtable set name='raju' where id=1";
		    //String q1 = "insert into newtable values(" +id+ "', '" +Name+  "', '" +Phone+ ")";
		    //ring q2 = "DELETE from userid WHERE id = 1"; 
		  
		Class.forName("com.mysql.jdbc.Driver");
		Connection dbcon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","mona1998");
		System.out.println("connection estableshed\n");
			PreparedStatement stmt=dbcon.prepareStatement("insert into newtable values(?,?,?)");
			
			
				ResultSet rs=stmt.executeQuery("SELECT * FROM newtable");
				
				while(rs.next())
				{
					int id1=rs.getInt("Id");
					String name=rs.getString("Name");
					double phone=rs.getDouble("Phone");
					System.out.println(id1+"-"+name+"-"+phone);
				}
				stmt.setInt(1, 222); 
				stmt.setString(2, "Tom"); 
				stmt.setInt(3, 2000);
				int updates = stmt.executeUpdate();
			
				//stmt.executeUpdate();
				 //stmt.executeUpdate(q1);
				 //stmt.executeUpdate(q2);
				rs.close();
				stmt.close();
				dbcon.close();
	}

}
