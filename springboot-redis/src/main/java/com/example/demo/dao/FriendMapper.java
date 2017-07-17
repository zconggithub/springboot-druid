package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Friend;

public interface FriendMapper {


    int insert(Friend record);

    int insertSelective(Friend record);
    
    Friend selectByFtel(String ftel);//mapper文件中有对应sql
    
    @Select("select fname,sex,age,ftel,month_sal as monthSal from friend")
    List<Map<String,Object>> getAllFriend();
    
    @Select("select fname,sex,age,ftel from friend")
    List<Map<String,Object>> searchAllByAnnotaion();
    
    @Select("select fname from friend where fname=#{fname}")
    List<Friend> selectFriendByFname(String fname);
    
    
    @Select("select fname,sex,age,ftel,month_sal as monthSal from friend where fname=#{fname} and ftel=#{ftel}")
    Friend checkLogin(String fname,String ftel);
}