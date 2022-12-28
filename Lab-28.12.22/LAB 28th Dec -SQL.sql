USE lab_souravdb;

Create table Department (
Department_ID int Primary Key,
Department_Name Varchar(30),
Department_Head Varchar(30),
Department_Description Varchar(30)
);
Create table Employee1  (
Employee_Id int Primary key,
Employee_Name Varchar(30),
Employee_Address Varchar(30),
Employee_Salary double,
Employee_Contact_No int,
Department_Id int Fostudent_joinreign Key
);
