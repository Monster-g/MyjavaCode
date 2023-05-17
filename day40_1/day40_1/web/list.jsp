<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="${pageContext.request.contextPath}/">
</head>
<body>
    <a href="add.jsp">添加</a>
    <table width="800px" align="center" border="1px">
        <tr>
            <th>编号</th>
            <th>邮箱</th>
            <th>密码</th>
            <th>真实姓名</th>
            <th>qq</th>
            <th>微信</th>
            <th>电话</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="account">
            <tr>
                <td>${account.id}</td>
                <td>${account.email}</td>
                <td>${account.pwd}</td>
                <td>${account.truename}</td>
                <td>${account.qq}</td>
                <td>${account.wx}</td>
                <td>${account.phone}</td>
                <td>
                    <a href="preUpdate.do?id=${account.id}">修改</a>
                    <a href="delete.do?id=${account.id}" onclick="return confirm('确定要删除吗？')">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
