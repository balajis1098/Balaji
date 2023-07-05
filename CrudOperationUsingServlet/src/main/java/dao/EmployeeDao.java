package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao 
{
	
	// getAllEmployees is used to fetch all employees from DB
	
	public static List<Employee> getAllEmployees(){  
        List<Employee> list=new ArrayList<Employee>();  
          
        try{  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Balaji@1810");  
            PreparedStatement prestmt = con.prepareStatement("select * from employees");  
            ResultSet rs=prestmt.executeQuery();  
            while(rs.next()){  
                Employee emp = new Employee();  
                  
                emp.setName(rs.getString(1));  
                emp.setPassword(rs.getString(2));  
                emp.setEmail(rs.getString(3));  
                emp.setCountry(rs.getString(4));
                emp.setId(rs.getInt(5));
                list.add(emp);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
	
	
	//Save function is used to save the employee into DB/Table
	public static int save(Employee e)
	{
		int val = 0;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Balaji@1810");
			
			String save = "insert into employees (Emp_Name,Emp_Pass,Emp_Country,Emp_email) values (?,?,?,?)";
		//	String save = "{call save_emp(?,?,?,?)}";
			CallableStatement cs = con.prepareCall(save);
			
			cs.setString(1, e.getName());
			cs.setString(2, e.getPassword());
			cs.setString(3, e.getCountry());
			cs.setString(4, e.getEmail());
			val = cs.executeUpdate();
		
			con.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return val;
	}
	
	//deleteEmp is used to delete the employee from DB/Table
	public static int deleteEmp(int id)
	{
		int val = 0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connec = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Balaji@1810");
			
			CallableStatement csmt = connec.prepareCall("delete from employees where id = ?");
			csmt.setInt(1, id);
			val = csmt.executeUpdate();
			
			connec.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return val;
	}
	
	//UpdateEmpById is used to update a details of exiting record of employee in table
	public static Employee UpdateEmpById(int id)
	{
		Employee ep = new Employee();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connec = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Balaji@1810");
			
			CallableStatement csmt = connec.prepareCall("select * from employees where id = ?");
			csmt.setInt(1, id);
			ResultSet rs = csmt.executeQuery();
			
			if(rs.next())
			{
				ep.setName(rs.getString(1));
				ep.setPassword(rs.getString(2));
				ep.setCountry(rs.getString(3));
				ep.setEmail(rs.getString(4));
				ep.setId(rs.getInt(5));
			}
			
			connec.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
		return ep;
	}

	public static int empUpdate(Employee e) {
		
			int val = 0;
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedetails","root","Balaji@1810");
				
				String save = ("update employees set Emp_Name=?,Emp_Pass=?,Emp_Country=?,Emp_email=? where id=?");
			//	String save = "{call save_emp(?,?,?,?)}";
				CallableStatement cs = con.prepareCall(save);
				
				cs.setString(1, e.getName());
				cs.setString(2, e.getPassword());
				cs.setString(3, e.getCountry());
				cs.setString(4, e.getEmail());
				cs.setInt(5, e.getId());
				val = cs.executeUpdate();
			
				con.close();
			
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		return val;
	}
}
