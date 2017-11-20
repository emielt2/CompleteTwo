package servletpackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletTwo")
public class ServletTwo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
//        writer.println(StringsForHtml.stringSTART);
//        writer.println(StringsForHtml.stringforbodytwee);
//        writer.println(StringsForHtml.stringEND);
//        System.out.println(StringsForHtml.stringSTART);
//        System.out.println(StringsForHtml.stringforbodytwee);
//        System.out.println(StringsForHtml.stringEND);
        writer.println(StringsForHtml.fullHTML_SoloSeven);
    }
}
class StringsForHtml {
    static String infotext = "This is some text from SomeExtraClass";

    static String stringfromesuite =  "x";

    static String stringforbody = "<h1>{{5+7}}</h1>"+
            "  <p>Name : <input type=\"text\" ng-model=\"name\"></p>\n" +
            "  <h1>Hello {{name}}</h1>\n";

    static String stringforbodytwee =
            "<p>Name : <input type=\"text\" ng-model=\"name\" placeholder=\"Enter name here\"></p>\n" + "<h1>Hello {{name}}</h1>";

    static String stringSTART = "<!doctype html>\n" + "<html ng-app>\n" + "<head>\n" + "<title>My Angular App</title>\n" +
            "<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js\"></script>\n" +"<link rel=\"stylesheet\" href=\"css/styles.css\">"+ "    </head>\n" + "    <body>\n";
    static String stringEND =  "</body>\n" + "  </html>";

    static String fullHTML_SoloSeven = "<!DOCTYPE html>\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "    <title>Title</title>\n" +
            "    <style>\n" +
            "h1 {\n" +
            "    color: blue;\n" +
            "    font-family: verdana;\n" +
            "    font-size: 300%;\n" +
            "}\n" +
            "p  {\n" +
            "    color: red;\n" +
            "    font-family: courier;\n" +
            "    font-size: 160%;\n" +
            "}\n" +
            "h2 {\n" +
            "    color: purple;\n" +
            "    allignment: right;\n" +
            "}\n" +
            "\n" +
            "\n" +
            "    </style>\n" +

            "    <script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.3.8/angular.min.js\"></script>\n" +
            "    <script>src = \"angular-translate.min.js\"</script>\n" +

            "    <link rel=\"stylesheet\" href=\"css/styles.css\">\n" +
            "</head>\n" +
            "<body>\n" +
            "<div ng-app=\"\" ng-init=\"firstName='John'\">\n" +
            "\n" +
            "    <p>Name: <input type=\"text\" ng-model=\"firstName\"></p>\n" +
            "    <p>You wrote: {{ firstName }}</p>\n" +
            "\n" +
            "\n" +
            "    <div ng-init=\"names=['Jani','Hege','Kai']\">\n" +
            "        <ul>\n" +
            "            <li ng-repeat=\"x in names\">\n" +
            "                {{ x }}\n" +
            "            </li>\n" +
            "        </ul>\n" +
            "    </div>\n" +
            "    <div ng-app=\"\" ng-init=\"quantity=1;price=5\">\n" +
            "\n" +
            "        Quantity: <input type=\"number\" ng-model=\"quantity\">\n" +
            "        Costs:    <input type=\"number\" ng-model=\"price\">\n" +
            "\n" +
            "        Total in dollar: {{ quantity * price }}\n" +
            "\n" +
            "    </div>\n" +
            "    <div ng-app=\"\" ng-init=\"names2=[\n" +
            "{name:'Jani',country:'Norway'},\n" +
            "{name:'Hege',country:'Sweden'},\n" +
            "{name:'Kai',country:'Denmark'}]\">\n" +
            "\n" +
            "        <ul>\n" +
            "            <li ng-repeat=\"x in names2\">\n" +
            "                {{ x.name + ', ' + x.country }}\n" +
            "\n" +
            "            </li>\n" +
            "        </ul>\n" +
            "\n" +
            "    </div>\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "</div>\n" +
            "\n" +
            "</body>\n" +
            "\n" +
            "</html>";
}