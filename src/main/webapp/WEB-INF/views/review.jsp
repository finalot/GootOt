<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" style="overflow-x:hidden;">
<head>
<style type="text/css">
            body{
                font-family: 'Jua', sans-serif;
            }

            #container{
                width: 100%;
                height: 100%;
                text-align: center;
                position: absolute;
                left: 0px;
            }

            #profile{
                width: 850px;
                height: 280px;
                padding: 10px;
                padding-top: 25px;
                border: none;
                display: inline-block;
                margin-bottom: 0px;
            }

            .post{
                width: 260px;
                margin: 7px;
            }


            #show-profile{
                width: 850px;
                height: 280px;
                border-radius: 9px;
                position: absolute;
                background: none;
            }
            
            #profilebackgound{
                width: 850px;
                height: 280px;
                background-color: lightgrey;
                border-radius: 9px;
                display: inline-block;
                position:absolute;
				margin-left: -425px; 
				z-index: -1;
                
                -webkit-box-shadow: 0 5px 10px -6px #222;
                -moz-box-shadow: 0 5px 10px -6px #222;
                box-shadow: 0 5px 10px -6px #222;
            }
            

            #profileimgbox{
                width: 170px;
                height: 165px;
                border-radius: 100%;
                float: left;
                margin-top: 110px;
                margin-left: 60px;  
                text-align: center;
                background-color: white;
                box-shadow: 1px 3px 6px 0px #222;

            }
            #profileimg{
                border-radius: 100%;
                width: 160px;
                height: 155px;
                float: left;
                padding: 5px;
                text-align: center;
                display: inline-block;
            }
            

            .profile{
                font-size: 25px;
                margin: 10px;
                margin-top: 1px;

            }

			#hr1{
			 margin: 0px 0px 5px 0px; 
			 width: 850px;
			 display: inline-block;
			 }

            #settingimg{
                width: 50px;
                height: 50px;
            }

            #profilename{
                width: 300px;
                height: 140px;
                margin-top: 130px;
                border: none;
                border-radius: 6px;
                padding: 5px;
                float: left;
                margin-left: 10px;
                text-align: left;
                padding-left: 10px;
                color: white;
            }

            #name{
                font-size: 50px;
            }

            #memo{
                font-size: 25px;
            }

            #profileright{
                width: 130px;
                height: 280px;
                float: right;
                border-radius: 15px;
                text-align: left;
                font-size: 18px;
                color: white;
                padding: 10px;
               
            }

            #profileSetbtn{
                font-family: 'Jua', sans-serif;
                margin-top: 10px;
                font-size: 15px;
                border: none;
                border-radius: 10px;
                width: 100px;
                height: 28px;
                opacity: 70%;
            }

            #settingbtn{
                font-family: 'Jua', sans-serif;
                font-size: 15px;
                width: 70px;
                height: 27px;
                border: none;
                border-radius: 10px;
                margin-left: 25px;
                opacity: 70%;
            }

            #userprofilshow{
                background-color: whitesmoke;
                border: none;
                width: 300px;
                height: 50px;
                

            }
            #modal{
                display: none;
                position: fixed;
                z-index: 10; 
                left: 0;
                top: 0;
                width: 100%;
                height: 100%;
                overflow: auto;
                background-color: rgb(0,0,0);
                background-color: rgba(0,0,0,0.4);
                text-align: center;
            }

            #modalcontent{
                width: 900px;
                height: 500px;
                font-size: 25px;
                margin-top: 4%;
                display: inline-block;
            }

			.contentimgs{
				width: auto;
                height: 800px;
                float: left;
			 
			}
			
			#dotbox{
				position: absolute;
                background-color: rgba(0,0,0,0.4);
				bottom: 0px;
				left: 200px;
			}

            #modalimg{
            	width:auto;
                height:100%;
                float: left;
            }

            #coments{
                background-color: white;
                width: 400px;
                height: 800px;
                float: left;
                padding: 20px;
                overflow: hidden;
            }
            .coments{
                float: left;
            }

            #innercoment{
                height: 150px;
            }

            #closebtn{
                margin-left: 1050px;
                width: 40px;
                height: 40px;
                background-color: transparent;
                border: 1px solid transparent;
                font-size: 45px;
            }

            #comentarea{
            }

            #comentinput{
                width: 245px;
                height: 25px;
                float: left;
            }
            
             #rvComment{
                width: 245px;
                height: 25px;
                float: left;
            }

            #comentsend{
                height: 25px;
                background-color: lightslategray;
                border: 0px;
                font-size:18px;
            }
            
            

            #setting{
                display: none;
                position: fixed;
                z-index: 10; 
                left: 0;
                top: 0;
                width: 100%;
                height: 100%;
                overflow: auto;
                background-color: rgb(0,0,0);
                background-color: rgba(0,0,0,0.4);
                text-align: center;
            }

            #settinglist{
                height: 490px;
                width: 250px;
                border:none;
                background-color: white;
                border-radius: 15px;
                font-size: 20.5px;
                margin: 120px auto;
                padding-top: 2px;
                display: inline-block;
            }

            #profileModal{
                display: none;
                position: fixed;
                z-index: 10; 
                left: 0;
                top: 0;
                width: 100%;
                height: 100%;
                overflow: auto;
                background-color: rgb(0,0,0);
                background-color: rgba(0,0,0,0.4);
                text-align: center;
            }
            #profileSet{
                height: 530px;
                width: 260px;
                border:none;
                background-color: white;
                border-radius: 15px;
                font-size: 18px;
                margin: 85px auto;
                padding-top: 2px;
                text-align: center;
                display: inline-block;
            }

            #Public_scope{
                height: 320px;
                width: 250px;
                border: none;
                background-color: white;
                border-radius: 15px;
                font-size: 23px;
                margin: 150px auto;
                padding-top: 10px;
                text-align: center;
                display: inline-block;
            }

            #Public_Scope_Modal{
                display: none;
                position: fixed;
                z-index: 10; 
                left: 0;
                top: 0;
                width: 100%;
                height: 100%;
                overflow: auto;
                background-color: rgb(0,0,0);
                background-color: rgba(0,0,0,0.4);
                text-align: center;
            }

            #comentSet{
                height: 320px;
                width: 250px;
                border: none;
                background-color: white;
                border-radius: 15px;
                font-size: 23px;
                margin: 150px auto;
                padding-top: 10px;
                text-align: center;
                display: inline-block;
            }

            #comentSetModal{
                display: none;
                position: fixed;
                z-index: 10; 
                left: 0;
                top: 0;
                width: 100%;
                height: 100%;
                overflow: auto;
                background-color: rgb(0,0,0);
                background-color: rgba(0,0,0,0.4); 
                text-align: center;
            }

            #comenttextarea{
                height: 100px;
                width: 230px;
            }

            #nameSet{
                height: 250px;
                width: 250px;
                border: none;
                background-color: white;
                border-radius: 15px;
                font-size: 23px;
                margin: 150px auto;
                padding-top: 10px;
                text-align: center;
                display: inline-block;
            }

            #nameSetModal{
                display: none;
                position: fixed;
                z-index: 10; 
                left: 0;
                top: 0;
                width: 100%;
                height: 100%;
                overflow: auto;
                background-color: rgb(0,0,0);
                background-color: rgba(0,0,0,0.4); 
                text-align: center;
                /* display: inline-block; */
            }

            #nametextarea{
                height: 25px;
                width: 230px;
            }

            .checkBox{
               border-radius: 100%;
               width: 15px;
               height: 15px; 
            }
            
            #proImgSet{
             	height: 250px;
                width: 250px;
                border: none;
                background-color: white;
                border-radius: 15px;
                font-size: 23px;
                margin: 150px auto;
                padding-top: 10px;
                text-align: center;
                display: inline-block;
            }
            
            #proImgModal{
             display: none;
                position: fixed;
                z-index: 10; 
                left: 0;
                top: 0;
                width: 100%;
                height: 100%;
                overflow: auto;
                background-color: rgb(0,0,0);
                background-color: rgba(0,0,0,0.4); 
                text-align: center;
                /* display: inline-block; */
            }
            
              #proimgarea{
                height: 25px;
                width: 230px;
            }
            
             #proBackSet{
             	height: 250px;
                width: 250px;
                border: none;
                background-color: white;
                border-radius: 15px;
                font-size: 23px;
                margin: 150px auto;
                padding-top: 10px;
                text-align: center;
                display: inline-block;
            }
            
            #proBackModal{
             display: none;
                position: fixed;
                z-index: 10; 
                left: 0;
                top: 0;
                width: 100%;
                height: 100%;
                overflow: auto;
                background-color: rgb(0,0,0);
                background-color: rgba(0,0,0,0.4); 
                text-align: center;
                /* display: inline-block; */
            }
            
              #probackarea{
                height: 25px;
                width: 230px;
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
<title>review</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" href="/ot/resources/images/icons/favicon.png" />
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ot/resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ot/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ot/resources/fonts/themify/themify-icons.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ot/resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ot/resources/fonts/elegant-font/html-css/style.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="/ot/resources/vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ot/resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ot/resources/vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="/ot/resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="/ot/resources/vendor/slick/slick.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="/ot/resources/css/util.css">
<link rel="stylesheet" type="text/css" href="/ot/resources/css/main.css">
<!--===============================================================================================-->
</head>
<body class="animsition">

	<!-- Header -->
	<jsp:include page="header.jsp"/>

	<!-- breadcrumb --><br>
	<section class="bg-title-page p-t-40 p-b-50 flex-col-c-m" style="background-image: /ot/resources/images/heading-pages-01.jpg;">
		<h1 class="l-text2 t-center w3-center w3-animate-bottom">
			Review
		</h1>
	</section>
	<div class="container bgwhite " style="max-width:95%;">
		<div class="flex-w flex-sb" style="width:80%;margin-left:13%;">

				
				<style class="modalcss">
