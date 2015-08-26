<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="pages/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<script src="<%=contextPath%>/scripts/login.js"></script>
<link href="<%=contextPath%>/css/loginStyle.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
$(function(){
	$("#button").click(function(){
		$("#loginform").submit();
	});	
});
	
</script>

</head>
<body>
<div id="Content">
  <div id="FormContent">
  	<div id = "InputContent">
  	<form action="<%=contextPath%>/admin/login.jhtml" method="post" id="loginform">
    	<input type="text" value="请输入用户名" onfocus="javascript:if(this.value=='请输入用户名')this.value='';" name="username" style="width=140"/>
        <input type="password" value="请输入密码" onfocus="javascript:if(this.value=='请输入密码')this.value='';" name="password"/>
  		<div id="SubmitBtn">
     		<img src="<%=contextPath%>/images/Image4atframe0.png" onmousedown="this.src='images/btnDown.png'" onmouseup="this.src='<%=contextPath%>/images/Image5atframe0.png'"  id ="button">
    	</div>
  	</form>
    </div>
  </div>
</div>
</body>
</html>