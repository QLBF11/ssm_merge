<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored=“false”%>
<html>
<head>
    <title>嘻嘻嘻</title>
</head>
<body>

<tr>
    <th>书籍编号</th>
    <th>书籍名字</th>
    <th>书籍数量</th>
    <th>书籍详情</th>
</tr>

<c:forEach var="book" items="${requestScope.get('list')}">
    <tr>
        <td>${book.getBookID()}</td>
        <td>${book.getBookName()}</td>
        <td>${book.getBookCounts()}</td>
        <td>${book.getDetail()}</td>
    </tr>
</c:forEach>

</body>
</html>
