package com.kh.ot.member.controller;

import java.io.IOException;
import java.io.PrintWriter;
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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.kh.ot.member.service.MemberService;
import com.kh.ot.member.vo.Member;

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




}
