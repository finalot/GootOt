<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="Content-Style-Type" content="text/css">
<title>oT.</title>
<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<!--    <link rel="stylesheet" href="/ot/resources/css/Login_style.css"> -->
<link rel="stylesheet" href="/ot/resources/css/mypage_basic.css">
<link rel="stylesheet" href="/ot/resources/css/mypage_list.css">
<link rel="icon" type="image/png" href="/ot/resources/images/icons/favicon.png" />

	<jsp:include page="header.jsp"/>
</head>
<body>
	<c:url var="mWishlist" value="mWishlist.do"/>
	<c:url var="mPoint" value="mPoint.do"/>
	<c:url var="mCoupon" value="mCoupon.do">
	<c:url var="mCompletecoupon" value="mCompletecoupon.do"/>
	
	
	
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
	                    	<a href="${mPoint }">0원</a>
	                    </strong>
	                </li>
                
	                <li class="etc ">
	                    <strong class="title">COUPON</strong>
	                    <br>
	                    <strong class="data">
	                    	<a href="${mCoupon }">${cp.listCount }<span>개</span></a>
	                    </strong>
	                </li>
	            </ul>
			</div>
		</div>
		
		<div id="contents">

			<div class="titleArea">
				<h2>COUPON</h2>
			</div>

			<div class="xans-element- xans-layout xans-layout-logincheck ">
				<!--
			    $url = /member/login.html
			-->
			</div>

			<form id="frmCouponlist" name="frmCouponlist" action="" method="post"
				target="_self" enctype="multipart/form-data">
				<div class="xans-element- xans-myshop xans-myshop-couponlist">
					<!--
        $product_list_url = coupon_product_list.html
    -->			<div class="ec-base-tab tab_style">
        		<ul class="menu">
					<li class="selected">
						<a href="${mCoupon }">사용가능한 쿠폰 목록</a>
					</li>
		            <li>	
		            	<a href="${mCompletecoupon }">사용완료한 쿠폰 목록</a>
	            	</li>
						<p style="text-align: right; margin-right: 5px; padding-top: 15px;">사용가능 쿠폰 : ${cp.listCount }장</p>
        		</ul>
			</div>
					<div class="ec-base-table typeList">
						<table border="1" summary="">
							<caption>마이 쿠폰 목록</caption>
							<colgroup>
								<col style="width: 60px">
								<col style="width: 200px">
								<col style="width: 150px">
								<col style="width: 160px">
								<col style="width: 150px">
							</colgroup>
							<thead>
								<tr>
									<th scope="col">NO</th>
									<th scope="col">COUPON NAME</th>
									<th scope="col">DISCOUNT</th>
									<th scope="col">DATE</th>
								</tr>
							</thead>
							<c:if test="${ !empty list}">
								<c:forEach var="cp" items="${list }">
							<tbody class="center">
								<tr class="xans-record-">
									<td>${cp.cpseq }</td>
									<td>${cp.cpname }</td>
									<td>${cp.cpDiscount }</td>
									<td>${cp.cpdate }</td>
								</tr>
								</c:forEach>
								</c:if>
							</tbody>
							<c:if test="${empty list }">
							<tbody class="">
								<tr>
									<td colspan="7" class="message">보유하고 계신 쿠폰 내역이 없습니다</td>
								</tr>
							</tbody>
							</c:if>
						</table>
					</div>
					<p class="ec-base-button displaynone">
						<span class="gRight"><img
							src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_coupon_use.gif"
							alt="사용하기" onclick="COUPON.useCoupon()"></span>
					</p>
				</div>
			</form>

			<div
				class="xans-element- xans-myshop xans-myshop-couponlistpaging ec-base-paginate">
				<a href="/myshop/coupon/coupon.html?page=1" class="first"><img
					src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지"></a>
				<a href="/myshop/coupon/coupon.html?page=1"><img
					src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지"></a>
				<ol>
					<li class="xans-record-"><a href="?page=1" class="this">1</a></li>
				</ol>
				<a href="/myshop/coupon/coupon.html?page=1"><img
					src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지"></a>
				<a href="/myshop/coupon/coupon.html?page=1" class="last"><img
					src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지"></a>
			</div>

			<form id="frmSerialCoupon" name=""
				action="/exec/front/myshop/couponSerial" method="post"
				target="_self" enctype="multipart/form-data">
				<div class="xans-element- xans-myshop xans-myshop-couponserial ">
					<div class="title">
						<h3>쿠폰인증번호 등록하기</h3>
					</div>
					<div class="ec-base-box typeThinBg couponSerial">
						<!--
            $login_page_url = /member/login.html
        -->
						<fieldset>
							<legend>쿠폰번호 등록</legend>
							<input id="coupon_code" name="coupon_code" fw-filter=""
								fw-label="쿠폰인증번호" fw-msg="" class="inputTypeText" placeholder=""
								maxlength="35" value="" type="text"> <a href="#none"
								class="yg_btn yg_btn1 yg_btn_border_444"
								onclick="coupon_code_submit();" alt="쿠폰번호 인증">쿠폰번호 인증</a>
							<p>반드시 쇼핑몰에서 발행한 쿠폰번호만 입력해주세요. (10~35자 일련번호 "-" 제외)</p>
						</fieldset>
					</div>
				</div>
			</form>

			<div class="ec-base-help">
				<h3>쿠폰 이용 안내</h3>
				<div class="inner">
					<ol style="font-size:13px;">
						<li class="item1"><strong>쿠폰인증번호 등록하기</strong>에서 쇼핑몰에서 발행한
							종이쿠폰/시리얼쿠폰/모바일쿠폰 등의 인증번호를 등록하시면 온라인쿠폰으로 발급되어 사용이 가능합니다.</li>
						<li class="item2">쿠폰은 주문 시 1회에 한해 적용되며, 1회 사용 시 재 사용이 불가능합니다.</li>
						<li class="item3">쿠폰은 적용 가능한 상품이 따로 적용되어 있는 경우 해당 상품 구매 시에만
							사용이 가능합니다.</li>
						<li class="item4">특정한 종이쿠폰/시리얼쿠폰/모바일쿠폰의 경우 단 1회만 사용이 가능할 수
							있습니다.</li>
					</ol>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="footer.jsp"/>
</body>
</html>