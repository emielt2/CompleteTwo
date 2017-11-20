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
        response.setContentType("text/html");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Hi from doPost()<h1>");
//        sayTotal(response, writer, "Hi from doPost()");
        if(request.getParameter("passwordPOST").equals("123")){
            writer.println("<h3>Login Correct</h3>");

        }
        else{
            writer.println("<h3>Login Failed</h3>");
            sayMid(response, request, writer, "POST");

        }


        System.out.println("POST password =" + request.getParameter("password"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        //System.out.println("GET password =" + request.getParameter("password"));
//
//        if(request!=null&&request.getParameter("password").equals("123")){
//            writer.println("CORRECT");
//        }
//        else{
//            if(request!=null)
//            writer.println("WRONG");
//        }
        sayMid(response, request, writer, "GET");

        sayX(response, writer, "Hi from doGet()");
        writer.println("<body>");
        writer.println("<html>");

    }

    void sayX(HttpServletResponse response, PrintWriter writer, String text) {
        writer.println("<h1>Say X = " + text + "</h1>");
    }

    void sayTotal(HttpServletResponse response, PrintWriter writer, String text) {
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<h1>Say X = " + text + "</h1>");
        writer.println("<body>");
        writer.println("<html>");
    }

    void sayMid(HttpServletResponse response, HttpServletRequest request, PrintWriter writer, String text) {

        writer.println("<form method=POST action=>");//writer.println("<form method=POST action=LogonServlet>");
        writer.println("Username=<input type=text name=username><br>");
        writer.println("Password=<input type=text name=passwordPOST>");
        writer.println("<input type=submit value='LogonPOST'>");
        writer.println("</form>");
//        writer.println("<form method=GET action=LogonServlet>");

        writer.println("<form method=GET action=>");
        writer.println("Username=<input type=text name=username><br>");
        //writer.println("Password=<input type=text name=password>");
        writer.println("<input type=submit value='LogonGET'>");
        writer.println("</form>");
        writer.println("<h1>Say X = " + text + "</h1>");
    }
}

