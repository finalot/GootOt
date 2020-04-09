<%@page import="com.kh.ot.main.vo.Product_opt"%>
<%@page import="com.kh.ot.main.vo.Product"%>
<%@page import="com.kh.ot.main.vo.Product_color"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Product</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="/ot/resources/images/icons/favicon.png"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/fonts/themify/themify-icons.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/fonts/elegant-font/html-css/style.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/vendor/slick/slick.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/vendor/noui/nouislider.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="/ot/resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="/ot/resources/css/main.css">
<!--===============================================================================================-->
</head>
<body class="animsition">

	<!-- Header -->
	<jsp:include page="header.jsp"/>

	<!-- Title Page -->
	<section class="bg-title-page p-t-50 p-b-40 flex-col-c-m" style="background-image: url(/ot/resources/images/heading-pages-02.jpg);">
		<h2 class="l-text2 t-center">
			OT.CLOTHING
		</h2>
		<p class="m-text13 t-center">
			New Arrivals oT. Collection 2020
		</p>
	</section>

<!-- 프로덕트 1부분 경로 설정 -->
					<c:url var="best" value="product1.do">
						<c:param name="product1" value="5"/>
					</c:url>
					<c:url var="clothing" value="product1.do">
						<c:param name="product1" value="1"/>
					</c:url>
					<c:url var="outer" value="product1.do">
						<c:param name="product1" value="2"/>
					</c:url>
					<c:url var="shoes" value="product1.do">
						<c:param name="product1" value="3"/>
					</c:url>
					<c:url var="acc" value="product1.do">
						<c:param name="product1" value="4"/>
					</c:url>
					<c:url var="event" value="product1.do">
						<c:param name="product1" value="6"/>
					</c:url>
					<!-- 프로덕트 1 부분 경로설정 끝 -->
<!-- 프로덕트 2 부분 경로설정  -->
					<c:url var="tnasi" value="product2.do">
						<c:param name="product2" value="11"/>
					</c:url>
					<c:url var="mantoman" value="product2.do">
						<c:param name="product2" value="12"/>
					</c:url>
					<c:url var="hoody" value="product2.do">
						<c:param name="product2" value="13"/>
					</c:url>
					<c:url var="pants" value="product2.do">
						<c:param name="product2" value="14"/>
					</c:url>
					<c:url var="neat" value="product2.do">
						<c:param name="product2" value="15"/>
					</c:url>
					<c:url var="onepieceskirt" value="product2.do">
						<c:param name="product2" value="16"/>
					</c:url>
					<c:url var="shirtblouse" value="product2.do">
						<c:param name="product2" value="17"/>
					</c:url>
					<c:url var="jacket" value="product2.do">
						<c:param name="product2" value="21"/>
					</c:url>
					<c:url var="coatjumper" value="product2.do">
						<c:param name="product2" value="22"/>
					</c:url>
					<c:url var="cardigan" value="product2.do">
						<c:param name="product2" value="23"/>
					</c:url>
					<c:url var="belt" value="product2.do">
						<c:param name="product2" value="41"/>
					</c:url>
					<c:url var="glasses" value="product2.do">
						<c:param name="product2" value="42"/>
					</c:url>
					<c:url var="hat" value="product2.do">
						<c:param name="product2" value="43"/>
					</c:url>
					<c:url var="socks" value="product2.do">
						<c:param name="product2" value="44"/>
					</c:url>
					<c:url var="accessories" value="product2.do">
						<c:param name="product2" value="45"/>
					</c:url>
					<c:url var="etc" value="product2.do">
						<c:param name="product2" value="46"/>
					</c:url>
					<c:url var="new5" value="product2.do">
						<c:param name="product2" value="61"/>
					</c:url>
					<c:url var="sale" value="product2.do">
						<c:param name="product2" value="62"/>
					</c:url>
					
					<c:url var="todaymain" value="todaymain.ad"/> 
					
					
					<!-- 프로덕트 2 부분 경로설정 끝 -->

	<!-- Content page -->
	<section class="bgwhite p-t-55 p-b-65">
		<div class="container">
			<div class="row">
				<div class="col-sm-6 col-md-4 col-lg-3 p-b-50">
					<div class="leftbar p-r-20 p-r-0-sm">
						<!--  -->
						<h4 class="m-text14 p-b-7">
							Categories
						</h4>
						<ul class="p-b-54">
					 <c:forEach var="dc" items="${ dclist }"> 
						
						
