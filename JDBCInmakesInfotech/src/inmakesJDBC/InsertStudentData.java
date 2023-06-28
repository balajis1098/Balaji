package inmakesJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertStudentData 
{
	public static void main(String[] args) throws Exception {
		
		try {
			InsertStudentData.insertStudentData();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void insertStudentData() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Balaji@1810");
			String sql = "INSERT INTO student VALUES (5,'Kumar','Pune','Aeronautical','9021223489')";
			Statement stm = con.createStatement();
			boolean bo = false;
			if(bo == false)
			{
				stm.executeUpdate(sql);
				bo = true;
			}
			if(bo == true)
			{
				System.out.println("Record Inserted Successfully");
			}
				
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
			
	}
}
