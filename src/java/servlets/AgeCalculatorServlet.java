/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

/**
 *
 * @author Chris
 */
public class AgeCalculatorServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        return;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String a = request.getParameter("age");
        try{
            if (!a.equals("")){
                int age = Integer.parseInt(a);
                request.setAttribute("Message","Your age next birthday will be " + (age+1));
            }else{
                request.setAttribute("Message","You must give your current age");
            }
        }catch (Exception e){
            request.setAttribute("Message","You must enter a number");
        }
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);

    }
}
