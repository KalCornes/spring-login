package com.care.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.care.member_dto.MemberDTO;
import com.care.member_service.MemberService;
import com.care.member_service.loginChkServiceImpl;
import com.care.member_service.memberListServiceImpl;
import com.care.member_service.saveMemberServiceImpl;
import com.care.template.Constant;

@Controller
public class MemberController {
	private MemberService member;

	public MemberController(){
		String config ="classpath:applicationJDBC.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(config);
		JdbcTemplate template = ctx.getBean("template",JdbcTemplate.class);
		Constant.template = template;
	}
	
	@RequestMapping("index")
	public String index() {
		return "member/index";
	}
	
	@RequestMapping("login")
	public String login() {
		return "member/login";
	}
	
	@RequestMapping("loginChk")
	public String loginChk(Model model, HttpServletRequest request) {
		member = new loginChkServiceImpl();
		boolean result;
		result = member.loginChk(model, request);
		if (result) {
			HttpSession session = request.getSession();
			session.setAttribute("state", "로그인");
			return "redirect:successLogin";
		}
		else {
			return "redirect:login";
		}
	}
	
	@RequestMapping("successLogin")
	public String successLogin() {
		return "member/successLogin";
	}
	
	@RequestMapping("memberList")
	public String memberList(Model model, HttpServletRequest request) {
		member = new memberListServiceImpl();
		ArrayList<MemberDTO> list = member.memberList(model);
		model.addAttribute("member",list);
		return "member/memberList";
	}
	
	@RequestMapping("memberInfo")
	public String memberInfo(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		model.addAttribute("id",id);
		model.addAttribute("pwd",pwd);
		return "member/memberInfo";
	}
	
	@RequestMapping("membership")
	public String membership() {
		return "/member/membership";
	}
	
	@RequestMapping("saveMember")
	public String saveMember(Model model, HttpServletRequest request) {
		member = new saveMemberServiceImpl();
		model.addAttribute("id",request.getParameter("id"));
		model.addAttribute("pwd",request.getParameter("pwd"));
		member.saveMember(request);
		return "redirect:login";
	}
}
