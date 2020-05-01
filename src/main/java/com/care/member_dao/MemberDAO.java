package com.care.member_dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.ui.Model;

import com.care.member_dto.MemberDTO;
import com.care.template.Constant;

public class MemberDAO {
	
	private JdbcTemplate template;

	public MemberDAO() {
		this.template = Constant.template;
	}

	public ArrayList<MemberDTO> list() {
		String sql = "select * from member02";
		ArrayList<MemberDTO> list = (ArrayList<MemberDTO>)template.query(sql, new BeanPropertyRowMapper<MemberDTO>(MemberDTO.class));
		return list;
	}

	public boolean loginChk(String id, String pwd) {
		ArrayList<MemberDTO> list = list();
		boolean result = false;
		
		for (MemberDTO dto: list) {
			if (dto.getId().equals(id)) {
				if (dto.getPwd().equals(pwd)) {
					return result = true;
				}
			}
		}
		return result;
	}
	
	public void insert(String id, String pwd) {
		String sql = "insert into member02(id,pwd) values(?,?)";
		template.update(sql,new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, id);
				ps.setString(2, pwd);
			}
		});
	}
}
