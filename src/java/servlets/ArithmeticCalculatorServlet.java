/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Chris
 */
public class ArithmeticCalculatorServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("res","---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        try {
                int firstNum = Integer.parseInt(first);
                int secondNum = Integer.parseInt(second);
                int res;
                if (request.getParameter("cal").equals("a")){
                    res = firstNum+secondNum;
                    request.setAttribute("res",res);
                }else if (request.getParameter("cal").equals("b")){
                    res = firstNum - secondNum;
                    request.setAttribute("res",res);
                }else if (request.getParameter("cal").equals("c")){
                    res = firstNum * secondNum;
                    request.setAttribute("res",res);
                }else if (request.getParameter("cal").equals("d")){
                    res = firstNum % secondNum;
                    request.setAttribute("res",res);
                }
                else if ((first.isEmpty() && !second.isEmpty()) || (!first.isEmpty() && second.isEmpty())){
                    request.setAttribute("res","invalid");
                }
            }catch (Exception e){
            request.setAttribute("res","invalid");
        }
        request.setAttribute("firstNum",first);
        request.setAttribute("secondNum",second);

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }
}
