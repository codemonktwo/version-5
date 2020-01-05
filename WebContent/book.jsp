<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>too title here</title>
</head>
<style>

input[type=text], select {
  width: 20%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=date], select {
  width: 20%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
textarea[type=text], select {
  width: 20%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=password], select {
  width: 20%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 20%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
<body>
<center><h3>Order</h3>

<div>
  <form action="book_servlet" method="post">
   
    <label for="pickupdate">Pickup Date</label><br/>
    <input type="date" id="pickupdate" name="pickupdate" placeholder="date"><br/>
    
    <label for="pickupt">Time for Pickup</label><br/>
    <select id="pickupt" name="pickupt">
     <option value="9-10am">9-10am</option>
      <option value="10-11am">10-11am</option>
      <option value="11-12am">11-12am</option>
      <option value="12-1pm">12-1pm</option>
      <option value="1-2pm">1-2pm</option>
      <option value="2-3pm">2-3pm</option>
      <option value="3-4pm">3-4pm</option>
      <option value="4-5pm">4-5pm</option>
      <option value="5-6pm">5-6pm</option>
      <option value="6-7pm">6-7pm</option>
      <option value="7-8pm">7-8pm</option>
      <option value="8-9pm">8-9pm</option>
     </select><br/>   
    
    
    <label for="city">City</label><br/>
    <select id="city" name="city">
     <option value="Indore">Indore</option>
      <option value="Prayagraj">Prayagraj</option>
      <option value="Delhi">Delhi</option>
      <option value="Bangalore">Bangalore</option>
      <option value="Pune">Pune</option>
      <option value="Hyderabad">Hyderabad</option>
      <option value="Mumbai">Mumbai</option>
     </select><br/>
     
     <label for="pincode">Pincode</label><br/>
    <input type="text" id="pincode" name="pincode" placeholder="pincode"><br/>
    
    
    <label for="address">Address</label><br/>
    <textarea type="text" id="address" name="address" placeholder="Address"></textarea> <br/>
    <label for="landmark">Landmark</label><br/>
    <input type="text" id="landmark" name="landmark" placeholder="Landmark"><br/>

    <input type="submit" value="Submit">
  </form>
</div>
</center>
</body>
</html>