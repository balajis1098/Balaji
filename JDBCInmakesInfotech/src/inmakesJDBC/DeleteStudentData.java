package inmakesJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteStudentData 
{
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Balaji@1810");
			Statement stm = con.createStatement();
			String sql = "DELETE FROM student WHERE Student_id = 2";
			stm.executeUpdate(sql);
			System.out.println("Record Deleted Successfully");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
