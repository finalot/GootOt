package com.kh.ot.member.service;

import java.util.Random;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.kh.ot.member.dao.MemberDao;
import com.kh.ot.member.vo.Member;


@Service("mService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	SqlSessionTemplate sqlSession;
	
	@Autowired
	private MemberDao mDao; //MemberDao에 mDao 이름의 어노테이션을 부여
	
	@Override
	public Member loginMember(String id,String pwd) {
		return mDao.loginMember(id,pwd);
	}

	@Override
	public Member findId(String memName, String memSsn) {
		return mDao.findId(memName,memSsn);
	}

	@Override
	public Member findpassword(String memId, String memName) {
		return mDao.findpassword(memId,memName);
	}

	@Override
	public int updatePwd(String memId, String firstpwd) {
		return mDao.updatePwd(memId,firstpwd);
	}
		

}
