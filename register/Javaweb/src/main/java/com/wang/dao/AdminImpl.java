package com.wang.dao;

import com.wang.pojo.Admin;
import com.wang.pojo.Guy;
import com.wang.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminImpl implements Admindao{
    @Override
    public Admin all(String name,String pass) {
        Admin admin = new Admin();
        String sql = "select * from admin where name =? and pass=? ";
        JdbcUtil jdbc = new JdbcUtil();
        Connection conn = jdbc.getConn();
        ResultSet rs=null;
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,pass);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                String name1 = rs.getString("name");
                String pass1 = rs.getString("pass");
                admin.setName(name1);
                admin.setPass(pass1);

            }
            return  admin;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbc.close(rs,preparedStatement,conn);
        }
        return null;
    }
}
