
function registerCustomer(name, surname, email, cell)
{
	$.ajaxSetup({headers:{'Content-Type': 'application/json'}});
	
	var Customer = JSON.stringify({"name": name, "surname": surname, "email": email , "cell": cell});
	console.log(Customer);
	$.post('http://localhost:8080/customer/add', Customer,
		function(data){
			console.log(data);
		});
				
}

function getHorrorFilms()
{		
	$.get('http://localhost:8080/horror/all', 
		function(data){
			console.log(data);
		});		
}

function getDocumenaryFilms()
{		
	$.get('http://localhost:8080/documentary/all', 
		function(data){
			console.log(data);
		});		
}

function getScifiFilms()
{		
	$.get('http://localhost:8080/scifi/all', 
		function(data){
			console.log(data);
		});		
}

function getActionFilms()
{		
	$.get('http://localhost:8080/action/all', 
		function(data){
			console.log(data);
		});		
}

function findCustomer(email, password)
{
	var Customer = 1;
	$.get('http://localhost:8080/customer/find/' + Customer,
		function(data){
			console.log(data);
		});
}

function findReservation(email, password)
{console.log("kak");
	$.get('http://localhost:8080/customer/login/' + email + "/" + password,
		function(data){			
			findCustomerReservation(data);
		});
}

function findCustomerReservation(customer)
{
	var Customer = JSON.stringify(customer);
	console.log(Customer);
	$.ajaxSetup({headers:{'Content-Type': 'application/json'}});
	$.post('http://localhost:8080/reservation/findCustReservation/', Customer,
		function(data){
			console.log(data);
		});
}