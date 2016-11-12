<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>欢迎页</title>
    </head>
    <body>
       <tr>欢迎您！ ${user1.userName}</tr>
       <table>
       <th>序号</th><th>姓名</th><th>密码</th><th>年龄</th>
       <c:forEach var="user" items="${list }">
       	<tr> 
       	<td>${user.id}</td><td>${user.userName}</td><td>${user.password}</td><td>${user.age}</td>
       	</tr>
       </c:forEach>
       </table>
       <img alt="img" src="img/aa.jpg">
      <a href="<%=basePath %>front/showlogin"><input type="button" value="点击进入页面"></input></a>
    </body>
</html>