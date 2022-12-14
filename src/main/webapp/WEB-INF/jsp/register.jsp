<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>login</title>
    <style>
        .form {
            position:relative;
            z-index:1;
            background:rgba(7,40,195,0.8);
            max_width:360px;
            margin:0 auto 100px;
            padding:45px;
            text-align=center
        }
        .Register-page {
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
<h2>${errorMsg}</h2>
<div class="Register-page">
        <div class="form">
        <h2>
            Register to Car rental Application
        </h2>
        <form method="post" modelAttribute="user" class="login-form"/>
            <input type="text" name="username" path="username"/>
            <input type="password" name="password" path="password"/>
            <button class="button" type="submit">
                Register
            </button>
            <!--<p class="message">Already Registered?<a href="login">login</a></p>-->
        </form>
    </div>
</div>
</body>
</html>
