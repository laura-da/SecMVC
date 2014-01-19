<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Spitters</h2>

	<c:forEach items="${spitters}" var="spitter">
  		<c:out value="${spitter.username}"/> 
  		
	</c:forEach>
 
</body>
</html>