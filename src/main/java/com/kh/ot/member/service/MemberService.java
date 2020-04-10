package com.kh.ot.member.service;

import java.util.ArrayList;

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

	/**
	 * @작성일  : 2020. 4. 3.
	 * @작성자  : 문태환
	 * @내용 	: 출석체크 이벤트
	 * @param memNo
	 * @param tdDate
	 * @return
	 */
	public int dailyCheck(int memNo, String tdDate);

	/**
	 * @작성일  : 2020. 4. 4.
	 * @작성자  : 문태환
	 * @내용 	: 출석체크 리스트
	 * @param m
	 * @return
	 */
	public ArrayList<Member> dailyCheckList(Member m);

	/**
	 * @작성일  : 2020. 4. 5.
	 * @작성자  : 문태환
	 * @내용 	: 출석체크 쿠폰발급
	 * @param memNo
	 * @return
	 */
	public int couponInsert(int memNo);
	

	/**
	 * @작성일  : 2020. 4. 3.
	 * @작성자  : 우예진
	 * @내용    : 아이디 중복검사
	 * @param userId
	 * @return
	 */
	public int idDuplicate(String userId);

	
	/**
	 * @작성일  : 2020. 4. 3.
	 * @작성자  : 우예진
	 * @내용    : 회원가입
	 * @param m
	 * @return
	 */
	public int insertMember(Member m);


	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 신경섭
	 * @내용 : 회원정보 수정
	 * @param m
	 * @return int
	 */
	public int updateMember(Member m);


	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 신경섭
	 * @내용 : 환불계좌 수정
	 * @param m
	 * @return int
	 */
	public int updateAccount(Member m);

	/**
	 * @작성일 : 2020. 4. 9.
	 * @작성자 : 신경섭
	 * @내용 : 회원 탈퇴
	 * @param m
	 * @return int
	 */
	public int deleteMember(Member m);

	
}
