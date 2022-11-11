<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Cars List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Cars List</h1>
    <br/><br/>
    <a href="/sort"> sort car price</a></td>
    <div>
      <table border="1">
        <tr>
          <th>Car Name</th>
          <th>Cost</th>
          <th>Id</th>
          <th>Book</th>
        </tr>
        <c:forEach items="${welcome2}" var ="Cars">
        <tr>
          <td>${Cars.model}</td>
          <td>${Cars.cost}</td>
          <td>${Cars.id}</td>
          <td><a href="/welcome2/${Cars.id}">Book Now</a></td>
        </tr>
        </c:forEach>
      </table>
    </div>

  </body>
</html>