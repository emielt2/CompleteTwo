package servletpackage;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorld")
public class HelloWorld extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        writer.println("<html><body>This is POST for HelloWorld</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setContentType("text/html");        PrintWriter writer = response.getWriter();        writer.println("<html><body>Hello World!</body><html>");
        PrintWriter writer = response.getWriter();
        PersonData personData = new PersonData();
        personData.setFirstName("John");
        personData.setLastName("Johson");
        //Integer[] intarray = new Integer[]{1,3,5};
       // String jsonint = new Gson().toJson(intarray);
        String json = new Gson().toJson(personData);
        response.setContentType("application/json");
        response.getWriter().write(json);
        System.out.println("Here1");
        //response.getWriter().write(jsonint);
        //writer.println(json);
    }



}
