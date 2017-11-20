package servletpackage;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Startpage")
public class Startpage extends HttpServlet {
    @Inject
    Planet planet;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        //printHTMLBodyTags(response, writer);
        printHTMLBodyTagsWithoutNGAPP(response, writer);

        //Planet moon = new Planet("moo00n");
        //Planet moon = new Planet();
        //writer.println("<h2>"+moon.getNaming()+"</h2>");

        //writer.println("<h2>"+giveFiveFive()+"</h2>");
        planet.startTimer();
        writer.println(
//                "<!DOCTYPE html>\n" +
//                "<html>\n" +
//                "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js\"></script>\n" +
//                "<body>\n" +
//                "\n" +
//                "<p>Click the table headers to change the sorting order:</p>\n" +
//                "\n" +
//                "<h2>{{planet}}</h2>"+
                "<h2>" + planet.getNaming() + "</h2>" +

                        "<div ng-app=\"myApp\" ng-controller=\"namesCtrl\">\n" +
                        "\n" +
                        "<table border=\"1\" width=\"100%\">\n" +
                        "<tr>\n" +
                        "<th ng-click=\"orderByMe('name')\">Name</th>\n" +
                        "<th ng-click=\"orderByMe('country')\">Country</th>\n" +
                        "</tr>\n" +
                        "<tr ng-repeat=\"x in names | orderBy:myOrderBy\">\n" +
                        "<td>{{x.name}}</td>\n" +
                        "<td>{{x.country}}</td>\n" +
                        "</tr>\n" +
                        "</table>\n" +
                        "\n" +
                        "</div>\n" +
                        "\n" +
                        "<script>\n" +
                        "angular.module('myApp', []).controller('namesCtrl', function($scope) {\n" +
                        "    $scope.names = [\n" +
                        "        {name:'Jani',country:'Norway'},\n" +
                        "        {name:'Carl',country:'Sweden'},\n" +
                        "        {name:'Margareth',country:'England'},\n" +
                        "        {name:'Hege',country:'Norway'},\n" +
                        "        {name:'Joe',country:'Denmark'},\n" +
                        "        {name:'Gustav',country:'Sweden'},\n" +
                        "        {name:'Birgit',country:'Denmark'},\n" +
                        "        {name:'Mary',country:'England'},\n" +
                        "        {name:'Kai',country:'Norway'}\n" +
                        "        ];\n" +
                        "    $scope.orderByMe = function(x) {\n" +
                        "        $scope.myOrderBy = x;\n" +
                        "    }\n" +
                        "});\n" +
                        "</script>\n" +
                        "<form method=GET action=Startpage>" +
                        //"Username=<input type=text name=username ng-minlength=\"5\" required placeholder=\"Please Specify\" value=emiel>"+
                        //"Password=<input type=text name=password placeholder=\"Please Specify\" value=123>"+
                        "<input type=submit value='Go to timer'>" +
                        "</form>"+
                        "\n" + "<form method=POST action=>" +
//                "\n" +"<form action=/StartPage method=GET>"+
//                        "<form method=GET action=StartPage>"
                        "<input type=submit value=Submit>" +
                        "</form>" +
                        "</body>\n" +
                        "</html>");
        //writer.println("</body></html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        printHTMLBodyTagsWithoutNGAPP(response, writer);
        //doGet(request, response);
        writer.println("<form method=GET action=Startpage>");
        writer.println("h2>Timer: "+planet.getTimer()+"</h2>");
        writer.println("<input type=submit value='go get'>" +
                "</form>");
        writer.println("</body></html>");
    }

    private void printHTMLBodyTags(HttpServletResponse response, PrintWriter writer) {
        response.setContentType("text/html");
        writer.println("<!doctype html>\n" + "<html ng-app>\n" + "<head>\n" + "<title>My Angular App</title>\n" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js\"></script>\n" + "<link rel=\"stylesheet\" href=\"css/styles.css\">" + "    </head>\n" + "    <body>\n");
//                "<script src=\"http://code.angularjs.org/angular-0.10.6.js\"></script>\n" + "<link rel=\"stylesheet\" href=\"css/styles.css\">" + "    </head>\n" + "    <body>\n");

        writer.println("<h4>Startpage</h4>");
    }

    private void printHTMLBodyTagsWithoutNGAPP(HttpServletResponse response, PrintWriter writer) {
        response.setContentType("text/html");
        writer.println("<!doctype html>\n" + "<html>\n" + "<head>\n" + "<title>My Angular App</title>\n" +
                "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js\"></script>\n" + "<link rel=\"stylesheet\" href=\"css/styles.css\">" + "    </head>\n" + "    <body>\n");
//                "<script src=\"http://code.angularjs.org/angular-0.10.6.js\"></script>\n" + "<link rel=\"stylesheet\" href=\"css/styles.css\">" + "    </head>\n" + "    <body>\n");

        writer.println("<h4>Startpage</h4>");
    }

    private int giveFiveFive() {
        return 55;
    }
}
