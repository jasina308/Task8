package task23;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) {
		
		//load and register JDBC driver
		String db_url="jdbc:mysql://localhost:3306/demotest";
		String user="root";
		String pass="root";
		
		try {
			//To  Establish the connection 

			Connection connection= DriverManager.getConnection(db_url, user, pass);
			
			// Check whether connection established.
			if(connection!=null) {
				
				System.out.println("Connection established");
			}
			
			else {
				
				System.out.println("Connection not established");
			}

			
			//Perform operation
			
		Statement stmt = connection.createStatement();
		//insert query to perform insert operation
		//String insert="insert into emptable(empcode,empname,empage,esalary)values(102,'Jacky',30,20000),(103,'Joe',20,40000),(104,'John',40,80000),(105,'Shameer',25,90000);";
		
				//Perform insertion 
				//stmt.executeUpdate(insert);
		
				// selecting the data
		
				String select="select * from emptable";
				ResultSet rs = stmt.executeQuery(select);
				
				while(rs.next()) {
					
				System.out.println(rs.getInt("empcode"));
				System.out.println(rs.getString("empname"));
				System.out.println(rs.getInt("empage"));
				System.out.println(rs.getInt("esalary"));
				
				}
				
				connection.close();	
			
		}

		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
