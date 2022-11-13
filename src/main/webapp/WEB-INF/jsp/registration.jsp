<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Cars List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <div>
      <table border="1">
        <tr>
          <th>Car Name</th>
          <th>Cost</th>
          <th>Id</th>
          <th>rnum</th>
        </tr>
        <c:forEach items="${registration}" var ="cars">
        <tr>
          <td>${cars.model}</td>
          <td>${cars.cost}</td>
          <td>${cars.id}</td>
          <td><a href="/registration/${cars.regnum}">Book Now</a></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </body>
</html>