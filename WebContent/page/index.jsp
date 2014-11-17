<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
	<head>
		<base href="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.serverPort}${pageContext.request.contextPath}/">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<META HTTP-EQUIV="Cache-Control" CONTENT="no-cache" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
		<title>实验室管理系统</title>
	    <link rel="stylesheet" href="css/bootstrap.css"/>
	    <link rel="stylesheet" href="css/index.css"/>
	   
	</head>
	<body>
		<!-- 头部 -->
		 <jsp:include page="head.jsp" flush="true"></jsp:include>
		<!-- 导航栏 -->
		 <jsp:include page="nav.jsp" flush="true"></jsp:include>
		 <!--焦点图  -->
		 <jsp:include page="carousel.jsp" flush="true"></jsp:include>
	</body>
	 <script type="text/javascript" src="js/jquery-1.10.2.js"></script>
	 <script type="text/javascript" src="js/bootstrap-2.3.1.min.js"></script>
	 <script type="text/javascript" src="js/stickUp.js"></script>
	 <script type="text/javascript" src="js/common.js"></script>
</html>