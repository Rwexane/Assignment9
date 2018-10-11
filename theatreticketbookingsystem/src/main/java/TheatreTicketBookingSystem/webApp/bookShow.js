document.getElementById('movieBtn').addEventListener("click", function(){
	showTimes();
});

document.getElementById('timeBtn').addEventListener("click", function(){
	showSeats ();
});

function showTimes()
{
	var timesDiv = document.getElementById('time');
	timesDiv.style.display = "inline";
}


function showSeats()
{
	var seatsDiv = document.getElementById('seats');
	seatsDiv.style.display = "inline";
}