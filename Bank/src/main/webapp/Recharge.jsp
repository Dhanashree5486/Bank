
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="Recharge.css">
</head>
<body>

	<img class="img1" alt="Logo" src="https://o.remove.bg/downloads/83a5e4a6-5393-4bb1-a4ad-f5520e26a45b/logot-removebg-preview.png">
	<p style="color: white; font-weight: bold; position: relative; left: 90px; top: -35px; font-family: URW Chancery L, cursive">BANK</p>
	
	<p style="color: #0000a0; position: fixed; top: 20px; right: 50px; font-weight: bold; font-family: URW Chancery L, cursive">SMART BANKING <br>with CloudBank</p>
	
	<h1 style="color: #fb0006; font-weight: 900; font-size: 50px; font-family: URW Chancery L, cursive; position: relative; top: -100px; text-align: center;">Enter Recharge Details...</h1><br>
	
	<div class="form">
	
	<form action="RechargeController">
	
		<label for="mobno">Mobile Number</label>
		<input type="text" name="mobno" placeholder="Mobile Number here...">
		
		<label for="rechargeamt">Recharge Amount</label>
		<input type="text" name="rechargeamt" placeholder="Recharge Amount here...">
		
		<label for="servicep">Service Provider</label>
		<select name="servicep" placeholder="Select Service Provider">
				<option value="Airtel">Airtel</option>
				<option value="VI">VI</option>
				<option value="BSNL">BSNL</option>
		</select>
		
		
		<input type="submit" value="Recharge" class="recharge"></td>
			
	</form>

</body>
</html>