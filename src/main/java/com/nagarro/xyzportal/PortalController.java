package com.nagarro.xyzportal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class PortalController {
	
	@Autowired
	UserDao userDao;
	
	@GetMapping
	public List<User> getUser() {
		List<User> users = new ArrayList<>();
		for(User user : userDao.findAll()) {
			users.add(user);
		}
		return users ;
	}

}
