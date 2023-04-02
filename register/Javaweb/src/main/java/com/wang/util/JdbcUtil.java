package com.wang.util;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JdbcUtil {

    static Properties properties = null;

    static {
        properties = new Properties();
        try {
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("dp.properties"));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public Connection getConn() {
        Connection conn=null;
        try {
        	 try {
				Class.forName(properties.getProperty("jdbc.driver"));
			} catch (ClassNotFoundException e) {
				
			}
            conn= DriverManager.getConnection(properties.getProperty("jdbc.url"),properties.getProperty("jdbc.username"),properties.getProperty("jdbc.password"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public void close(ResultSet rs, Statement st,Connection connection){
        if (rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                if (st!=null){
                    try {
                        st.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }finally {
                        if (connection!=null){
                            try {
                                connection.close();
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }

}

