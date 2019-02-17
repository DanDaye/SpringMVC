<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liangjinsi
  Date: 2019-02-15
  Time: 22:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="command" scope="request" class="test.bean.User"/>
<html>
<head>
    <title>Spring MVC表单处理值-密码</title>
</head>
<body>
<h2>用户信息</h2>
<form:form action="addUser" method="POST">
    <table>
        <tr>
            <td><form:label path="username">用户名：</form:label></td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td><form:label path="password">密码：</form:label></td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td>
                <form:label path="address">地址：</form:label>
            </td>
            <td><form:textarea path="address" rows="5" cols="30"/> </td>
        </tr>
        <tr>
            <td><form:label path="receivePaper">订阅新闻？</form:label></td>
            <td><form:checkbox path="receivePaper"/></td>
        </tr>
        <tr>
            <td><form:label path="favoriteFrameworks">喜欢的框架</form:label></td>
            <td><form:checkboxes path="favoriteFrameworks" items="${webFrameworkList}"/></td>
        </tr>
        <tr>
            <td><form:label path="gender">性别：</form:label></td>
            <td><form:radiobutton path="gender" value="M" label="男"/>
                <form:radiobutton path="gender" value="F" label="女"/> </td>
        </tr>
        <tr>
            <td><from:label path="favoriteNumber">喜欢的数组：</from:label></td>
            <td><form:radiobuttons path="favoriteNumber" items="${numberList}"/> </td>
        </tr>
        <tr>
            <td><form:label path="country">所在国家</form:label></td>
            <td><form:select path="country">
                <form:option value="NONE" label="请选择..."/>
                <form:options items ="${countryList}"/>
            </form:select></td>
        </tr>

        <tr>
            <td><form:label path="skills">技术:</form:label></td>
            <td><form:select path="skills" items="${skillsList}" multiple="true"/> </td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交表达"></td>
        </tr>
    </table>
</form:form>
</body>
</html>
