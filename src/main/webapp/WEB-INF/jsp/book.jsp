<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <meta charset="UTF-8" />
    <title>Cars List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Booked Successfully ! Here are your car details.</h1>
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>Car Name</th>
          <th>Cost</th>
          <th>Id</th>
          <th>rnum</th>
        </tr>
        <tr>
          <td>${book.model}</td>
          <td>${book.cost}</td>
          <td>${book.id}</td>
          <td>${book.regnum}</td>

        </tr>
      </table>
    </div>

</body>
</html>