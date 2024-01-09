<html>
   <jsp:include page="/WEB-INF/include/header.jsp"/>
  <body>
    <div align="center">
       <h3>Add Visiting Customer Details</h3>
    </div>
    <form action="addcustomer" method="get" method="get">
     <div align="center">
         <% 
	         String value = (String)request.getAttribute("status");
	          if(value!=null){
	        	  out.println(value);
	          }
         %>
      </div>
     <div align="center">
         <table>
            <tr><td>Customer Name :</td><td><input type="text" name="custname"/></td></tr>
            <tr><td>Surname :</td><td><input type="text" name="surname"/></td></tr>
            <tr><td>Date of Birth :</td><td><input type="text" name="dob"/></td></tr>
            <tr><td>Age :</td><td><input type="text" name="age"/></td></tr>
            <tr><td>Mobile No :</td><td><input type="text" name="mobile"/></td></tr>
            <tr><td>Email Id :</td><td><input type="text" name="email"/></td></tr>
            <tr><td>Address :</td><td><input type="text" name="address"/></td></tr>
            <tr><td>Street :</td><td><input type="text" name="street"/></td></tr>
            <tr><td>City :</td><td><input type="text" name="city"/></td></tr>
            <tr><td>Pincode :</td><td><input type="text" name="pincode"/></td></tr>
            <tr><td>Purpose of Visit :</td><td><input type="text" style="font-size: 18pt; height: 40px; width:280px;" name="purpose"/></td></tr>
         
          </table>
       </div>
       <br>
       <br>
       
       <div align="center">
           <button type="submit" name="addcustomer" value="Add Customer">Add Customer</button>
       </div>
    
    </form>
   </body>
</html>