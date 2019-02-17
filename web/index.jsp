<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liangjinsi
  Date: 2019-02-15
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Spring Loading Page</title>
  </head>
  <body>
  <h2>Spring Landing Page</h2>
  <p>点击下面的按钮获得一个简单页面重定向</p>
  <form:form method="GET" action="redirect">
    <table>
      <tr>
        <td>
          <input type="submit" value="页面重定向">
        </td>
      </tr>
    </table>
  </form:form>
  </body>
</html>
