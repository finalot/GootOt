<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="Content-Style-Type" content="text/css">
<title>상품문의</title>
<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<!--    <link rel="stylesheet" href="./css/Login_style.css"> -->
<link rel="stylesheet" href="/ot/resources/css/mypage_list.css">
<link rel="stylesheet" href="/ot/resources/css/mypage_basic.css">
<link rel="icon" type="image/png" href="/ot/resources/images/icons/favicon.png"/>
</head>
<style>
.ec-base-table td{
  border-top: 1px solid #EEE !important;
}
.ec-base-table.typeList .center td.left {
    padding-left: 3px;
    text-align: left !important;
 }

.thumb img {
    width: 85%;
}

.thumb{
 text-align: left !important;
   padding-left: 1% !important;
}

.ec-base-table.typeList , .ec-base-table.typeList td.cen{
    padding-left: 0;
    padding-right: 0;
    text-align: left !important;
}
.ec-base-paginate1 a {
    display: inline-block;
    float: none;
}

.ec-base-paginate1 img {
    vertical-align: none !important;
}
.ec-base-paginate1 {
    margin: 30px auto;
    text-align: center;
    line-height: 0;
    display: table;
}
a{
	cursor:pointer;
}
</style>
<body>
   <%@include file="header.jsp" %>


    <div id="container">
        <div id="contents" style="margin-top:11.5%;">
         <div class="mypage_top_outer">

         </div>

         <div class="titleArea">
             <h2>상품 문의</h2>
         </div>

         <div class="xans-element- xans-layout xans-layout-logincheck ">
         <!--
             $url = /member/login.html
         -->
         </div>

         <div class="xans-element- xans-myshop xans-myshop-wishlist ec-base-table typeList xans-record-">
         <!--
              $login_page = /member/login.html
                 $count = 10
           -->
            <table border="1" summary>
               <caption style="display:none;">관심상품 목록</caption>
                   <colgroup>
                  <col style="width:6%;">
                  <col style="width:8%">
                  <col style="width:70%">
                  <col style="width:auto">
                  <col style="width:17%">



               </colgroup>
               <thead>
                  <tr>
                         <th scope="col">NO</th>
                         <th scope="col">PRODUCT</th>
                         <th scope="col">SUBJECT</th>
                         <th scope="col">WRITER</th>
                         <th scope="col">DATE</th>
                     </tr>
                   </thead>

               <tbody class="xans-element- xans-board xans-board-notice-1002 xans-board-notice xans-board-1002 center"><!--

                --><tr style="background-color:#F9F9F9; color:#555555;" class="xans-record-">
            <td style="font-weight:600;"></td>
                    <td class="displaynone"></td>
                    <td></td>
                    <td class="subject left txtBreak">
                        <strong> <a href="/article/배송문의/3001/279655/" style="color:#555555; font-size:12px;">▶ 일시품절/품절 관련 안내입니다.</a></span></strong>
                    </td>
                    <td>홍길동</td>
                    <td class=""><span class="txtNum">2017-11-09</span></td>
                    <td class="displaynone"><img src="//img.echosting.cafe24.com/skin/base/board/ico_point0.gif" alt="0점"></td>
                </tr>
      </tbody>

            <tbody class="xans-element- xans-myshop xans-myshop-wishlistitem center">
             <c:forEach var="b" items="${ list }">
                      <tr class="xans-record-">
                     <td>
                        <!-- no 공지번호 들어갈 곳 -->
                           <span id="idMsg4">${b.qna_no }</span>
                     </td>
                           <td class="thumb" >
                              <!-- subject 내용 들어갈 곳 -->

                             <img src="//black-up.kr/web/product/medium/201910/7e87ddc2879aa1c854575447f27b6026.gif" onerror="this.src='//img.echosting.cafe24.com/thumb/img_product_small.gif';" alt="">

                         </td>

                         <!-- 상품명 이름 들어갈 곳 -->
                         <td class="cen">
                            <span id="prd_name">러트 세미 부츠컷 슬랙스</span>
                            <br>
                            <div class="ppro">
                            <img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_lock.gif" alt="비밀글" class="ec-common-rwd-image"> 
                                 <a id="idMsg10" style="color:#555555;"onclick="prdtDetail(this)">
                                 [답변 전]</a> <img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image"><span class="txtEm"></span>
                            </div>
                         </td>
                           <td class="left">
                               <!-- writer 내용들어갈곳 -->
                        <span id="idMsg11">${b.qna_writer }</span>
                            <td class="price center"><span id="idMsg4">${b.qna_date }</span></td>
                            <td class="button">

                            </td>
                          </tr>
                          </c:forEach>
               </tbody>

               <tbody class="xans-element- xans-myshop xans-myshop-wishlistitem center">
                      <tr class="xans-record-">
                     <td>
                        <!-- no 공지번호 들어갈 곳 -->
                           <span id="idMsg4">${b.qna_no }</span>
                     </td>
                           <td class="thumb" >
                              <!-- subject 내용 들어갈 곳 -->

                             <img src="//black-up.kr/web/product/medium/201910/7e87ddc2879aa1c854575447f27b6026.gif" onerror="this.src='//img.echosting.cafe24.com/thumb/img_product_small.gif';" alt="">

                         </td>

                         <!-- 상품명 이름 들어갈 곳 -->
                         <td class="cen">
                            <span id="prd_name">러트 세미 부츠컷 슬랙스</span>
                            <br>
                            <div class="ppro">
                            <img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_re.gif" alt="답변" class="ec-common-rwd-image">
                            <img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_lock.gif" alt="비밀글" class="ec-common-rwd-image">
                                 <a id="idMsg10" style="color:#555555;" href="product_board_reply.do">
                                 답변완료 :)</a> <img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image"><span class="txtEm"></span>
                            </div>
                         </td>
                           <td class="left">
                               <!-- writer 내용들어갈곳 -->
                        <span id="idMsg11">홍길동</span>
                            <td class="price center"><span id="idMsg4">${b.qna_date }</span></td>
                            <td class="button">

                            </td>
                          </tr>
               </tbody>

              </table>


         </div>
