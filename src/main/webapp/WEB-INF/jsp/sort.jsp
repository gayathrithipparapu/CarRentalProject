<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <meta charset="UTF-8" />
    <title>Cars List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Sorted cars price details.</h1>
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>Car Name</th>
          <th>Cost</th>
          <th>Id</th>
        </tr>
        <tr>
          <td>${sort.model}</td>
          <td>${sort.cost}</td>
          <td>${sort.id}</td>
        </tr>
      </table>
    </div>
</body>
</html>