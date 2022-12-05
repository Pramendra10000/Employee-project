package info;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet") 
public class ViewServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
	         throws ServletException, IOException { 
		
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        out.println("<a href='index.html'> <button type=\"button\" id=\"bt3\">Add New Employee</button> </a>");  
      //  out.println("<h1 >Employees List</h1>");  
        List<Emp> list=EmpDao.getAllEmployees();  
        
        out.print("<link rel=\"stylesheet\" type=\"text/css\" href=\"tablestyle.css\"> ");
        out.print("<body>\r\n"
        		+ " <h1 id=\"heading\">ENTERED DETAILS </h1>");
        
        out.print("<table>");  
        
        out.print("<tr> \r\n"
        		+ "    <th> EMP&nbsp;ID</th>\r\n"
        		+ "    <th> NAME</th>\r\n"
        		+ "    <th>PASSWORD</th>\r\n"
        		+ "    <th>EMAIL</th>\r\n"
        		+ "    <th>COUNTRY</th>\r\n"
        		+ "    <th>EDIT</th>\r\n"
        		+ "    <th>DELETE</th>\r\n"
        		+ "</tr>");  
        for(Emp e:list){  
        	
         out.print("\r\n"
         		+ "        <tr><td>"+e.getId()+"</td>\r\n"
         		+ "            <td>"+e.getName()+"</td>\r\n"
         		+ "            <td>"+e.getPassword()+"</td>\r\n"
         		+ "            <td>"+e.getEmail()+"</td>\r\n"
         		+ "            <td>"+e.getCountry()+"</td>\r\n"
         		+ "          <td><a href='EditServlet?id="+e.getId()+"'><button id=\"bt1\" type=\"button\">EDIT</button></a></td>\r\n"
         		+ "          <td><a href='DeleteServlet?id="+e.getId()+"'><button id=\"bt2\" type=\"button\">DELETE</button></a></td>\r\n"
         		+ "            </tr>");  
        }  
        out.print("</table>");  
        out.print("</body>") ; 
        
        out.close();  
		
	}
	
}
