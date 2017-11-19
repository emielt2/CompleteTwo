package servletpackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LogonServlet")
public class LogonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<form method=GET action=LogonServlet>");
        writer.println("Username=<input type=text name=username><br>");
        writer.println("Password=<input type=text name=password>");
        writer.println("<input type=submit value='Logon'>");
        writer.println("</form>");
        writer.println("<body>");
        writer.println("<html>");

    }
}