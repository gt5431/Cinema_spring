function add(){
	
	var flag= validate();
	if(flag){
		$.ajax({
			type:"POST",
			url:"Film_add.action",
			data:$("form").serialize(),
			success:function(data){
				alert("更新成功!!");
			}
		});
	}else{
		
	}

}

function validate() {
	
	if ($("#filmname").val() == null || $("#filmname").val() == "") {
		$("#fnmessage").css("display","inline");
		$("#fnmessage").html('<font size="1" color="blue">电影名称不能为空</font>');
		return false;
	} else {
		$("#fnmessage").css("display", "none");
	}

	if ($("#typeId").val() == null || $("#typeId").val() == "") {
		$("#timessage").css("display","inline");
		$("#timessage").html('<font size="1" color="blue">类型不能为空</font>'); 
		return false; 
	} else {
		$("#timessage").css("display", "none"); 
	}

	if ($("#ticketprice").val() == null || $("#ticketprice").val() == "") {
		$("#tpmessage").css("display","inline");
		$("#tpmessage").html('<font size="1" color="blue">价格不能为空</font>');
		return false; 
	} else {
		$("#tpmessage").css("display", "none"); 
	}

	if ( !$.isNumeric(  $("#ticketprice").val() )  ) { 
		$("#tpmessage").css("display","inline");
		$("#tpmessage").html('<font size="1" color="red">价格必须是数字</font>');
		return false; 
	}else if ($($("#ticketprice")).val() < 50) {
		$("#tpmessage").css("display","inline");
		$("#tpmessage").html('<font  size="1" color="red">价格必须大于50</font>');
		return false; 
	}
	return true;
}