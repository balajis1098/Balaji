package dao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class UpdateEmployee
 */
//@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>Update Employee</h1>");
		
		String id1 = request.getParameter("id");
		int id2 = Integer.parseInt(id1);
		
		Employee emp = EmployeeDao.UpdateEmpById(id2);
		
		pw.print("<form action='UpdateEmployeebyId' method='post'>");  
        pw.print("<table>");  
        pw.print("<tr><td></td><td><input type='hidden' name='id' value='"+emp.getId()+"'/></td></tr>");  
        pw.print("<tr><td>Name:</td><td><input type='text' name='name' value='"+emp.getName()+"'/></td></tr>");  
        pw.print("<tr><td>Password:</td><td><input type='password' name='password' value='"+emp.getPassword()+"'/></td></tr>");  
        pw.print("<tr><td>Email:</td><td><input type='email' name='email' value='"+emp.getEmail()+"'/></td></tr>");  
        pw.print("<tr><td>Country:</td><td>");  
        pw.print("<select name='country' style='width:150px'>");  
        pw.print("<option>India</option>");  
        pw.print("<option>USA</option>");  
        pw.print("<option>England</option>");
        pw.print("<option>France</option>");
        pw.print("<option>China</option>");
        pw.print("<option>Afganistan</option>");
        pw.print("<option>Srilanka</option>");
        pw.print("<option>Bangladesh</option>");
        pw.print("<option>UAE</option>");
        pw.print("<option>Russia</option>");
        pw.print("<option>canada</option>");
        pw.print("<option>Australia</option>");
        pw.print("<option>Germany</option>");
        pw.print("<option>Other</option>");  
        pw.print("</select>");  
        pw.print("</td></tr>");  
        pw.print("<tr><td colspan='2'><input type='submit' value='Edit & Save '/></td></tr>");  
        pw.print("</table>");  
        pw.print("</form>");  
          
        pw.close();
		
	}

}
