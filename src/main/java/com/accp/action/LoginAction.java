package com.accp.action;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class LoginAction {

	@GetMapping("{uname}/{upwd}")
	public Map<String, Object> login(@PathVariable("uname")String uname ,@PathVariable("upwd")String upwd){
		Map<String, Object> msg = new HashMap<>();
		if(uname.equals("admin") && upwd.equals("123")) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
}
