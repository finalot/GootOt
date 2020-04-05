package com.kh.ot.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.context.HttpRequestResponseHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.kh.ot.member.service.MemberService;
import com.kh.ot.member.vo.Member;

/**
 * @author yejin
 *
 */
@SessionAttributes("loginMember")
@Controller
public class MemberController {

	// @Autowired 타입의 어노테이션을 붙여주면 생성할 필요없이 변수 선언만 해도
	// 빈 스키냉을 통해 아래의 'mService'의 이름을 가지고 있는 빈을 찾아서
	// 자동으로 생성 후 주입해준다.

	@Autowired
	private MemberService mService;

//	암호화용
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;



	/**
	 * @작성일 : 2020-04-02
	 * @작성자 : 문태환
	 * @내용 : 로그인 화면 이동
	 * @return
	 */
	@RequestMapping("loginView.do")
	public String loginView() {

		return "login";
	}

	/**
	 * @작성일 : 0202-04-02
	 * @작성자 : 문태환
	 * @내용 : 회원가입 화면 이동
	 * @return
	 */
	@RequestMapping("joinView.do")
	public String joinView() {

		return "join";
	}

	/**
	 * @작성일 : 2020-04-02
	 * @작성자 : 문태환
	 * @내용 : 마이페이지 이동
	 * @return
	 */
	@RequestMapping("MyPage.do")
	public String MyPage() {

		return "mypage";
	}

	/**
	 * @작성일  : 2020. 4. 2.
	 * @작성자  : 문태환
	 * @내용 	: 아이디 찾기 화면
	 * @return
	 */
	@RequestMapping("findIdView.do")
	public String findIdView() {

		return "findId";
	}
	/**
	 * @작성일  : 2020. 4. 2.
	 * @작성자  : 문태환
	 * @내용 	:비밀번호찾기 이동
	 * @return
	 */
	@RequestMapping("findpasswordView.do")
	public String findpwdView() {

		return "findpassword";
	}
	/**
	 * @작성일  : 2020. 4. 2.
	 * @작성자  : 문태환
	 * @내용 	: 비밀번호 갱신 이동
	 * @return
	 */
	@RequestMapping("changePwdView")
	public String changePwdView(HttpServletRequest request,String memId) {

		request.setAttribute("memId",memId);

		return "changepassword";
	}


	/**
	 * @작성일 : 2020-04-02
	 * @작성자 : 문태환
	 * @내용 : 로그인
	 * @param id
	 * @param pwd
	 * @param response
	 * @throws IOException
	 */

	  @RequestMapping("login.do")
	  public void login(String id, String pwd, HttpServletResponse response,HttpSession session) throws IOException{

	  String msg = "";
	  PrintWriter out = response.getWriter();
		  Member m = mService.loginMember(id, pwd);

		if (m != null /* && bcryptPasswordEncoder.matches(m.getMemPwd(), pwd) */ ) {
			  msg = "ok";
			  session.setAttribute("loginMember", m);
		  }else {
			  msg="fail";
		  }
		  out.print(msg);
	  }

	  /**
	 * @작성일  : 2020-04-02
	 * @작성자  : 문태환
	 * @내용 	: 로그아웃
	 * @param status
	 * @return
	 */
	@RequestMapping("logout.do")
	public String logout(SessionStatus status) {

		  status.setComplete();

			return "home";
		}

	/**
	 * @작성일  : 2020. 4. 2.
	 * @작성자  : 문태환
	 * @내용 	: 아이디 찾기
	 * @param response
	 * @param memName
	 * @param memSsn
	 * @throws IOException
	 */
	@RequestMapping("findId.do")
	public void findId(HttpServletResponse response, String memName,String memSsn) throws IOException {

		response.setContentType("application/json; charset=utf-8");
		JSONObject job = new JSONObject();
	     PrintWriter out = response.getWriter();
	     Member m = mService.findId(memName, memSsn);
	     if(m != null) {
	    	 job.put("memName",m.getMemName());
	    	 job.put("memId",m.getMemId());
	     	}else {
		    	 job.put("msg","error");
	     	}
	     		out.print(job);
	}

