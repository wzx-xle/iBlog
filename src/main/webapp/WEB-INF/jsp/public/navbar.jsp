<%--
 Copyright (C) 2001-2017 wxyz <hyhjwzx@126.com>
 
 This program can be distributed under the terms of the GNU GPL Version 2.
 See the file LICENSE.
--%>
<%--
  公共导航栏
  
  @auther wxyz 2017-01-09_20:21
  @since 0.1
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <a href="${ctx}/" class="navbar-brand">${TITLE}</a>
        </div>
        <div class="collapse navbar-collapse">
            <form action="${ctx}/search" class="navbar-form navbar-right" role="search">
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="搜索" name="key">
                </div>
            </form>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="${ctx}/">主页</a></li>
                <li><a href="${ctx}/archives">归档</a></li>
                <li><a href="${ctx}/tags">标签</a></li>
                <li><a href="${ctx}/about">我</a></li>
            </ul>
        </div>
    </div>
</div>
