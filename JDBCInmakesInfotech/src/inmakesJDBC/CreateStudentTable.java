package inmakesJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateStudentTable 
{
	public static void main(String[] args) 
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Balaji@1810");
			
			String sql = "create table student"
					+ "( Student_id int not null primary key,"
					+ "Student_name varchar(20) not null,"
					+ "Student_place varchar(20) not null,"
					+ "course varchar(20) not null,"
					+ "contact_num varchar(10) not null"
					+ ")";
			Statement stm = con.createStatement();
			
			int i = stm.executeUpdate(sql);
			
			if(i > 0)
			{
				System.out.println("Table created successfully");
			}
			
		}	
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	
	}
}
