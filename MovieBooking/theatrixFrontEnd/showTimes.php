<!doctype html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/styleSheet1.css">
<meta charset="utf-8">
<title>Theatrix - Show Times</title>
</head>

<body background="images/scene2.png">
	<div class = "Holder">
		<div class="Header">
		<input type="image" src="icon/homeBtn.png" a href="home.php" align="right" style="colour:#"/>
		<h1>Theatrix</h1>
		<h2 align="left">Show Times</h2>
		</div>
		
			<table cellpadding="10" cellspacing="10" style="background-color:#" width="820">
	<tr>
		<td colspan="8"  style="color:#fff;" width="50">
			<table cellpadding="10" cellspacing="0"  border="0">
				<tr>
					<td><span class="itemText">King Lear</span></td>
				</tr>
				<tr>
					<td><img src="plays/poster1.png"></td>
				</tr>
			</table>			
		</td>
		
		<td colspan="8"  style="color:#fff;">
			<table cellpadding="5" cellspacing="0"  border="0">
			<tr>
					<td><span class="itemText">Hamlet</span></td>
				</tr>
				<tr>
					<td><img src="plays/poster2.png"></td>
				</tr>
			</table>			
		</td>
		
		<td colspan="8"  style="color:#fff;">
			<table cellpadding="5" cellspacing="0"  border="0">
				<tr>
					<td><span class="itemText">Winter's Tale</span></td>
				</tr>
				<tr>
					<td><img src="plays/poster3.png"></td>
				</tr>
			</table>
		</td>
		
		<td colspan="8"  style="color:#fff;" width="60">
			<table cellpadding="5" cellspacing="0"  border="0">
				<tr>
					<td><span class="itemText">MacBeth</span></td>
				</tr>
				<tr>
					<td><img src="plays/poster4.png"></td>
				</tr>
			</table>			
		</td>
		
		<td colspan="8"  style="color:#fff;">
			<table cellpadding="5" cellspacing="0"  border="0">
			<tr>
					<td><span class="itemText">Othello</span></td>
				</tr>
				<tr>
					<td><img src="plays/poster5.png"></td>
				</tr>
			</table>			
		</tr>
	</table>
		
		<div class = "ShowDtl">
		<h2>[Show Title]</h2>
		<p>Age Restriction: <b>[taken from db]</b></p>
		<p>Synopsis: <b>[taken from db]</b></p>	
		</div>
		
		<div class = "Times">
		<table border = 1px>
		<tr><th>Date</th>
		
		
		<?php
			for ($i = 0; $i < 5; $i++){ //using foreach while calling from db. This is just temporary
				echo '<th>Time</th>';
			}
			echo'</tr>';
			
			for ($j = 0; $j < 5; $j++){
				echo'<tr><td>[DATE FROM DB]</td>';
				
				for ($i = 0; $i < 5; $i++){
					echo '<td><a href="file:///P:/Theatrix/Show%20Times.html">[TIME FROM DB - 15:10]</a></td>';//replace with the time from the db
				}
				echo '</tr>';
			}
		?>
		
		
		</table>
		</div>
		
		
	</div>	
	
</body>
</html>


	