<c:if test="${ dc.downNo eq 1 && dc.upNo eq 1 }"> 
							<li class="p-t-4">
								<a href="${tnasi }" class="s-text13 active1">
									<small>티셔츠/나시</small>
								</a>
							</li>
</c:if>
<c:if test="${ dc.downNo eq 2 && dc.upNo eq 1 }"> 
							<li class="p-t-4">
								<a href="${mantoman }" class="s-text13">
									<small>맨투맨</small>
								</a>
							</li>
</c:if>
<c:if test="${ dc.downNo eq 3 && dc.upNo eq 1 }"> 
							<li class="p-t-4">
								<a href="${hoody }" class="s-text13">
									<small>후디</small>
								</a>
							</li>
</c:if>
<c:if test="${ dc.downNo eq 4 && dc.upNo eq 1 }"> 
							<li class="p-t-4">
								<a href="${pants }" class="s-text13">
									<small>바지</small>
								</a>
							</li>
</c:if>
<c:if test="${ dc.downNo eq 5 && dc.upNo eq 1 }"> 
							<li class="p-t-4">
								<a href="${neat }" class="s-text13">
									<small>니트</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 6 && dc.upNo eq 1 }"> 
							<li class="p-t-4">
								<a href="${onepieceskirt }" class="s-text13">
									<small>원피스/스커트</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 7 && dc.upNo eq 1 }"> 
							<li class="p-t-4">
								<a href="${shirtblouse }" class="s-text13">
									<small>셔츠/블라우스</small>
								</a>
							</li>
							</c:if>							
							
							
<c:if test="${ dc.downNo eq 1 && dc.upNo eq 2 }"> 
							<li class="p-t-4">
								<a href="${jacket }" class="s-text13">
									<small>자켓</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 2 && dc.upNo eq 2 }"> 
							<li class="p-t-4">
								<a href="${coatjumper }" class="s-text13">
									<small>코트/점퍼</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 3 && dc.upNo eq 2 }"> 
							<li class="p-t-4">
								<a href="${cardigan }" class="s-text13">
									<small>가디건</small>
								</a>
							</li>
							</c:if>							
<c:if test="${ dc.downNo eq 1 && dc.upNo eq 3 }"> 
							<li class="p-t-4">
								<a href="${shoes }" class="s-text13">
									<small>신발</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 1 && dc.upNo eq 4 }"> 
							<li class="p-t-4">
								<a href="${belt }" class="s-text13">
									<small>벨트</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 2 && dc.upNo eq 4 }"> 
							<li class="p-t-4">
								<a href="${glasses }" class="s-text13">
									<small>안경</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 3 && dc.upNo eq 4 }"> 
							<li class="p-t-4">
								<a href="${hat }" class="s-text13">
									<small>모자</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 4 && dc.upNo eq 4 }"> 
							<li class="p-t-4">
								<a href="${socks }" class="s-text13">
									<small>양말</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 5 && dc.upNo eq 4 }"> 
							<li class="p-t-4">
								<a href="${accessories }" class="s-text13">
									<small>악세사리</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 6 && dc.upNo eq 4 }"> 
							<li class="p-t-4">
								<a href="${etc }" class="s-text13">
									<small>기타</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 1 && dc.upNo eq 5 }"> 
							<li class="p-t-4">
								<a href="${best }" class="s-text13">
									<small>best20</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 1 && dc.upNo eq 6 }"> 
							<li class="p-t-4">
								<a href="${new5 }" class="s-text13">
									<small>new5%</small>
								</a>
							</li>
							</c:if>
