package com.care.member_service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.care.member_dto.MemberDTO;

public interface MemberService {
	public boolean loginChk(Model model, HttpServletRequest request);
	public ArrayList<MemberDTO> memberList(Model model);
	public void saveMember(HttpServletRequest request);
}
