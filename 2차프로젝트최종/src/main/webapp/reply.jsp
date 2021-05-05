<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%
		String qid = request.getParameter("qid");
		String qtype = request.getParameter("qtype");
		String qtitle = request.getParameter("qtitle");
		String qcontents = request.getParameter("qcontents");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Bootstrap core CSS -->
<link href="resources/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" type="text/css">

<!-- Custom fonts for this template -->
<link href="resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link href="resources/vendor/bootstrap/css/bootstrap.css"
	rel="stylesheet" type="text/css">
<link
	href="resources/vendor/fontawesome-free/css/all.min.css/vendor/simple-line-icons/css/simple-line-icons.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic"
	rel="stylesheet" type="text/css">
<link href="resources/css/qinsert.css" rel="stylesheet" type="text/css">

<!-- Custom styles for this template -->
<link href="resources/css/landing-page.min.css" rel="stylesheet"
	type="text/css">
<link href="resources/css/landing-page.css" rel="stylesheet"
	type="text/css">

</head>
<body>
	<!-- Navigation : 맨 위 메뉴바 부분/ 모든 페이지에 공통적으로 들어갈 부분(메뉴바)-->
	<nav class="navbar navbar-light bg-light static-top">
		<div class="logo">
			<a class="navbar-brand" href="main.jsp">내 집은 신촌에 있나방</a>
		</div>
		<div id="menu">
			<!-- 세션처리 -->
			<a class="btn btn-primary btn-lg" href="productSummary2.jsp">방찾기</a>
			<a class="btn btn-primary btn-lg" href="#">마이페이지</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<a class="btn btn-primary btn-lg" href="#">방내놓기</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<a class="btn btn-primary btn-lg" href="qnamain.jsp">고객센터</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<a class="btn btn-primary btn-lg" href="ruser_update.jsp">회원정보수정</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<a class="btn btn-primary btn-lg" href="ruser_delete.jsp">회원탈퇴</a>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
			<a class="btn btn-primary btn-lg" href="ruser_logout.jsp">로그아웃</a>
			<div class="btn btn-primary btn-lg">${userid}님환영합니다.</div>
			<!-- href에 각자 만든 페이지 주소 넣어주기 -->
		</div>
	</nav>
	<!-- navigation 종료 -->

<body class="qna_insert_body">
	<div>
		<div class="qna_insert_page">
			<div class="qna_insert_notice">
				<p>있나방에 궁금하신 점을 문의해주세요</p>
				<p>
					문의내용과 답변은 <a href="qall">'1:1 문의내역'</a>에서 확인하실 수 있습니다.
				</p>
			</div>
		</div>
		<ul class="qna_insert_input">
			<form action="rinsert">
				<li class="qna_insert_category1">
					<div class="qna_insert_typename">문의 유형</div> 
					<select name="qtype" class="qna_insert_typeselect" readonly>
						<option selected><%= qtype %></option>
					</select>
				</li>
				<li class="qna_insert_category2">
					<div class="qna_insert_titlename" readonly>제목</div>
					<input type="text" name="qtitle" class="qna_insert_titleinput" readonly value="<%= qtitle %>">
				</li>
				<li class="qna_insert_category3">
					<div class="qna_insert_contentname">내용</div>
					<textarea class="qna_insert_contentinput" name="qcontents" readonly><%= qcontents %></textarea>
				</li>
				<li class="qna_insert_category3">
					<div class="qna_insert_contentname">답변</div>
					<textarea class="qna_insert_contentinput" name="reply" placeholder='답변을 입력하세요.' ></textarea>
				</li>
		</ul>
				<footer class="qna_insert_footer">
					<button type="submit" value="답변하기" class="qna_insert_button">답변하기</button>
					<input type="text" name="qid" value="<%= qid %>" style="display:none">
					<!-- 넘어온 qid 데이터를 rinsert로 같이 보내기 -->
				</footer>
			</form>
	</div>
</body>

</html>

