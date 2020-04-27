<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="Content-Style-Type" content="text/css">
<title>oT.</title>
<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" href="/ot/resources/css/mypage_basic.css">
<link rel="stylesheet" href="/ot/resources/css/mypage_list.css">
<link rel="icon" type="image/png" href="/ot/resources/images/icons/favicon.png"/>

<style>
.ec-base-tab.tab_style li a {
    background: #f4f4f4;
    margin: 0;
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

</style>
	<jsp:include page="header.jsp"/>	
</head>
<body>
	<c:url var="mWishlist" value="mWishlist.do"/>
	<c:url var="mPoint" value="mPoint.do"/>
	<c:url var="mCoupon" value="mCoupon.do"/>
	<c:url var="mUnavailpoint" value="mUnavailpoint.do"/>

 	<div id="container">
 		<div id="memberInf1">
			<div class="xans-myshop-bankbook " style="width: 80%;">
    			<p class="xans-element- xans-myshop xans-myshop-asyncbenefit mypage_top ">
    				<strong>
    					<span><span class="xans-member- var-name">${loginMember.memName }</span></span>
    				</strong>
 					님은 현재 
					<strong>
						<span class="xans-member- var-group_name" style="color:rgba(230,106,87,1);">
							<c:if test="${loginMember.memSumMoney < 30000}">
								MEMBER
							</c:if>
							<c:if test="${loginMember.memSumMoney >= 30000 && loginMember.memSumMoney < 60000}" >
								IRON
							</c:if>
							<c:if test="${loginMember.memSumMoney >= 60000 && loginMember.memSumMoney < 90000}" >
								BRONZE
							</c:if>
							<c:if test="${loginMember.memSumMoney >= 90000 && loginMember.memSumMoney < 120000}" >
								SILVER
							</c:if>
							<c:if test="${loginMember.memSumMoney >= 120000}" >
								GOLD
							</c:if>
						</span>
						<span class="myshop_benefit_ship_free_message"></span>
					</strong>
  					입니다.
				</p>
		
				<ul style="float: right;width: 350px; height: 60px;margin-right: 100px;margin-top: -34px;">
					<li class="xans-layout-shoppinginfo ">
						<strong class="title">WISH</strong>
  						<br>
						<strong class="data ">
							<a href="${mWishlist }">
									<span id="xans_myshop_interest_prd_cnt">${WishList }개</span>
							</a>
						</strong>
					</li>
				
               		<li>
	                    <strong class="title">POINT</strong>
	                    <br>
	                    <strong class="data">
	                    	<a href="${mPoint }">
	                    	<fmt:formatNumber value="${loginMember.mem_point }" pattern="#,###"/>원</a>
	                    </strong>
	                </li>
                
	                <li class="etc ">
	                    <strong class="title">COUPON</strong>
	                    <br>
	                    <strong class="data">
	                    	<a href="${mCoupon }">${CouponCount }<span>개</span></a>
	                    </strong>
	                </li>
	            </ul>
			</div>
		</div>
		
        <div id="contents">
			<div class="titleArea">
    			<h2>POINT</h2>
			</div>

			<div class="xans-element- xans-layout xans-layout-logincheck ">
			<!--
			    $url = /member/login.html
			-->
			</div>
			
			<div class="ec-base-tab tab_style">
        		<ul class="menu">
					<li class="selected">
						<a href="${mPoint }">포인트 내역 보기</a>
					</li>
        		</ul>
			</div>

			<div class="xans-element- xans-myshop xans-myshop-historylist">
				<!--
	            $only_html = no
	            $count = 10
	            $login_page = /member/login.html
	        	-->
				<div class="ec-base-table typeList">
            		<table border="1" summary="" style="border-bottom:none;">
						<caption>적립금 내역</caption>
                		<colgroup>
							<col style="width:15%">
							<col style="width:15%">
							<col style="width:20%">
							<col style="width:30%">
							<col style="width:auto">
						</colgroup>
						
						<thead>
							<tr>
								<th scope="col">날짜</th>
								<th scope="col">구분</th>
	                        	<th scope="col">적립금</th>
		                        <th scope="col">관련 주문</th>
		                        <th scope="col">내용</th>
	                    	</tr>
                    	</thead>
                    
						<tbody class=" center">
							<tr class="xans-record-">
										<td>회원가입날짜</td>
										<td>회원가입</td>
				                        <td>
				                        	<fmt:formatNumber value="2000" pattern="#,###"/>
			                        	</td>
				                        <td>
				                        <a href="/myshop/order/detail.html?order_id="></a>
				                        </td>
				                        <td>회원가입을 축하합니다</td>
				                    </tr>
						<c:if test="${ !empty list }">
							<c:forEach var="pt" items="${list }">
									<tr class="xans-record-">
										<td>${pt.pt_date }</td>
										<td>${pt.pt_part }</td>
				                        <td>
				                        	<fmt:formatNumber value="${pt.pt_price }" pattern="#,###"/>
			                        	</td>
				                        <td>
				                        <a href="/myshop/order/detail.html?order_id=">${pt.ordno }</a>
				                        </td>
				                        <td>${pt.pt_content }</td>
				                    </tr>
							</c:forEach>
						</c:if>
						</tbody>
					</table>
					
						<c:if test="${ empty list }">
							<p class="message ">적립금 내역이 없습니다.</p>
						</c:if>
	        	</div>
			</div>
			
			<c:if test="${ !empty list }">
			<!-- 페이징 처리 -->
			<div class="xans-element- xans-myshop xans-myshop-couponlistpaging ec-base-paginate1">
				<c:if test="${pi.currentPage eq 1 }">
					<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
				</c:if>
				<c:if test="${pi.currentPage ne 1 }">
					<c:url var="start" value="mCoupon.do">
						<c:param name="currentPage" value="1"/>
					</c:url>
				<a href="${start }" class="first">
					<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
				</a>
				</c:if> 
				
				
				<c:if test="${ pi.currentPage eq 1 }">
					<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지"> &nbsp;
				</c:if>
				<c:if test="${ pi.currentPage ne 1 }">
				<c:url var="before" value="mPoint.do">
                  <c:param name="currentPage" value="${pi.currentPage - 1 }"/>
                  </c:url>
                  <a href="${before}">
                  <img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지">
                  </a> &nbsp;
                 </c:if>
                  
				 <c:forEach var="p" begin="${ pi.startPage }" end="${ pi.endPage }">
                     <c:if test="${ p eq pi.currentPage }">
                        <font color="red" style="font-size: 13px;font-weight: 900;font-family: 'arial',serif;line-height: 35px;">
                        <b>${ p }</b> &nbsp;&nbsp;</font>
                     </c:if>

                     <c:if test="${ p ne pi.currentPage }">
                        <c:url var="pagination" value="mPoint.do">
                           <c:param name="currentPage" value="${ p }"/>
                     </c:url>
                     <a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
                     ${ p }</a> &nbsp;
                  </c:if>
               </c:forEach>
               
               
               <c:if test="${ pi.currentPage eq pi.maxPage }">
					<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
				</c:if>
				<c:if test="${ pi.currentPage ne pi.maxPage }">
				<c:url var="after" value="mPoint.do">
                     <c:param name="currentPage" value="${pi.currentPage +1 }"/>
                  </c:url>
                  <a href="${after}">
               <img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
               </a>
               </c:if>
               
               <c:if test="${ pi.currentPage eq pi.maxPage }">
               		<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
               </c:if>
               <c:if test="${ pi.currentPage ne pi.maxPage }">
               		<c:url var="end" value="mPoint.do">
               			<c:param name="currentPage" value="${pi.maxPage }"/>
               		</c:url>
					<a href="${end }" class="last">
					<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지"></a>
               </c:if>
			</div>
			</c:if>
			
			<div class="xans-element- xans-myshop xans-myshop-head ec-base-help ">
				<h3>적립금 안내</h3>
				<div class="inner">
	        		<ol class="xans-element- xans-myshop xans-myshop-historyinfo" style="font-size: 13px;">
	        			<li class="item1 ">적립금 사용은 최소 2,000원부터 사용이 가능합니다. 최대 사용금액은 제한이 없습니다.</li>
						<li class="item2 ">적립금 사용 시 배송비는 적립금으로 사용 할 수 없습니다.</li>
					</ol>
				</div>
			</div>
		</div>
	</div>
	
 <%@include file="footer.jsp" %>
</body>
</html>