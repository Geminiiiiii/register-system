package com.wang.serivce;

import com.wang.dao.AdminImpl;
import com.wang.dao.Admindao;
import com.wang.pojo.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class Loginservlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
        Admindao admindao = new AdminImpl();
        Admin all = admindao.all(name, pass);
        if (all!=null){
            if (name.equals(all.getName()) &&  pass.equals(all.getPass())){
                req.getRequestDispatcher("/user").forward(req,resp);
            }else {
                req.setAttribute("np","Incorrect password or account");
                req.getRequestDispatcher("/index.jsp").forward(req,resp);
            }
        }
    }
}
