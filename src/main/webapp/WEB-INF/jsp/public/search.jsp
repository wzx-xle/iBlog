<%--
 Copyright (C) 2001-2017 wxyz <hyhjwzx@126.com>
 
 This program can be distributed under the terms of the GNU GPL Version 2.
 See the file LICENSE.
--%>
<%--
  搜索结果
  
  @auther wxyz 2017-01-09_20:30
  @since 0.1
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <%@ include file="/WEB-INF/jsp/inc/header.jsp" %>
    <title>搜索 - ${TITLE}</title>
</head>
<body>
<%@ include file="navbar.jsp" %>
<div class="container" style="margin-top: 50px">
    搜索 ${AUTHOR} <br>
</div>
<%@ include file="/WEB-INF/jsp/inc/script.jsp" %>
</body>
</html>
