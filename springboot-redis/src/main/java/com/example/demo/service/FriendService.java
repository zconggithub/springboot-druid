package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.Friend;

/**
 * 
 * @author zhoucong(QQ:2632652610)
 *
 */
public interface FriendService {

	
	int insert(Friend friend);
	
	Friend selectByFtel(String ftel);//mapper文件中有对应sql
	
	List<Map<String,Object>> getAllFriend();
	


}
