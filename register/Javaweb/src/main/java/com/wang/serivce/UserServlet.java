package com.wang.serivce;

import com.wang.dao.GuyImpl;
import com.wang.dao.Guydao;
import com.wang.dao.Userdao;
import com.wang.dao.UserdaoImpl;
import com.wang.pojo.Guy;
import com.wang.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/user")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Userdao userdao = new UserdaoImpl();
        Guydao guydao = new GuyImpl();
        String cmd = req.getParameter("cmd");
        if ("in".equals(cmd)){
            String learn = req.getParameter("learn");
            System.out.println("learn"+learn);
            String ation = req.getParameter("ation");
            String vaccine = req.getParameter("vaccine");
            String own = req.getParameter("own");
            String expect = req.getParameter("expect");
            Guy guy = new Guy();
            guy.setExpect(learn);
            guy.setAtion(ation);
            guy.setVaccine(vaccine);
            guy.setOwn(own);
            guy.setExpect(expect);
            guydao.in(guy);
        }else if ("in1".equals(cmd)){
            int ic = Integer.parseInt(req.getParameter("ic"));
            String program = req.getParameter("program");
            User user = new User();
            user.setIc(ic);
            user.setProgram(program);
            userdao.in(user);
        }else if ("update".equals(cmd)){
            int ic = Integer.parseInt(req.getParameter("ic"));
            String program = req.getParameter("program");
            Date date = Date.valueOf(req.getParameter("date"));
            int id = Integer.parseInt(req.getParameter("id"));
            User user = new User();
            user.setIc(ic);
            user.setProgram(program);
            user.setDate(date);
            user.setId(id);
            userdao.update(user);
        }
        req.setAttribute("user", userdao.all());

        if ("cx".equals(cmd)){
        	String ic = req.getParameter("ic");
        	List<User> cx=null;
        	if(ic == null || "".equals(ic)) {
        		cx =  userdao.all();
        	}else {
        		cx = userdao.cx( Integer.parseInt(ic));
        	}
            req.setAttribute("user", cx);
        }
        req.getRequestDispatcher("/user.jsp").forward(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Userdao userdao = new UserdaoImpl();
        Guydao guydao = new GuyImpl();
        String id = req.getParameter("id");
        String cmd = req.getParameter("cmd");

        if ("guy".equals(cmd)){
        if (id.equals("")){

        }else {
            req.getRequestDispatcher("/guy.jsp").forward(req,resp);
        }
        }else if ("dl".equals(cmd)){;
            int id1= Integer.parseInt(id);
            userdao.dl(id1);
            req.setAttribute("user",userdao.all());
            req.getRequestDispatcher("/user.jsp").forward(req,resp);
        }else if ("in".equals(cmd)){
            req.getRequestDispatcher("/userin.jsp").forward(req,resp);
        }else if ("update".equals(cmd)){
            int ic = Integer.parseInt(req.getParameter("ic"));
            List<User> cx = userdao.cx(ic);
            req.setAttribute("update",cx);
            req.getRequestDispatcher("/updateuser.jsp").forward(req,resp);
        }

    }
}
