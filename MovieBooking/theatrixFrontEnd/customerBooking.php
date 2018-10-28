<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Movie Reservation</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/styleSheet.css">
	<link rel="canonical" href="http://techbrij.com/780/seat-reservation-with-jquery" />
    <script src="../jquery-1.4.1.min.js" type="text/javascript"></script>
	<script src="js/jquery.js" type="text/javascript"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
    <script>
        function isNumber(e){
            e = e || window.event;
            var charCode = e.which ? e.which : e.keyCode;
            return /\d/.test(String.fromCharCode(charCode));
        }
    </script>
		<style type="text/css">
		#holder{	
		 height:200px;	 
		 width:550px;
		 background-color:#F5F5F5;
		 border:1px solid #A4A4A4;
		 margin-left:10px;	
		}
		 #place {
		 position:relative;
		 margin:7px;
		 }
		 #place a{
		 font-size:0.6em;
		 }
		 #place li
		 {
			 list-style: none outside none;
			 position: absolute;   
		 }    
		 #place li:hover
		 {
			background-color:yellow;      
		 } 
		 #place .seat{
		 background:url("images/available_seat_img.gif") no-repeat scroll 0 0 transparent;
		 height:33px;
		 width:33px;
		 display:block;	 
		 }
		  #place .selectedSeat
		  { 
			background-image:url("images/booked_seat_img.gif");      	 
		  }
		   #place .selectingSeat
		  { 
			background-image:url("images/selected_seat_img.gif");      	 
		  }
		  #place .row-3, #place .row-4{
			margin-top:10px;
		  }
		 #seatDescription{
		 padding:0px;
		 }
		  #seatDescription li{
		  verticle-align:middle;	  
		  list-style: none outside none;
		   padding-left:35px;
		  height:35px;
		  float:left;
		  }
	</style>
</head>
	<div class="btSubmit" align = "right">			
		<div id = "button"><a href="homepage.php" src="icon/homeBtn.png" >Back</a></div>				
	</div>
<h1>Reservation Form</h1>
<body background="images/th2.png" >
<form id="booking-form" class="booking-form" name="form1" method="post" action="customerBooking2.php">
    <div id="form-content">
        <div class="group">
		<table cellpadding="0" cellspacing="2" style="background-color:#" width="1260" align="center">
		<tr>
			<td height="0" colspan="8"  style="color:#fff;">
			<table cellpadding="0" cellspacing="0"  border="0" width="0">
				<tr>
				<td>
				<label align="center" >Select your Show Below</label><br></br>
            <div class="w3-content w3-display-container" align="center">
                <div class="w3-display-container mySlides">
                    <img  src = "plays/s1.png" style="width:100%">
					<br></br>
                    <div class="w3-display-bottomleft w3-container w3-padding-10 w3-black">
                        Hamlet
                    </div>
                </div>
                <div class="w3-display-container mySlides">
                    <img src="plays/s2.png" style="width:100%">
					<br></br>
                    <div class="w3-display-bottomleft w3-container w3-padding-16 w3-black">
                        Othello
                    </div>
                </div>
                <div class="w3-display-container mySlides">
                    <img src="plays/s3.png" style="width:100%">
					<br></br>
                    <div class="w3-display-bottomleft w3-container w3-padding-16 w3-black">
                        Julia Ceasar
                    </div>
                </div>
                <div class="w3-display-container mySlides">
                    <img src="plays/s4.png" style="width:100%">
					<br></br>
                    <div class="w3-display-bottomleft w3-container w3-padding-16 w3-black">
                        King Lear
                    </div>
                </div>
				<div class="w3-display-container mySlides">
                    <img src="plays/s5.png" style="width:100%">
					<br></br>
                    <div class="w3-display-bottomleft w3-container w3-padding-16 w3-black">
                        A winter's tale
                    </div>
                </div>
				<div class="w3-display-container mySlides">
                    <img src="plays/poster6.png" style="width:100%">
					<br></br>
                    <div class="w3-display-bottomleft w3-container w3-padding-16 w3-black">
                        Macbeth
                    </div>
                </div>
				<div class="w3-display-container mySlides">
                    <img src="plays/p7.png" style="width:100%">
					<br></br>
                    <div class="w3-display-bottomleft w3-container w3-padding-16 w3-black">
                        Romeo & Juliet
                    </div>
                </div>
                <button class="w3-button w3-white w3-display-left" onclick ="plusDivs(-1)">&#10094;</button>
                <button class="w3-button w3-white w3-display-right" onclick ="plusDivs(1)">&#10095;</button>
                <span class="w3-badge demo w3-border" onclick="currentDiv(1)"></span>
                <span class="w3-badge demo w3-border" onclick="currentDiv(2)"></span>
                <span class="w3-badge demo w3-border" onclick="currentDiv(3)"></span>
                <span class="w3-badge demo w3-border" onclick="currentDiv(4)"></span>
            </div>
        </div>
		</tr>
			</table>			
		</td>
			<td colspan="8"  style="color:#fff;">			
			<table cellpadding="0" cellspacing="0"  border="0">
				<tr>
				<td><br></br><label for="name">Name</label>
            <div><input id="name" name="name" maxlength="20" class="form-control" type="text" placeholder="Name" required autofocus></div>
        </div>
        <div class="group">
            <label for="surname">Surname</label>
            <div><input id="surname" name="surname" maxlength="20" class="form-control" type="text" placeholder="Surname" required autofocus></div>
        </div>
        <div class="group">
            <label for="dob">Date of Birth</label>
            <div><input id="dob" name="dob" maxlength="8" class="form-control" type="dob" onkeypress="return isNumber(event);" placeholder="DDMMYYYY" required autofocus></div>
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
            <div><input id="psw" name="psw" class="form-control" type="text" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" placeholder="Password" title="Create a password for your next login which contains at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required autofocus></div>
        </div>
        <div class="group">
            <label for="psw">Confirm Password</label>
            <div><input id="psw" name="psw" class="form-control" type="text" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" placeholder="Confirm Password" title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required autofocus></div>
        </div><br></br>
        <div class="group submit">
            <label class="empty"></label>
            <div><input name="submit" type="submit" value="Book" /></div>
        </div>
    </div>
	<div class="selmovie">
					<br></br><label for="movie">Your Show has been Selected Above</label>
					</div>
        <div class="group">
    <div id="form-loading" class="hide"><i class="fa fa-circle-o-notch fa-spin"></i></div>
	</tr>
			</table>			
		</td>
		
	<td colspan="8"  style="color:#fff;">			
	<table cellpadding="0" cellspacing="0"  border="0">
		<tr>
		<td>
	<div style="width: 50%;" align = "center"></div>
      <h2 style="font-size:1.2em;" align = "center">Cinema layout</h2>
	<div id="holder" > 
		<ul  id="place">
        </ul>    
	</div>
	<div style="width:600px;text-align:center;overflow:auto" align = "center" > 
		<ul id="seatDescription">
			<li style="background:url('images/available_seat_img.gif') no-repeat scroll 0 0 transparent;">Available Seat</li></br></br></br>
			<li style="background:url('images/booked_seat_img.gif') no-repeat scroll 0 0 transparent;" >Booked Seat</li></br></br></br>
			<li style="background:url('images/selected_seat_img.gif') no-repeat scroll 0 0 transparent;">Selected Seat</li></br></br>
		</ul>        
	</div>
	<div style="width:580px;text-align:left;margin:5px" align = "center">
		<input type="button" id="btnShowNew" value="View Selected Seats"/></br></br>
		<input type="button" id="btnShow"  value="Book Selected Seats" />
	</div>
	</tr>
			</table>			
		</td>
