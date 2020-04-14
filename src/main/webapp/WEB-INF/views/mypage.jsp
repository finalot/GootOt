<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="Content-Style-Type" content="text/css">
<title>oT.</title>

<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
   <link rel="stylesheet" type="text/css" href="/ot/resources/css/Login_style.css"/>
   <link rel="stylesheet" type="text/css" href="/ot/resources/css/mypage_basic.css"/>
   <link rel="stylesheet" type="text/css" href="/ot/resources/css/mypage.css"/>
   
   <link rel="icon" type="image/png" href="images/icons/favicon.png"/>
	<jsp:include page="header.jsp"/>
</head>
<body>
			<!-- 마이페이지 상세 목록 경로지정 -->
			<!-- 주문내역(배송관련) 경로지정 -->
			<c:url var="mList" value="mList.do">
				<c:param name="mList" value="all"/>
			</c:url>
			<c:url var="delivery_prev" value="mList.do">
				<c:param name="mList" value="prev"/>
			</c:url>
			<c:url var="delivery_ready" value="mList.do">
				<c:param name="mList" value="ready"/>
			</c:url>
			<c:url var="delivery_ing" value="mList.do">
				<c:param name="mList" value="ing"/>
			</c:url>
			<c:url var="delivery_complete" value="mList.do">
				<c:param name="mList" value="complete"/>
			</c:url>
			<c:url var="delivery_cancel" value="mList.do">
				<c:param name="mList" value="cancel"/>
			</c:url>
			<c:url var="delivery_change" value="mList.do">
				<c:param name="mList" value="change"/>
			</c:url>
			<c:url var="delivery_return" value="mList.do">
				<c:param name="mList" value="return"/>
			</c:url>
			
			<c:url var="mWishlist" value="mWishlist.do"/>
			<c:url var="mPoint" value="mPoint.do"/>
			<c:url var="mCoupon" value="mCoupon.do"/>
			<c:url var="mBoard" value="mBoard.do"/>
			<c:url var="mAddress" value="mAddress.do"/>
			<c:url var="mEdit" value="mEdit.do"/>
			
	<div id="container">
 		<div id="memberInf1">
			<div class="xans-myshop-bankbook " style="width: 80%;">
    			<p class="xans-element- xans-myshop xans-myshop-asyncbenefit mypage_top ">
    				<strong>
    					<span><span class="xans-member- var-name">홍길동</span></span>
    				</strong>
 					님은 현재 
					<strong>
						<span class="xans-member- var-group_name" style="color:rgba(230,106,87,1);">MEMBER</span>
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
									<span id="xans_myshop_interest_prd_cnt">0개</span>
							</a>
						</strong>
					</li>
				
               		<li>
	                    <strong class="title">POINT</strong>
	                    <br>
	                    <strong class="data">
	                    	<a href="${mPoint }">${loginMember.mem_point }원</a>
	                    </strong>
	                </li>
                
	                <li class="etc ">
	                    <strong class="title">COUPON</strong>
	                    <br>
	                    <strong class="data">
	                    	<a href="${mCoupon }">${CouponCount}<span>개</span></a>
	                    </strong>
	                </li>
	            </ul>
			</div>
		</div>
		
        <div id="contents">
			<div class="mypage_top_outer">
			 <!-- <div module="myshop_bankbook">        
			        <ul>
			            <li module="Layout_shoppingInfo">
			                <strong class="title"><a href="/myshop/wish_list.html">WISH</a></strong>
			                <strong class="data {$use_interest_prd|display}"><a href="/myshop/wish_list.html">{$interest_prd_cnt}</a></strong>
			            </li>
			            <li>
			                <strong class="title"><a href="/myshop/mileage/historyList.html">POINT</a></strong>
			                <strong class="data"><a href="/myshop/mileage/historyList.html">{$avail_mileage}</a></strong>
			            </li>
			            <li class="etc {$display_coupon|display}">
			                <strong class="title"><a href="/myshop/coupon/coupon.html">COUPON</a></strong>
			                <strong class="data"><a href="/myshop/coupon/coupon.html">{$coupon_cnt}<span>개</span></a></strong>
			                <a href="/myshop/coupon/coupon.html"></a>
			            </li>
			        </ul>
			    </div> -->
			</div>

			<div class="titleArea">
    			<h2>MY SHOPPING</h2>
			</div>

			<div class="xans-element- xans-layout xans-layout-logincheck ">
			<!--
			    $url = /member/login.html
			-->
			</div>
		
			<div id="myshopMain" class="xans-element- xans-myshop xans-myshop-main">
			
			
				<div class="shopMain order">
			        <a href="${mList }">주문내역</a>
			    </div>
				<div class="shopMain wishlist">
			        <a href="${mWishlist }">관심상품</a>
			    </div>
				<div class="shopMain mileage">
			        <a href="${mPoint }">적립금</a>
			    </div>
				<div class="shopMain coupon  ">
			        <a href="${mCoupon }">쿠폰</a>
			    </div>
				<div class="shopMain board">
			        <a href="${mBoard }">내가 쓴 게시글</a>
			    </div>
				<div class="shopMain address">
			        <a href="${mAddress }">배송 주소록 관리</a>
			    </div>
				<div class="shopMain profile">
			        <a href="${mEdit }">회원 정보 수정</a>
			    </div>
			    
		<!--    <div class="shopMain consult displaynone">
		       		 <h3><a href="/board/consult/list.html"><strong>consult</strong>1:1 맞춤상담</a></h3>
		       		 <p><a href="/board/consult/list.html">고객님의 궁금하신 문의사항에 대하여 1:1맞춤상담 내용을 확인하실 수 있습니다.</a></p>
		    	</div>
		   	    <div module="Myshop_InquiryDash" class="shopMain inquiry">
		        <h3><a href="/board/inquiry/list.html"><strong>Inquiry</strong>대량구매 문의 관리</a></h3>
		        <p><a href="/board/inquiry/list.html">요청한 대량구매문의 내역을 확인하고 관리하실 수 있습니다.</a></p>
		    	</div> -->
			</div>
		
			<div class="xans-element- xans-myshop xans-myshop-orderstate ">
				<div class="title">
			        <h3>나의 주문처리 현황 <span class="desc">(최근 <em>3개월</em> 기준)</span></h3>
			    </div>
			    
				<div class="state">
				
			        <ul class="order">
						<li>
			                <strong>입금전</strong>
			                <a href="${delivery_prev }" class="count"><span id="xans_myshop_orderstate_shppied_before_count">0</span></a>
			            </li>
			            <li>
			                <strong>배송준비중</strong>
			                <a href="${delivery_ready }" class="count"><span id="xans_myshop_orderstate_shppied_standby_count">0</span></a>
			            </li>
			            <li>
			                <strong>배송중</strong>
			                <a href="${delivery_ing }" class="count"><span id="xans_myshop_orderstate_shppied_begin_count">0</span></a>
			            </li>
			            <li>
			                <strong>배송완료</strong>
			                <a href="${delivery_complete }" class="count"><span id="xans_myshop_orderstate_shppied_complate_count">0</span></a>
			            </li>
			        </ul>
			        
					<ul class="cs">
						<li>
			                <span class="icoDot"></span>
			                <strong>취소 : </strong>
			                <a href="${delivery_cancel }" class="count"><span id="xans_myshop_orderstate_order_cancel_count">0</span></a>
			            </li>
			            <li>
			                <span class="icoDot"></span>
			                <strong>교환 : </strong>
			                <a href="${delivery_change }" class="count"><span id="xans_myshop_orderstate_order_exchange_count">0</span></a>
			            </li>
			            <li>
			                <span class="icoDot"></span>
			                <strong>반품 : </strong>
			                <a href="${delivery_return }" class="count"><span id="xans_myshop_orderstate_order_return_count">0</span></a>
			            </li>
			        </ul>
				</div>
			</div>
		</div>
		
	<hr class="layout">
	</div>

 <jsp:include page="footer.jsp"/>
</body>
</html>