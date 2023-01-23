import java.io.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  

@WebServlet("/servlet2")
  
public class servlet2 extends HttpServlet {  
  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
    
    //Getting the value from the hidden field  
    String n=request.getParameter("uname");  
    out.print("Hello "+n);  

    out.close();  
  
         }catch(Exception e){System.out.println(e);}  
    }  
      
  
}  