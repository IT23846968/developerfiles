<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Create a New Account</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: center;
        }

        h1 {
            font-size: 24px;
            margin-bottom: 10px;
        }

        p {
            font-size: 14px;
            margin-bottom: 20px;
        }

        .login-options {
            display: flex;
            flex-direction: column;
            margin-bottom: 20px;
        }

        .login-options button {
            margin-bottom: 10px;
            padding: 10px;
            width: 100%;
            border: 1px solid #ccc;
            background-color: #f9f9f9;
            cursor: pointer;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .login-options button img {
            width: 20px;
            margin-right: 10px;
        }

        .form {
            margin-top: 20px;
        }

        input[type="text"], input[type="email"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            border: none;
            color: #fff;
            cursor: pointer;
            border-radius: 5px;
        }

        button[type="submit"]:hover {
            background-color: #45a049;
        }

        .success-message {
            color: green;
            margin-top: 20px;
        }
    </style>
</head>
<body>

<div class="container">



    <h1>Create a New Account</h1>
    <p>Come join our community! Let's set up your account. Already have an account? <a href="#">Sign in here</a></p>
    
	
   <form action="userServlet" method="POST">

        <input type="text" name="customerName" id="customerName" placeholder="User Name" required><br>

        <input type="email" name="email" id="email" placeholder="Email" required><br>
        
        <input type="text" name="dob" id="dob" placeholder="User Name" required><br>
         
        <input type="text" name="age" id="age" placeholder="User Name" required><br>
          
        <input type="text" name="gender" id="gender" placeholder="User Name" required><br>
           
        <input type="text" name="phoneNo" id="phoneNo" placeholder="User Name" required><br>
           
        <input type="text" name="country" id="country" placeholder="User Name" required><br>

        <input type="password" name="currentPassword" id="currentPassword" placeholder="Password" required><br>


        <button type="submit" value="Submit">Register</button>
    </form>


    <div class="success-message" id="successMessage"></div>
</div>

</body>
</html>