	/**
	 * @작성일  : 2020. 4. 2.
	 * @작성자  : 문태환
	 * @내용 	: 비밀번호 찾기 메일발송
	 * @param response
	 * @param memName
	 * @param memEmail
	 * @param memId
	 * @throws IOException
	 */
	@RequestMapping("findpassword.do")
	public void findpassword(HttpServletResponse response,

			String memName,String memEmail,String memId) throws IOException {

	        //먼저 아이디로 회원정보를 받아오고 가져온 데이터에서 email값을 비교하여 존재하지 않으면 인증메일 보내지 못함
	        Member m = mService.findpassword(memId,memName);

		     PrintWriter out = response.getWriter();

	        if(m==null || !m.getMemEmail().equals(memEmail))
	        {
	        	out.print("fail");
	        }

	                String host = "smtp.gmail.com";
	                String user = "finalot12345@gmail.com"; //자신의 계정
	                String password = "!!otot123456";//자신의 패스워드

	                //메일 받을 주소
	                String to_email = m.getMemEmail();

	                //SMTP 서버 정보를 설정한다.
	                Properties props = new Properties();
	                props.put("mail.smtp.host", host);
	                props.put("mail.smtp.port", 465);
	                props.put("mail.smtp.auth", "true");
	                props.put("mail.smtp.ssl.enable", "true");

	                //인증 번호 생성기
	                StringBuffer temp =new StringBuffer();
	                Random rnd = new Random();
	                for(int i=0;i<10;i++)
	                {
	                    int rIndex = rnd.nextInt(3);
	                    switch (rIndex) {
	                    case 0:
	                        // a-z
	                        temp.append((char) ((int) (rnd.nextInt(26)) + 97));
	                        break;
	                    case 1:
	                        // A-Z
	                        temp.append((char) ((int) (rnd.nextInt(26)) + 65));
	                        break;
	                    case 2:
	                        // 0-9
	                        temp.append((rnd.nextInt(10)));
	                        break;
	                    }
	                }
	                String AuthenticationKey = temp.toString();
	                System.out.println(AuthenticationKey);

	                Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
	                    protected PasswordAuthentication getPasswordAuthentication() {
	                        return new PasswordAuthentication(user,password);
	                    }
	                });

	                //email 전송
	                try {
	                    MimeMessage msg = new MimeMessage(session);
	                    msg.setFrom(new InternetAddress(user, "Ot."));
	                    msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to_email));

	                    //메일 제목
	                    msg.setSubject("안녕하세요 Ot. 인증 메일입니다.");
	                    //메일 내용
	                    msg.setText("인증 번호는 :"+temp);

	                    Transport.send(msg);
	                    System.out.println("이메일 전송");

	                }catch (Exception e) {
	                    e.printStackTrace();
	                }
	               out.print(temp);
	    }

	/**
	 * @작성일  : 2020. 4. 2.
	 * @작성자  : 문태환
	 * @내용 	: 비밀번호 갱신
	 * @param memId
	 * @param firstpwd
	 * @return
	 */
	@RequestMapping(value="updatepwd.do", method=RequestMethod.POST )
	public String updatePwd(String memId ,String firstpwd) {

	 int result = mService.updatePwd(memId,firstpwd);

	 if(result > 0) {
		 return "redirect:index.jsp";
	 }else {
		 return "changepassword";
	 }
	}

	/**
	 * @작성일 : 2020. 4. 2.
	 * @작성자 :이대윤
	 * @내용 : 프로덕트2 페이지 이동
	 * @param @return
	 * @return String
	 */
	@RequestMapping("dailyCheck.do")
	public ModelAndView dailyCheck(Member m ,HttpSession session, ModelAndView mv) {

		 m =  (Member)session.getAttribute("loginMember");

		ArrayList<Member> list = mService.dailyCheckList(m);

		System.out.println(list.toString());

		mv.addObject("list",list);
		mv.setViewName("dailyCheck");

		return mv;
	}


	/**
	 * @작성일  : 2020. 4. 3.
	 * @작성자  : 우예진
	 * @내용    : 아이디 중복검사
	 * @param response
	 * @param userId
	 * @throws IOException
	 */
	@RequestMapping(value="idDuplicate.do", method=RequestMethod.POST)
	public void idDuplicate(HttpServletResponse response ,String userId) throws IOException {
		PrintWriter out = response.getWriter();

		int result = mService.idDuplicate(userId);

		if(result > 0) {
			 out.print("no");
		 }else {
			out.print("ok");
		 }
	}



	/**
	 * @작성일  : 2020.04.04
	 * @작성자  : 우예진
	 * @내용    : 회원가입
	 * @param m
	 * @param model
	 * @param postcode1
	 * @param address1
	 * @param address2
	 * @param mobile1
	 * @param mobile2
	 * @param mobile3
	 * @param birth_year
	 * @param birth_month
	 * @param birth_day
	 * @return
	 */
	@RequestMapping(value="yinsert.do", method=RequestMethod.POST)
	public String insertMember(Member m, Model model,
								@RequestParam("postcode1") String postcode1,
								@RequestParam("address1") String address1,
								@RequestParam("address2") String address2,
								@RequestParam("mobile1") String mobile1,
								@RequestParam("mobile2") String mobile2,
								@RequestParam("mobile3") String mobile3,
								@RequestParam("birth_year") String birth_year,
								@RequestParam("birth_month") String birth_month,
								@RequestParam("birth_day") String birth_day) {
		// 회원 가입 전 회원정보를 출력
		System.out.println(m);
		System.out.println(postcode1 + ", " + address1 + ", "+ address2);
		System.out.println(mobile1 + ", " + mobile2 + ", "+ mobile3);
		System.out.println(birth_year + ", " + birth_month + ", "+ birth_day);

		// System.out.println(bcryptPasswordEncoder.encode(m.getPwd()));

		String encPwd = bcryptPasswordEncoder.encode(m.getMemPwd());

		m.setMemPwd(encPwd);

		// 주소데이터들 ","를 구분자로 지정
		if(!postcode1.contentEquals("")) {
			m.setMemAddress(postcode1+","+address1+","+address2);
		}
		if(!mobile1.contentEquals("")) {
			m.setMemPhone(mobile1+"-"+mobile2+","+mobile3);
		}
		if(!birth_year.contentEquals("")) {
			m.setMemSsn(birth_year+","+birth_month+","+birth_day);
		}

		int result = mService.insertMember(m);

		if(result >0) {
			return "redirect:index.jsp";
		} else {
			model.addAttribute("msg","회원가입실패!!");
			return "common/errorPage";
		}

	}

	/**
	 * @작성일  : 2020.04.04
	 * @작성자  : 우예진
	 * @내용    : 상품불량 및 오배송접수 글쓰기 페이지 이동
	 * @return
	 */
	@RequestMapping("bad_product_write.do")
	public String bad_product_write() {

		return "bad_product_write";
	}


	/**
	 * @작성일  : 2020.04.04
	 * @작성자  : 우예진
	 * @내용    : 상품불량 및 오배송접수 상품문의 상세페이지 이동
	 * @return
	 */
	@RequestMapping("bad_product_detail.do")
	public String bad_product_detail() {

		return "bad_product_detail";
	}


	/**
	 * @작성일  : 2020.04.04
	 * @작성자  : 우예진
	 * @내용    : 상품불량 및 오배송접수 답변 페이지 이동
	 * @return
	 */
	@RequestMapping("bad_product_reply.do")
	public String bad_product_reply() {

		return "bad_product_reply";
	}

	/**
	 * @작성일  : 2020.04.04
	 * @작성자  : 우예진
	 * @내용    : 상품불량 및 오배송접수 게시판 페이지 이동
	 * @return
	 */
	@RequestMapping("bad_product_board.do")
	public String bad_product_board() {

		return "bad_product_board";
	}





	/**
	 * @작성일  : 2020. 4. 3.
	 * @작성자  : 문태환
	 * @내용 	: 출석체크 이벤트
	 * @param memNo
	 * @param tdDate
	 * @return
	 */
	@RequestMapping("insertdailyCheck.do")
	public String dailyCheck(int memNo,String tdDate) {


		int result = mService.dailyCheck(memNo,tdDate);

		if(result > 0) {

			return "redirect:dailyCheck.do";
		}else {
			System.out.println("에러");
			return null;
		}
	}
	/**
	 * @작성일  : 2020. 4. 5.
	 * @작성자  : 문태환
	 * @내용 	: 출석체크 쿠폰발급
	 * @param memNo
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("couponInsert.do")
	public void couponInsert(int memNo , HttpServletResponse response) throws IOException {


		int result = mService.couponInsert(memNo);

		  PrintWriter out = response.getWriter();

		if(result > 0) {
			out.print("ok");
		}else {
			out.print("fail");
		}

	}
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 입금확인/입금자변경 상세정보
	 * @return
	 */
	@RequestMapping("bank_insert_detail.do")
	public String bank_insert_detail() {

		return "bank_insert_detail";
	}
	
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 입금확인/입금자변경 답변정보
	 * @return
	 */
	@RequestMapping("bank_insert_reply.do")
	public String bank_insert_reply() {

		return "bank_insert_reply";
	}
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 입금확인/입금자변경 글쓰기
	 * @return
	 */
	@RequestMapping("bank_insert_write.do")
	public String bank_insert_write() {

		return "bank_insert_write";
	}
	
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 입금확인/입금자변경 페이지 이동
	 * @return
	 */
	@RequestMapping("bank_insert_board.do")
	public String bank_insert_board() {

		return "bank_insert_board";
	}
	
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송문의 상세정보
	 * @return
	 */
	@RequestMapping("delivery_board_detail.do")
	public String delivery_board_detail() {

		return "delivery_board_detail";
	}
	
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송문의 답변 상세정보
	 * @return
	 */
	@RequestMapping("delivery_board_reply.do")
	public String delivery_board_reply() {

		return "delivery_board_reply";
	}
	
	
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송문의 글쓰기
	 * @return
	 */
	@RequestMapping("delivery_board_write.do")
	public String delivery_board_write() {

		return "delivery_board_write";
	}
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송문의 페이지 이동
	 * @return
	 */
	@RequestMapping("delivery_board.do")
	public String delivery_board() {

		return "delivery_board";
	}
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송전취소/변경 페이지 이동
	 * @return
	 */
	@RequestMapping("delivery_cancel.do")
	public String delivery_cancel() {

		return "delivery_cancel";
	}
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송전취소/변경 상세페이지
	 * @return
	 */
	@RequestMapping("delivery_cancel_detail.do")
	public String delivery_cancel_detail() {

		return "delivery_cancel_detail";
	}
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송전취소/변경 답변페이지
	 * @return
	 */
	@RequestMapping("delivery_cancel_reply.do")
	public String delivery_cancel_reply() {

		return "delivery_cancel_reply";
	}
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 배송전취소/변경 글쓰기페이지
	 * @return
	 */
	@RequestMapping("delivery_cancel_write.do")
	public String delivery_cancel_write() {

		return "delivery_cancel_write";
	}
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 상품문의 페이지 이동
	 * @return
	 */
	@RequestMapping("product_board.do")
	public String product_board() {

		return "product_board";
	}
	

	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 상품문의 상세페이지
	 * @return
	 */
	@RequestMapping("product_board_detail.do")
	public String product_board_detail() {

		return "product_board_detail";
	}


	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 상품문의 답변페이지
	 * @return
	 */
	@RequestMapping("product_board_reply.do")
	public String product_board_reply() {

		return "product_board_reply";
	}
	
	/**
	 * @작성일  : 2020.04.05
	 * @작성자  : 우예진
	 * @내용    : 상품문의 글쓰기페이지
	 * @return
	 */
	@RequestMapping("product_board_write.do")
	public String product_board_write() {

		return "product_board_write";
	}
	
	


	
	

}
