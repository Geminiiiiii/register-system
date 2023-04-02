package com.wang.dao;

import com.wang.pojo.User;
import com.wang.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserdaoImpl implements Userdao {


    @Override
    public List<User> all() {
        String sql = "select * from user";
        JdbcUtil jdbc =new JdbcUtil();
        Connection conn = jdbc.getConn();
        ResultSet rs=null;
        PreparedStatement preparedStatement=null;
        List<User> list = new ArrayList<>();
        try {
            preparedStatement = conn.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                int ic = rs.getInt("ic");
                Date date = rs.getDate("date");
                String program = rs.getString("program");
                User user = new User();
                user.setId(id);
                user.setIc(ic);
                user.setDate(date);
                user.setProgram(program);
                list.add(user);
            }
            return  list;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbc.close(rs,preparedStatement,conn);
        }
        return null;
    }

    @Override
    public List<User> cx(int ic) {
        String sql = "select * from user where ic=?";
        JdbcUtil jdbc = new JdbcUtil();
        Connection conn = jdbc.getConn();
        ResultSet rs=null;
        PreparedStatement preparedStatement=null;
        List<User> list = new ArrayList<>();
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,ic);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                int ic1 = rs.getInt("ic");
                Date date = rs.getDate("date");
                String program = rs.getString("program");
                User user = new User();
                user.setId(id);
                user.setIc(ic1);
                user.setDate(date);
                user.setProgram(program);
                list.add(user);
            }
            return  list;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbc.close(rs,preparedStatement,conn);
        }
        return null;
    }

    @Override
    public int dl(int id) {
        String slq = "DELETE FROM user WHERE id= ?";
        JdbcUtil jdbc = new JdbcUtil();

        Connection conn = null;
        PreparedStatement preparedStatement=null;
        try {
            conn=jdbc.getConn();
            preparedStatement=conn.prepareStatement(slq);
            preparedStatement.setInt(1,id);
            boolean rs= preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int update(User user) {
        String slq = "update user set ic=?,date=?,program=? where id=?";
        JdbcUtil jdbc = new JdbcUtil();
        Connection conn = null;
        PreparedStatement preparedStatement=null;
        try {
            conn=jdbc.getConn();
            preparedStatement=conn.prepareStatement(slq);
           preparedStatement.setLong(1,user.getIc());
           preparedStatement.setString(2, String.valueOf(user.getDate()));
           preparedStatement.setString(3,user.getProgram());
           preparedStatement.setLong(4,user.getId());
           preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return 0;
    }

    @Override
    public int in(User user) {
        String slq = "insert into user(ic,date,program) values(?,?,?)";
        JdbcUtil jdbc = new JdbcUtil();
        Connection conn = null;
        PreparedStatement preparedStatement=null;
        try {
            conn=jdbc.getConn();
            preparedStatement=conn.prepareStatement(slq);
            preparedStatement.setLong(1,user.getIc());
            preparedStatement.setDate(2, new java.sql.Date(new java.util.Date().getTime()));
            preparedStatement.setString(3, user.getProgram());
            int kk=preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return 0;
    }
}
