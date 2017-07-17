package com.example.demo.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
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
@CacheConfig(cacheNames="friend")//该注解是用来开启声明的类参与缓存,如果方法内的@Cacheable注解没有添加key值，那么会自动使用cahceNames配置参数并且追加方法名。

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
	@Cacheable//配置方法的缓存参数，可自定义缓存的key以及value。
	public Friend selectByFtel(String ftel) {
		// TODO Auto-generated method stub
		return friendMapper.selectByFtel(ftel);
	}

	@Override
	@Cacheable//配置方法的缓存参数，可自定义缓存的key以及value。
	public List<Map<String,Object>> getAllFriend() {
		// TODO Auto-generated method stub
		return friendMapper.getAllFriend();
	}







}
