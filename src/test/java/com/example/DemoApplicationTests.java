package com.example;

import com.example.model.User;
import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		List<User> users = userService.getUserList();
		System.out.println(users.get(0).getUsername());
	}
	@Test
	public void passwordLoads(){
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();;
		System.out.println(passwordEncoder.encode("$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi"));
	}
}
