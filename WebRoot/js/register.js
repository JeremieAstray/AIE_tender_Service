$(document).ready(function(){
	var num = 1;//初始化num

	//页面加载初始化操作
	$("div.showDiv div").hide();//隐藏所有内容
	$("div.content h1").hide();
	$("ul li a:first").addClass("active");//选中第一个
	$("div.showDiv .Menu1").show();//显示第一个内容
	$("div.content .registerText1").show();
	//为切换描点绑定点击事件
	$("ul li a").click(function(){
		$("ul li a").removeClass("active");//删除所有选中样式
		$(this).addClass("active");
		$("div.showDiv div").hide();
		$("div.showDiv .Menu"+$(this).html()).fadeIn();
		$("div.content h1").hide();
		$("div.content .registerText"+$(this).html()).show();
		num = $(this).html();
	});

	$(".nextBtn").click(function(){
		num++;
		$("ul li a").removeClass("active");//删除所有选中样式
		$("#a"+num).addClass("active");
		$("div.showDiv div").hide();
		$("div.showDiv .Menu"+num).fadeIn();
		$("div.content h1").hide();
		$("div.content .registerText"+num).show();
	});
	
});