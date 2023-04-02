package com.wang.dao;

import com.wang.pojo.Guy;

import java.util.List;

public interface Guydao {
    //¸ù¾İid²éÑ¯
     List<Guy> getid(int id);

     int in(Guy guy);
}
