package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FriendMapper;
import com.example.demo.entity.Friend;
import com.example.demo.service.*;
/**
 * 
 * @author zhoucong(QQ:2632652610)
 *
 */
@Service
public class FriendServiceImpl implements FriendService{

	private static Logger logger = Logger.getLogger("FriendServiceImpl"); 
	 
	@Autowired
	private FriendMapper friendMapper;

	@Override
	public int insert(Friend friend) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Friend selectByFtel(String ftel) {
		// TODO Auto-generated method stub
		return friendMapper.selectByFtel(ftel);
	}

	@Override
	public List<Map<String,Object>> getAllFriend() {
		// TODO Auto-generated method stub
		return friendMapper.getAllFriend();
	}







}