<c:if test="${ dc.downNo eq 2 && dc.upNo eq 6 }"> 
							<li class="p-t-4">
								<a href="${sale }" class="s-text13">
									<small>sale</small>
								</a>
							</li>
							</c:if>
							
	</c:forEach> 
						</ul>
						<!--  -->
						<h4 class="m-text14 p-b-32">
							Filters
						</h4>

						<div class="filter-price p-t-22 p-b-50 bo3">
							<div class="m-text15 p-b-17">
								<small>price</small>
							</div>

							<div class="wra-filter-bar">
								<div id="filter-bar"></div>
							</div>

							<div class="flex-sb-m flex-w p-t-16">
								<div class="w-size11">
									<!-- Button -->
									<button class="flex-c-m size4 bg7 bo-rad-15 hov1 s-text14 trans-0-4">
										ON
									</button>
								</div>

								<div class="s-text3 p-t-10 p-b-10">
									<small>가격 구간: <span id="value-lower">650</span>￦ - <span id="value-upper">980</span>￦</small>
								</div>
							</div>
						</div>

						<div class="filter-color p-t-22 p-b-50 bo3">
							<div class="m-text15 p-b-12">
								Color
							</div>

							<ul class="flex-w" id="color">
							  <c:forEach var="pp" items="${ plist }"> 
								<c:forEach var="poo" items="${ polist }">
								
									 <c:if test="${ pp.prdtNo eq poo.prdtNo }"> 
									
										
										
										<c:forEach var="pcc" items="${ pclist }">
											<c:if test="${ poo.optColor eq pcc.pcName }">
								<script>
											var test = ${ pclist};
											console.log(test);
											var mySet = new Set();
											
											
								<li class="color-choice" id="${pcc.pcRgb}" style="width:17px;height:17px;display:inline-block;
								border:1px solid black;margin-right:2px;margin-bottom:2px;background:${pcc.pcRgb};"></li>
								</script>
											</c:if>		
										</c:forEach>
									 </c:if> 
								</c:forEach>
							 </c:forEach> 
							 <%-- <% ArrayList<Product> pplist = new ArrayList<Product>(); %>
							 <% ArrayList<Product_color> pclist = new ArrayList<Product_color>(); %>
							 <% ArrayList<Product_opt> polist = new ArrayList<Product_opt>(); %>
							 
							 
							 
							 <li class="color-choice" id="${pcc.pcRgb}" style="width:17px;height:17px;display:inline-block;
								border:1px solid black;margin-right:2px;margin-bottom:2px;background:${pcc.pcRgb};"></li>
							  --%>
							 
							 
							</ul>
						</div>

						<div class="search-product pos-relative bo4 of-hidden">
							<input class="s-text7 size6 p-l-23 p-r-50" type="text" name="search-product" placeholder="Search Products...">

							<button class="flex-c-m size5 ab-r-m color2 color0-hov trans-0-4">
								<i class="fs-12 fa fa-search" aria-hidden="true"></i>
							</button>
						</div>
					</div>
				</div>

				<div class="col-sm-6 col-md-8 col-lg-9 p-b-50">
					<!--  -->
					<div class="flex-sb-m flex-w p-b-35">
						<div class="flex-w">
							<div class="rs2-select2 bo4 of-hidden w-size12 m-t-5 m-b-5 m-r-10"style="background:black;">
								<select class="selection-2" name="sorting"style="background:black;">
									<option style="background:black">-정렬-</option>
									<option>인기 순서</option>
									<option>낮은 가격순</option>
									<option>높은 가격순</option>
								</select>
							</div>

							<div class="rs2-select2 bo4 of-hidden w-size12 m-t-5 m-b-5 m-r-10"style="background:black;">
								<select class="selection-2" name="sorting">
									<option>Price</option>
									<option><font class="format-money">5000</font><small>￦</small> - <font class="format-money">50000</font><small>￦</small></option>
									<option><font class="format-money">50000</font><small>￦</small> - <font class="format-money">100000</font><small>￦</small></option>
									<option><font class="format-money">100000</font><small>￦</small> - <font class="format-money">150000</font><small>￦</small></option>

								</select>
							</div>
						</div>

						<span class="s-text8 p-t-5 p-b-5">
							-티셔츠/나시-
						</span>
					</div>
