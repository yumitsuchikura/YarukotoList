$(function(){

	/**
	 * 検索ボタン押下時
	 */
	$("#update_inser").click(function(){
		
		$.ajax({
			method : "POST",
			url : "/search_todo",
			data : formData,
			async : false
		}).done(function(data){
			let url = location.protocol + "//" + location.host + "/";
			location.href = url;
			alert("検索に成功しました。");
		}).fail(function(XMLHttpRequest, textStatus, errorThrown){
			alert("検索に失敗しました。");
			console.log("XMLHttpRequest : " + XMLHttpRequest.status);
			console.log("textStatus : " + textStatus);
			console.log("errorThrown : " + errorThrown.message);
		});
		
	});
});