.page {
	transition: opacity 0.3s ease-out;
	font-size: 12px;
}

.modal {
	position: relative;
	top: -10%;
}


.reviews_index__no_data_message {
	display: none;
	text-align: center;
	color: #9e9e9e;
	margin-top: 30px;
	font-weight: bold;
}

.reviews_index--gallery .reviews_index__reviews:after {
	clear: both;
	content: ".";
	display: block;
	font-size: 0;
	height: 0;
	line-height: 0;
	visibility: hidden;
}

.photo_review_thumbnail__author_name {
	margin-right: 75px;
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}

.reviews_index_gallery_review__review_product:after {
	clear: both;
	content: ".";
	display: block;
	font-size: 0;
	height: 0;
	line-height: 0;
	visibility: hidden;
}

.reviews_index_gallery_review {
	cursor: pointer;
	float: left;
	font-family: "나눔고딕", "NanumGothic", "맑은 고딕", "Malgun Gothic", "돋움",
		"Dotum", "굴림", "Helvetica Neue", Helvetica, Arial, sans-serif;
	width: 215px;
	border: 1px solid #e5e5e5;
	padding: 0;
	margin: 0 10px 50px 10px;
	box-shadow: 0 3px 3px #fafafa;
	position: relative;
}

.reviews_index__foot {
	text-align: center;
	padding-top: 25px;
}

.reviews_index_gallery_review__review_product {
	padding: 13px 11px;
	height: 40px !important;
	cursor: pointer;
	*min-height: 0;
}
</style>




					
						<div class="wrap-dropdown-content p-t-15 bo7 p-b-14 modalcss"
							style="width: 98%; height: 100%; margin-top: 60px;margin-left:3.2%;">
							

							<div class="page">

								<img class="." alt="best_review"
									src="/ot/resources/images/oT/common/review.jpg" width="90%"
									height="auto" style="margin-left:1%;">
									
									<br><br>
									<div class="products_reviews_form__title" style="float:left;font-size:12px;">
      <strong>REVIEW</strong><span class="divider">|</span><span class="weak">문의글 혹은 악의적인 비방글은 무통보 삭제된다는 점 유의해주세요^^</span>
      
    </div>
    					<br><br>
									
<style>
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

