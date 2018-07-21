<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Registration Successful</title>
</head>
<body>
<h3><s:text name="thankyou"/></h3>
<p>Your registration information: <s:property value="person"/></p>
<p><a href="<s:url action='index'/>">Return to home page</a></p>
</body>
</html>
