package com.wang.dao;

import com.wang.pojo.User;

import java.util.List;

public interface Userdao {
    //查询所有的数据
     List<User> all();

     List<User> cx(int ic);

     int dl(int id);

     int update(User user);

     int in(User user);
}
