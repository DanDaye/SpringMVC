<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: liangjinsi
  Date: 2019-02-16
  Time: 20:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC上传文件示例</title>
</head>
<body>
<%--@elvariable id="fileUpload" type=""--%>
<form:form method="POST" modelAttribute="fileUpload" enctype="multipart/form-data">
    请选择一个文件上传：
    <input type="file" name="file">
    <input type="submit" value="提交上传">
</form:form>
</body>
</html>
