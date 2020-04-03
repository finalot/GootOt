package com.kh.ot.member.service;

import javax.servlet.http.HttpServletRequest;

import com.kh.ot.member.vo.Member;

public interface MemberService {

	
	/**
	 * @작성일 : 2020-04-02
	 * @작성자 : 문태환
	 * @내용    : 로그인 인터페이스
	 * @return
	 */
	public Member loginMember(String id, String pwd);

	/**
	 * @작성일  : 2020. 4. 2.
	 * @작성자  : 문태환
	 * @내용 	: 아이디 찾기
	 * @param memName
	 * @param memSsn
	 * @return
	 */
	public Member findId(String memName, String memSsn);

	/**
	 * @작성일  : 2020. 4. 2.
	 * @작성자  : 문태환
	 * @내용 	: 비밀번호 찾기 메일발송
	 * @param memName
	 * @param memId
	 * @param request
	 */
	public Member findpassword(String memId, String memName);

	/**
	 * @작성일  : 2020. 4. 2.
	 * @작성자  : 문태환
	 * @내용 	: 비밀번호 갱신
	 * @param memId
	 * @param firstpwd
	 * @return
	 */
	public int updatePwd(String memId, String firstpwd);
	
}
