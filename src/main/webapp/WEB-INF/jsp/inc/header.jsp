<%--
  Copyright (C) 2001-2016 wxyz <hyhjwzx@126.com>

  This program can be distributed under the terms of the GNU GPL Version 2.
  See the file LICENSE.
--%>
<%--
  User:
    wxyz 2016-11-08_21:05
    wxyz 2016-11-08_22:15
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%-- taglibs --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<c:set var="cdn" value="${ctx}/static/scripts/libs"/>
<c:if test="${fn:length(LIBS_CDN) > 0}">
    <c:set var="cdn" value="${LIBS_CDN}"/>
</c:if>

<%-- meta --%>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>

<%-- style --%>
<script type="text/javascript">
    var CONTEXTPATH = '${pageContext.request.contextPath}';
</script>

<link href="${ctx}/static/images/favicon.ico?v=0.1" rel="shortcut icon" type="image/x-icon" />
<link href="${cdn}/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet" />

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="${cdn}/html5shiv/3.7.2/html5shiv.min.js"></script>
<script src="${cdn}/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<link href="${ctx}/static/styles/common.css?v=0.1" rel="stylesheet" />
