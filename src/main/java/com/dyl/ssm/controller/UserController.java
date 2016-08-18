package com.dyl.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.dyl.ssm.Util.IDGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dyl.ssm.pojo.User;
import com.dyl.ssm.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping(value="/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}

	@RequestMapping(value="/RegisterUser")
	public  String RegisterUser(@ModelAttribute User user){
		user.setId(IDGenerator.generatorID());
        System.out.print("测试");
		this.userService.insertUuer(user);
		return "RegisterUser";
	}
}
