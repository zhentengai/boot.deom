package com.hxf.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hxf.entity.UserInfo;

@RestController
@RequestMapping("/user")
public class UserInfoController {
	
	Logger logger = Logger.getLogger(getClass());
	
//	@Autowired
	RestTemplate restTemplate = new RestTemplate(); 
	
	@RequestMapping(path="/info",method=RequestMethod.GET,produces="application/json;charset=utf8")
	public UserInfo userInfo(@RequestBody String userName,@RequestBody String passWord) {
		System.out.println("-------------------------------------------this is UserInfo Controller");
		
		logger.debug(" userNmae  :  "+userName+"   passWord   :   "+passWord);
		
		
		UserInfo u = new UserInfo();
		
		u.setUsername(userName);
		u.setPassword(passWord);
		u.setName("name");
		
		
		return u;
	}
	
	
	@RequestMapping(path="/test",method=RequestMethod.POST,produces="application/json;charset=utf8")
	public UserInfo restTemplateTet() {
		UserInfo u = restTemplate.getForObject("http://127.0.0.1:8080/user/info", UserInfo.class);
		System.out.println("name    :  "+u.getName());
		System.out.println("userName:  "+u.getUsername());
		System.out.println("password:  "+u.getPassword());
		return u;
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		
//		restTemplate

		
	}
	


}
