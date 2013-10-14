<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
  <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'getit.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	用户id:<s:property value="UE.userid"/><br>
  	用户名:<s:property value="UE.username"/><br>
  	呢称:<s:property value="UE.name"/><br>
    用户类型:<s:property value="UE.UIEE.userType"/><br>
    负责人:<s:property value="UE.UIEE.principal"/><br>
    学院:<s:property value="UE.UIEE.college"/><br>
    业务范围:<s:property value="UE.UIEE.business_scope"/><br>
    QQ:<s:property value="UE.UIEE.QQ"/><br>
    email:<s:property value="UE.UIEE.email"/><br>
    长号:<s:property value="UE.UIEE.long_num"/><br>
    短号:<s:property value="UE.UIEE.short_num"/><br>
  </body>
</html>
