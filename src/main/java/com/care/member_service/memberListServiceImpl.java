package com.care.member_service;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;

import com.care.member_dao.MemberDAO;
import com.care.member_dto.MemberDTO;

public class memberListServiceImpl implements MemberService{


	@Override
	public boolean loginChk(Model model, HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<MemberDTO> memberList(Model model) {
		MemberDAO dao = new MemberDAO();
		ArrayList<MemberDTO> list = dao.list();
		return list;
	}

	@Override
	public void saveMember(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
	}


}
