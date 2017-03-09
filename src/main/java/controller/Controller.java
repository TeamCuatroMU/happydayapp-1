
package controller;

import model.HappyDayLog;
import model.DAOHappyDayLog;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Devin Walter
 */
public class Controller extends HttpServlet{
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        String url = "/index.html";
        
        String action = request.getParameter("userAction");
        if (action == null){
            action = "index";
        }
        if (action.equalsIgnoreCase("index")){
            url = "/index.html";
        } else if (action.equalsIgnoreCase("login")){
            //url = "/login.html";
            String email = request.getParameter("email");
            String first = request.getParameter("first");
            String last = request.getParameter("last");
            String user = request.getParameter("username");
            String month = request.getParameter("month");
            int year = Integer.parseInt(request.getParameter("year"));
            
            HappyDayLog newUser = new HappyDayLog(email, first, last, user, month, year);
            DAOHappyDayLog.addUser(newUser);
        }
    }
}
