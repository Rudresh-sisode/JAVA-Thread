
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  </head>
<body>
<div class="container">
<h2 class="text-center">Perform Transaction</h2>
              <hr/>
 <div class="form-group">
       <label class="control-label col-md-1" for="name">From</label>
           <div class="col-md-2">
                <input type="date" name="date" id="date" class="form-control" placeholder="Enter Date">
           </div>
           <div class="col-md-1">
           </div>
             <label class="control-label col-md-1" for="name">To</label>
           <div class="col-md-2">
                <input type="date" name="date" id="date" class="form-control" placeholder="Enter Date">
           </div>
           
              <div class="col-md-2" >
               <input type="submit" value="Display" class="btn btn-primary"> 
              </div>
              
           
 </div>
 <div class="container">
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>John</td>
        <td>Doe</td>
        <td>john@example.com</td>
      </tr>
      <tr>
        <td>Mary</td>
        <td>Moe</td>
        <td>mary@example.com</td>
      </tr>
      <tr>
        <td>July</td>
        <td>Dooley</td>
        <td>july@example.com</td>
      </tr>
    </tbody>
  </table>
 
 
 
 </div>
</div>
</body>
</html>