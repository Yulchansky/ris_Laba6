<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>title</title>
</head>
<body>
<a href="/laba_6">Home</a>
<h1>Treatment</h1>
<jsp:useBean id="treatment" scope="request" type="java.util.List<entity.Treatment>"/>
<c:if test="${treatment != null}">
    <table>
        <tr>
            <th><c:out value="Id"/></th>
            <th><c:out value="Disease"/></th>
            <th><c:out value="Medicine"/></th>
        </tr>
        <c:forEach items="${treatment}" var="treatments">
            <tr>
                <td>${treatments.id}</td>
                <td>${treatments.disease}</td>
                <td>${treatments.medicine}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
