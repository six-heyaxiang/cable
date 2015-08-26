<%@ taglib prefix="s" uri="/struts-tags" %>
<%
	String contextPath = request.getContextPath();
    StringBuffer rootPath = new StringBuffer();
    rootPath.append(request.getScheme());
    rootPath.append("://");
    rootPath.append(request.getServerName()+":" + request.getServerPort());
    rootPath.append(contextPath);
    
    response.setContentType("text/html; charset=UTF-8");
%>
<script src="<%=contextPath%>/scripts/jquery-1.9.1.js"></script>

