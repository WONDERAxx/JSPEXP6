<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="connection" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/testdb?useUniCode=true&characterEncoding=utf8"
		user= "root" password="root"
	/>
	<sql:update dataSource="${connection }" var="count">
		INSERT INTO employees(id,name,age,education,address,salary)
		VALUES('11','王明',24,'本科','北京朝阳区',13600)
	</sql:update>
	<sql:query dataSource="${connection }" var="result">
		SELECT * from employees;
	</sql:query> 
	<div align="center">
		<table border="1" width="80%">
		<tr>
			<th>编号</th>
			<th>名字</th>
			<th>薪水</th>
			<th>地址</th>
		</tr>
		<c:forEach var="row" items="${result.rows}">
		<tr>
			<td><c:out value="${row.id }"/></td>
			<td><c:out value="${row.name }"/></td>
			<td><c:out value="${row.salary }"/></td>
			<td><c:out value="${row.address }"/></td>
		</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>