<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Cars List</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
  </head>
  <body>
    <h1>Cars List</h1>
    <a href="/ascsort">Sort price lower to higher</a>
    <br/><br/>
    <a href="/dscsort">Sort price higher to lower</a>
    <br/><br/>
    <a href="/modelsort">Sort by model</a>
    <br/><br/>
    <div>
      <table border="1">
        <tr>
          <th>Car Name</th>
          <th>Cost</th>
          <th>Id</th>
          <th>Book</th>
          <th>Status</th>
        </tr>
        <c:forEach items="${cars}" var ="cars">
        <tr>
          <td>${cars.model}</td>
          <td>${cars.cost}</td>
          <td>${cars.id}</td>
          <td>${cars.status}</td>

          <td><a href="/cardetails/${cars.id}">Book Now</a></td>
        </tr>
        </c:forEach>
      </table>
    </div>
    <br/><br/>
    <a href="/welcome">Enter your requirements</a>
    <br></br>
    <form method="post">
    <input type="number" name="regnum"></input>
    <button type="submit"> Already Booked?Enter Registration Number </button>
    </form>
  </body>
</html>