package com.codeshu.controller;

import com.codeshu.entity.User;
import com.codeshu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author CodeShu
 * @date 2023/8/27 16:04
 */
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserMapper userMapper;

	@GetMapping("getAll")
	public List<User> getAll() {
		return userMapper.selectList(null);
	}

	@PostMapping("insert")
	public String insert(@RequestBody User user) {
		userMapper.insert(user);
		return "插入用户成功";
	}
}
