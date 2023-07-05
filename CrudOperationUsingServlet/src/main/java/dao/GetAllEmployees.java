package dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class GetAllEmployees
 */
//@WebServlet("/GetAllEmployees")
public class GetAllEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllEmployees() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<a href='index.html'>Add New Employee</a>");
		pw.println("<h1>Employees List</h1>");
		
		List<Employee> list=EmployeeDao.getAllEmployees();
		
		pw.print("<table border='1' width='100%'");
		pw.print("<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
		
		for(Employee emp : list)
		{
			pw.print("<tr><td>"+emp.getId()+"</td><td>"+emp.getName()+"</td><td>"+emp.getPassword()+"</td><td>"+emp.getCountry()+"</td><td>"+emp.getEmail()+"</td><td><a href='UpdateEmployee?id="+emp.getId()+"'>edit</a></td><td><a href='DeleteEmployee?id="+emp.getId()+"'>delete</a></td></tr>");	
		}
		
		pw.print("</table>");
		pw.close();
	}

}
