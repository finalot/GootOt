<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
  <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <!--===============================================================================================-->
	<link rel="icon" type="image/png" href="/ot/resources/aimages/icon/favicon.png"/>
   
    <!-- Title Page-->
    <title>oT. ADMIN</title>

    <!-- Fontfaces CSS-->
    <link href="/ot/resources/acss/font-face.css" rel="stylesheet" media="all">
    <link href="/ot/resources/avendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="/ot/resources/avendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="/ot/resources/avendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="/ot/resources/avendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">

    <!-- Vendor CSS-->
   <link href="/ot/resources/avendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="/ot/resources/avendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="/ot/resources/avendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="/ot/resources/avendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="/ot/resources/avendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="/ot/resources/avendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="/ot/resources/avendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="/ot/resources/acss/theme.css" rel="stylesheet" media="all">


</head>
<style>
 td{
    padding: 13px 11px 12px !important;
    height: 80px;
    font-weight:normal;
    border:2px solid #d9dadc;
    background: white;
               
}
th{
	padding: 13px 11px 12px !important;
	text-align:center;
	background-color:#f5f4f4;
	   font-weight:normal;
	     border:2px solid #d9dadc;
}

#design-table th{

	    width: 10%;
	    padding-left: 3%;
}

#design-table{

    margin-top: 1%;
    margin-bottom: 3%;
    padding-left: 4%;
    width: 90%;
    margin-left: 5%;
    margin-right: 5%;
    } 