</style>
									<br>
									
									
						<div id=sortButton>
									<!-- 카테고리 셀렉트 -->
									<select style="margin-bottom:3.2%;background:none;outline: 0;width:80px;">
									<option>카테고리</option>
									<option>Best20</option>
									<option>Clothing</option>
									<option>Outer</option>
									<option>Shoes</option>
									<option>Acc</option>
									<option>Event</option>
									</select>
									<!-- 카테고리 셀렉트 -->
									
									<!-- 검색 -->
									
									<form class="submitSearch" action="#" style="margin-top:-5%;position:relative;left:7%;">
										<input type="text"  name="search"
										 style="border: 1px solid lightgray !important; border-radius: 5px; background: none;"
											placeholder="Search..">
										<button type="submit">
											<i class="fa fa-search"></i>
										</button>
									</form><br>
									<!-- 검색 -->
						<!-- 정렬 부분 버튼 -->
								<!-- Button -->
								<button id="scoreSort" class=" bg4 bo-rad-23 hov1 s-text1 trans-0-4" href="review.jsp"
						style=" width: 7%; height: 20px; font-size: 12px; background:white;color:gray;"><Strong>평점순</Strong> <small>(100)</small></button>
									
									&nbsp;|
									
								<!-- Button -->
								<button id="recommandSort"class="bg4 bo-rad-23 hov1 s-text1 trans-0-4" href="review.jsp"
						style=" width: 4%; height: 20px; font-size: 12px; background:white;color:gray;"><Strong>좋아요순</Strong></button>
									
									&nbsp;|
									
								<!-- Button -->
								<button id="newSort"class=" bg4 bo-rad-23 hov1 s-text1 trans-0-4" href="review.jsp"
						style=" width: 4%; height: 20px; font-size: 12px; background:white;color:gray;"><Strong>최신순</Strong></button>
									
						<!-- 정렬 부분 버튼 -->
						</div>
						
						
						<div class="products_reviews_header__lower"  >
      
  <div class="review_options_search js-review-options-search" >
    	
    <ul class="review_options_search__option_types"style="border:2px solid lightgray;margin-top:17px;margin-left:-40px;color:#c3b798;width:10%; font-size:14px;">
      <br>
        <li class="review_options_search__option_type">
          <a class="review_options_search__option_type_link js-link-review-option-type">
            <div class="review_options_search__option_type_name" title="키"><small><strong>&nbsp;키</strong></small></div><br>
            <div class="review_options_search__option_type_dropdown_button">
              <i class="review_options_search__option_type_icon sprites-icon-drop-down-s"></i>
            </div>
          </a>
          <div class="review_options_search__dropdown_menu js-dialog-iframe-height">
            
              <ul class="review_options_search__values"style="margin-left:30px;">
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="-150" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_0">
                    <label for="review_option_type_3_0">149 cm 이하</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="150-153" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_1">
                    <label for="review_option_type_3_1">150 - 152 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="153-156" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_2">
                    <label for="review_option_type_3_2">153 - 155 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="156-159" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_3">
                    <label for="review_option_type_3_3">156 - 158 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="159-162" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_4">
                    <label for="review_option_type_3_4">159 - 161 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="162-165" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_5">
                    <label for="review_option_type_3_5">162 - 164 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="165-168" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_6">
                    <label for="review_option_type_3_6">165 - 167 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="168-171" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_7">
                    <label for="review_option_type_3_7">168 - 170 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="171-174" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_8">
                    <label for="review_option_type_3_8">171 - 173 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="174-177" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_9">
                    <label for="review_option_type_3_9">174 - 176 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="177-180" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_10">
                    <label for="review_option_type_3_10">177 - 179 cm</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_3" value="180" class="checkbox-review-option-search" style="border:none;" id="review_option_type_3_11">
                    <label for="review_option_type_3_11">180 cm 이상</label>
                  </li>
                
              </ul>
            
          </div>
        </li>
      <br><br>
        <li class="review_options_search__option_type">
          <a class="review_options_search__option_type_link js-link-review-option-type">
            <div class="review_options_search__option_type_name" title="몸무게"><small><strong>&nbsp;몸무게</strong></small></div><br>
            <div class="review_options_search__option_type_dropdown_button">
              <i class="review_options_search__option_type_icon sprites-icon-drop-down-s"></i>
            </div>
          </a>
          <div class="review_options_search__dropdown_menu js-dialog-iframe-height">
            
              <ul class="review_options_search__values"style="margin-left:32px;">
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="-45" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_0">
                    <label for="review_option_type_4_0">44 kg 이하</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="45-48" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_1">
                    <label for="review_option_type_4_1">45 - 47 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="48-51" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_2">
                    <label for="review_option_type_4_2">48 - 50 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="51-54" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_3">
                    <label for="review_option_type_4_3">51 - 53 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="54-57" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_4">
                    <label for="review_option_type_4_4">54 - 56 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="57-60" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_5">
                    <label for="review_option_type_4_5">57 - 59 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="60-63" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_6">
                    <label for="review_option_type_4_6">60 - 62 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="63-66" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_7">
                    <label for="review_option_type_4_7">63 - 65 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="66-69" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_8">
                    <label for="review_option_type_4_8">66 - 68 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="69-72" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_9">
                    <label for="review_option_type_4_9">69 - 71 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="72-75" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_10">
                    <label for="review_option_type_4_10">72 - 74 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="75-78" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_11">
                    <label for="review_option_type_4_11">75 - 77 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="78-81" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_12">
                    <label for="review_option_type_4_12">78 - 80 kg</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_4" value="81" class="checkbox-review-option-search" style="border:none;" id="review_option_type_4_13">
                    <label for="review_option_type_4_13">81 kg 이상</label>
                  </li>
                
              </ul>
            
          </div>
        </li>
      <br><br>
        <li class="review_options_search__option_type">
          <a class="review_options_search__option_type_link js-link-review-option-type">
            <div class="review_options_search__option_type_name" title="평소사이즈-상의"><small><strong>&nbsp;평소사이즈</strong></small></div><br>
            <div class="review_options_search__option_type_dropdown_button">
              <i class="review_options_search__option_type_icon sprites-icon-drop-down-s"></i>
            </div>
          </a>
          <div class="review_options_search__dropdown_menu js-dialog-iframe-height">
            
              <ul class="review_options_search__values"style="margin-left:46px;">
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_5" value="XS" class="checkbox-review-option-search" style="border:none;" id="review_option_type_5_0">
                    <label for="review_option_type_5_0">XS</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_5" value="S" class="checkbox-review-option-search" style="border:none;" id="review_option_type_5_1">
                    <label for="review_option_type_5_1">S</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_5" value="M" class="checkbox-review-option-search" style="border:none;" id="review_option_type_5_2">
                    <label for="review_option_type_5_2">M</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_5" value="L" class="checkbox-review-option-search" style="border:none;" id="review_option_type_5_3">
                    <label for="review_option_type_5_3">L</label>
                  </li>
                
                  <li class="review_options_search__value">
                    <input type="checkbox" name="option_5" value="XL" class="checkbox-review-option-search" style="border:none;" id="review_option_type_5_4">
                    <label for="review_option_type_5_4">XL</label>
                  </li>
                
              </ul>
            
          </div>
        </li>
      <br>
    </ul>
  </div>


    </div>
						
						
						
									<hr style="border:1px solid lightgray;margin-top:2px;">
									<br><br>
									<!-- modal시작!!!!!!!!!!!!!!!!!!!!!!!! -->
									<div id="modal" style="overflow-y:hidden;">
								<div id="modalcontent" style="width:100%;height:100%;margin-left:18.5%;margin-top:80px !important;">
                
               
                
                <div id="modalpost" >
                    <div id="modalimg" class="slideshow-container" style="position:relative;top:-20px;" >
                        
                         <div style="width:10px;height:10px;position:relative;top:400px;left:5px;">
                         <a class="prev" onclick="plusSlides(-1);"style="font-size:25px;background:gray;opacity: 0.6;" ><strong>&#10094;</strong></a>
                         </div>
                        <div style="width:10px;height:10px;position:relative;top:390px;left:780px;">
                        <a class="next" onclick="plusSlides(1);" style="font-size:25px;background:gray;opacity: 0.6;"><strong>&#10095;</strong></a>
                        </div>
                        
                        <div class="mySlides" style="display: block;">
                            <div class="numbertext" ><font style="font-size:14px;">1 / 2</font></div>
                            <img class="contentimgs" src="/ot/resources/images/oT/review/review_sample1.jpg" alt="sample1" style="margin-top:-5%;">
                        </div>
                        
                        <div class="mySlides">
                            <div class="numbertext"><font style="font-size:14px;">2 / 2</font></div>
                            <img class="contentimgs" src="/ot/resources/images/oT/review/review_sample2.jpg" alt="sample2" style="margin-top:-5%;" >
                        </div>
                        
               
                       
                       
                        
                        <div id="dotbox" style="text-align:center">
                            <span class="dot" onclick="currentSlide(1);"></span> 
                            <span class="dot" onclick="currentSlide(2);"></span> 
                           
                        </div>      
                        
                                    
                   </div>
            
               </div>
 <button class="close1" onclick="modalclose();"style="position: relative;right: 365px;bottom: 37px;color:ivory;">&times;</button>
 					<!-- 모달창 시작점 -->
                    <div id="coments"style="margin-top:-3px;overflow-y:scroll;" >
                    
								<br>
								<div style="position: relative; top: -6%; font-size:14px;margin:0px 0px -20px 0px;"
											class="reviews_index_gallery_review__review_product js-link-iframe "
											data-url="http://www.black-up.kr/product/detail.html?cate_no=1&amp;product_no=10550">
											<div
												class="reviews_index_gallery_review__review_product_thumbnail">
												<img class="" id="pImage" width="55"
													height="55"
													src="${r.prdtPath }${r.prdtImg}"
													style="padding-right: 3%; opacity: 1; float: left;">

											</div>
											<div class="reviews_index_gallery_review__review_product_info" >
												<div class="reviews_index_gallery_review__product_info_title" id="prDetail"
												style="padding-top:6px;">
													<!-- MODAL 창에 뜨는 DETAIL 상품명 -->
													
												</div>
											<div class="reviews_index_gallery_review__product_info_feedbacks" style="margin-top: 3px;">
	<i class="fa fa-fw fa-star"></i><i class="fa fa-fw fa-star"></i><i class="fa fa-fw fa-star"></i><i class="fa fa-fw fa-star"></i><i class="fa fa-fw fa-star"></i>
													<span class="reviews_index_gallery_review__reviews_count" style="color:gray;">
													<small id="memName"></small>
													</span>
												</div>
											</div>
										</div>
										<hr>
                        <div style="color:gray; border:1px solid lightgray; font-size:15px;">
                          	<small style="margin-left:-44px;">이 리뷰를 <strong style="color:black;">
                          	<span id="likeCount"></span></strong >명이 좋아합니다.</small>
                        </div><hr>
                         <div style="color:gray; border:2px dotted lightgray; font-size:15px;">
                          	선택한 옵션 <br> <small>color : <strong style="color:black;" id="rColor"></strong></small><br>
                          				<small>size : <strong style="color:black;" id="rSize"></strong></small>	
                        </div><hr>
                        <div id="innercoment">
                            <div class="coments" style="font-size:12px;text-align:left;padding:10px;letter-spacing: 1px;" id="rInfo">
                            <!-- 리뷰내용 -->
                            </div><br>
              
                           
                        </div>
                         <div style="color:lightgray;font-size:12px;float:right;" id="rDate2"></div>
                        <div><hr>
                            <div style="margin-top:-4px;">
                            <font style="font-size:13px;color:gray;">이  리뷰가</font> &nbsp;
                            
                            <a id="heartClick" style="font-size: 12px; border: none; color:white; width:60px;height:30px;">
                            <img src="/ot/resources/images/icons/like-noncheck.png" id="nonHeart"
                            style="width: 33px;margin-left: -11px;margin-top: -3px;">   
                            <input type="hidden" id="likeCheck" value="">
                            <input type="hidden" id="rv_no2" value="">                   
                            </a>         
                            </div>
                        </div><hr>
                        
                        <!-- 댓글 forEach 시작점 -->
                        <div id="comentarea">
                        	<div>
                     
                       
                            <input onkeyPress="reviewReply();" type="text" id="rvComment" placeholder="댓글을 작성해주세요 :)" maxlength="80" style="resize:none; /* border-radius: 5px 0px 0px 5px;  */
                            border: 0.5px solid lightgray; background-color: whitesmoke; padding: 2px; height:40px;width:85%;">
                            <button onclick="" id="comentsend" style=" font-size: 15px;
                             background: white; border: 1px solid lightgray; /* border-radius:0px 5px 5px 0px; */ 
                             width:50px;height: 40px;position:relative;bottom:2px;">등록</button>
                             </div><br>
                             
                              <%--   <c:forEach var="rp" items="${rp.rplist }"> --%>
                                <input type="hidden" id="rv_no3" value=""> 
                             <div style="color:gray; border:1px solid lightgray; /* border-radius:5px; */ font-size:16px;">
                          	<small>
                          	하이하잉ㅇ</small>
                          	<button style="">&times;</button><br>
                          	<button style="float:right;font-size:10px;color:#e65540;margin-top:1px;">&nbsp;&nbsp;신고하기</button>
                          	 <div style="color:lightgray;font-size:11px;float:right;" id="rvDate">
                          	 
                          	 <font>이대*</font>&nbsp;&nbsp;2020-03-31</div>
                          	 
                          	 </div>
                          	 
                       <%--  </c:forEach> --%>
                          	 <br>
                          	 
                        
                        </div>
                        <!-- 댓글 forEach 끝나는점) -->
                    </div>
                       <!-- 모달창 끝나는 점 -->     
                </div>
                </div>
                <!-- modal끝!!!!!!!!!!!!!!!!!!!!!!!! -->
									
								<div class="reviews_index__no_data_message">아직 작성한 리뷰가
									없습니다.</div>
								<ul class="reviews_index__reviews reviews" style="margin-top:10px;margin-left:-3%;">
								
								
									<!-- 리뷰1줄 시작 -->
									
									<!-- 리뷰1 -->
									<!-- foreach문 시작점 -->
									<c:forEach var="r" items="${rlist }">
									<li class="reviews_index_gallery_review review1"
										style="-webkit-box-shadow: 0 4px 6px -6px #222;
  -moz-box-shadow: 0 4px 6px -6px #222;
  box-shadow: 0 4px 6px -6px #222;width: 15.5%; height: 385px; font-size: 11px; border: 2px solid lightgray; border-radius: 2%; margin-right: 1.8%;">
  <input type="hidden" class="rv_no" value="${r.rvNo }">
										<div class="photo_review_thumbnail js-link-fullscreen-popup"
											data-url="/black-up.kr/reviews/180783/photo_review_popup?app=0&amp;iframe=1&amp;iframe_id=crema-reviews-2&amp;parent_url=http%3A%2F%2Fblack-up.kr%2Fboard%2Fproduct%2Flist.html%3Fboard_no%3D4&amp;parent_widget_id=29&amp;widget_env=100">
											<div class="photo_review_thumbnail__thumbnail_container">
												<ul>
													<li class="photo_review_thumbnail__review_image_thumbnail">
														<img class="js-review-image"
														alt="그레이 사고 너무 잘 입어서 블랙 롱 버전으로 재구매했"
														src="//assets6.cre.ma/p/black-up-kr/reviews/00/00/18/07/83/image1/portrait_cb3ba3c75d217685.jpg"
														style="width: 100%; opacity: 1; border-bottom: 2px solid lightgray;">
													</li>
												</ul>
												<div class="photo_review_thumbnail__review_info">
													<div
														class="
            photo_review_thumbnail__media_count_indicator
            photo_review_thumbnail__media_count_indicator--total_count_1
          ">
														<div
															class="photo_review_thumbnail__media_count_indicator_dot"></div>
													</div>
												</div>
											</div>
											<div style="border-radius: 2%; width: 90%; margin-left: 5%;"
												class="photo_review_thumbnail__review_author_info">

												<div style="margin-top: 2%; border-radius: 2%;"
													class="photo_review_thumbnail__review_title js-translate-review-message">

													${r.rvInfo }</div>
												<br>
												<div style="margin-top: -2%; color: gray;"
													class="photo_review_thumbnail__date_name_container photo_review_thumbnail__date_name_container--show_created_at">
													<div class="photo_review_thumbnail__author_name"
														style="float: left;">
														<!-- 작성자 -->
														<strong>${r.memName }</strong>
													</div>

													<div class="photo_review_thumbnail__created_at"
														style="position: relative; left: 5%;">${r.rvDate }</div>
														<!-- 내가 리뷰 작성한 내용 -->
													<hr>
												</div>
											</div>
										</div>

										<div style="position: relative; top: -6%;"
											class="reviews_index_gallery_review__review_product js-link-iframe "
											data-url="http://www.black-up.kr/product/detail.html?cate_no=1&amp;product_no=10550">
											<div
												class="reviews_index_gallery_review__review_product_thumbnail">
												<img class="" alt="(BLACK UP) 호딘 트레이닝 팬츠" width="55" id="pImage"
													height="55"
													src="${r.prdtPath }${r.prdtImg}"
													style="padding-right: 3%; opacity: 1; float: left;">

											</div>
											<div
												class="reviews_index_gallery_review__review_product_info">
												<div
													class="reviews_index_gallery_review__product_info_title">
													<!-- 내가 구매한 상품명 -->
													${r.prdtName }</div>
												<div
													class="reviews_index_gallery_review__product_info_feedbacks">
													<span class="reviews_index_gallery_review__reviews_count"
														style="color: #c3b798;">리뷰<strong
														style="color: black;">1,841</strong></span> <span
														class="reviews_index_gallery_review__display_score"
														style="color: #c3b798;">평점<strong
														style="color: black;">4.9</strong></span>
														<i class="fa fa-fw fa-star"></i><i class="fa fa-fw fa-star"></i><i class="fa fa-fw fa-star"></i><i class="fa fa-fw fa-star"></i><i class="fa fa-fw fa-star"></i>
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
	 
					</div><br><br><br>
					
					<!-- 페이징 처리 할 부분 -->
					<div style="position:relative;left:-46.8%;padding-top:2%;">
					 <div class="xans-element- xans-myshop xans-myshop-orderhistorypaging ec-base-paginate1">
            <!-- <a href="?page=1&amp;history_start_date=2019-12-15&amp;history_end_date=2020-03-14&amp;past_year=2019" class="first"> -->

               <img src="/ot/resources/images/btn_page_first.gif" alt="첫 페이지">


					<c:if test="${empty sc }">
                  <c:url var="before" value="review.do">
                  <c:param name="currentPage" value="${pi.currentPage -1 }"/>
                  </c:url>
                      </c:if>
					<c:if test="${!empty sc }">
                  <c:url var="before" value="pb_search.do">
                  <c:param name="currentPage" value="${pi.currentPage -1 }"/>
                  <c:param name="search_date" value="${sc.search_date }"/>
                  <c:param name="search_key" value="${sc.search_key }"/>
                  <c:param name="search" value="${sc.search }"/>
                  </c:url>
                      </c:if>
                                            
                  <a href="${before}">
                  <img src="/ot/resources/images/btn_page_prev.gif" alt="이전 페이지">
                  </a> &nbsp;
             

               <c:forEach var="p" begin="${ pi.startPage }" end="${ pi.endPage }">
                 
		   <c:if test="${ p eq pi.currentPage }">
                        <font color="red" style="font-size: 13px;font-weight: 900;font-family: 'arial',serif;line-height: 35px;">
                        <b>${ p }</b> &nbsp;&nbsp;</font>
                     </c:if>
					
					 <c:if test="${empty sc }">	
                     <c:if test="${ p ne pi.currentPage }">
                        <c:url var="pagination" value="review.do">
                           <c:param name="currentPage" value="${ p }"/>
                     </c:url>
                     <a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
                     ${ p }</a> &nbsp;
                  </c:if>
                  </c:if>
                  
                  	 <c:if test="${!empty sc }">	
                     <c:if test="${ p ne pi.currentPage }">
                        <c:url var="pagination" value="pb_search.do">
                           <c:param name="currentPage" value="${ p }"/>
                           <c:param name="search_date" value="${sc.search_date }"/>
		                  <c:param name="search_key" value="${sc.search_key }"/>
		                  <c:param name="search" value="${sc.search }"/>
                     </c:url>
                     <a href="${ pagination }" style="font-family: 'arial',serif;line-height: 35px;font-size: 13px;">
                     ${ p }</a> &nbsp;
                  </c:if>
                  </c:if>
                  
                  
               </c:forEach>

				     <c:if test="${empty sc }">	
                    <c:url var="after" value="review.do">
                     <c:param name="currentPage" value="${pi.currentPage +1 }"/>
                    </c:url>
                     </c:if>
                     
                  <c:if test="${!empty sc }">
                  <c:url var="after" value="pb_search.do">
                  <c:param name="currentPage" value="${pi.currentPage +1 }"/>
                  <c:param name="search_date" value="${sc.search_date }"/>
                  <c:param name="search_key" value="${sc.search_key }"/>
                  <c:param name="search" value="${sc.search }"/>
                  </c:url>
                      </c:if>
                  
                  <a href="${after}">
               <img src="/ot/resources/images/btn_page_next.gif" alt="다음 페이지">
               </a>


               <img src="/ot/resources/images/btn_page_last.gif" alt="마지막 페이지">

         </div>
					</div>

				</div>
				
		</div>
	<hr>
		<br><br>
	<style>
