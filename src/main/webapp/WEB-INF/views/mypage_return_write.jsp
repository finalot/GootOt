<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="Content-Style-Type" content="text/css">
<title>반품문의</title>
<script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
<link rel="stylesheet" href="/ot/resources/css/mypage_list.css">
<link rel="stylesheet" href="/ot/resources/css/mypage_basic.css">
<link rel="icon" type="image/png" href="/ot/resources/images/icons/favicon.png"/>
</head>
<style>
.ec-base-table td{
  border-top: 1px solid #EEE !important;
  font-size:13px;
}
.ec-base-table.typeList .center td.left {
    padding-left: 3px;
    text-align: left !important;
 }
 .xans-board .ec-base-table tbody th {
    padding: 15px 10px 14px 18px;
    border-right: 0;
    border-left: 0;
    background: 0;
    font-weight: 400;
    color: #666;
     border-top: 1px solid #EEE !important;
    font-size: 13px;
  
    }
    
.ec-base-table.typeWrite td {
    padding: 0px 0px 0px !important;
}

 
.thumb{
 text-align: left !important;
	padding-left: 1% !important;
}
.ec-base-table.typeWrite{
	border: none;
}

</style>
<body>
	<%@include file="header.jsp" %>	
 	
	
    <div id="container">
        <div id="contents" style="margin-top:11.5%;">
			<div class="mypage_top_outer">
			 
			</div>

			<div class="titleArea">
    			<h2>반품 문의</h2>
			</div>

			<div class="xans-element- xans-layout xans-layout-logincheck ">
		
			</div>
			
			<div class="xans-element- xans-board xans-board-writepackage-1002 xans-board-writepackage xans-board-1002 "><div class="xans-element- xans-board xans-board-title-1002 xans-board-title xans-board-1002 "><div class="title">
      
        </div>
</div>
<form id="boardWriteForm" action="ReturnInsert.do"  >
	<div class="xans-element- xans-board xans-board-write-1002 xans-board-write xans-board-1002">
		<!--
            $login_page_url = /member/login.html
            $deny_access_url = /index.html
        -->
	<div class="ec-base-table typeWrite ">
            <table border="1" summary="">
		<caption>글쓰기 폼</caption>
            <colgroup>
				<col style="width:150px;">
				<col style="width:auto;">
			</colgroup>
		<tbody>
		<tr>
		<th scope="row">주문번호</th>
           <td><input type="text" name="ordCode" value="${ordNo} " style="width: 390px;height: 26px;" readonly>
		   </td>
    </tr>
    <tr>
		<th scope="row">문의 고객명</th>
           <td><input type="text" name="reName" value="${loginMember.memName }" style="width: 390px;height: 26px;" readonly>
		   </td>
    </tr>
     <tr>
		 <th scope="row">반품사유</th>
           <td><input type="text" name="reReason" style="width: 390px;height: 26px;">
		   </td>
    </tr>
    <tr>
		<th scope="row">TITLE</th>
           <td><input type="text" name="reTitle" style="width: 390px;height: 26px;">
		   </td>
    </tr>
    <tr>
		<th scope="row">SUBJECT</th>
           <td><select id="subject" name="b_cate_no">
			<option value="1">[반품문의]</option>
			</select>  	
		   </td>
    </tr>
	<tr>    
	<td colspan="2" class="clear">           
            <script type="text/javascript" src="//editor.cafe24.com/js/nneditor.js?c=ko"></script>
            <style type="text/css">@import "http://editor.cafe24.com/css/style.css?ver=r3.4.0.20191127.1";@import "http://editor.cafe24.com/css/styleie8.css?ver=r3.4.0.20191127.1";</style>
           <script type="text/javascript" src="http://editor.cafe24.com/lang/ko.js?version=r3.4.0.20191127.1" charset="UTF-8"></script>
           <script type="text/javascript" src="http://editor.cafe24.com/js/nneditorUtils.dev.js?version=r3.4.0.20191127.1" charset="UTF-8"></script>
           <script type="text/javascript" src="http://editor.cafe24.com/js/nneditorRange.dev.js?version=r3.4.0.20191127.1" charset="UTF-8"></script>
           <script type="text/javascript" src="http://editor.cafe24.com/js/nneditorCore.dev.js?version=r3.4.0.20191127.1" charset="UTF-8"></script>
            <script type="text/javascript">
            NN.Config.instanceID = "content";
            NN.Config.value = "";
            NN.Config.toolbarType = "simple";
                
                
                

                //Editor Height
                NN.Config.height=400;

                var oNN_content = new NNEditor();
                oNN_content.build();

                if (typeof $Editor != "object") {
                    $Editor = {
                        _obj : {},

                        push : function(obj, id) {
                            this._obj[id] = obj;
                        },

                        get : function(id) {
                            return this._obj[id];
                        },

                        reset : function(id) {
                            this._obj[id].getText().value = "";
                            this._obj[id].getIFDoc().body.innerHTML = this._obj[id].Config.START_HTML;
                        },

                        contents : function(id, context) {
                            this._obj[id].getText().value = context;
                            this._obj[id].getIFDoc().body.innerHTML = this._obj[id].view.parsing(2);
                        }
                    };
                }

                $Editor.push(oNN_content, "content");
                
                
            </script>	
            	
		
	</tbody>
	</table>
</div>
		<div class="ec-base-button ">
            <span class="gLeft">
                <span class="displaynone"><a href="#none" onclick="" class="yg_btn_30 yg_btn4" alt="관리자답변보기">관리자답변보기</a></span>
                <a href="product_board.do" class="yg_btn_30 yg_btn4" alt="목록">LIST</a>
            </span>
            <span class="gRight">
                <button  id="insert_ok" class="yg_btn_30 yg_btn4" alt="등록">OK</button>
                
                <a href="product_board.do" class="yg_btn_30 yg_btn4" alt="취소">CANCEL</a>
            </span>
        </div>
	</div>
	<input tyep="hidden" name="prdtCode" value="">
	</form>
</div>

	</div>
	
 <%@include file="footer.jsp" %>
</body>
<script>

$('#insert_ok').click(function(){
	$('#boardWriteForm').submit();
});

</script>


</html>