#design-table tr{
	display: felx;
}
.mainbaner{
 margin-left: 3%;
}  
.main-design div{
	margin-bottom: 6%;
	padding-bottom: 2%;
	border-bottom: 1px solid #f3f3f3;
}
.main-text{
	margin-right: 5%;
}  
</style>
<body class="animsition" style="background: rgb(243, 243, 243);">

   
  <jsp:include page="a_header.jsp"/>
 <!-- MENU SIDEBAR-->
 	
        <aside class="menu-sidebar d-none d-lg-block">
            <div class="logo">
                <a href="todayMain.ad">
                    <img src="/ot/resources/aimages/icon/ot.png" alt="OT" style="max-height: 35px;"/>
                </a>
            </div>
            <div class="menu-sidebar__content js-scrollbar1">
                <nav class="navbar-sidebar">
                    <ul class="list-unstyled navbar__list">
                        <li class="has-sub"> 
                            <%-- <!-- active has-sub 파란색 --> --%>
                            <a class="js-arrow" href="#">
                                <i class="fa fa-bar-chart-o"></i>통계</a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                                <li>
                                    <a href="todayMain.ad">당일현황</a>
                                </li>
                                <li>
                                    <a href="todayChart.ad">매출그래프</a>
                                </li>
                                <li>
                                    <a href="best.ad">상품판매순위</a>
                                </li>
                            </ul>
                        </li>
                        
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fa fa-users"></i>회원 </a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                                <li>
                                    <a href="customer.ad">회원 관리</a>
                                </li>
                            </ul>
                        </li>
                        
                         <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fa fa-truck"></i>주문 </a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                                <li>
                                    <a href="order.ad">주문확인 관리</a>
                                </li>
                                <li>
                                	<a href="order_2.ad">배송대기 관리</a>
                                </li>
                                 <li>
                                	<a href="order_3.ad">배송중 관리</a>
                                </li>
                                 <li>
                                	<a href="order_4.ad">배송완료 관리</a>
                                </li>
                                
                            </ul>
                        </li>
                        
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fa fa-shopping-cart"></i>상품관리</a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                            	<li>
                                    <a href="category.ad">카테고리관리</a>
                                </li>
                                <li>
                                    <a href="productAdd.ad">상품등록</a>
                                </li>
                                <li>
                                    <a href="productList.ad">상품관리</a>
                                </li>
                            </ul>
                        </li>
                        
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fa fa-bullhorn"></i>이벤트&nbsp;/&nbsp;쿠폰</a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                                <li>
                                    <a href="eventAdd.ad">이벤트/쿠폰 등록</a>
                                </li>
                                <li>
                                    <a href="eventList.ad">이벤트/쿠폰 관리</a>
                                </li>
                            </ul>
                        </li>
                        
                        
                        <li>
                            <a class="js-arrow" href="productReturn_list.ad">
                        <i class="fa fa-credit-card"></i>교환 &nbsp;/&nbsp;반품</a>
                        </li>
                 		<li class="active has-sub">
                           <a href="DesignEdit.ad">
                               <i class="fa fa-desktop"></i>디자인</a>
                       </li>
                         <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fa fa-question"></i>Q & A</a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                            	<li>
                                    <a href="QnA_Product.ad">상품문의</a>
                                </li>
                                <li>
                                    <a href="QnA_delivery_cancel.ad">배송전 문의</a>
                                </li>
                                <li>
                                    <a href="productReturn.ad">배송후 문의</a>
                                </li>
                                 <li>
                                    <a href="QnA_bank_insert.ad">입금확인/입급자 변경 문의</a>
                                </li>
                                 <li>
                                    <a href="QnA_bad_product.ad">상품불량 및 오배송 문의</a>
                                </li>
                            </ul>
	                       </li>
	                    <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fa fa-pencil-square-o"></i>리뷰</a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                            	<li>
                                    <a href="review_list.ad">리뷰관리</a>
                                </li>
                                <li>
                                    <a href="review_report_list.ad">신고된 리뷰관리</a>
                                </li>
                                
                            </ul>
	                  	</li>
                    </ul>
                </nav>
            </div>
        </aside>
        <!-- END MENU SIDEBAR-->
     
     
     
     <!-- WELCOME-->
     <div style="padding-left:300px;">
    <section class="welcome p-t-10">
        <div class="container" style="margin-left: 3%;">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="title-4"> 
                    <b>
                    &nbsp; &nbsp; &nbsp; 디자인관리
                    </b>
                    </h1>
                    <hr class="line-seprate">
                </div>
            </div>
        </div>
    </section>
    <table id="design-table">
    	<tr>
        	<td colspan="2" style="background:#dfe3e6; margin-bottom: 3%;padding-bottom: 2%;">
        	<h3 style="color: black;margin-left: 3%;"> 디자인 상세정보</h3></td>
        </tr>
        <tr >
        	<th ><span style="color: red">*</span> 메인배너</th>
        	<td class="main-design">
        		<div style="display: flex;margin-top: 3%"><span>FILE 1</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>
				
				<div style="display: flex;"><span>FILE 2</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>    		   
        		
				<div style="display: flex;"><span>FILE 3</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>    		    		    
				<div style="display: flex;"><span>FILE 4</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>    		        		
        		
				<div style="display: flex;"><span>FILE 5</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>    						
				
				<div style="display: flex;"><span>FILE 6</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>    		        	   
        		
        		
				<div style="display: flex;"><span>FILE 7</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>    		        		
				<div style="display: flex;"><span>FILE 8</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>    		    		    
        		
        		
				<div style="display: flex;"><span>FILE 9</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>    						
				
				<div style="display: flex;"><span>FILE 10</span><input class="mainbaner" type="file">
        		<span>메인배너 문구</span><input style="margin-left:2%;border: 1px solid #333330" class="main-text" type="text">
        		<span>바로가기 링크</span><input style="margin-left:2%;border: 1px solid #333330" class="main-link" type="text">
        		</div>    		        	
        		</td>
        	</tr>
        	<tr>
        		<th><span style="color: red">*</span>
        		메인 영상</th>
        	
        		<td>
        			<div style="display: flex"> FILE <input style="margin-left:2%;" type="file" class="main-video" ></div>
        			</td>
        		
        	</tr>
        	<tr>
        		<th><span style="color: red">*</span>인스타 정보</th>
        		<td class="main-design">
        			<div style="display: flex;margin-top: 3%">
        			FILE 1<input style="margin-left:2%;margin-right: 3%" type="file" class="insta-img">
        			링크 <input style="margin-left:2%; border: 1px solid #333330;" type="text" class="insta-link">	   	
        			</div>
        			<div style="display: flex">
        			FILE 2<input style="margin-left:2%;margin-right: 3%" type="file" class="insta-img">
        			링크 <input style="margin-left:2%; border: 1px solid #333330;" type="text" class="insta-link">	   	
        			</div>
        			<div style="display: flex">
        			FILE 3<input style="margin-left:2%;margin-right: 3%" type="file" class="insta-img">
        			링크 <input style="margin-left:2%; border: 1px solid #333330;" type="text" class="insta-link">	   	
        			</div>
        			<div style="display: flex">
        			FILE 4<input style="margin-left:2%;margin-right: 3%" type="file" class="insta-img">
        			링크 <input style="margin-left:2%; border: 1px solid #333330;" type="text" class="insta-link">	   	
        			</div>
        			<div style="display: flex">
        			FILE 5<input style="margin-left:2%;margin-right: 3%" type="file" class="insta-img">
        			링크 <input style="margin-left:2%; border: 1px solid #333330;" type="text" class="insta-link">	   	
        			</div>
        		</td>
        	
        	</tr>
    </table>
    <div align="center">
    <button style="width: 90px; height: 30px;border-radius: 10px; background: black;color: white;margin-bottom: 30px"> 배너등록 </button>
    </div>   
   		
    
    	
    
    
    
    
    </div>
     <div class="page-wrapper">
    </div>

    <script>
        $('#coupon_open').click(function(){
               $('#coupon_div').css('display','block'); 
        });
        $('#coupon_close').click(function(){
            $('#coupon_div').css('display','none');
        });
        $('#coupon_input').click(function(){
            if($('#coupon_name').val() && $('#coupon_price').val() != ""){
                var coupon_name = $('#coupon_name').val();

                $('#d_coupon').append("<option value="+coupon_name+">"+coupon_name
                                        +"</option>");
                alert('쿠폰등록 완료');
                $('#coupon_div').css('display','none');
                    document.getElementById('#coupon_name').value = "";
                    document.getElementById('#coupon_price').value = "";
            }else{
                
                alert('쿠폰명 또는 쿠폰가격을 입력해 주세요')
            }


        });
    </script>


    <script>
       
        $('.category').click(function(){

        var product = document.getElementById('product');
        var money = document.getElementById('money');
        var coupon = document.getElementById('coupon');
          
        if(product.checked == true){
            $('#d_product').removeAttr('readonly').css('background','white').focus();
        }else if(product.checked == false){
            $('#d_product').css('background','rgba(190, 181, 181, 0.24)').attr("readonly",true).val('');
        }
        if(money.checked == true){
            $('#d_money').removeAttr('readonly').css('background','white').focus();
        }else if(money.checked == false){
            $('#d_money').css('background','rgba(190, 181, 181, 0.24)').attr("readonly",true).val('');
        }
        if(coupon.checked ==true){
            $('#d_coupon').removeAttr('disabled').css('background','white').focus();
        }else{
            $('#d_coupon').css('background','rgba(190, 181, 181, 0.24)').attr("disabled",true).val('');

        }
    });
    </script>
    <script>
        $('.d-day').click(function(){
            var day = parseInt($('input[name="d-day"]:checked').val());

            var startday = document.getElementById('startday').value;
                 startday = startday.split("-");
           var end = new Date((startday[0]),(startday[1]-1),(parseInt(startday[2])+day));
           
           var endday = end.toISOString().substr(0,10);
           
         $('#endday').val(endday);   
            
        });
        $('#d_coupon').click(function(){
        	
	     if($('#d_coupon').val()=='daily'){
    		 $('#coupon-price').html('쿠폰가 : 3,000원');
    	}else{
    		 $('#coupon-price').html('');
    	}
	
        });

    </script>

    <script type="text/javascript">
        function readURL(input) {
        if (input.files && input.files[0]) {
        var reader = new FileReader();
        reader.onload = function (e) {
        $('#blah').attr('src', e.target.result);
        }
        reader.readAsDataURL(input.files[0]);
        }
        }
        </script>
    


     <!-- Jquery JS-->
     <script src="/ot/resources/avendor/jquery-3.2.1.min.js"></script>
     <!-- Bootstrap JS-->
     <script src="/ot/resources/avendor/bootstrap-4.1/popper.min.js"></script>
     <script src="/ot/resources/avendor/bootstrap-4.1/bootstrap.min.js"></script>
     <!-- Vendor JS       -->
     <script src="/ot/resources/avendor/slick/slick.min.js">
     </script>
     <script src="/ot/resources/avendor/wow/wow.min.js"></script>
     <script src="/ot/resources/avendor/animsition/animsition.min.js"></script>
     <script src="/ot/resources/avendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
     </script>
     <script src="/ot/resources/avendor/counter-up/jquery.waypoints.min.js"></script>
     <script src="/ot/resources/avendor/counter-up/jquery.counterup.min.js">
     </script>
     <script src="/ot/resources/avendor/circle-progress/circle-progress.min.js"></script>
     <script src="/ot/resources/avendor/perfect-scrollbar/perfect-scrollbar.js"></script>
     <script src="/ot/resources/avendor/chartjs/Chart.bundle.min.js"></script>
     <script src="/ot/resources/avendor/select2/select2.min.js">
     </script>
 
     <!-- Main JS-->
     <script src="/ot/resources/ajs/main.js"></script>
</body>
</html>


