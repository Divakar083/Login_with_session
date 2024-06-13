package com.example.login_with_session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(name="login",value="/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String L_username = req.getParameter("username");
        String L_password = req.getParameter("password");
        resp.setContentType("text/html");
        HttpSession session = req.getSession();
        String org_username = (String) session.getAttribute("username");
        String org_password = (String) session.getAttribute("password");
        if(org_username.equals(L_username) &&  org_password.equals(L_password)){
            resp.sendRedirect("dashboard");
        }
        else{
            resp.sendRedirect("login.html");
        }
    }

}
