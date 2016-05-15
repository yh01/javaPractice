<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	敵のHP:<s:property value="EnemyHP" /><br>
	自分のHP:<s:property value="PlayerHP" /><br>
	<s:property value="COMMENT" /><br>
	<s:form action="ATTACK" namespace="/">
	<s:submit type="button" value="ATTACK"/>
	</s:form>
	<s:form action="RUN" namespace="/">
	</s:form>
	<s:form action="HEAL" namespace="/">
	</s:form>
	<s:form action="TEST" namespace="/">
	<s:submit type="button" value="TEST"/>
	</s:form>
	<s:property value="TESTRESULT" />
</body>
</html>