package com.wang.dao;

import com.wang.pojo.Guy;
import com.wang.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuyImpl  implements Guydao {
    @Override
    public List<Guy> getid(int id) {
        List<Guy> list = new ArrayList<>();
        String sql = "select * from guy where user_id=?";
        JdbcUtil jdbc = new JdbcUtil();
        Connection conn = jdbc.getConn();
        ResultSet rs=null;
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                int user_id = rs.getInt("user_id");
                String learn = rs.getString("learn");
                String action = rs.getString("ation");
                String vaccine = rs.getString("vaccine");
                String own = rs.getString("own");
                String expect = rs.getString("expect");
                Guy guy = new Guy();
                guy.setUserId(user_id);
                guy.setLearn(learn);
                guy.setAtion(action);
                guy.setAtion(vaccine);
                guy.setOwn(own);
                guy.setExpect(expect);
                list.add(guy);

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
    public int in(Guy guy) {
        String slq = "insert into guy(learn,ation,vaccine,own,expect) values(?,?,?,?,?)";
        JdbcUtil jdbc = new JdbcUtil();
        Connection conn = null;
        PreparedStatement preparedStatement=null;
        try {
            conn=jdbc.getConn();
            preparedStatement=conn.prepareStatement(slq);
            preparedStatement.setString(1,guy.getLearn());
            preparedStatement.setString(2,guy.getAtion());
            preparedStatement.setString(3,guy.getVaccine());
            preparedStatement.setString(4,guy.getOwn());
            preparedStatement.setString(5,guy.getExpect());
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
