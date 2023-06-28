package inmakesJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable 
{
	public static void main(String[] args) 
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Balaji@1810");
			
			String sql = "create table bank"
					+ "( bank_id int not null primary key,"
					+ "bank_name varchar(10) not null"
					+ ")";
			Statement stm = con.createStatement();
			
			stm.executeUpdate(sql);
			System.out.println("Table created successfully");
		}	
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	
	}
}
