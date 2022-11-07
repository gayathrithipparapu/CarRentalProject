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

        .login-page {
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
        font-size:12px;

        }
        .form .message a{
        color:#4CAF50;
        text-decoration:none;
        }
        .form .register-form
        {
        display:none
        }


    </style>
<body>
    <h2>${errorMsg}</h2>
    <div class="login-page">
    <div class="form">

        <h2>
            Login to Car rental Application
        </h2>
        <form action="" method="post" class="login-form">

            <input type="text" name="username" id="">
            <input type="password" name="password" id="">
            <button class="button" type="submit">
                login
            </button>
            <p class="message">Not Registered?<a href="#">Register</a>

        </form>
        <form action="" method="post" class="register-form">
        <input type="text" placeholder="username"/>
        <input type="password" placeholder="password"/>
        <input type="text" placeholder="email id"/>
        <button> Create</button>
        <p class="message">Already Registered? <a href="#">Login</a></p>
        </form>
        </div>
        </div>
    </div>
    <script src='https://code.jquery.com/jquery-3.6.1.min.js'>
    </script>

    <script>
    $('.message a').click(function()
    {
    $('form').animate({height:"toggle",opacity:"toggle"},"slow")
    });
    </script>
</body>

</html>