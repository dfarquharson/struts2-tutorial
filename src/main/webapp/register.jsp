<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Register</title>
    <s:head/>
</head>
<body>
<h3>Register for a prize by completing this form.</h3>

<s:form action="register">
    <s:textfield key="person.firstName"/>
    <s:textfield key="person.lastName"/>
    <s:textfield key="person.email"/>
    <s:textfield key="person.age"/>
    <s:submit/>
</s:form>
</body>
</html>
