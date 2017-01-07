<%--
  Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>

  This program can be distributed under the terms of the GNU GPL Version 2.
  See the file LICENSE.
--%>
<%--
  User:
    wxyz 2016-10-31_22:33
    wxyz 2016-11-08_22:15
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="zh_CN">
<head>
    <%@ include file="/WEB-INF/jsp/inc/header.jsp" %>

    <title>${TITLE}</title>
</head>
<body>
<div class="container">
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
        <div class="navbar-header">
            <a class="navbar-brand" href="${ctx}">${TITLE}</a>
        </div>
    </div>
    首页 ${AUTHOR} <br>
</div>
<%@ include file="/WEB-INF/jsp/inc/script.jsp" %>
</body>
</html>
