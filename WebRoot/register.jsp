<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.scauast.studio.dao.user.impl.User_DaoImpl"%>
<%@page import="com.scauast.studio.dao.user.User_Dao"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
User_Dao UD = new User_DaoImpl();
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
	<title>Studio Register</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="Studio Register">
<link href="css/register.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/register.js"></script>
</head>
<body>
	<div class="content">
		<h3>用户注册</h3>
		<h1 class="registerText1">步骤一: 验证用户名</h1>
		<h1 class="registerText2">步骤二: 填写基本信息</h1>
		<h1 class="registerText3">步骤三: 工作室用户信息(选填)</h1>
		<h1 class="registerText4">步骤四: 输入密码及提交信息</h1>
		<div class="line"></div>
		<div class="registerMenu">
			<ul>
				<li><a href="javascript:void(0)" id="a1">1</a></li>
				<li><a href="javascript:void(0)" id="a2">2</a></li>
				<li><a href="javascript:void(0)" id="a3">3</a></li>
				<li><a href="javascript:void(0)" id="a4">4</a></li>
			</ul>
			<p class="menuText">步骤:</p>
		</div>
		<div class="showDiv">
		<form action="user_Register" method="post">
			<div class="Menu1">
				<h4>用户名:</h4>
				<p>用户名和密码用于登录。</p>
				<p>用户名不得超过20个字符</p>
				<p>用户名须为英文或数字</p>
				<a class="checkBtn" href="javascript:void(0)" id="checkUserId">CHECK</a>
				<input type="text" placeholder="Customer ID" name="userId" />
				<p id="checkStateUsername" class="checkState"></p><%-- <%=UD.checkName(name) %><%=UD.checkUsername(username) %> --%>

				<br/>
				<h4>昵称:</h4>
				<p>昵称用于分辨不同用户</p>
				<p>不同用户昵称不允许重复</p>
				<p>工作室用户请使用工作室名称</p>
				<a class="checkBtn" href="javascript:void(0)" id="checkUserName">CHECK</a>
				<input type="text" placeholder="Customer Name" name="userName" />
				<p id="checkStateNikename" class="checkState"></p>
				<a href="javascript:void(0)" class="nextBtn">下一步</a>
			</div>
			<div class="Menu2">
				<p>以下信息用于联系用户,未经用户同意我们不会公开</p>
				<h4>手机号码(长号)</h4>
				<input type="text" placeholder="Customer Telephone Number" name="userTelL" />
				<h4>手机号码(短号)</h4>
				<input type="text" placeholder="Customer Group Number" name="userTelS" />
				<h4>电子邮箱</h4>
				<input type="text" placeholder="Customer E-mail" name="userEmail" />
				<h4>QQ账号</h4>
				<input type="text" placeholder="Customer QQ Number" name="userQQ" />
				<a href="javascript:void(0)" class="nextBtn">下一步</a>
			</div>
			<div class="Menu3">
				<p>以下信息工作室用户须填写，普通用户不必填写</p>
				<input type="radio" name="userType" value="1" checked="checked" /><label>普通用户</label>
				<input type="radio" name="userType" value="2" /><label>工作室用户</label>
				<h4>工作室法人(负责人)</h4>
				<input type="text" placeholder="Studio Owner" name="studioOwner" class="studioInput"/>
				<h4>工作室法人年级专业</h4>
				<input type="text" placeholder="Studio Object" name="studioObject" class="studioInput"/>
				<h4>工作室所在学院</h4>
				<input type="text" placeholder="Studio Collage" name="studioCollage" class="studioInput"/>
				<h4>工作室营业范围(可以多个))</h4>
				<input type="text" placeholder="Studio Area" name="studioArea" class="studioInput"/>
				<h4>工作室简要介绍(100字内)</h4>
				<textarea class="introduceInput" name="studioIntroduce"placeholder="Studio Introduce"></textarea>
				<a href="javascript:void(0)" class="nextBtn">下一步</a> 
			</div>
			<div class="Menu4">
				<h4>密码</h4>
				<p>密码用于用户登录</p>
				<p>密码只能由数字及英文组成</p>
				<input type="password" placeholder="Customer password" name="userPassword" id="userPassword"/>
				<br class="line"/>
				<p>请再次输入密码</p>
				<input type="password" placeholder="Customer Password Again" name="userCheckPassword" id="userCheckPassword"/>
				<br/>
				<input class="submitBtn" type="submit" value="注册" name="submit"/>
			</div>
		</form>
		</div>
	</div>
</body>
</html>