<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Cars List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Sorted by descending order of price</h1>
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>Car Name</th>
          <th>Cost</th>
          <th>Id</th>
          <th>Book</th>
        </tr>
        <c:forEach items="${cars}" var ="cars">
        <tr>
          <td>${cars.model}</td>
          <td>${cars.cost}</td>
          <td>${cars.id}</td>
          <td><a href="/dscsort/${cars.id}">Book Now</a></td>
        </tr>
        </c:forEach>
      </table>
    </div>
    <br/><br/>
    <a href="/welcome">Enter your requirements</a>
  </body>
</html>