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
   <link rel="stylesheet" href="/ot/resources/css/mypage_basic.css">
   <link rel="stylesheet" href="/ot/resources/css/mypage_list.css">
   <link rel="icon" type="image/png" href="/ot/resources/images/icons/favicon.png"/>
   
<style>
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

 	<div id="container">
 		<div id="memberInf1">
			<div class="xans-myshop-bankbook " style="width: 80%;">
    			<p class="xans-element- xans-myshop xans-myshop-asyncbenefit mypage_top ">
    				<strong>
    					<span><span class="xans-member- var-name">${loginMember.memName }</span></span>
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
    			<h2>ORDER LIST</h2>
			</div>

			<div class="xans-element- xans-myshop xans-myshop-orderhistorytab ec-base-tab tab_style ">
				<ul class="menu">
					<li class="tab_class selected">
						<a href="${mList }">주문내역조회 (<span id="xans_myshop_total_orders">0</span>)</a>
					</li>
			        <li class="tab_class_cs">
			        	<a href="/ot/mypage_list_cancel.jsp">취소/반품/교환 내역 (<span id="xans_myshop_total_orders_cs">0</span>)</a>
					</li>
			        <!-- <li class="tab_class_old displaynone">
			        	<a href="/ot/mypage_list_prev.jsp">이전 주문내역 (<span id="xans_myshop_total_orders_old">0</span>)</a>
		        	</li> -->
    			</ul>
			</div>
			
			<form action="my_orderlist.do" id="my_orderlist" name="my_orderlist">
				<div class="xans-element- xans-myshop xans-myshop-orderhistoryhead ">
					<fieldset class="ec-base-box">
						<legend>검색기간설정</legend>
      					<div class="stateSelect ">
           					<select id="order_status" name="order_status" class="fSelect">
								<option value="all">전체 주문처리상태</option>
								<option value="shipped_before">입금완료</option>
								<option value="shipped_standby">배송준비중</option>
								<option value="shipped_begin">배송중</option>
								<option value="shipped_complate">배송완료</option>
								<option value="order_cancel">취소</option>
								<option value="order_exchange">교환</option>
								<option value="order_return">반품</option>
							</select>       
						</div>
						
				        <span class="period">
				            <a href="#none" class="btnNormal" days="00">
				            <img src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date1.gif" offimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date1.gif" onimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date1_on.gif" alt="오늘"></a>
				            <a href="#none" class="btnNormal" days="07">
				            <img src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date2.gif" offimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date2.gif" onimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date2_on.gif" alt="1주일"></a>
				            <a href="#none" class="btnNormal" days="30">
				            <img src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date3.gif" offimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date3.gif" onimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date3_on.gif" alt="1개월"></a>
				            <a href="#none" class="btnNormal" days="90">
				            <img src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date4.gif" offimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date4.gif" onimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date4_on.gif" alt="3개월"></a>
				            <a href="#none" class="btnNormal" days="180">
				            <img src="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date5.gif" offimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date5.gif" onimage="//img.echosting.cafe24.com/skin/base_ko_KR/myshop/btn_date5_on.gif" alt="6개월"></a>
				        </span>
				        
        				<input id="history_start_date" name="history_start_date" class="fText hasDatepicker" readonly="readonly" size="10" value="2019-12-15" type="text"><button type="button" class="ui-datepicker-trigger"><img src="//img.echosting.cafe24.com/skin/admin_ko_KR/myshop/ico_cal.gif" alt="..." title="..."></button> ~ 
        				<input id="history_end_date" name="history_end_date" class="fText hasDatepicker" readonly="readonly" size="10" value="2020-03-14" type="text"><button type="button" class="ui-datepicker-trigger"><img src="//img.echosting.cafe24.com/skin/admin_ko_KR/myshop/ico_cal.gif" alt="..." title="..."></button>        
        				<input alt="조회" id="order_search_btn" type="image" src="//img.echosting.cafe24.com/skin/admin_ko_KR/myshop/btn_search.gif">    
       				</fieldset>
       				
					<ul>
						<li>기본적으로 최근 3개월간의 자료가 조회되며, 기간 검색시 지난 주문내역을 조회하실 수 있습니다.</li>
						<li>주문번호를 클릭하시면 해당 주문에 대한 상세내역을 확인하실 수 있습니다.</li>
	   			    </ul>
				</div>
				
				<input id="mode" name="mode" value="" type="hidden">
				<input id="term" name="term" value="" type="hidden">
			</form>
			
			<div class="xans-element- xans-myshop xans-myshop-orderhistorylistitem ec-base-table typeList">
				<!--
	       			 $login_url = /member/login.html
	    		-->
				<div class="title">
        			<h3 style="margin:0;">주문 상품 정보</h3>
    			</div>
    			
				<table border="1" summary="">
        			<colgroup>
						<col style="width:135px;">
						<col style="width:93px;">
						<col style="width:auto;">
						<col style="width:61px;">
						<col style="width:130px;">
						<col style="width:130px;">
						<col style="width:130px;">
					</colgroup>
					
					<thead>
						<tr>
							<th scope="col" style="line-height:1em">ORDER DATE<br>[ORDER NO]</th>
			                <th scope="col">IMAGE</th>
			                <th scope="col">PRODUCT NAME</th>
			                <th scope="col">QTY</th>
			                <th scope="col">PRICE</th>
			                <th scope="col">ORDER STATE</th>
			                <th scope="col">ORDER CHANGE</th>
            			</tr>
           			</thead>

					<c:url var="product_detail" value="product_detail.do">
						<c:param name="product_detail" value="p1"/>
					</c:url>           			
					
					<c:forEach var="o" items="${list }">
					<tbody class="center ">
						<tr class="xans-record-">
							<td class="number ">
                    			${o.ord_date }                   
                    		<p>
                    			<a href="${product_detail }" class="line">[${o.ord_no }]</a>
                   			</p>
		                    <a href="#none" class="displaynone yg_btn_80 yg_btn3" onclick="OrderHistory.orderCancel('20200314-0004984')" alt="주문취소">주문취소</a>
		                    <a href="cancel.html?order_id=20200314-0004984" class="displaynone button yg_btn_80 yg_btn3" alt="취소신청">취소신청</a>
		                    <a href="exchange.html?order_id=20200314-0004984" class="displaynone button yg_btn_80 yg_btn3" alt="교환신청">교환신청</a>
		                    <a href="return.html?order_id=20200314-0004984" class="displaynone button yg_btn_80 yg_btn3" alt="반품신청">반품신청</a>
               				</td>
               				
			                <td class="thumb"><a href="/product/detail.html?product_no=9017&amp;cate_no=25">
			                	<img src="${o.path }${o.image }" onerror="this.src='//img.echosting.cafe24.com/thumb/img_product_small.gif';" alt=""></a>
		                	</td>
			                <td class="product left top">
                    			<a href="/product/detail.html?product_no=9017&amp;cate_no=25">${o.prdt_name }</a>
                    			<div class="option ">[옵션: ${o.ord_color}]</div>
                   				<p class="gBlank5 displaynone">무이자할부 상품</p>
                			</td>
                			<td>${o.ord_count}</td>
                			<td><fmt:formatNumber value="${o.prdt_sumprice}" pattern="#,###"/>won
                				<div class="displaynone"></div>
							</td>
                			<td class="state">
                   				<p style="font-size:13px;">${o.ord_status}</p>
								<p class="displaynone" style="font-size:13px;">
									<a href="#" target="_self"></a>
								</p>
								<p class="displaynone">
									<a href="#none" class="line" onclick="">[]</a>
								</p>
								<a href="#" class="displaynone yg_btn_80 yg_btn1 crema-new-review-link crema-applied" data-cafe24-product-link="?board_no=4&amp;product_no=9017&amp;order_id=20200314-0004984" alt="구매후기">구매후기</a>
								<a href="#none" class="displaynone" onclick="OrderHistory.withdraw('C','20200314-0004984|9017|000J|3263477','F', 'F') yg_btn_80 yg_btn3" alt="취소철회">취소철회</a>
								<a href="#none" class="displaynone" onclick="OrderHistory.withdraw('E','20200314-0004984|9017|000J|3263477','F', 'F') yg_btn_80 yg_btn3" alt="교환철회">교환철회</a>
								<a href="#none" class="displaynone" onclick="OrderHistory.withdraw('R','20200314-0004984|9017|000J|3263477','F', 'F') yg_btn_80 yg_btn3" alt="반품철회">반품철회</a>
                			</td>
                			<td>
			                    <p class="displaynone"><a href="#none" class="line" onclick="OrderHistory.getDetailInfo('?product_no=9017&amp;cate_no=25&amp;order_id=20200314-0004984&amp;ord_item_code=20200314-0004984-01');">[상세정보]</a></p>
			                    <p class="">-</p>
                			</td>
            			</tr>
					</tbody>
					</c:forEach>
					
					
					
				</table>
				<p class="message displaynone">주문 내역이 없습니다.</p>
			</div>

			<!-- 페이징 처리 -->
			<div class="xans-element- xans-myshop xans-myshop-couponlistpaging ec-base-paginate1">
			
				<c:if test="${empty os }">
					<c:if test="${pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</c:if>
					<c:if test="${pi.currentPage ne 1 }">
						<c:url var="start" value="mList.do">
							<c:param name="currentPage" value="1"/>
						</c:url>
					<a href="${start }" class="first">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</a>
					</c:if>
				</c:if>
				
				<c:if test="${ !empty os }">
					<c:if test="${pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</c:if>
					<c:if test="${pi.currentPage ne 1 }">
						<c:url var="start" value="my_orderlist.do">
							<c:param name="currentPage" value="1"/>
							<c:param name="order_status" value="${param.order_status }"/>
							<c:param name="history_start_date" value="${os.start_date }"/>
	                 		<c:param name="history_end_date" value="${os.end_date }"/>
						</c:url>
					<a href="${start }" class="first">
						<img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">
					</a>
					</c:if>
				</c:if>
				
				<c:if test="${empty os }">
					<c:if test="${ pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지"> &nbsp;
					</c:if>
					
					<c:if test="${ pi.currentPage ne 1 }">
						<c:url var="before" value="mList.do">
	                  		<c:param name="currentPage" value="${pi.currentPage - 1 }"/>
	                    </c:url>
	               	<a href="${before}">
	                  	<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지">
	                </a> &nbsp;
	                </c:if>
				</c:if>
					
				<c:if test="${ !empty os }">
					<c:if test="${ pi.currentPage eq 1 }">
						<img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지"> &nbsp;
					</c:if>
					
					<c:if test="${ pi.currentPage ne 1 }">
						<c:url var="before" value="my_orderlist.do">
			                <c:param name="currentPage" value="${pi.currentPage - 1 }"/>
			                <c:param name="order_status" value="${param.order_status }"/>
							<c:param name="history_start_date" value="${os.start_date }"/>
	                 		<c:param name="history_end_date" value="${os.end_date }"/>
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
						
				 	<c:if test="${ empty os }">	
	                     <c:if test="${ p ne pi.currentPage }">
	                        <c:url var="pagination" value="mList.do">
	                           <c:param name="currentPage" value="${ p }"/>
	                     	</c:url>
	                     	<a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
	                     	${ p }</a> &nbsp;
	                  	 </c:if>
	                </c:if>
	                  
	               	 <c:if test="${ !empty os }">	
	                     <c:if test="${ p ne pi.currentPage }">
	                        <c:url var="pagination" value="my_orderlist.do">
		                        <c:param name="currentPage" value="${ p }"/>
			                    <c:param name="order_status" value="${param.order_status }"/>
							<c:param name="history_start_date" value="${os.start_date }"/>
	                 		<c:param name="history_end_date" value="${os.end_date }"/>
	                        </c:url>
	                     	<a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
	                     	${ p }</a> &nbsp;
	                  	 </c:if>
	                </c:if>
	          	</c:forEach>
	               
               	<c:if test="${ empty os }">
               		<c:if test="${ pi.currentPage eq pi.maxPage }">
						<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
					</c:if>
				
					<c:if test="${ pi.currentPage ne pi.maxPage }">
						<c:url var="after" value="mList.do">
		                   	<c:param name="currentPage" value="${pi.currentPage +1 }"/>
	                 	</c:url>
	                 	<a href="${after}">
	              			<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
	              		</a>
	              	</c:if>
               </c:if>
               
               <c:if test="${ !empty os }">
               		<c:if test="${ pi.currentPage eq pi.maxPage }">
						<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
					</c:if>
					
					<c:if test="${ pi.currentPage ne pi.maxPage }">
						<c:url var="after" value="my_orderlist.do">
	                     	<c:param name="currentPage" value="${pi.currentPage +1 }"/>
	                     	<c:param name="order_status" value="${param.order_status }"/>
							<c:param name="history_start_date" value="${os.start_date }"/>
	                 		<c:param name="history_end_date" value="${os.end_date }"/>
                  		</c:url>
                  		<a href="${after}">
               				<img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
               			</a>
             		</c:if>
               </c:if>
               
               <c:if test="${empty os }">
               		<c:if test="${ pi.currentPage eq pi.maxPage }">
               			<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
               		</c:if>
               		
               		<c:if test="${ pi.currentPage ne pi.maxPage }">
	               		<c:url var="end" value="mList.do">
	               			<c:param name="currentPage" value="${pi.maxPage }"/>
	               		</c:url>
						<a href="${end }" class="last">
							<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
						</a>
               		</c:if>
               </c:if>
               
               <c:if test="${ !empty os }">
	               <c:if test="${ pi.currentPage eq pi.maxPage }">
	               		<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
	               </c:if>
	               
	               <c:if test="${ pi.currentPage ne pi.maxPage }">
	               		<c:url var="end" value="my_orderlist.do">
	               			<c:param name="currentPage" value="${pi.maxPage }"/>
	               			<c:param name="order_status" value="${param.order_status }"/>
							<c:param name="history_start_date" value="${os.start_date }"/>
	                 		<c:param name="history_end_date" value="${os.end_date }"/>
	               		</c:url>
						<a href="${end }" class="last">
							<img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">
						</a>
	               </c:if>
               </c:if>
			</div>
			
			
		</div>
		<hr class="layout">
	</div>
	
 <jsp:include page="footer.jsp"/>
</body>
</html>