<%-- 		<c:if test="${! empty sessionScope.loginMember }"> --%>
        <a href="product_board_write.do" class="hov1 s-text1 trans-0-4 yg_btn_145">
        <span style="position: relative;top: -2px;">write</span></a>
     <%--    </c:if> --%>
			
         <div class="xans-element- xans-board xans-board-search-1002 xans-board-search xans-board-1002 "><fieldset class="boardSearch">
		<legend>게시물 검색</legend>
		<form action="pb_search.do">
            <p><select id="search_date" name="search_date">
            <option value="week">일주일</option>
			<option value="month">한달</option>
			<option value="month3">세달</option>
			<option value="all">전체</option>
			</select>
            <select id="search_key" name="search_key">
            <option value="title">제목</option>
            <option value="writer">글쓴이</option>
            <option value="date">기간별</option>
            </select> 
         
      <input id="search" name="search" class="inputTypeText" type="text">
<!--       <input id="searchDate" name="searchDate" type="date"> -->
      <a href="#none" onclick="pbSearch();" class="yg_btn_28 yg_btn318">
      <span id="idMsg9">SEARCH</span></a></p>
         </form>
           </fieldset>
   </div>

         <div class="xans-element- xans-myshop xans-myshop-orderhistorypaging ec-base-paginate1">
            <!-- <a href="?page=1&amp;history_start_date=2019-12-15&amp;history_end_date=2020-03-14&amp;past_year=2019" class="first"> -->

               <img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">



                  <c:url var="before" value="product_board.do">
                  <c:param name="currentPage" value="${pi.currentPage -1 }"/>
                  </c:url>
                  <a href="${before}">
                  <img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지">
                  </a> &nbsp;

               <c:forEach var="p" begin="${ pi.startPage }" end="${ pi.endPage }">
                     <c:if test="${ p eq pi.currentPage }">
                        <font color="red" style="font-size: 13px;font-weight: 900;font-family: 'arial',serif;line-height: 35px;">
                        <b>${ p }</b> &nbsp;&nbsp;</font>
                     </c:if>

                     <c:if test="${ p ne pi.currentPage }">
                        <c:url var="pagination" value="product_board.do">
                           <c:param name="currentPage" value="${ p }"/>
                     </c:url>
                     <a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
                     ${ p }</a> &nbsp;
                  </c:if>
               </c:forEach>


               <c:url var="after" value="product_board.do">
                     <c:param name="currentPage" value="${pi.currentPage +1 }"/>
                  </c:url>
                  <a href="${after}">
               <img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
               </a>


               <img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">

         </div>

        </div>
      <hr class="layout">
   </div>
   <input id="q_no" type="hidden" value="${b.qna_no}">
 <%@include file="footer.jsp" %>
 <script>
 
 function prdtDetail(en){
	
	var q_no = $(en).parents('tr').children('td').eq(0).children('span').text();	 

	 location.href='product_board_detailView.do?qna_no='+q_no; 
	
 }
 
 function pbSearch() {
	 var search_key = $('#search_key').val();
	 var search_date = $('#search_date').val();
	 var search = $('#search').val();
	 
	 location.href="pb_search.do?search_key="+search_key+"&search="+search;
 }
 
 
 </script>
</body>
</html>
