$(function() {
	
	$("#search-page").click(function(event){
		
		// <a>タグのデフォルト動作を抑止
		event.preventDefault();
		
		$.ajax({
			method : "POST",
			url : "/",
			data : "",
			dataType : "html"
		}).done(function(data){
			$('body').html(data);
		}).fail(function(XMLHttpRequest, textStatus, errorThrown){
			alert("検索画面に遷移できませんでした。");
			console.log("XMLHttpRequest : " + XMLHttpRequest.status);
			console.log("textStatus : " + textStatus);
			console.log("errorThrown : " + errorThrown.message);
		});
		
	});
	
	$("#regist-page").click(function(event){
		
		// <a>タグのデフォルト動作を抑止
		event.preventDefault();
		
		$.ajax({
			method : "POST",
			url : "/openregist",
			data : "",
			dataType : "html"
		}).done(function(data){
			$('body').html(data);
		}).fail(function(XMLHttpRequest, textStatus, errorThrown){
			alert("登録画面に遷移できませんでした。");
			console.log("XMLHttpRequest : " + XMLHttpRequest.status);
			console.log("textStatus : " + textStatus);
			console.log("errorThrown : " + errorThrown.message);
		});
		
	});

})