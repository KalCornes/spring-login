package com.care.member_service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;
import com.care.member_dto.MemberDTO;

public class saveMemberServiceImpl implements MemberService {

	@Override
	public boolean loginChk(Model model, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<MemberDTO> memberList(Model model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveMember(HttpServletRequest request) {
		MemberDAO dao = new MemberDAO();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		dao.insert(id,pwd);
	}

}
