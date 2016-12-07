package com.example;

import com.example.model.User;
import com.example.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private UserService userService;
	@Test
	public void contextLoads() {
		ArrayList<User> users = userService.getUserList();
		System.out.println(users.get(0).getUserName());
	}

}
