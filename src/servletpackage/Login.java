package servletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Login")
public class Login extends HttpServlet {
    String lastResult ="";
    int totalFails=0;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setContentType("text/html");
        //PrintWriter writer = response.getWriter();
        //writer.println(StringsForHtml.stringSTART);
        //writer.println("<html><body>");
        if(request.getParameter("username").equals("emiel")&&request.getParameter("password").equals("123")){
            //writer.print("<h2>Login Correct! AngularCheck:{{1+1}}</h2>");

            //ServletTwo ob=new ServletTwo();
//            ob.doPost(request, response);
//            new Startpage().doGet(request, response);//WORKS
            //Startpage sp = new Startpage()





            //RequestDispatcher rd = request.getRequestDispatcher("/Startpage");//WORKED
            RequestDispatcher rd = request.getRequestDispatcher("/StartpageNGTWO");


            //RequestDispatcher rd = request.getRequestDispatcher("/HelloWorld");//GOES TO POST
            rd.forward(request,response);
//            RequestDispatcher rd = request.getRequestDispatcher("ServletTwo");
//            rd.forward(request,response);
        }
        else{
          //  writer.print("<h2>Login WRONG!!! AngularCheck:{{1+1}}</h2>");
            lastResult="ERRRROR WRONG USERNAME OR PASSWORD! Total Failed Tries = "+ ++totalFails;
            doGet(request,response);
        }

//        doGet();
//        writer.print("<h2>{");


//
//        PersonData personData = new PersonData();
//        personData.setFirstName("John");
//        personData.setLastName("Johson");
//        String json = new Gson().toJson(personData);
//        response.setContentType("application/json");
//        response.getWriter().write(json);
//        writer.println(json);
//        writer.print("}</h2>");


        //response.setContentType("text/html");
//        writer.println("}</h2>");
//        //writer.println("<html>");
//        //writer.println("<body>");
//
//        writer.println("<h1>Login page</h1>");
//        writer.println("<h2>1+1={{1+1}}</h2>");
//        //writer.println("<button ng-click= >ClickHere</button>");


//        writer.println("</body>");
//        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //RequestDispatcher rd = request.getRequestDispatcher("/HelloWorld");rd.forward(request,response);//GOES TO GET

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        //writer.println(StringsForHtml.stringSTART);
        writer.println("<html><head><link rel=\"stylesheet\" href=\"css/styles.css\"></head><body>");
        //writer.println("<html>");
        //writer.println("<body>");
//        writer.println("<form  action=\"servlet1\" method=\"post\">");
        writer.println("<h1>Welcome to GET of Login</h1>");
        writer.println("<form method=POST action=>");
        writer.println("Username=<input type=text name=username ng-minlength=\"5\" required placeholder=\"Please Specify\" value=emiel>");
        writer.println("Password=<input type=text name=password placeholder=\"Please Specify\" value=123>");
        writer.println("<input type=submit value='LogonPOST'>");

        writer.println("<h3>" + lastResult +" </h3>");

        writer.println("</body>");
        writer.println("</html>");

    }

    void printFull(HttpServletRequest request, HttpServletResponse response,String strings[]) throws IOException{


    }


}
