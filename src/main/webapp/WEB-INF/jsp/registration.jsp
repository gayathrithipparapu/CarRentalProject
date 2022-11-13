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
        <tr>
          <td>${cars.model}</td>
          <td>${cars.cost}</td>
          <td>${cars.id}</td>
          <td>${cars.regnum}</td>
        </tr>
      </table>
    </div>
  </body>
</html>