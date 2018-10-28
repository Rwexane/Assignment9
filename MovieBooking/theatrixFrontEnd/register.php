<html>
<head>
    <title>Admin Registration</title>
</head>
<input type="image" src="icon/homeBtn.png" a href="home.php" align="right" style="colour:#"/>
<link rel="stylesheet" href="css/styleSheet1.css">
<body background="images/scene3">
<h1>Theatrix Administrator Registration</h1>
<div class = "container form-signin" align="center">
	<?php

			if (isset($_POST['register']) && !empty($_POST['name']) && !empty($_POST['surname']) && !empty($_POST['password']))
			{

				$name = $_POST['name'];
				$surname = $_POST['surname'];
				$password = $_POST['password'];

				$curl = curl_init();

				curl_setopt_array($curl, array(
				  CURLOPT_PORT => "8080",
				  CURLOPT_URL => "http://localhost:8080/theatrix/addAdmin/%7B$name%7D/%$surname%7D/%7Bpassword%7D",
				  CURLOPT_RETURNTRANSFER => true,
				  CURLOPT_ENCODING => "",
				  CURLOPT_MAXREDIRS => 10,
				  CURLOPT_TIMEOUT => 30,
				  CURLOPT_HTTP_VERSION => CURL_HTTP_VERSION_1_1,
				  CURLOPT_CUSTOMREQUEST => "GET",
				  CURLOPT_HTTPHEADER => array(
					"aAuthorization: Basic cG9zdG1hbjpwYXNzd29yZA==",
          "Cache-Control: no-cache",
          "Postman-Token: c802310f-3b3b-4a66-92a1-6118ee8ab42a"
				  ),
				));

				$response = curl_exec($curl);
				$err = curl_error($curl);

				curl_close($curl);

				if ($err) {
				  echo "cURL Error #:" . $err;
				} else {
				  echo $response;
				}
			}
	?>
</div>
<div class = "container" align="center" action ="userLogin.php">
    <form class = "form-signin" role = "form" action = "<?php echo htmlspecialchars($_SERVER['PHP_SELF']); ?>" method = "post" >
        <h4 class = "form-signin-heading">
            <div class="group">
                <label for="name">Name</label>
                <div><input id="name" name="name" maxlength="20" class="form-control" type="text" placeholder="Name" required autofocus></div>
            </div>
            <div class="group">
                <label for="surname">Surname</label>
                <div><input id="surname" name="surname" maxlength="20" class="form-control" type="text" placeholder="Surname" required autofocus></div>
            </div>
            <div class="group">
                <label for="ID">ID Number</label>
                <div><input id="ID" name="ID" maxlength="13" class="form-control" type="ID" onkeypress="return isNumber(event);" placeholder="ID Number" required autofocus></div>
            </div>
            <div class="group">
                <label for="tID">Theatrix ID</label>
                <div><input id="tID" name="tID" maxlength="5" class="form-control" type="tID" placeholder="Theatrix ID" required autofocus></div>
            </div>
            <div class="group">
                <label for="phone" >Contact Number</label>
                <div><input type="text" maxlength="11" name="phone" class="form-control" id="phone" onkeypress="return isNumber(event);" placeholder="+(27 21) " required autofocus/></div>
            </div>
            <div class="group">
                <label for="email">Email</label>
                <div><input id="email" name="email" class="form-control" type="email" placeholder="Email" required autofocus></div>
            </div>
            <div class="group">
                <label for="psw">Password</label>
                <div><input id="psw" name="psw" class="form-control" type="text" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" placeholder="Password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required autofocus></div>
            </div>
			<br></br>
            <button class = "btn btn-lg btn-primary btn-block" type = "submit" name = "register"><a href="userLogin.php"</a>Register</button></br></br>
    </form>
    Already Registered <a href = "userLogin.php" tite = "NewLogin">Login Screen
</div>
</body>
</html>
