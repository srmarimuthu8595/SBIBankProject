USE sampledb;

CREATE TABLE customerdetails(
   customerId int(11) NOT NULL AUTO_INCREMENT,
   custname varchar(50),
   surname varchar(50),
   dateofbirth varchar(15),
   age varchar(15),
   mobileNo varchar(15),
   emailId varchar(50),
   address varchar(50),
   street varchar(50),
   city varchar(50),
   pincode varchar(15),
   purposeofvisit varchar(1000),
   PRIMARY KEY (`customerId`)
 )

