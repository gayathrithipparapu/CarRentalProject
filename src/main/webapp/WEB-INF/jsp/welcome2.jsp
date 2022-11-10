<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Cars List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Cars List</h1>

    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>Car Name</th>
          <th>Cost</th>
          <th>Id</th>
        </tr>
        <c:forEach  items="${welcome2}" var ="Cars">
        <tr>
          <td>${Cars.model}</td>
          <td>${Cars.cost}</td>
          <td>${Cars.id}</td>
          <td><a href="book">Book Now</a></td>
        </tr>
        </c:forEach>
      </table>
    </div>

</html>