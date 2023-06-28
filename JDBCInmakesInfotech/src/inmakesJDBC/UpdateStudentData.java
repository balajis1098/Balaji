package inmakesJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStudentData 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Balaji@1810");
			Statement stm = con.createStatement();
			String ser = "UPDATE student SET Student_place = 'Kolkata' WHERE Student_id = 2 ";
			stm.execute(ser);
			System.out.println("Record Updated Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
