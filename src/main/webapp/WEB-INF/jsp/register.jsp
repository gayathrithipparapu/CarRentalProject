<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <style>
        form {
            position:center;
            z-index:1;
            background:rgba(7,40,195,0.8);
            max_width:100px;
            margin-top: 100px;
            margin-bottom: 100px;
            margin-right: 300px;
            margin-left: 300px;
            padding:50px;
            text-align=center
        }

        register-page {
            width:360px;
            padding:10% 0 0;
            margin:auto;
        }
        .form input
        {
        font-family:"Roboto",sans-serif;
        outline:1;
        background:#f2f2f2;
        width:100%;
        border:0;
        margin:0 0 15px;
        padding:15px;
        box-sizing:border-box;
        font size:14px;

        }
        .form button
        {
        font-family:"Roboto",sans-serif;
        text-transform:uppercase;
        outline:0;
        background:#4CAF50;
        width:100%;
        border:0;
        padding:15px;
        color:#FFFFFF;
        font-size:14px;
        cursor:pointer;

        }
        .form button:hover,.form button:active
        {
        background:#43A047;
        }
        .form .message
        {
        margin:15px 0 0;
        color:aliceblue;
        font-size:20px;

        }
        .form .message a{
        color:#4CAF50;
        text-decoration:none;
        }

    </style>
    <body>
    <div class="register-page">
        <c:if test="${not empty errorMsg}">
        <div class="alert alert-danger" role="alert">${errorMsg}</div>
        </c:if>
        <div class="form">
            <h2>
                Register for car rental Application
            </h2>
            <form:form method="post" modelAttribute="user">
                <form:input type="text" placeholder="username"/>
                <form:input type="password" placeholder="password"/>
                <form:button class="button" type="submit">
                        Create
                </form:button>
                <p class="message">Already Registered? <a href="login">Login</a></p>j
            </form:form>

        </div>

    </div>
    </body>
</html>
