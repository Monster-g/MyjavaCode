<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
  <base href="${pageContext.request.contextPath}/"/>
  <title>员工列表</title>
  <meta charset="UTF-8">
  <link rel="stylesheet" type="text/css" href="css/style.css" />
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
          <a href="#">main</a>
        </h1>
      </div>
      <div id="navigation">
      </div>
    </div>
    <div id="content">
      <p id="whereami">
      </p>
      <h1>
        Welcome!
      </h1>
      <table class="table">
        <tr class="table_header">
          <td>
            编号
          </td>
          <td>
            姓名
          </td>
          <td>
            性别
          </td>
          <td>
            年龄
          </td>
          <td>
            薪资
          </td>
          <td>
            照片
          </td>
          <td>
            部门
          </td>
          <td>
            爱好
          </td>
          <td>
            操作
          </td>
        </tr>
        <c:forEach items="${bean.list}" var="emp" varStatus="status">
        <tr class="${status.index % 2 == 0?'row1':'row2'}">
          <td>
            ${emp.id}
          </td>
          <td>
              ${emp.name}
          </td>
          <td>
              <c:choose>
                <c:when test="${emp.sex == 1}">男</c:when>
                <c:otherwise>女</c:otherwise>
              </c:choose>
          </td>
          <td>
              ${emp.age}
          </td>
          <td>
              ${emp.salary}
          </td>
          <td>
              ${emp.photo}
          </td>
          <td>
              ${emp.deptName}
          </td>
          <td>
              ${emp.hobby}
          </td>
          <td>
            <a href="emplist.html">删除</a>&nbsp;<a href="updateEmp.html">修改</a>
          </td>
        </tr>
        </c:forEach>
      </table>
      <p>
        当前是第${bean.current}页，共${bean.pages}页，共${bean.count}条

        <c:if test="${not bean.isFirst}">
          <a href="employee.do">首页</a>
        </c:if>
        <c:if test="${bean.hasPrev}">
          <a href="employee.do?page=${bean.prev}">上一页</a>
        </c:if>
        <c:forEach items="${bean.numbers}" var="n">
          <c:choose>
            <c:when test="${n == bean.current}">
              ${n}
            </c:when>
            <c:otherwise>
              <a href="employee.do?page=${n}">${n}</a>
            </c:otherwise>
          </c:choose>
        </c:forEach>
        <c:if test="${bean.hasNext}">
          <a href="employee.do?page=${bean.next}">下一页</a>
        </c:if>
        <c:if test="${not bean.isLast}">
          <a href="employee.do?page=${bean.last}">尾页</a>
        </c:if>

      </p>
      <p>
        <input type="button" class="button" value="员工添加" onclick="location='employee.do?m=preAdd'"/>
      </p>
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
