<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <base href="${pageContext.request.contextPath}/"/>
    <title>add Emp</title>
    <meta charset=UTF-8">
    <link rel="stylesheet" type="text/css"
          href="css/style.css" />
</head>

<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br />
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">Main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>

        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                员工添加:
            </h1>
            <form action="employee.do" method="post" enctype="multipart/form-data">
                <input type="hidden" name="m" value="add">
                <table cellpadding="0" cellspacing="0" border="0"
                       class="form_table">
                    <tr>
                        <td valign="middle" align="right">
                            姓名:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="name" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            性别:
                        </td>
                        <td valign="middle" align="left">
                            <input type="radio" class="inputgri" name="sex" value="1" checked/>男
                            <input type="radio" class="inputgri" name="sex" value="0" checked/>女
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            薪资:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="salary" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            年龄:
                        </td>
                        <td valign="middle" align="left">
                            <input type="text" class="inputgri" name="age" />
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            部门:
                        </td>
                        <td valign="middle" align="left">
                            <select name="deptId">
                                <c:forEach items="${list}" var="dept">
                                    <option value="${dept.id}">${dept.name}</option>
                                </c:forEach>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            爱好:
                        </td>
                        <td valign="middle" align="left">
                            <input type="checkbox" name="hobby" value="看书">看书
                            <input type="checkbox" name="hobby" value="打篮球">打篮球
                            <input type="checkbox" name="hobby" value="踢足球">踢足球
                        </td>
                    </tr>
                    <tr>
                        <td valign="middle" align="right">
                            照片:
                        </td>
                        <td valign="middle" align="left">
                            <input type="file" name="photo">
                        </td>
                    </tr>
                </table>
                <p>
                    <input type="submit" class="button" value="添加" />
                </p>
            </form>
        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
