package info;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/EditServlet")  
public class EditServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
	         throws ServletException, IOException { 
		 
		   response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	        out.println("<h1 style='text-align:center;'>Update Employee</h1>");  
	        String sid=request.getParameter("id");  
	        int id=Integer.parseInt(sid);  
	          
	        Emp e=EmpDao.getEmployeeById(id);  
	
	          out.print("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"> ");
	          out.print("");
	          out.print("   <div class=\"container\" style=\"margin: 68px 489px 22px 500px;     border-radius: 15px; background-color: rgba(119, 119, 119, 0.305); 4px solid #00ffc6de;\">\r\n"
	             		+ "");
	        out.print("<form action='EditServlet2' method='post' id=\"in\">"); 
     
	     //   out.print("<table>");  
	        
	        
	        out.print("<label></label>\r\n"
	        		+ "    <input type=\"hidden\" name=\"id\" value="+e.getId()+" > <br>");  
	        
	        out.print(" <label>NAME :</label>\r\n"
	        		+ "    <br>\r\n"
	        		+ "    <input type=\"text\" name=\"name\" id=\"na1\" value="+e.getName()+" placeholder=\"Enter your name\"><br> <br>\r\n"
	        		+ "    ");  
	        
	        out.print("<label>PASSWORD :</label>\r\n"
	        		+ "    <br>\r\n"
	        		+ "    <input type=\"password\" name=\"password\" value="+e.getPassword()+" id=\"na2\" placeholder=\"Enter your Password\"><br> <br> "); 
	        
	        out.print("<label>EMAIL :</label>\r\n"
	        		+ "    <br>\r\n"
	        		+ "    <input type=\"email\" name=\"email\" id=\"na3\" value="+e.getEmail()+" placeholder=\"Enter your Email\"> <br> <br>\r\n"
	        		+ "    ");  
	        
	        out.print(" <label>COUNTRY :</label>&nbsp; &nbsp;");  
	        out.print(" <select name=\"country\" style=\"width:150px\" id=\"sec\">  ");  
	        out.print("<option>India</option>");  
	        out.print("<option>USA</option>");  
	        out.print("<option>UK</option>");  
	        out.print("<option>Other</option>");  
	        out.print(" </select> <br> <br>");  
	       // out.print("</td></tr>");  
	        out.print("    <button type=\"submit\"value=\"Save Employee\" id=\"sub\" >Update</button>");  
	  
	        
	        //   out.print("</table>");  
	        out.print("</form>");  
	          
	        out.print("</div>");
	        
	        out.close();
	
	}
}
