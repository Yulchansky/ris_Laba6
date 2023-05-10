<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
    <link href="styles.css" rel="stylesheet" type="text/css">
</head>

<body>
<form method="Get">
    <button type="submit" formaction="getAll">Get all treatment</button><br/>
    <label>
        Get treatment by disease:
        <input type="text" name="disease" placeholder="Disease">
    </label>
    <button type="submit" formaction="getByDisease">Find</button><br/>
    <label>
        Get treatment by medicine:
        <input type="text" name="medicine" placeholder="Medicine">
    </label>
    <button type="submit" formaction="getByMedicine">Find</button><br/>
</form>
</body>
</html>
