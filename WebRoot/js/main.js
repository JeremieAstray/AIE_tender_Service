$(document).ready(function(){

	var content = $("#content");
	var register = $("#register");

	var menuSlider = $("#menuSlider");

	var bidding = $("#bidding");
	var message = $("#message");
	var edit = $("#edit");
	var apply = $("#apply");

	var tryBtn = $("#tryBtn");
	var biddingBtn = $("#biddingBtn");
	var messageBtn = $("#messageBtn");
	var editBtn = $("#editBtn");
	var applyBtn = $("#applyBtn");
	var exitBtn = $("#exitBtn");

	tryBtn.click(function(){
		content.slideUp(600);
		register.slideUp(600);
		tryBtn.slideUp(600);
		menuSlider.animate({top:'20%'},600);
	});

	biddingBtn.click(function(){
		menuSlider.animate({left:'-60%'},600);
		bidding.animate({left:'15%'},600);
	});

	messageBtn.click(function(){
		menuSlider.animate({left:'-60%'},600);
		message.animate({left:'15%'},600);
	});

	editBtn.click(function(){
		menuSlider.animate({left:'-60%'},600);
		edit.animate({left:'15%'},600);
	});

	applyBtn.click(function(){
		menuSlider.animate({left:'-60%'},600);
		apply.animate({left:'15%'},600);
	});

	exitBtn.click(function(){
		content.slideDown(600);
		register.slideDown(600);
		tryBtn.slideDown(600);
		menuSlider.animate({top:'100%'},600);
	});


	$(".backBtn").click(function(){
		menuSlider.animate({left:'25%'},600);
		bidding.animate({left:'100%'},600);
		message.animate({left:'100%'},600);
		edit.animate({left:'100%'},600);
		apply.animate({left:'100%'},600);
	});

	var biddingSearch = $("#biddingSearch");
	var biddingOn = $("#biddingOn");
	var biddingMy =$("#biddingMy");
	var biddingOut = $("#biddingOut");

	$(".biddingMenu a:first").addClass("biddingMenuBtnActive");//选中第一个

	biddingSearch.click(function(){
		$(".biddingMenu a").removeClass("biddingMenuBtnActive");//删除所有选中样式
		$(this).addClass("biddingMenuBtnActive");
	});

	biddingOn.click(function(){
		$(".biddingMenu a").removeClass("biddingMenuBtnActive");//删除所有选中样式
		$(this).addClass("biddingMenuBtnActive");
	});

	biddingMy.click(function(){
		$(".biddingMenu a").removeClass("biddingMenuBtnActive");//删除所有选中样式
		$(this).addClass("biddingMenuBtnActive");
	});

	biddingOut.click(function(){
		$(".biddingMenu a").removeClass("biddingMenuBtnActive");//删除所有选中样式
		$(this).addClass("biddingMenuBtnActive");
	});


});