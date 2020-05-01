package com.care.member_service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;
import com.care.member_dto.MemberDTO;

public class loginChkServiceImpl implements MemberService{


	@Override
	public boolean loginChk(Model model, HttpServletRequest request) {
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		MemberDAO dao = new MemberDAO();
		boolean result = dao.loginChk(id,pwd);
		return result;
	}

	@Override
	public ArrayList<MemberDTO> memberList(Model model) {
		return null;
	}

	@Override
	public void saveMember(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}



}
