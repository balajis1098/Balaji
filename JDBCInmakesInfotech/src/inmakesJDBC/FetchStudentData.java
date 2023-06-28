package inmakesJDBC;

import java.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class FetchStudentData 
{
	public static void main(String[] args)
	{
		try {
			FetchStudentData.fetchStudentData();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void fetchStudentData()
	{
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Balaji@1810");
			
			Statement stmt= con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			System.out.println("Student_id  Student_name  Student_place  course  contact_num");
			while(rs.next())
			{
				int id = rs.getInt("Student_id");
				String stdName = rs.getString("Student_name");
				String stdPlace = rs.getString("Student_place");
				String course = rs.getString("course");
				String mobNumber = rs.getString("contact_num");
				
				System.out.print(id+"           "+stdName+"       "+stdPlace+"         "+course+"     "+mobNumber);
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}	
}
