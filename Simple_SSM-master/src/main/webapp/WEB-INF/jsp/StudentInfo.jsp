<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/9
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询</title>
</head>
<body>
<center>
<h1>查询一个用户</h1>
    <table border="1">
<tr>
    <td>标签</td>
    <td>value</td>
</tr>
        <tr>
            <td>id</td>
        <td><c:out value="${Student.studentId}"/> </td>
        </tr>
        <tr>
            <td>姓名</td>
            <td><c:out value="${Student.studentName}"/> </td>
        </tr>
        <tr>
            <td>专业</td>
            <td><c:out value="${Student.studentMajor}"/> </td>
        </tr>
        <tr>
            <td>学院</td>
            <td><c:out value="${Student.studentDept}"/> </td>
        </tr>
    </table>
</center>
</body>
</html>
