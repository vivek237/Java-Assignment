package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertIntoTable {
	 static final String url="jdbc:mysql://localhost/studentRecord";
	 static final String user="root";
	 static final String pass="2000";
	 
 	public static void main(String[] args) {
 		try(Connection conn=DriverManager.getConnection(url,user,pass);
 				Statement stm=conn.createStatement();)
 		{
 			String sql="INSERT INTO studentDetail VALUES(101,'vivek',20,'chandigarh')";
 			stm.executeUpdate(sql);
 			
 			sql="INSERT INTO studentDetail VALUES(102,'satyam',23,'delhi')";
 			stm.executeUpdate(sql);

 			sql="INSERT INTO studentDetail VALUES(103,'raman',24,'gurugram')";
 			stm.executeUpdate(sql);

 			sql="INSERT INTO studentDetail VALUES(104,'dheeru',25,'up')";
 			stm.executeUpdate(sql);
 			
 			System.out.println("Record Inserted......");
 		}
 		catch(SQLException e) {
 			e.printStackTrace();
 		}
	}
}
