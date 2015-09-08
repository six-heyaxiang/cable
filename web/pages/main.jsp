<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>铁路</title>
<link href="<%=contextPath%>/css/MainStyle.css" rel="stylesheet" type="text/css"/>
<%-- <script language="javascript" type="text/javascript" src="<%=contextPath%>/scripts/MainPageFrame.js"></script>
 --%>
 <script type="text/javascript">
	$(function() {
		
	});
	function stationClick(id) {
		$.ajax({
			url:'<%=contextPath%>/infos/orbitlist.jhtml',// 跳转到 action    
		    data:{  
		    	stationId:id   
		    },    
		    type:'get',    
		    cache:false,    
		    dataType:'json',    
		    success:function(data) {    
		    	alert(data["orbits"][0]["orbitName"]);
		    },    
		     error : function() {    
		          alert("异常！");    
		     } 
		});	
	}
</script>
</head>
<body>
	<div id = "container">
        <div id="Header">
        </div>
        <div id ="PageBody">
            <div id="SideBar">
            	<div id = "SearchBar">
                <form action="" method="get">
                	<div id = "searchText">
                    	<input name="" type="text" />
                    </div>
                    <div id = "searchBtn">
                    	<a href="javascript:void(0)" onclick="SearchStart()"><img src="../images/search.PNG"  ></a>
                    </div>
                </form>
                </div>
                <div id = "List">
            		<ul>
            			<s:iterator value="stationInfoListBean.stationInfos" var="station">
            				<li class = "liTitle" onclick="stationClick(<s:property value="#station.stationId"/>)"><a href="javascript:void(0)"><s:property value="#station.stationName"/></a></li>	
            			</s:iterator>
                    </ul>
                </div>
            </div>
            <div id = "MainBody">
<!--             	<iframe  name ="myFrame" id = "myFrame" src="MainPageFrame.html" scrolling="no" frameborder="0" width="1080px" height="720px"></iframe>
 -->            </div>
        </div>
        <div>
        <div id="Footer">
        </div>
    	</div>
    </div>
</body>

</html>
