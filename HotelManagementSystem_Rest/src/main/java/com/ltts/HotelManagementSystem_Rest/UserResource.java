package com.ltts.HotelManagementSystem_Rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	@RequestMapping("users")
	public List<User> getUsers(){
		List<User> users=new ArrayList();
		User u1=new User();
		u1.setName("Subbarao");
		u1.setUserName("subbu123");
		u1.setEmail("subbu@gmail.com");
		u1.setPassword("gvs123");
		
		User u2=new User();
		u2.setName("Sandeep");
		u2.setUserName("sandeepReddy");
		u2.setEmail("Sandeep@gmail.com");
		u2.setPassword("Sandeep");
		
		users.add(u1);
		users.add(u2);
		
		return users; 
		
	}

}
