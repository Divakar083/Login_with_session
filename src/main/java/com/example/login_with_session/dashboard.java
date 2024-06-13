package com.example.login_with_session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(name = "dashbord",value="/dashboard")
public class dashboard extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        String crct_user_name = (String) session.getAttribute("username");
        String crct_password= (String) session.getAttribute("password");
        resp.setContentType("text/html");
        resp.getWriter().println("Your username is " + crct_user_name);
        resp.getWriter().println("Your password is " + crct_password);
    }
}

