package com.wang.dao;

import com.wang.pojo.User;

import java.util.List;

public interface Userdao {
    //��ѯ���е�����
     List<User> all();

     List<User> cx(int ic);

     int dl(int id);

     int update(User user);

     int in(User user);
}
