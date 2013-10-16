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
    
    <title>success</title>
   
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="success">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <body>
    success. <br>
    用户id session:标签方法<s:property value="#session.userid"/> |jsp方法： <%=session.getAttribute("userid") %> <br />
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
    <script src="${pageContext.request.contextPath}/js/prototype-1.6.1.js" 
	type="text/javascript">
	</script>
    <script type="text/javascript">
		function gotClick()
		{
			//请求的地址
			var url = 'user_Logout.action';
			//将favorite表单域的值转换为请求参数
			var params = Form.serialize('form1');
			//创建Ajax.Request对象，对应于发送请求
			var myAjax = new Ajax.Request(
			url,
			{
				//请求方式：POST
				method:'post',
				//请求参数
				parameters:params,
				//指定回调函数
				onComplete: processResponse,
				//是否异步发送请求
				asynchronous:true
			});
		}
		function processResponse(request)
		{
			//使用JSON对象将服务器响应解析成JSON对象
			var res = request.responseText.evalJSON();
			alert(res.UE.userid);
			//遍历JSON对象的每个属性
			for(var propName in res)
			{
				$("show").innerHTML += propName + " --> " 
					+ res[propName] + "<br/>";
			}		
		}	
	</script>
    <s:form id="form1">
	<tr><td colspan="2">
	<input type="button" value="提交" onclick="gotClick();"/>
	</td></tr>
</s:form>
<a href ="user_Logout">logout</a>
 	<div id="show">
</div>
  </body>
</html>
