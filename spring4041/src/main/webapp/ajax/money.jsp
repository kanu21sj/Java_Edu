<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
	String money = request.getParameter("money");
	String choice = request.getParameter("choice");
	double money2 = Double.parseDouble(money);
	
	if(choice.equals("1")){
		money2 = (int)(money2 * 0.8);
	} else if(choice.equals("2")) {
		money2 = (int)(money2 * 0.9);		
	}
%>지불 금액은 <%= (int)money2 %>원 지불수단은 <%= choice %>