<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%
    
    //Random 함수 사용하여 난수 생성
	Random r = new Random();
    
    //100000~999999까지 랜덤한 숫자 발생
    int result = r.nextInt(900000) + 100000; 
    %><%= result %>