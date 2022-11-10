<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Cars List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>

  <style>
  table, th, td {
    border: 1px solid black;
  }
  table.center {
    margin-left: auto;
    margin-right: auto;
  }
  </style>
  </head>
  <body>
    <h1>Cars List</h1>
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>Model</th>
          <th>Cost</th>
        </tr>
        <c:forEach  items="${welcome}" var ="Cars">
         <tr>
              <td>${Cars.model}</td>
          <td>${Cars.cost}</td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </body>
</html>