<c:url var="product_detail" value="product_detail.do">
	<c:param name="product_detail" value="p1" />  
</c:url>



					<!-- Product -->
					<div class="row">
					
					<c:forEach var="p" items="${ plist }">
							<!-- 뉴프로덕트블록 샘플 -->
						<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
							<div class="block2">
								<div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
									<img src="${p.prdtImagePath }${p.prdtImage }" alt="IMG-PRODUCT">

									<div class="block2-overlay trans-0-4">
										<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
											<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
											<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
										</a>

										<div class="block2-btn-addcart w-size1 trans-0-4">
											<!-- Button -->
											<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width:60%;margin-left:20%">
												<small>관심상품 담기</small>
											</button>
										</div>
									</div>
								</div>

								<div class="block2-txt p-t-20">
									<span class="block2-price m-text6 p-r-5" >
								<c:forEach var="po" items="${ polist }">
								
									<c:if test="${ p.prdtNo eq po.prdtNo }">
									
										<c:forEach var="pc" items="${ pclist }">
										
										<c:if test="${ po.optColor eq pc.pcName }">
										<div style="width:17px;height:17px;background:${pc.pcRgb};display:inline-block;border:1px solid black;margin-left:0.5px;"></div>
										</c:if>
										
										</c:forEach>
										
									</c:if>
									
								</c:forEach>
									</span>
										
									<br>
									<a href="${product_detail }" id="${p.prdtNo }"class="block2-name dis-block s-text3 p-b-5"style="font-size:12px">
										${p.prdtName }

									</a>

									<span class="block2-price m-text6 p-r-5">
										<small><font class="format-money">${ p.prdtPrice}</font> won</small>&nbsp;&nbsp;
										<font style="font-size:9px;color:gray">리뷰 : 100</font>
									</span>
								</div>
							</div>
						</div>
						
						</c:forEach>
							<!-- 세일프로덕트블록 샘플 -->
					<!-- <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
							<div class="block2">
								<div class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
									<img src="/ot/resources/images/oT/clothing/t_nasi/numb_lettering_t/numb_lettering_t.webp" alt="IMG-PRODUCT">

									<div class="block2-overlay trans-0-4">
										<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
											<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
											<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
										</a>

										<div class="block2-btn-addcart w-size1 trans-0-4">
											Button
											<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width:60%;margin-left:20%">
												<small>장바구니 담기</small>
											</button>
										</div>
									</div>
								</div>

								<div class="block2-txt p-t-20">
								<span class="block2-price m-text6 p-r-5" >
										<div style="width:17px;height:17px;background:white;float:left;border:1px solid black;"></div>
									</span>
									<br>
									<a href="productDetail.jsp" class="block2-name dis-block s-text3 p-b-5"style="font-size:12px">
										[B-BASIC] 넘브 레터링 티셔츠

									</a>

									<span class="block2-price m-text6 p-r-5">
										<small><font class="format-money">20000</font> won</small>&nbsp;&nbsp;
										<font style="font-size:9px;color:gray">리뷰 : 100</font>
									</span>
								</div>
							</div>
						</div> -->
							<!-- 기본프로덕트블록 샘플 -->
						<!-- <div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
							<div class="block2">
								<div class="block2-img wrap-pic-w of-hidden pos-relative">
									<img src="/ot/resources/images/oT/clothing/t_nasi/standard_round_t/standard_round_t.webp" alt="IMG-PRODUCT">

									<div class="block2-overlay trans-0-4">
										<a href="#" class="block2-btn-addwishlist hov-pointer trans-0-4">
											<i class="icon-wishlist icon_heart_alt" aria-hidden="true"></i>
											<i class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
										</a>

										<div class="block2-btn-addcart w-size1 trans-0-4">
											Button
											<button class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width:60%;margin-left:20%">
												<small>장바구니 담기</small>
											</button>
										</div>
									</div>
								</div>

								<div class="block2-txt p-t-20">
								<span class="block2-price m-text6 p-r-5" >
										<div style="width:17px;height:17px;background:black;float:left;border:1px solid black;"></div>
										<div style="width:17px;height:17px;background:white;margin-left:3px;float:left;border:1px solid black;"></div>
										<div style="width:17px;height:17px;background:gray;margin-left:3px;float:left;border:1px solid black;"></div>
										<div style="width:17px;height:17px;background:navy;margin-left:3px;float:left;border:1px solid black;"></div>
									</span>
									<br>
									<a href="productDetail.jsp" class="block2-name dis-block s-text3 p-b-5"style="font-size:12px">
										[B-BASIC] 베이직 라운드 반팔티

									</a>

									<span class="block2-price m-text6 p-r-5">
										<small><font class="format-money">12000</font> won</small>&nbsp;&nbsp;
										<font style="font-size:9px;color:gray">리뷰 : 100</font>
									</span>
								</div>
							</div>
						</div> -->

				</div>
					<!-- Pagination -->
					<div class="pagination flex-m flex-w p-t-26">
						<a href="#" class="item-pagination flex-c-m trans-0-4 active-pagination">1</a>
						<a href="#" class="item-pagination flex-c-m trans-0-4">2</a>
					</div>
			</div>
		</div>
	</section>


	<!-- Footer -->
	<jsp:include page="footer.jsp"/>



	<!-- Back to top -->
	<div class="btn-back-to-top bg0-hov" id="myBtn">
		<span class="symbol-btn-back-to-top">
			<i class="fa fa-angle-double-up" aria-hidden="true"></i>
		</span>
	</div>

	<!-- Container Selection -->
	<div id="dropDownSelect1"></div>
	<div id="dropDownSelect2"></div>