/* The Modal (background) */
.modal {
	display: none; /* Hidden by default */
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgb(0, 0, 0); /* Fallback color */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
}

/* Modal Content/Box */
.modal-content {
	background-color: #fefefe;
	padding: 20px;
	border: 1px solid #888;
	width: 100%; /* Could be more or less, depending on screen size */
}
/* The Close Button */
.close1 {
	color: #aaa;
	align: right;
	font-size: 28px;
	font-weight: bold;
}


.close:hover, .close:focus {
	color: black;
	text-decoration: none;
	cursor: pointer;
}
</style>
					<c:url var="bi1" value="product_detail.do">
						<c:param name="bi" value="bi1"/>
					</c:url>
					<c:url var="bi2" value="product_detail.do">
						<c:param name="bi" value="bi2"/>
					</c:url>
					<!-- <c:url var="bi3" value="productDetail.do">
						<c:param name="bi" value="bi3"/>
					</c:url>
					<c:url var="bi4" value="productDetail.do">
						<c:param name="bi" value="bi4"/>
					</c:url>
					<c:url var="bi5" value="productDetail.do">
						<c:param name="bi" value="bi5"/>
					</c:url>
					<c:url var="bi6" value="productDetail.do">
						<c:param name="bi" value="bi6"/>
					</c:url>
					<c:url var="bi7" value="productDetail.do">
						<c:param name="bi" value="bi7"/>
					</c:url>
					<c:url var="bi8" value="productDetail.do">
						<c:param name="bi" value="bi8"/>
					</c:url> -->
									
	<!-- Relate Product -->
	<section class="relateproduct bgwhite p-t-45 p-b-138">
		<div class="container">
			<div class="sec-title p-b-60">
				<h3 class="m-text5 t-center">Best Item</h3>
			</div>

			<!-- Slide2 -->
			<div class="wrap-slick2">
				<div class="slick2">

					<!-- 뉴프로덕트블록 샘플 -->
					<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
						<div class="block2">
							<div
								class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
								<img
									src="/ot/resources/images/oT/clothing/t_nasi/basic_crop_color_nasi/basic_crop_color_nasi.webp"
									alt="IMG-PRODUCT">

								<div class="block2-overlay trans-0-4">
									<a href="#"
										class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
										class="icon-wishlist icon_heart_alt" aria-hidden="true"></i> <i
										class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
									</a>

									<div class="block2-btn-addcart w-size1 trans-0-4">
										<!-- Button -->
										<button
											class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width: 60%; margin-left: 20%">
											<small>관심상품 담기</small>
										</button>
									</div>
								</div>
							</div>

							<div class="block2-txt p-t-20">
								<span class="block2-price m-text6 p-r-5">
									<div
										style="width: 17px; height: 17px; background: black; float: left; border: 1px solid black;"></div>
									<div
										style="width: 17px; height: 17px; background: gray; margin-left: 3px; float: left; border: 1px solid black;"></div>
									<div
										style="width: 17px; height: 17px; background: #39761F; margin-left: 3px; float: left; border: 1px solid black;"></div>
									<div
										style="width: 17px; height: 17px; background: #E4F650; margin-left: 3px; float: left; border: 1px solid black;"></div>
									<div
										style="width: 17px; height: 17px; background: #4A87B9; margin-left: 3px; float: left; border: 1px solid black;"></div>
								</span> <br> <a href="${bi1 }"
									class="block2-name dis-block s-text3 p-b-5"
									style="font-size: 12px"> [B-BASIC] 베이직 크롭 컬러나시 </a> <span
									class="block2-price m-text6 p-r-5"> <small><font
										class="format-money">7000</font> won</small>&nbsp;&nbsp;<font
									style="font-size: 9px; color: gray">리뷰 : 100</font>
								</span>
							</div>
						</div>
					</div>
					<!-- 세일프로덕트블록 샘플 -->
					<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
						<div class="block2">
							<div
								class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
								<img
									src="/ot/resources/images/oT/clothing/t_nasi/numb_lettering_t/numb_lettering_t.webp"
									alt="IMG-PRODUCT">

								<div class="block2-overlay trans-0-4">
									<a href="#"
										class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
										class="icon-wishlist icon_heart_alt" aria-hidden="true"></i> <i
										class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
									</a>

									<div class="block2-btn-addcart w-size1 trans-0-4">
										<!-- Button -->
										<button
											class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width: 60%; margin-left: 20%">
											<small>관심상품 담기</small>
										</button>
									</div>
								</div>
							</div>

							<div class="block2-txt p-t-20">
								<span class="block2-price m-text6 p-r-5">
									<div
										style="width: 17px; height: 17px; background: white; float: left; border: 1px solid black;"></div>
								</span> <br> <a href="${bi2 }"
									class="block2-name dis-block s-text3 p-b-5"
									style="font-size: 12px"> [B-BASIC] 넘브 레터링 티셔츠 </a> <span
									class="block2-price m-text6 p-r-5"> <small><font
										class="format-money">20000</font> won</small>&nbsp;&nbsp;<font
									style="font-size: 9px; color: gray">리뷰 : 100</font>
								</span>
							</div>
						</div>
					</div>
					<div class="col-sm-12 col-md-6 col-lg-4 p-b-50">
						<!-- 기본프로덕트블록 샘플 -->
						<div class="block2">
							<div class="block2-img wrap-pic-w of-hidden pos-relative">
								<img
									src="/ot/resources/images/oT/clothing/t_nasi/standard_round_t/standard_round_t.webp"
									alt="IMG-PRODUCT">

								<div class="block2-overlay trans-0-4">
									<a href="#"
										class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
										class="icon-wishlist icon_heart_alt" aria-hidden="true"></i> <i
										class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
									</a>

									<div class="block2-btn-addcart w-size1 trans-0-4">
										<!-- Button -->
										<button
											class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width: 60%; margin-left: 20%">
											<small>관심상품 담기</small>
										</button>
									</div>
								</div>
							</div>

							<div class="block2-txt p-t-20">
								<span class="block2-price m-text6 p-r-5">
									<div
										style="width: 17px; height: 17px; background: black; float: left; border: 1px solid black;"></div>
									<div
										style="width: 17px; height: 17px; background: white; margin-left: 3px; float: left; border: 1px solid black;"></div>
									<div
										style="width: 17px; height: 17px; background: gray; margin-left: 3px; float: left; border: 1px solid black;"></div>
									<div
										style="width: 17px; height: 17px; background: navy; margin-left: 3px; float: left; border: 1px solid black;"></div>
								</span> <br> <a href="productDetail.jsp"
									class="block2-name dis-block s-text3 p-b-5"
									style="font-size: 12px"> [B-BASIC] 베이직 라운드 반팔티 </a> <span
									class="block2-price m-text6 p-r-5"> <small><font
										class="format-money">12000</font> won</small>&nbsp;&nbsp;<font
									style="font-size: 9px; color: gray">리뷰 : 100</font>
								</span>
							</div>
						</div>
					</div>

					<div class="item-slick2 p-l-15 p-r-15">
						<!-- Block2 -->
						<div class="block2">
							<div
								class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
								<img src="/ot/resources/images/item-07.jpg" alt="IMG-PRODUCT">

								<div class="block2-overlay trans-0-4">
									<a href="#"
										class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
										class="icon-wishlist icon_heart_alt" aria-hidden="true"></i> <i
										class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
									</a>

									<div class="block2-btn-addcart w-size1 trans-0-4">
										<!-- Button -->
										<button
											class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width: 60%; margin-left: 20%">
											<small>관심상품 담기</small>
										</button>
									</div>
								</div>
							</div>

							<div class="block2-txt p-t-20">
								<a href="product-detail.html"
									class="block2-name dis-block s-text3 p-b-5"> Frayed denim
									shorts </a> <span class="block2-oldprice m-text7 p-r-5">
									$29.50 </span> <span class="block2-newprice m-text8 p-r-5">
									$15.90 </span>
							</div>
						</div>
					</div>

					<div class="item-slick2 p-l-15 p-r-15">
						<!-- Block2 -->
						<div class="block2">
							<div
								class="block2-img wrap-pic-w of-hidden pos-relative block2-labelnew">
								<img src="/ot/resources/images/item-02.jpg" alt="IMG-PRODUCT">

								<div class="block2-overlay trans-0-4">
									<a href="#"
										class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
										class="icon-wishlist icon_heart_alt" aria-hidden="true"></i> <i
										class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
									</a>

									<div class="block2-btn-addcart w-size1 trans-0-4">
										<!-- Button -->
										<button
											class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width: 60%; margin-left: 20%">
											<small>관심상품 담기</small>
										</button>
									</div>
								</div>
							</div>

							<div class="block2-txt p-t-20">
								<a href="product-detail.html"
									class="block2-name dis-block s-text3 p-b-5"> Herschel
									supply co 25l </a> <span class="block2-price m-text6 p-r-5">
									$75.00 </span>
							</div>
						</div>
					</div>

					<div class="item-slick2 p-l-15 p-r-15">
						<!-- Block2 -->
						<div class="block2">
							<div class="block2-img wrap-pic-w of-hidden pos-relative">
								<img src="/ot/resources/images/item-03.jpg" alt="IMG-PRODUCT">

								<div class="block2-overlay trans-0-4">
									<a href="#"
										class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
										class="icon-wishlist icon_heart_alt" aria-hidden="true"></i> <i
										class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
									</a>

									<div class="block2-btn-addcart w-size1 trans-0-4">
										<!-- Button -->
										<button
											class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width: 60%; margin-left: 20%">
											<small>관심상품 담기</small>
										</button>
									</div>
								</div>
							</div>

							<div class="block2-txt p-t-20">
								<a href="product-detail.html"
									class="block2-name dis-block s-text3 p-b-5"> Denim jacket
									blue </a> <span class="block2-price m-text6 p-r-5"> $92.50 </span>
							</div>
						</div>
					</div>

					<div class="item-slick2 p-l-15 p-r-15">
						<!-- Block2 -->
						<div class="block2">
							<div class="block2-img wrap-pic-w of-hidden pos-relative">
								<img src="/ot/resources/images/item-05.jpg" alt="IMG-PRODUCT">

								<div class="block2-overlay trans-0-4">
									<a href="#"
										class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
										class="icon-wishlist icon_heart_alt" aria-hidden="true"></i> <i
										class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
									</a>

									<div class="block2-btn-addcart w-size1 trans-0-4">
										<!-- Button -->
										<button
											class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width: 60%; margin-left: 20%">
											<small>관심상품 담기</small>
										</button>
									</div>
								</div>
							</div>

							<div class="block2-txt p-t-20">
								<a href="product-detail.html"
									class="block2-name dis-block s-text3 p-b-5"> Coach slim
									easton black </a> <span class="block2-price m-text6 p-r-5">
									$165.90 </span>
							</div>
						</div>
					</div>

					<div class="item-slick2 p-l-15 p-r-15">
						<!-- Block2 -->
						<div class="block2">
							<div
								class="block2-img wrap-pic-w of-hidden pos-relative block2-labelsale">
								<img src="/ot/resources/images/item-07.jpg" alt="IMG-PRODUCT">

								<div class="block2-overlay trans-0-4">
									<a href="#"
										class="block2-btn-addwishlist hov-pointer trans-0-4"> <i
										class="icon-wishlist icon_heart_alt" aria-hidden="true"></i> <i
										class="icon-wishlist icon_heart dis-none" aria-hidden="true"></i>
									</a>

									<div class="block2-btn-addcart w-size1 trans-0-4">
										<!-- Button -->
										<button
											class="flex-c-m size1 bg4 bo-rad-23 hov1 s-text1 trans-0-4"
											style="width: 60%; margin-left: 20%">
											<small>관심상품 담기</small>
										</button>
									</div>
								</div>
							</div>

							<div class="block2-txt p-t-20">
								<a href="product-detail.html"
									class="block2-name dis-block s-text3 p-b-5"> Frayed denim
									shorts </a> <span class="block2-oldprice m-text7 p-r-5">
									$29.50 </span> <span class="block2-newprice m-text8 p-r-5">
									$15.90 </span>
							</div>
						</div>
					</div>
				</div>
			</div>
