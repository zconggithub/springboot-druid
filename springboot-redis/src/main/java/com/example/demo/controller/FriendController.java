package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Friend;
import com.example.demo.service.FriendService;

@RestController
public class FriendController {
	
	@Autowired
	private FriendService friendService;
	
	@RequestMapping("/getAll")
	public List<Map<String,Object>> getAll(){
		
		return friendService.getAllFriend();
	}
	
	@RequestMapping("/getOne")
	public Friend getOne(String ftel){
		Friend friend=friendService.selectByFtel(ftel);
		return friend;
		
	}
}