<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/bootstrap/js/popper.js"></script>
	<script type="text/javascript" src="/ot/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/select2/select2.min.js"></script>
	<script type="text/javascript">
		$(".selection-1").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});

		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect2')
		});
	</script>
<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/daterangepicker/moment.min.js"></script>
	<script type="text/javascript" src="/ot/resources/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/slick/slick.min.js"></script>
	<script type="text/javascript" src="/ot/resources/js/slick-custom.js"></script>
<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/sweetalert/sweetalert.min.js"></script>
	<script type="text/javascript">
		$('.block2-btn-addcart').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
			$(this).on('click', function(){
				swal(nameProduct, "is added to cart !", "success");
			});
		});

		$('.block2-btn-addwishlist').each(function(){
			var nameProduct = $(this).parent().parent().parent().find('.block2-name').html();
			$(this).on('click', function(){
				swal(nameProduct, "is added to wishlist !", "success");
			});
		});
	</script>

<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/noui/nouislider.min.js"></script>
	<script type="text/javascript">
		/*[ No ui ]
	    ===========================================================*/
	    var filterBar = document.getElementById('filter-bar');

	    noUiSlider.create(filterBar, {
	        start: [ 5000, 150000 ],
	        connect: true,
	        range: {
	            'min': 5000,
	            'max': 150000
	        }
	    });

	    var skipValues = [
	    document.getElementById('value-lower'),
	    document.getElementById('value-upper')
	    ];

	    filterBar.noUiSlider.on('update', function( values, handle ) {
	        skipValues[handle].innerHTML = Math.round(values[handle]) ;
	    });
	</script>
<!--===============================================================================================-->
	<script src="js/main.js"></script>

</body>
</html>
