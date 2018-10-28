<html>
<head>
    <title>Theatrix Admin Login</title>
	<link rel="stylesheet" type="text/css" href="css/cssLogin.css">
</head>

		<div class="btSubmit" align = "right">
			<div id = "button"><a href="homepage.php" src="icon/homeBtn.png" >HOME</a></div>
		</div>
<h1>Hello Theatrix User...</h1>
<body background ="images/th3.png">
<label for="name">Please enter the following below: </label>
<div class = "container form-signin" align="center-left">
	<?php

			if (isset($_POST['login']) && !empty($_POST['name']) && !empty($_POST['password']))
			{
				$name = $_POST['name'];
				$password = $_POST['password'];

				$curl = curl_init();

				curl_setopt_array($curl, array(
				  CURLOPT_PORT => "8080",
				  CURLOPT_URL => "http://localhost:8080/theatrix//readSingleUser/%$name%7D",
				  CURLOPT_RETURNTRANSFER => true,
				  CURLOPT_ENCODING => "",
				  CURLOPT_MAXREDIRS => 10,
				  CURLOPT_TIMEOUT => 30,
				  CURLOPT_HTTP_VERSION => CURL_HTTP_VERSION_1_1,
				  CURLOPT_CUSTOMREQUEST => "GET",
				 CURLOPT_HTTPHEADER => array(
           "aAuthorization: Basic cG9zdG1hbjpwYXNzd29yZA==",
           "Cache-Control: no-cache",
           "Postman-Token: f6d0e732-7651-4a10-89b1-e76466af0c46"
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
<div class= "container" align="center" >
    <form class = "form-signin" role = "form" action = "<?php echo htmlspecialchars($_SERVER['PHP_SELF']); ?>" method = "post">
        <h4 class = "form-signin-heading">
            <div class="group">
                <label for="name">Name</label>
                <div><input id="name" name="name" maxlength="20" class="form-control" type="text" placeholder="Name" required autofocus></div>
            </div><br></br>
            <div class="group">
                <label for="psw">Password</label>
                <div><input id="psw" name="psw" class="form-control" type="text" placeholder="Password" required autofocus></div>
            </div><br></br>
            <button class = "btnSubmit" type = "submit" name = "login"><a href="adminSeating.php"</a>User Login</button></br></br>
    </form>
    Need to Register? Click here <a href = "register.php" tite = "Register">Register
</div>

	<table cellpadding="10" cellspacing="2" style="background-color:#" width="1120">
	<tr>
		<td colspan="8"  style="color:#fff;" width="50">
			<table cellpadding="0" cellspacing="0"  border="0">
				<tr>
					<td><span class="itemText">A Midnight Summers Dream</span></td>
				</tr>
				<tr>
					<td><img src="plays/p1.png"></td>
				</tr>
			</table>
		</td>

		<td colspan="8"  style="color:#fff;">
			<table cellpadding="0" cellspacing="0"  border="0">
			<tr>
					<td><span class="itemText">Much Ado About Nothing</span></td>
				</tr>
				<tr>
					<td><img src="plays/p2.png"></td>
				</tr>
			</table>
		</td>

		<td colspan="8"  style="color:#fff;">
			<table cellpadding="0" cellspacing="0"  border="0">
				<tr>
					<td><span class="itemText">Hamlet</span></td>
				</tr>
				<tr>
					<td><img src="plays/p3.png"></td>
				</tr>
			</table>
		</td>

		<td colspan="8"  style="color:#fff;" width="60">
			<table cellpadding="0" cellspacing="0"  border="0">
				<tr>
					<td><span class="itemText">MacBeth</span></td>
				</tr>
				<tr>
					<td><img src="plays/p4.png"></td>
				</tr>
			</table>
		</td>

		<td colspan="8"  style="color:#fff;">
			<table cellpadding="0" cellspacing="0"  border="0">
			<tr>
					<td><span class="itemText">Twelfth Night</span></td>
				</tr>
				<tr>
					<td><img src="plays/p5.png"></td>
				</tr>
			</table>
		</td>

		<td colspan="8"  style="color:#fff;">
			<table cellpadding="0" cellspacing="0"  border="0">
				<tr>
					<td><span class="itemText">Antony and Cleopatra</span></td>
				</tr>
				<tr>
					<td><img src="plays/p6.png"></td>
				</tr>
			</table>
		</td>

		<td colspan="8"  style="color:#fff;">
			<table cellpadding="0" cellspacing="0"  border="0">
				<tr>
					<td><span class="itemText">Romeo & Juliet</span></td>
				</tr>
				<tr>
					<td><img src="plays/p7.png"></td>
				</tr>
			</table>
		</tr>
	</table>
</body>
</html>
