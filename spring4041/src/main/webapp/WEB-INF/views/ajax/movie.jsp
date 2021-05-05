<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<table border="1">
	<tr>
		<td style="background:yellow; font-size:20px; width: 100px; height:50px;">영화제목</td>
		<td style="background:yellow; font-size:20px; width: 100px; height:50px;">관람료</td>
	</tr>
	<tr>
		<td style="background:pink; font-size:20px; width: 100px; height:50px;">${vo.title}</td>
		<td style="background:pink; font-size:20px; width: 100px; height:50px;">${vo.price}원</td>
	</tr>
	<tr>
		<td colspan="2">
			<a href="ajax3.jsp">문자인증받기</a>
		</td>
	</tr>
</table>