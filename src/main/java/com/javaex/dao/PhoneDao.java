package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhoneDao {

	@Autowired
	private SqlSession sqlSession;

	public void PhoneInsert(PersonVo personVo) {
		sqlSession.insert("phonebook.insert",personVo);
	}

	public void PhoneUpdate(PersonVo personVo) {
		sqlSession.update("phonebook.update",personVo);
	}

	public void PhoneDelete(int num) {
		sqlSession.delete("phonebook.delete",num);
	}

	public List<PersonVo> getPersonList() {
		
		List<PersonVo> personList = sqlSession.selectList("phonebook.getList2");
		System.out.println(personList.toString());
		return personList;
	}
	public List<PersonVo> getSearchPhoneList(String word) {
		
		return null;
	}
	public PersonVo getPerson(int id) {
		
		return sqlSession.selectOne("phonebook.getPerson",id);
	}
}
