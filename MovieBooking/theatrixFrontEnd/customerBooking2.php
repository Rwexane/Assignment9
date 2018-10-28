<!doctype html>
<html>
<head>
<link href="css/styleSheet2" rel="stylesheet" type="text/css"/>
<link rel="canonical" href="http://techbrij.com/780/seat-reservation-with-jquery" />
<script src="../jquery-1.4.1.min.js" type="text/javascript"></script>
<script src="js/jquery.js" type="text/javascript"></script>
<meta charset="utf-8">
<title>Theatrix - Customer Booking</title>
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

<body background="images/th4.png">
	<div class = "Holder">
		<div class="Header">
		<center><h1>Theatrix</h1></center>
		<h2>Customer Booking</h2>
		
		</div>
		
<table align="center" cellpadding="0" cellspacing="2" style="background-color:#" width="1280">
	<tr>
		<td colspan="8"  style="color:#fff;" width="10">
			<table cellpadding="0" cellspacing="75"  border="0">
				<tr>
					<td>
					<h3>Customer Credentials</h3>
						<p>Username/Email: <input name="username" type="text" id="username" placeholder="Username"></p>
						<p>Password: <input name="password" type="text" id="password" placeholder="Password"></p>			
						<p><input name="ready" type="submit" id="ready" value="Ready"></p>
						</td>
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
						</div>	
					</td>
					<td>
						<h3>Customer Details</h3>
							<?php
							$names = "[Name]";
							$surname = "[Surname]";
							$contact = "[Contact]";
							$accNo = "[Account Number]";
							$seats = 0;
							
								echo '
								<p>Name: '.$names.'</p>
								<p>Surname: '.$surname.'</p>
								<p>Contact: '.$contact.'</p>
								<p>Account Number: '.$accNo.'</p>
								<p>Amount of Seats: ['.$seats.']</p>
								';
							?>	
							</div>			
					</td>
						</tr>
			</table>	
</body>
</html>
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