</div>
</section>
	


<!-- Footer -->
<jsp:include page="footer.jsp"/>


	

	<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/bootstrap/js/popper.js"></script>
	<script type="text/javascript"
		src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/select2/select2.min.js"></script>
	
	<!--===============================================================================================-->
	<script type="text/javascript" src="/ot/resources/vendor/slick/slick.min.js"></script>
	<script type="text/javascript" src="/ot/resources/js/slick-custom.js"></script>
	<!--===============================================================================================-->
	<script type="text/javascript"
		src="/ot/resources/vendor/sweetalert/sweetalert.min.js"></script>
	<script type="text/javascript">
		$('.block2-btn-addcart').each(
				function() {
					var nameProduct = $(this).parent().parent().parent().find(
							'.block2-name').html();
					$(this).on('click', function() {
						swal(nameProduct, "관심상품에 등록되었습니다 !", "success");
					});
				});

		$('.block2-btn-addwishlist').each(
				function() {
					var nameProduct = $(this).parent().parent().parent().find(
							'.block2-name').html();
					$(this).on('click', function() {
						swal(nameProduct, "Like 되었습니다 !", "success");
					});
				});

		$('.btn-addcart-product-detail').each(function() {
			var nameProduct = $('.product-detail-name').html();
			$(this).on('click', function() {
				swal(nameProduct, "장바구니에 등록되었습니다 !", "success");
			});
		});
	</script>

	<!--===============================================================================================-->
	<script src="/ot/resources/js/main.js"></script>
	
	
	<script>
		$(function() {
			getReplyList();
			
			//setInterval
			setInterval(function() {
				getReplyList();
			},3000);
			
			// 댓글등록
			
			$('#comentsend').on("click", function() {
				var rvComment = $('#rvComment').val();
				var rv_no3 = $('#rv_no3').val();
				
				$.ajax({
					url:"addReply.do",
					data : {rvComment : rvComment, rv_no3 : rv_no3},
					type:"post",
					success:function(data) {
						if(data=="success") {
							getReplyList();
							
							$('#rvComment').val("");
						}
					},error:function() {
						console.log("등록실패");
					}
				})
			});
			
		});
		
		function getReplyList() {
			var rv_no3 = $('#rv_no3').val();
		}
		
	
	</script>
	
	<script>
	$('#heartClick').click(function() {
		 var rv_no = $('#rv_no2').val();
		 var likeCheck = $('#likeCheck').val();
		
		 console.log("rv___no: " + rv_no);
		 var count = 0;
		 
		  $.ajax({
			 url:"reviewLike.do",
			 dataType:"json",
			 data : {rv_no : rv_no, likeCheck : likeCheck},
			 success : function(r) {
				 console.log(r)
				 console.log(r.r.rvLike)
				 $('#likeCheck').val(r.lhl.likeCheck);
				 $('#likeCount').text(r.r.rvLike);
				 if(r.lhl.likeCheck == "N"){
					 $('#nonHeart').attr("src","/ot/resources/images/icons/like-noncheck.png") ;
				 }else{
					 $('#nonHeart').attr("src","/ot/resources/images/icons/like-check.png");
				 }
			 }
		 }) 
		
	})
	
	
	
	</script>
	
	<!--============================================리뷰모달===================================================-->
	<script>
	
	<!--리뷰 모달 디테일 스크립트-->
	$('.review1').on('click',function modalOpen(){
		 var rv_no = $(this).find('.rv_no').val();
		 $("#rv_no2").val(rv_no);
		 var nonHeart = $('#nonHeart').attr("src");
		 var like_img="";
		 var count = 0;
		 console.log(rv_no);
		 
		 
		 $.ajax({
			 url:"reviewDetail.do",
			 dataType:"json",
			 data : {rv_no : rv_no},
			 success : function(r){
				 console.log(r)
				 $('#prDetail').text(r.r.prdtName);
				 $('#memName').text(r.r.memName);
				 $('#rColor').text(r.r.rvColor);
				 $('#rSize').text(r.r.rvSize);
				 $('#rInfo').text(r.r.rvInfo);
				 $('#rDate2').text(r.r.rvDate2);
				 $('#pImage').attr("src",r.r.prdtPath+r.r.prdtImg);
				 $('#likeCheck').val(r.lhl.likeCheck);
				 $('#likeCount').text(r.r.rvLike);
				 console.log(r.r.rvLike)
				 if(r.lhl.likeCheck == "N"){
					 $('#nonHeart').attr("src","/ot/resources/images/icons/like-noncheck.png") ;
				 }else{
					 $('#nonHeart').attr("src","/ot/resources/images/icons/like-check.png");
				 }
				/*  $('#pImage').text(r.r.prdtImage); */
				 console.log(r.r.prdtName);
			 },error : function(){
					alert('리뷰에러')
			}
		 });
		
		
		
        var ulr = $(this).attr("src");
        $("#modalimg").attr("src", ulr);            
        $('#modal').show();

        
    });
	  

      function modalclose(){
          $('#modal').css("display","none");
      }
	
      var slideIndex = 1;


      showSlides(slideIndex);

      function plusSlides(n) {
          showSlides(slideIndex += n);
      }

      function currentSlide(n) {
          showSlides(slideIndex = n);
      }

      function showSlides(n) {
          var i;
          var slides = document.getElementsByClassName("mySlides");
          var dots = document.getElementsByClassName("dot");
          if (n > slides.length) {slideIndex = 1}    
          if (n < 1) {slideIndex = slides.length}
          for (i = 0; i < slides.length; i++) {
              slides[i].style.display = "none";  
          }
          for (i = 0; i < dots.length; i++) {
              dots[i].className = dots[i].className.replace(" active", "");
          }
          slides[slideIndex-1].style.display = "block";  
          dots[slideIndex-1].className += " active";
      }
	</script>
	
</body>
		

</html>
