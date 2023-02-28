package com.aiit.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user=request.getParameter("user");
        String pwd = request.getParameter("pwd");
        //设置session过期时间1分钟
        //request.getSession().setMaxInactiveInterval(10);
        if(user.equals(pwd)) {
            request.getSession().setAttribute("user", user);
            //找到唯一的bindlisten对象
            Object counter = request.getServletContext().getAttribute("counter");
            //把listener设置成session
            request.getSession().setAttribute("usercount", counter);


            request.getRequestDispatcher("main.jsp").forward(request, response);
        }else {
            response.sendRedirect("Login.jsp");
        }

    }
}
