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
<!--    <link rel="stylesheet" href="/ot/resources/css/Login_style.css"> -->
<link rel="stylesheet" href="/ot/resources/css/mypage_list.css">
<link rel="stylesheet" href="/ot/resources/css/mypage_basic.css">
<link rel="icon" type="image/png" href="/ot/resources/images/icons/favicon.png" />

<style>
a{
	font-size : 13px !important;
	cursor : pointer;
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

.products_reviews_form {
    padding-bottom: 44px;
}
.products_reviews_form__head {
    padding-bottom: 10px;
    margin-bottom: 3px;
    font-family: 나눔고딕, NanumGothic, "맑은 고딕", "Malgun Gothic", 돋움, Dotum, 굴림, "Helvetica Neue", Helvetica, Arial, sans-serif;
    height: 11px;
    line-height: 20px;
}
.products_reviews_form__title {
    font-size: 12px;
    float: left;
}
.products_reviews_form__button {
    float: right;
    width: auto;
    line-height: 20px;
    background-color: rgb(48, 48, 48);
    color: rgb(255, 255, 255);
    text-align: center;
    font-size: 10px;
    cursor: pointer;
    white-space: nowrap;
    border-width: 1px;
    border-style: solid;
    border-color: rgb(16, 16, 16);
    border-image: initial;
    border-radius: 3px;
    padding: 0px 2px;
}
.products_reviews_summary {
    padding: 20px 0px 20px 29px;
    border-width: 1px;
    border-style: solid;
    border-color: rgb(218, 218, 218);
    border-image: initial;
}
.products_reviews_summary__inner {
    position: relative;
}
.products_reviews_summary__lcontent {
    margin-right: 263px;
    padding: 9px 20px 9px 0px;
    border-right: 1px solid rgb(237, 237, 237);
}
.products_reviews_summary__rcontent {
    position: absolute;
    right: 0px;
    top: 0px;
}
.score_summary {
    min-width: 90px;
}
.score_summary__footer {
    font-size: 14px;
    margin-top: 16px;
}
.score_summary__avg_score {
    width: 96px;
    float: left;
}
.score_summary__score_filters {
    padding-left: 120px;
}
.score_summary__average {
    line-height: 77px;
    text-align: center;
    color: white;
    font-size: 50px;
    background: rgb(37, 37, 37);
}
.score_summary__reviews_count {
    text-align: center;
    color: rgb(118, 118, 118);
    padding: 7px;
}
.score_summary__score_filter {
    display: inline-block;
    margin-bottom: 9px;
    height: 14px;
    width: 100%;
}
.score_summary__score_filter a {
    display: block;
    color: rgb(157, 157, 157);
}
.score_summary__score_filter__title {
    float: left;
    width: 50px;
}
.score_summary__score_filter__status {
    float: right;
    width: 64px;
    margin-left: 6px;
}
.score_summary__score_filter__gauge {
    margin-left: 54px;
    margin-right: 70px;
    position: relative;
    background: rgb(244, 244, 244);
}
.score_summary__score_filter__count {
    float: left;
    text-align: right;
    color: rgb(157, 157, 157);
    width: 42px;
}
.score_summary__score_filter__check {
    float: left;
    visibility: hidden;
    margin-left: 10px;
}
.sprites-check {
    vertical-align: middle;
    background-image: url(//assets.cre.ma/latte/assets/sprites-9f78e5e….png);
    width: 12px;
    height: 12px;
    background-repeat: no-repeat;
    background-position: -35px -88px;
}
.score_summary__score_filter a {
    display: block;
    color: rgb(157, 157, 157);
}
.score_summary__score_filter__gauge .percentile {
    width: 0px;
    height: 14px;
    background: rgb(255, 76, 35);
}
.score_summary__footer {
    font-size: 14px;
    margin-top: 16px;
}
.score_summary__footer .percentage {
    color: rgb(110, 182, 126);
}
.products_reviews_summary__rcontent {
    position: absolute;
    right: 0px;
    top: 0px;
}
.products_reviews_summary_thumbnail_small_with_score {
    width: 245px;
}
.products_reviews_summary_thumbnail_small_with_score__items {
    text-align: center;
    font-size: 0px;
    margin-top: 8px;
}
.products_reviews_summary_thumbnail_small_with_score__show_all_photo_reviews {
    text-align: center;
    margin-top: 18px !important;
}
.products_reviews_summary_thumbnail_small_with_score__item_row:first-child {
    margin-top: 0px;
}
.products_reviews_summary_thumbnail_small_with_score__item_row {
    margin-top: 8px;
    display: inline-block;
}
.products_reviews_summary_thumbnail_small_with_score__item:first-child {
    margin-left: 0px;
}
.products_reviews_summary_thumbnail_small_with_score__item {
    float: left;
    margin-left: 4px;
    background: rgb(237, 237, 237);
}
.products_reviews_summary_thumbnail_small_with_score__item_link {
    display: inline-block;
    font-size: 0px;
    position: relative;
}
.products_reviews_summary_thumbnail_small_with_score__show_all_photo_reviews {
    text-align: center;
    margin-top: 18px !important;
}
.widget_reviews {
    padding: 44px 0px;
}
.products_reviews_header {
    font-size: 16px;
}
.widget_reviews__body {
    border-bottom: 1px solid rgb(218, 218, 218);
}
.products_reviews_header__upper {
    font-family: 나눔고딕, NanumGothic, "맑은 고딕", "Malgun Gothic", 돋움, Dotum, 굴림, "Helvetica Neue", Helvetica, Arial, sans-serif;
    position: relative;
}
.products_reviews_header__separator {
    height: 1px;
    background: rgb(218, 218, 218);
    margin: 10px 0px;
}
.products_reviews_header__lower {
    padding-top: 10px;
    padding-bottom: 15px;
}
.products_reviews_header__sort_type--selected {
    color: rgb(51, 51, 51);
    font-size: 16px;
}
.products_reviews_header__sort_type {
    color: rgb(148, 148, 148);
    font-size: 13px;
    letter-spacing: -1px;
}
.products_reviews_header__sort_type_divider {
    font-size: 13px;
    padding: 0px 13px;
}
.products_reviews_header__upper {
    font-family: 나눔고딕, NanumGothic, "맑은 고딕", "Malgun Gothic", 돋움, Dotum, 굴림, "Helvetica Neue", Helvetica, Arial, sans-serif;
    position: relative;
}
.reviews_manager--absolute {
    position: absolute;
    top: 0px;
    right: 0px;
}
.products_reviews_header__separator {
    height: 1px;
    background: rgb(218, 218, 218);
    margin: 10px 0px;
}
.review_options_search__option_types {
    float: right;
}
.widget_reviews__body {
}
.products_reviews_summary__lcontent {
    margin-right: 263px;
    padding: 9px 20px 9px 0px;
    border-right: 1px solid rgb(237, 237, 237);
}
.score_summary__avg_score {
    width: 96px;
    float: left;
}
.score_summary__average {
    line-height: 77px;
    text-align: center;
    color: white;
    font-size: 50px;
    background: rgb(37, 37, 37);
}
.products_reviews_summary_thumbnail_small_with_score__show_all_photo_reviews_icon {
    display: none;
    position: absolute;
    right: -15px;
}
.sprites-check {
    vertical-align: middle;
    background-image: url(//assets.cre.ma/latte/assets/sprites-9f78e5e….png);
    width: 12px;
    height: 12px;
    background-repeat: no-repeat;
    background-position: -35px -88px;
}

.top_menu {
    position: relative;
    border: 1px solid #e1e1e1;
    margin-top: 18px;
    margin-bottom: 33px;
    box-shadow: 2px 3px 3px 0px rgba(0,0,0,0.03);
    filter: progid:DXImageTransform.Microsoft.Shadow(color='#f7f7f7', Direction=90, Strength=3);
    height: 51px;
    box-sizing: content-box;
    width:100%;
}

.select2-drop {
    width: 100%;
    margin-top: -1px;
    position: absolute;
    z-index: 9999;
    top: 100%;
    background: #fff;
    color: #000;
    border: 1px solid #aaa;
    border-top: 0;
}

</style>
	<jsp:include page="header.jsp"/>
</head>
<body>

	<c:url var="mWishlist" value="mWishlist.do"/>
	<c:url var="mPoint" value="mPoint.do"/>
	<c:url var="mCoupon" value="mCoupon.do"/>
	
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
	                    	<a href="${mCoupon }">${CouponCount}<span>개</span></a>
	                    </strong>
	                </li>
	            </ul>
			</div>
		</div>

		<div id="contents">
			<div class="titleArea">
				<h2>BOARD LIST</h2>
			</div>

			<div class="xans-element- xans-layout xans-layout-logincheck ">
				<!--
			    $url = /member/login.html
			-->
			</div>

			<div class="xans-element- xans-myshop xans-myshop-boardpackage ">
				<div class="xans-element- xans-myshop xans-myshop-boardlist ec-base-table typeList gBorder gBlank10">
					<!--
            $count = 10
            $relation_post = yes
        -->
					<table border="1" summary="">
						<caption>게시물 관리 목록</caption>
						<colgroup
							class="xans-element- xans-board xans-board-listheader-1002 xans-board-listheader xans-board-1002 ">
							<col style="width: 100px;">
							<col style="width: 200px;">
							<col style="width: auto;">
							<col style="width: 200px;">
							<col style="width: 200px;">
						</colgroup>
						<thead>
							<tr>
								<th scope="col">NO</th>
								<th scope="col">BOARD CATEGORY</th>
								<th scope="col">SUBJECT</th>
								<th scope="col">WRITER</th>
								<th scope="col">DATE</th>
							</tr>
						</thead>
						<tbody>
						<c:if test="${ empty list }">
							<tr>
								<td colspan="6" class="message">게시물이 없습니다.</td>
							</tr>
						</c:if>
						</tbody>
						
						<tbody class=" center">
								<c:url var="mBoard_view" value="mBoard_view.do">
									<c:param name="mBoard_view" value="Board"/>
								</c:url>
								
								<c:url var="mBoard_adminreply" value="mBoard_adminreply.do">
									<c:param name="mBoard_adminreply" value="mReply"/>
								</c:url>
								
							<c:if test="${ !empty list }">
								<c:forEach var="b" items="${list }">
								
							<tr class="xans-record-" id="catecheck">
							<input id="b_cate_no" name="b_cate_no"  class="b_cate_no" type="hidden" value="${b.b_cate_no}"/>
							<input id="q_no" name="q_no" class="q_no" type="hidden" value="${b.qna_no}"/>
								<td>${b.qna_no }</td>
								<td>
									<a onclick="boardmove(this); "id="cate">${b.b_cate_name }
									</a>
								</td>
								
								<c:if test="${b.b_cate_no eq 1 }">
								<td class="left">
                            		<span id="prd_name">${b.prdt_name}</span>
                           		 	<br>
                            		<div class="ppro">
                            			<c:if test="${b.qna_secure=='T'}">
                           					<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_lock.gif" alt="비밀글" class="ec-common-rwd-image"> 
                            		 		<c:if test="${b.qna_chk  == 'N'}">
	                                 			<a id="idMsg10" style="color:#555555;"onclick="prdtDetail(this)">
	                                 				${b.qna_title }
	                                 			</a> 
	                                		 	<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image">
	                                		 	<span class="txtEm"></span>
                             				</c:if>
                             				
                             				<c:if test="${b.qna_chk  == 'Y'}">
                                 				<a id="idMsg10" style="color:#555555;" onclick="prdtDetail(this)">
                                 					${b.qna_title }
                                				</a> 
                                 				<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image">
                                 				<span class="txtEm"></span>
                           					</c:if>
                           				</c:if>
                             	
                             			<c:if test="${b.qna_secure=='F'}">
                            		 		<c:if test="${b.qna_chk  == 'N'}">
                                 				<a id="idMsg10" style="color:#555555;" onclick="prdtDetail2(this)">
                                 					${b.qna_title }
                               					</a> 
                                				<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image">
                                				<span class="txtEm"></span>
                             				</c:if>
                             				<c:if test="${b.qna_chk  == 'Y'}">
                                 			<a id="idMsg10" style="color:#555555;"onclick="prdtDetail2(this)">
                                 					${b.qna_title }
                          					</a> 
                                 			<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image">
                                 			<span class="txtEm"></span>
                             				</c:if>
										</c:if>                               
                           		 	</div>
                         		</td>
                         		</c:if>
								
								<c:if test="${b.b_cate_no ne 1 }">
								<td class="left">
                            		<div class="ppro">
                            			<c:if test="${b.qna_secure=='T'}">
                           					<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_lock.gif" alt="비밀글" class="ec-common-rwd-image"> 
                            		 		<c:if test="${b.qna_chk  == 'N'}">
	                                 			<a id="idMsg10" style="color:#555555;"onclick="prdtDetail(this)">
	                                 				${b.qna_title }
	                                 			</a> 
	                                		 	<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image">
	                                		 	<span class="txtEm"></span>
                             				</c:if>
                             				
                             				<c:if test="${b.qna_chk  == 'Y'}">
                                 				<a id="idMsg10" style="color:#555555;"onclick="prdtDetail(this)">
                                 					${b.qna_title }
                                				</a> 
                                 				<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image">
                                 				<span class="txtEm"></span>
                           					</c:if>
                           				</c:if>
                             	
                             			<c:if test="${b.qna_secure=='F'}">
                            		 		<c:if test="${b.qna_chk  == 'N'}">
                                 				<a id="idMsg10" style="color:#555555;"onclick="prdtDetail2(this)">
                                 					${b.qna_title }
                               					</a> 
                                				<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image">
                                				<span class="txtEm"></span>
                             				</c:if>
                             				<c:if test="${b.qna_chk  == 'Y'}">
                                 			<a id="idMsg10" style="color:#555555;"onclick="prdtDetail2(this)">
                                 					${b.qna_title }
                          					</a> 
                                 			<img src="//img0001.echosting.cafe24.com/front/type_b/image/common/icon_new.gif" alt="NEW" class="ec-common-rwd-image">
                                 			<span class="txtEm"></span>
                             				</c:if>
										</c:if>                               
                           		 	</div>
                         		</td>
                         		</c:if>
                         		
								<td>${b.qna_writer }</td>
								<td><span class="txtNum">${b.qna_date }</span></td>
								
							</tr>
							
							</c:forEach>
							</c:if>
						</tbody>
					</table>
				</div>
			</div>
				<input id="board_sort" name="board_sort" value="" type="hidden" style="width:100px;">
				<div class="xans-element- xans-myshop xans-myshop-boardlistsearch ">
					<fieldset class="boardSearch">
						<legend>게시물 검색</legend>
						
					<form action="mBoardsearch.do">
						<p style="font-size:12px;">
							<select id="search_key" name="search_key" style="width:80px;">
								<option value="title">제목</option>
								<option value="writer">글쓴이</option>
							</select> 
							<input id="search" name="search" class="inputTypeText" type="text"> 
							<a href="#none" class="yg_btn_28 yg_btn3" onclick="pbSearch();" alt="찾기">SEARCH</a>
						</p>
						</form>
					</fieldset>
				</div>

			<!-- 페이징 처리 -->
			<div class="xans-element- xans-myshop xans-myshop-couponlistpaging ec-base-paginate1">
			<c:if test="${ !empty list }">
				<c:if test="${empty sc }">
					<c:if test="${pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</c:if>
					<c:if test="${pi.currentPage ne 1 }">
						<c:url var="start" value="mBoard.do">
							<c:param name="currentPage" value="1"/>
						</c:url>
					<a href="${start }" class="first">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</a>
					</c:if>
				</c:if>
				
				<c:if test="${ !empty sc }">
					<c:if test="${pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</c:if>
					<c:if test="${pi.currentPage ne 1 }">
						<c:url var="start" value="mBoardsearch.do">
							<c:param name="currentPage" value="1"/>
							<c:param name="search_key" value="${sc.search_key }"/>
	                 		<c:param name="search" value="${sc.search }"/>
						</c:url>
					<a href="${start }" class="first">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</a>
					</c:if>
				</c:if>
				
				<c:if test="${empty sc }">
					<c:if test="${ pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지"> &nbsp;
					</c:if>
					
					<c:if test="${ pi.currentPage ne 1 }">
						<c:url var="before" value="mBoard.do">
	                  		<c:param name="currentPage" value="${pi.currentPage - 1 }"/>
	                    </c:url>
	               	<a href="${before}">
	                  	<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지">
	                </a> &nbsp;
	                </c:if>
				</c:if>
					
				<c:if test="${ !empty sc }">
					<c:if test="${ pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지"> &nbsp;
					</c:if>
					
					<c:if test="${ pi.currentPage ne 1 }">
						<c:url var="before" value="mBoardsearch.do">
			                <c:param name="currentPage" value="${pi.currentPage - 1 }"/>
			                <c:param name="search_key" value="${sc.search_key }"/>
			                <c:param name="search" value="${sc.search }"/>
		                </c:url>
	                <a href="${before}">
	                	<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지">
	                </a> &nbsp;
	       			</c:if>
	       		</c:if>
	            
				 
				<c:forEach var="p" begin="${ pi.startPage }" end="${ pi.endPage }">
			   		<c:if test="${ p eq pi.currentPage }">
	                        <font color="red" style="font-size: 13px;font-weight: 900;font-family: 'arial',serif;line-height: 35px;">
	                        <b>${ p }</b> &nbsp;&nbsp;</font>
	                </c:if>
						
				 	<c:if test="${ empty sc }">	
	                     <c:if test="${ p ne pi.currentPage }">
	                        <c:url var="pagination" value="mBoard.do">
	                           <c:param name="currentPage" value="${ p }"/>
	                     	</c:url>
	                     	<a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
	                     	${ p }</a> &nbsp;
	                  	 </c:if>
	                </c:if>
	                  
	               	 <c:if test="${ !empty sc }">	
	                     <c:if test="${ p ne pi.currentPage }">
	                        <c:url var="pagination" value="mBoardsearch.do">
		                        <c:param name="currentPage" value="${ p }"/>
			                    <c:param name="search_key" value="${sc.search_key }"/>
			                    <c:param name="search" value="${sc.search }"/>
	                        </c:url>
	                     	<a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
	                     	${ p }</a> &nbsp;
	                  	 </c:if>
	                </c:if>
	          	</c:forEach>
	               
               	<c:if test="${ empty sc }">
               		<c:if test="${ pi.currentPage eq pi.maxPage }">
						<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
					</c:if>
				
					<c:if test="${ pi.currentPage ne pi.maxPage }">
						<c:url var="after" value="mBoard.do">
		                   	<c:param name="currentPage" value="${pi.currentPage +1 }"/>
	                 	</c:url>
	                 	<a href="${after}">
	              			<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
	              		</a>
	              	</c:if>
               </c:if>
               
               <c:if test="${ !empty sc }">
               		<c:if test="${ pi.currentPage eq pi.maxPage }">
						<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
					</c:if>
					
					<c:if test="${ pi.currentPage ne pi.maxPage }">
						<c:url var="after" value="mBoardsearch.do">
	                     	<c:param name="currentPage" value="${pi.currentPage +1 }"/>
	                     	<c:param name="search_key" value="${sc.search_key }"/>
	           		     	<c:param name="search" value="${sc.search }"/>
                  		</c:url>
                  		<a href="${after}">
               				<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
               			</a>
             		</c:if>
               </c:if>
               
               <c:if test="${empty sc }">
               		<c:if test="${ pi.currentPage eq pi.maxPage }">
               			<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
               		</c:if>
               		
               		<c:if test="${ pi.currentPage ne pi.maxPage }">
	               		<c:url var="end" value="mBoard.do">
	               			<c:param name="currentPage" value="${pi.maxPage }"/>
	               		</c:url>
						<a href="${end }" class="last">
							<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
						</a>
               		</c:if>
               </c:if>
               
               <c:if test="${ !empty sc }">
	               <c:if test="${ pi.currentPage eq pi.maxPage }">
	               		<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
	               </c:if>
	               
	               <c:if test="${ pi.currentPage ne pi.maxPage }">
	               		<c:url var="end" value="mBoardsearch.do">
	               			<c:param name="currentPage" value="${pi.maxPage }"/>
	               			<c:param name="search_key" value="${sc.search_key }"/>
	           		     	<c:param name="search" value="${sc.search }"/>	
	               		</c:url>
						<a href="${end }" class="last">
							<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
						</a>
	               </c:if>
               </c:if>
               </c:if>
			</div>
			
			
			
			<!-- 리뷰 부분 -->
			<div class="products_reviews_form__title" style="float:left;font-size:12px;">
	      		<strong>REVIEW</strong>
	      		<span class="divider"> | </span>
	      		<span class="weak">내가 작성한 리뷰</span>
   		    </div>
   		    <br>
			<div class="widget_reviews__body">
      			<div class="top_menu">
  					<ul class="top_menu__ul top_menu__ul--lpane">
    					<li class="top_menu__li top_menu__li--message" style = "padding: 10px 20px;">
      						<div class="top_menu__message_inner">
        						${ReviewCount }개의 리뷰를 작성하셨습니다.
     						</div>
    					</li>
					</ul>
  
  					<ul class="top_menu__ul top_menu__ul--rpane">
    					<li class="top_menu__li top_menu__li--sort_container">
      						<select name="sort" id="sort" style="height: 51px; border-style: none; width: 100%; font-size:13px;">
							     <option value="20">최신순</option>
								 <option value="10">추천순</option>
								 <option value="60">댓글 최신순</option>
	  						</select>
    					</li>
    
    					<li class="top_menu__li top_menu__search_container">
    					
		 					<form class="js-menu-search" action="mSearchReview.do" method="get">
						  		<button type="submit" style="margin: 15px 0px 15px 8px;">
									<i class="fa fa-search"></i>
								</button>
	   							<input type="text" name="reviewSearch" id="query" placeholder="검색어 입력" class="top_menu__query js-top-menu-query" 
	   							style="float: right; margin: 5px 0; height: 40px; width: 80%; border: none;">
		 					</form>
		 					
						</li>
  					</ul>
				</div>

     			<div class="page">
          			<div class="reviews">아직 작성한 리뷰가 없습니다.</div>
      			</div>
      			
				<div id="modal" style="overflow-y: hidden; display: none;">
					<div id="modalcontent" style="width:100%;height:100%;margin-left:18.5%;margin-top:80px !important;">
                
      				<!-- 모달창 사진 넘어가는 부분 -->
                		<div id="modalpost">
                    		<div id="modalimg" class="slideshow-container" style="position:relative;top:-20px;">
                        
                         		<div style="width:10px;height:10px;position:relative;top:400px;left:5px;">
                         			<a class="prev" onclick="plusSlides(-1);" style="font-size:25px;background:gray;opacity: 0.6;"><strong>❮</strong></a>
                         		</div>
                       			<div style="width:10px;height:10px;position:relative;top:390px;left:780px;">
                        			<a class="next" onclick="plusSlides(1);" style="font-size:25px;background:gray;opacity: 0.6;"><strong>❯</strong></a>
                       			</div>
                        
                        		<div class="mySlides" style="display: block;">
                            		<div class="numbertext"><font style="font-size:14px;">1 / 2</font></div>
                            		<img class="contentimgs" src="/ot/resources/images/oT/review/review_sample1.jpg" alt="sample1" style="margin-top:-5%;">
                        		</div>
                        
                        		<div class="mySlides" style="display: none;">
                            		<div class="numbertext"><font style="font-size:14px;">2 / 2</font></div>
                           			<img class="contentimgs" src="/ot/resources/images/oT/review/review_sample2.jpg" alt="sample2" style="margin-top:-5%;">
                       			</div>
                        		<div id="dotbox" style="text-align:center">
		                            <span class="dot active" onclick="currentSlide(1);"></span> 
		                            <span class="dot" onclick="currentSlide(2);"></span> 
                        		</div>      
                   			</div>
               			</div>
			   			<button class="close1" onclick="modalclose();" style="position: relative;right: 365px;bottom: 37px;color:ivory;">×</button>
               
	 					<!-- 모달창 시작점 -->
	                    <div id="coments"style="margin-top:-3px;overflow-y:scroll;" >
						<br>
							<div style="position: relative; top: -6%; font-size:14px;margin:0px 0px -20px 0px;" class="reviews_index_gallery_review__review_product js-link-iframe"
								data-url="http://www.black-up.kr/product/detail.html?cate_no=1&amp;product_no=10550">
								<div class="reviews_index_gallery_review__review_product_thumbnail">
									<img class="" id="pImage" width="55" height="55" src="${r.prdtPath }${r.prdtImg}" style="padding-right: 3%; opacity: 1; float: left;">
	
								</div>
								<div class="reviews_index_gallery_review__review_product_info" >
									<div class="reviews_index_gallery_review__product_info_title" id="prDetail" style="padding-top:6px;">
										<!-- MODAL 창에 뜨는 DETAIL 상품명 -->
									</div>
												
									<div class="reviews_index_gallery_review__product_info_feedbacks" style="margin-top: 3px;">
										<i class="fa fa-fw fa-star"></i>	
										<i class="fa fa-fw fa-star"></i>
										<i class="fa fa-fw fa-star"></i>
										<i class="fa fa-fw fa-star"></i>
										<i class="fa fa-fw fa-star"></i>
										<span class="reviews_index_gallery_review__reviews_count" style="color:gray;">
											<small id="memName"></small>
										</span>
									</div>
								</div>
							</div>
							<hr>
							
	                        <div style="color:gray; border:1px solid lightgray; font-size:15px;">
	                          	<small style="margin-left:-44px;">이 리뷰를 
	                          		<strong style="color:black;">
	                          			<span id="likeCount"></span>
	                       			</strong >명이 좋아합니다.
	                  			</small>
	                        </div>
	                        <hr>
	                        
	                        <div style="color:gray; border:2px dotted lightgray; font-size:15px;"> 
	                                          선택한 옵션 
	                        <br> 
		                        <small>color : 
		                        	<strong style="color:black;" id="rColor"></strong>
		                       	</small>
		                       	<br>
		                        <small>size : 
		                        	<strong style="color:black;" id="rSize"></strong>
		                       	</small>	
	                        </div>
	                        <hr>
	                        <div id="innercoment">
	                            <div class="coments" style="font-size:12px;text-align:left;padding:10px;letter-spacing: 1px;" id="rInfo">
	                            <!-- 리뷰내용 -->
	                            </div>
	                            <br>
	                        </div>
	                        
	                        <div style="color:lightgray;font-size:12px;float:right;" id="rDate2"></div>
	                        <div>
	                        <hr>
	                            <div style="margin-top:-4px;">
	                            	<font style="font-size:13px;color:gray;">이  리뷰가</font> &nbsp;
	                            
	                           		<a id="heartClick" style="font-size: 12px; border: none; color:white; width:60px;height:30px;">
	                           			<img src="/ot/resources/images/icons/like-noncheck.png" id="nonHeart"
	                           			style="width: 33px;margin-left: -11px;margin-top: -3px;">   
	                           			<input type="hidden" id="likeCheck" value="">
	                            		<input type="hidden" id="rv_no2" value="">                   
	                           		</a>         
	                            </div>
                        	</div>
                        	<hr>
                        
                        <!-- 댓글 forEach 시작점 -->
	                        <div id="comentarea">
	                        	<div style="margin-bottom: 14px;">
	                            	<input onkeyPress="reviewReply();" type="text" id="rvComment" placeholder="댓글을 작성해주세요 :)" maxlength="80" style="resize:none; /* border-radius: 5px 0px 0px 5px;  */
	                            border: 0.5px solid lightgray; background-color: whitesmoke; padding: 2px; height:40px;width:85%;">
	                            	<button onclick="" id="comentsend" style=" font-size: 15px; 
	                            	background: white; border: 1px solid lightgray; /* border-radius:0px 5px 5px 0px; */ 
	                             	width:50px;height: 40px;position:relative;bottom:2px;">등록</button>
	                            </div>
	                        </div>
                   	 	</div>
                       <!-- 모달창 끝나는 점 -->     
                	</div>
                </div>

				<ul id="review_list" class="reviews_index__reviews reviews" style="margin-top:10px;margin-left:-3%;">
					<!-- 리뷰1줄 시작 -->
									
					<!-- 리뷰1 -->
					<!-- foreach문 시작점 -->
					<c:forEach var="r" items="${rlist }">
					<li class="reviews_index_gallery_review review1" style="width: 15.5%; height: 385px; font-size: 11px; border: 1px solid lightgray; border-radius: 2%; margin-right: -1.2%; margin-left:3%">
  						<input type="hidden" class="rv_no" value="${r.rvNo }">
							<div class="photo_review_thumbnail js-link-fullscreen-popup"
							data-url="/black-up.kr/reviews/180783/photo_review_popup?app=0&amp;iframe=1&amp;iframe_id=crema-reviews-2&amp;parent_url=http%3A%2F%2Fblack-up.kr%2Fboard%2Fproduct%2Flist.html%3Fboard_no%3D4&amp;parent_widget_id=29&amp;widget_env=100">
								
								<div class="photo_review_thumbnail__thumbnail_container">
									<ul>
										<li class="photo_review_thumbnail__review_image_thumbnail">
											<a onclick="review1(this)">
												<img class="js-review-image" alt="그레이 사고 너무 잘 입어서 블랙 롱 버전으로 재구매했" src="//assets6.cre.ma/p/black-up-kr/reviews/00/00/18/07/83/image1/portrait_cb3ba3c75d217685.jpg"
												style="width: 100%; opacity: 1; border-bottom: 2px solid lightgray;">
											</a>
										</li>
									</ul>
									<div class="photo_review_thumbnail__review_info">
										<div class="photo_review_thumbnail__media_count_indicator photo_review_thumbnail__media_count_indicator--total_count_1">
											<div class="photo_review_thumbnail__media_count_indicator_dot"></div>
										</div>
									</div>
								</div>
								<div style="border-radius: 2%; width: 90%; margin-left: 5%;" class="photo_review_thumbnail__review_author_info">
									<div style="margin-top: 2%; border-radius: 2%;" class="photo_review_thumbnail__review_title js-translate-review-message">
										${r.rvInfo }
									</div>
									<br>
									<div style="margin-top: -2%; color: gray;" class="photo_review_thumbnail__date_name_container photo_review_thumbnail__date_name_container--show_created_at">
										<div class="photo_review_thumbnail__author_name" style="float: left;">
										<!-- 작성자 -->
											<strong>${r.memName }</strong>
										</div>

										<div class="photo_review_thumbnail__created_at" style="position: relative; left: 5%;">
											${r.rvDate }
										</div>
										
										<!-- 내가 리뷰 작성한 내용 -->
										<hr>
									</div>
								</div>
							</div>

							<div style="position: relative; top: -6%;" class="reviews_index_gallery_review__review_product js-link-iframe" 
									data-url="http://www.black-up.kr/product/detail.html?cate_no=1&amp;product_no=10550">
								<div class="reviews_index_gallery_review__review_product_thumbnail">
									<img class="" alt="(BLACK UP) 호딘 트레이닝 팬츠" width="55" id="pImage" height="55" 
									src="${r.prdtPath }${r.prdtImg}" style="padding-right: 3%; opacity: 1; float: left;">
								</div>
								<div class="reviews_index_gallery_review__review_product_info">
									<div class="reviews_index_gallery_review__product_info_title">
										<!-- 내가 구매한 상품명 -->
										${r.prdtName }
									</div>
									<div class="reviews_index_gallery_review__product_info_feedbacks">
										<span class="reviews_index_gallery_review__reviews_count" style="color: #c3b798;">리뷰
											<strong style="color: black;">1,841</strong>
										</span> 
										<br>
										<span class="reviews_index_gallery_review__display_score" style="color: #c3b798;">평점
											<strong style="color: black;">4.9</strong>
										</span>
										<i class="fa fa-fw fa-star"></i>
										<i class="fa fa-fw fa-star"></i>
										<i class="fa fa-fw fa-star"></i>
										<i class="fa fa-fw fa-star"></i>
										<i class="fa fa-fw fa-star"></i>
									</div>
								</div>
							</div>
						</li>
					</c:forEach>
				<!-- foreach문 마감줄 -->
				<!-- 리뷰1 끝 -->
				<!-- 리뷰1 -->
				</ul>
		</div>
		
		<!-- 페이징 처리 -->
			<div class="xans-element- xans-myshop xans-myshop-couponlistpaging ec-base-paginate1">
			<c:if test="${ !empty ReviewSearchlist }">
				<c:if test="${empty rs }">
					<c:if test="${pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</c:if>
					<c:if test="${pi.currentPage ne 1 }">
						<c:url var="start" value="mBoard.do">
							<c:param name="currentPage" value="1"/>
						</c:url>
					<a href="${start }" class="first">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</a>
					</c:if>
				</c:if>
				
				<c:if test="${ !empty rs }">
					<c:if test="${pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</c:if>
					<c:if test="${pi.currentPage ne 1 }">
						<c:url var="start" value="mSearchReview.do">
							<c:param name="currentPage" value="1"/>
							<c:param name="search_key" value="${sc.search_key }"/>
	                 		<c:param name="search" value="${sc.search }"/>
						</c:url>
					<a href="${start }" class="first">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</a>
					</c:if>
				</c:if>
				
				<c:if test="${empty rs }">
					<c:if test="${ pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지"> &nbsp;
					</c:if>
					
					<c:if test="${ pi.currentPage ne 1 }">
						<c:url var="before" value="mBoard.do">
	                  		<c:param name="currentPage" value="${pi.currentPage - 1 }"/>
	                    </c:url>
	               	<a href="${before}">
	                  	<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지">
	                </a> &nbsp;
	                </c:if>
				</c:if>
					
				<c:if test="${ !empty rs }">
					<c:if test="${ pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지"> &nbsp;
					</c:if>
					
					<c:if test="${ pi.currentPage ne 1 }">
						<c:url var="before" value="mSearchReview.do">
			                <c:param name="currentPage" value="${pi.currentPage - 1 }"/>
			                <c:param name="search_key" value="${sc.search_key }"/>
			                <c:param name="search" value="${sc.search }"/>
		                </c:url>
	                <a href="${before}">
	                	<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지">
	                </a> &nbsp;
	       			</c:if>
	       		</c:if>
	            
				 
				<c:forEach var="p" begin="${ pi.startPage }" end="${ pi.endPage }">
			   		<c:if test="${ p eq pi.currentPage }">
	                        <font color="red" style="font-size: 13px;font-weight: 900;font-family: 'arial',serif;line-height: 35px;">
	                        <b>${ p }</b> &nbsp;&nbsp;</font>
	                </c:if>
						
				 	<c:if test="${ empty rs }">	
	                     <c:if test="${ p ne pi.currentPage }">
	                        <c:url var="pagination" value="mBoard.do">
	                           <c:param name="currentPage" value="${ p }"/>
	                     	</c:url>
	                     	<a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
	                     	${ p }</a> &nbsp;
	                  	 </c:if>
	                </c:if>
	                  
	               	 <c:if test="${ !empty rs }">	
	                     <c:if test="${ p ne pi.currentPage }">
	                        <c:url var="pagination" value="mSearchReview.do">
		                        <c:param name="currentPage" value="${ p }"/>
			                    <c:param name="search_key" value="${sc.search_key }"/>
			                    <c:param name="search" value="${sc.search }"/>
	                        </c:url>
	                     	<a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
	                     	${ p }</a> &nbsp;
	                  	 </c:if>
	                </c:if>
	          	</c:forEach>
	               
               	<c:if test="${ empty rs }">
               		<c:if test="${ pi.currentPage eq pi.maxPage }">
						<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
					</c:if>
				
					<c:if test="${ pi.currentPage ne pi.maxPage }">
						<c:url var="after" value="mBoard.do">
		                   	<c:param name="currentPage" value="${pi.currentPage +1 }"/>
	                 	</c:url>
	                 	<a href="${after}">
	              			<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
	              		</a>
	              	</c:if>
               </c:if>
               
               <c:if test="${ !empty rs }">
               		<c:if test="${ pi.currentPage eq pi.maxPage }">
						<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
					</c:if>
					
					<c:if test="${ pi.currentPage ne pi.maxPage }">
						<c:url var="after" value="mSearchReview.do">
	                     	<c:param name="currentPage" value="${pi.currentPage +1 }"/>
	                     	<c:param name="search_key" value="${sc.search_key }"/>
	           		     	<c:param name="search" value="${sc.search }"/>
                  		</c:url>
                  		<a href="${after}">
               				<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
               			</a>
             		</c:if>
               </c:if>
               
               <c:if test="${empty rs }">
               		<c:if test="${ pi.currentPage eq pi.maxPage }">
               			<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
               		</c:if>
               		
               		<c:if test="${ pi.currentPage ne pi.maxPage }">
	               		<c:url var="end" value="mBoard.do">
	               			<c:param name="currentPage" value="${pi.maxPage }"/>
	               		</c:url>
						<a href="${end }" class="last">
							<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
						</a>
               		</c:if>
               </c:if>
               
               <c:if test="${ !empty rs }">
	               <c:if test="${ pi.currentPage eq pi.maxPage }">
	               		<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
	               </c:if>
	               
	               <c:if test="${ pi.currentPage ne pi.maxPage }">
	               		<c:url var="end" value="mSearchReview.do">
	               			<c:param name="currentPage" value="${pi.maxPage }"/>
	               			<c:param name="search_key" value="${sc.search_key }"/>
	           		     	<c:param name="search" value="${sc.search }"/>	
	               		</c:url>
						<a href="${end }" class="last">
							<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
						</a>
	               </c:if>
               </c:if>
               </c:if>
			</div>
			<hr class="layout">
		</div>
	<jsp:include page="footer.jsp"/>
	
	
	
	
	<script>
		 function pbSearch() {
			 var search_key = $('#search_key').val();
			 var search = $('#search').val();
			 
			 location.href="mBoardsearch.do?search_key="+search_key+"&search="+search;
		 }
		 
 		 function boardmove(bm){
			 
 			var b_cate_no=$(bm).parents('tr').find('.b_cate_no').val();
 			
 			console.log(b_cate_no);
 			
 			if(b_cate_no == 1){
 				location.href="product_board.do";
 			} else if(b_cate_no == 2) {
 				location.href="delivery_board.do";
 			} else if(b_cate_no == 3) {
 				location.href="delivery_cancel.do";
 			} else if(b_cate_no == 4) {
 				location.href="product_change.do";
 			} else if(b_cate_no == 5) {
 				location.href="bank_insert_board.do";
 			} else if(b_cate_no == 6) {
 				location.href="bad_product_board.do";
 			}
			
		 }
		 
		 function prdtDetail(pd) {
			 var q_no = $(pd).parents('tr').find('.q_no').val();
			 console.log(q_no);
			 
			 location.href="product_board_detailView.do?qna_no="+q_no;
		 }
		 			 
		 function prdtDetail2(pd) {
			 var q_no = $(pd).parents('tr').find('.q_no').val();
			 console.log(q_no);
			 
			 location.href="product_board_detail.do?qna_no="+q_no;
		 }
	</script>
	


</body>
</html>