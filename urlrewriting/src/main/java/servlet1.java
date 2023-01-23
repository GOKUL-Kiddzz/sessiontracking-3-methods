import java.io.*;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  
  

@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {  
  
  public void doGet(HttpServletRequest request, HttpServletResponse response){  
    try{  
  
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
    
    String n=request.getParameter("userName");  
    out.print("Welcome "+n);  

    //appending the username in the query string  
    out.print("<a href='servlet2?uname="+n+"'>visit</a>");  
              
    out.close();  
        }catch(Exception e){System.out.println(e);}  
  }  
}  