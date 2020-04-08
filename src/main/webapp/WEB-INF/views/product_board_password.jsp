<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품문의 패스워드</title>
<style>
.xans-board-title .title h2 {
    display: inline-block;
    font-size: 20px;
    padding: 10px 20px;
    font-weight: 400;
    letter-spacing: 2px;
}
    
.xans-board-secure .secret .info {
    margin: 0 0 50px 0;
    line-height: 150%;
    color: #757575;
}
</style>
</head>
<body>

<div class="xans-element- xans-board xans-board-securepackage-4 xans-board-securepackage xans-board-4 "><div class="xans-element- xans-board xans-board-title-4 xans-board-title xans-board-4 "><div class="title">
            <h2><font color="333333">상품문의</font></h2>
            <!--h3>상품문의 게시판입니다.</h3-->
        </div>
</div>
<form id="boardSecureForm" name="" action="/exec/front/Board/secure/6" method="post" target="_self" enctype="multipart/form-data">
<input id="no" name="no" value="826869" type="hidden">
<input id="board_no" name="board_no" value="6" type="hidden">
<input id="return_url" name="return_url" value="/article/상품문의/6/826869/?no=826869&amp;board_no=6&amp;page=" type="hidden"><div class="xans-element- xans-board xans-board-secure-4 xans-board-secure xans-board-4 "><div class="secret">            
            <fieldset>
<legend>비밀글보기</legend>
                <p class="info">이 글은 비밀글입니다. <strong class="txtEm">비밀번호를 입력하여 주세요.</strong><br>관리자는 확인버튼만 누르시면 됩니다.</p>
                <p class="password"><label for="secure_password">PASSWORD</label> <input id="secure_password" name="secure_password" fw-filter="" fw-label="비밀번호" fw-msg="" value="" type="password"></p>
                <div class="ec-base-button gBlank30">
                    <a href="/board/상품문의/6/" class="yg_btn_140 yg_btn3" alt="목록">LIST</a>
                    <a href="#none" onclick="BOARD.form_submit('boardSecureForm');" class="yg_btn_140 yg_btn5" alt="확인">OK</a>
                </div>
            </fieldset>
</div>
</div>
</form></div>
</body>
</html>