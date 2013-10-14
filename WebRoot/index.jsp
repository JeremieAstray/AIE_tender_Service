<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="zh-cn">
<head>
<base href="<%=basePath%>">
<meta charset="utf-8" />
    <title>Studio</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="Studio">
<link href="css/main.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/main.js"></script>
</head>
<body>

	<div class="content" id="content">
		<h1>工作室认证</h1>
		<div class="line"></div>
		<a href="javascript:void(0)" class="forget">丢失了用户名或密码？</a>

		<form action="user_Login"  target="_self" method="post">
		<div class="loginInput">
			<div class="loginName"><input type="text" placeholder="Customer ID" name="username" /></div>
			<div class="loginPassword"><input type="password" placeholder="Password" name="password" /></div>
		</div>
		<input class="submitBtn" type="submit" value="LOGIN" name="submit"/>
		</form>
	</div>
	<a href="javascript:void(0)" id="tryBtn">游客进入(仅开放招投标查看功能)</a>
	<a id="register" class="register" href="register.jsp">还没有加入？来注册一个</a>

	<div class="menu">
		<h1>用户主菜单</h1>
		<div class="line"></div>		
		<a class="menuBtn" href="javascript:void(0)">招投标界面</a>
		<a class="menuBtn" href="javascript:void(0)">我收到的信息</a>
		<a class="menuBtn" href="javascript:void(0)">修改或添加我的信息</a>
		<a class="menuBtn" href="javascript:void(0)">申报项目</a>		
	</div>

	<div class="menuSlider" id="menuSlider">
		<a id="biddingBtn" class="menuBtn" href="javascript:void(0)">招投标界面</a>
		<a id="messageBtn" class="menuBtn" href="javascript:void(0)">我收到的信息</a>
		<a id="editBtn" class="menuBtn" href="javascript:void(0)">修改或添加我的信息</a>
		<a id="applyBtn" class="menuBtn" href="javascript:void(0)">申报项目</a>
		<a id="exitBtn" class="menuBtn" href="javascript:void(0)" >退出且注销用户</a>
	</div>
	
	<div id="bidding">
		<div class="back">
			<a class="backBtn" href="javascript:void(0)">返回主菜单</a>
		</div>
		<div class="rightContent">
			<div class="biddingLeft">
				<div class="biddingMenu">
					<a class="biddingMenuBtn" href="javascript:void(0)" id="biddingSearch">招标公告</a>
					<a class="biddingMenuBtn" href="javascript:void(0)" id="biddingOn">中标公告</a>
					<a class="biddingMenuBtn" href="javascript:void(0)" id="biddingMy">我的招标信息</a>
					<a class="biddingMenuBtn" href="javascript:void(0)" id="biddingOut">发布招标信息</a>
				</div>
				<table class="biddingTable">
					<tbody>
						<tr class="biddingTableHead">
							<th>招标主题</th>
							<th>招标单位</th>
							<th>公告截止时间</th>
							<th>报名情况</th>
						</tr>
						
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<div id="message">
		<div class="back">
			<a class="backBtn" href="javascript:void(0)">返回主菜单</a>
		</div>
		<div class="rightContent">

		</div>
	</div>
	
	<div id="edit">
		<div class="back">
			<a class="backBtn" href="javascript:void(0)">返回主菜单</a>
		</div>
		<div class="rightContent">
			<div class="editContent">
				<div class="editRight">
					<h2>昵称:</h2>
					<input class="nickNameInput" type="text" name="userName" value="YesWeCan工作室" />
					<h3>工作室信息</h3>
					<label for="userTelL">用户类型</label>
					<input type="radio" name="userType" value="2" class="editRadio" />
					<h4>工作室用户</h4>
					<input type="radio" name="userType" value="1" checked="checked" class="editRadio" />
					<h4>普通用户</h4>
					<label for="studioOwner">工作室法人</label>
					<input class="editInputR" type="text" name="studioOwner" id="studioOwner" value="叶振鹏" />
					<label for="studioCollage">工作室所在学院</label>
					<input class="editInputR" type="text" name="studioCollage" id="studioCollage" value="软件学院" />
					<label for="studioArea">工作室营业范围</label>
					<input class="editInputR" type="text" name="studioArea" id="studioArea" value="游戏开发,网站制作" />
				</div>
				<div class="editLeft">
					<h2>用户名:</h2>
					<p>asd576999413</p>
					<h3>联系方式</h3>
					<label for="userTelL">手机长号</label>
					<input class="editInput" type="text" name="userTelL" id="userTelL" value="13610266550" />
					<label for="userTelS">手机短号</label>
					<input class="editInput" type="text" name="userTelS" id="userTelS" value="636550" />
					<label for="userQQ">腾讯帐号</label>
					<input class="editInput" type="text" name="userQQ" id="userQQ" value="530747239" />
					<label for="userEmail">电子邮箱</label>
					<input class="editInput" type="text" name="userEmail" id="userEmail" value="roamzhen@gmail.com" />
				</div>
				<div class="editBottom">
					<p>以上内容除用户名外点击即可修改</p>
					<input type="submit" name="editSubmit" id="editSubmit" value="提交" />
					<a id="resetBtn" href="javascript:void(0)">重新读取</a>
				</div>
			</div>
		</div>
	</div>

	<div id="apply">
		<div class="back">
			<a class="backBtn" href="javascript:void(0)">返回主菜单</a>
		</div>
		<div class="rightContent">
			
		</div>
	</div>
</body>
</html>