</form>

<script>
    var slideIndex = 1;
    showDivs(slideIndex);

    function plusDivs(n) {
        showDivs(slideIndex += n);
    }

    function showDivs(n) {
        var i;
        var x = document.getElementsByClassName("mySlides");
        if (n > x.length) {slideIndex = 1}
        if (n < 1) {slideIndex = x.length}
        for (i = 0; i < x.length; i++) {
            x[i].style.display = "none";
        }
        x[slideIndex-1].style.display = "block";
    }
	
</script>
<script type="text/javascript" >
        $(function () {
            var settings = {
                rows: 5,
                cols: 15,
                rowCssPrefix: 'row-',
                colCssPrefix: 'col-',
                seatWidth: 35,
                seatHeight: 35,
                seatCss: 'seat',
                selectedSeatCss: 'selectedSeat',
				selectingSeatCss: 'selectingSeat'
            };

            var init = function (reservedSeat) {
                var str = [], seatNo, className;
                for (i = 0; i < settings.rows; i++) {
                    for (j = 0; j < settings.cols; j++) {
                        seatNo = (i + j * settings.rows + 1);
                        className = settings.seatCss + ' ' + settings.rowCssPrefix + i.toString() + ' ' + settings.colCssPrefix + j.toString();
                        if ($.isArray(reservedSeat) && $.inArray(seatNo, reservedSeat) != -1) {
                            className += ' ' + settings.selectedSeatCss;
                        }
                        str.push('<li class="' + className + '"' +
                                  'style="top:' + (i * settings.seatHeight).toString() + 'px;left:' + (j * settings.seatWidth).toString() + 'px">' +
                                  '<a title="' + seatNo + '">' + seatNo + '</a>' +
                                  '</li>');
                    }
                }
                $('#place').html(str.join(''));
            };

            //case I: Show from starting
            init();

            //Case II: If already booked
            //var bookedSeats = [5, 10, 25];
            //init(bookedSeats);

            $('.' + settings.seatCss).click(function () {
			if ($(this).hasClass(settings.selectedSeatCss)){
				alert('This seat is already reserved');
			}
			else{
                $(this).toggleClass(settings.selectingSeatCss);
				}
            });

            $('#btnShow').click(function () {
                var str = [];
                $.each($('#place li.' + settings.selectedSeatCss + ' a, #place li.'+ settings.selectingSeatCss + ' a'), function (index, value) {
                    str.push($(this).attr('title'));
                });
                alert("Book Seats: "+str.join(','));
            })

            $('#btnShowNew').click(function () {
                var str = [], item;
                $.each($('#place li.' + settings.selectingSeatCss + ' a'), function (index, value) {
                    item = $(this).attr('title');                   
                    str.push(item);                   
                });
                alert("Selected Seats: "+str.join(','));
            })
        });    
    
</script>
</body>
</html>
