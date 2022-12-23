USE lab_souravdb;

# 1. Create table Customer the following tables with the constraints mentioned
create table Customer(
Cust_id varchar(3) primary key,
 Fname varchar(25) not null,
 Lname varchar(25),
 Area varchar(3) not null,
 Phone int(10)
);
# insert customer table  data
insert into customer values
('A01', 'Ivan', 'Ross', 'SA', 6125467),
('A02', 'Vandana', 'Ray', 'MU', 5560379),
('A03', 'Pramada', 'Jauguste', 'DA', 4560389),
('A04', 'Basu', 'Navindi', 'BA', 6125401),
('A05', 'Ravi', 'Shridhar', 'NA', null),
('A06', 'Rukmini', 'Aiyer', 'GH', 5125274);
select * from customer;
# Create table Movie the following tables with the constraints mentioned
create table Movie(
Mv_no int(2) primary key,
Cust_id varchar(3),
foreign Key(Cust_id) references customer(Cust_id),
Title varchar(20) not null,
Star varchar(3) not null,
Price int(3)
);
# insert Movie table data
insert into Movie values 
(1, 'A02', 'Bloody', 'JC', 181),
(2, 'A04', 'The Firm', 'TC', 200),
(3, 'A01', 'Pretty Woman', 'RG', 151),
(4, 'A06', 'Home Alone', 'MC', 150),
(5, 'A05', 'The Fugitive', 'MF', 200),
(6, 'A03', 'Coma', 'MD', 100),
(7, 'A02', 'Dracula', 'GO', 150),
(8, 'A06', 'Quick Change', 'BM', 100),
(9, 'A03', 'Gone with the Wind', 'CB', 200),
(10, 'A05', 'Carry on Doctor', 'LP', 100);
select * from movie;

# 2. Prove that entity integrity constraint is ensured by both the tables. (2 conditions to be checked).
insert into customer values
(null,'Ivan','Ross','SA',6125467);  -- error because primary key can't be null
 -- for movie table
 insert into Movie values 
(null,'A02','Bloody','JC',181); --  -- error because primary key can't be null
# 3. Prove that referential integrity constraint is ensured by both the tables.
insert into Movie values
(20,'A11','Bloody','JC',181);  -- the movie table refer to the customer table so, 
-- due to the referential integrity constraint rule the cust_id which is not present inside the customer table that's why
-- the error will occur.
insert into Movie values
(Ab,'A02','Bloody','JC',188);
-- due to damain intigiry constraint we can't put character value in the Mo_no column 
-- because this column only contain integer value
# 4. Prove that domain integrity constraint is ensured by the Movie table.

# 5. Display the movie titles, whose price is greater than 100 but less than 200.
select Title, price from movie where price between 101 and 199;
# 6. Display the cust_id who have seen movies having stars as either JC or TC or MC.
select cust_id FROM MOVIE where star = 'JC' OR star = 'TC' OR star = 'MC';
# 7. Display the details of those customers who have an A in their area name.
select * from customer where area like '%A%';
# 8. Display the movie titles, whose price is within 180 and the movie titles are of exactly 6 characters.
select title from movie where price <=18 and length(title)=6;
# 9. Display the movie name, their original prices and the prices after 10% increment.Give alias name to the incremented price column.
select title, price, price + (price * 1/10) as 'incremented price' from movie;
# 10.Display all the customer details in the following way: ‘Ivan Ross stays in SA and his phone number is 6125467.’
select concat(fname," ",lname," ","stays in ",area," ","and his phone number is ",phone) from customer where fname='Ivan' and lname='Ross' and phone =6125467;
-- Ivan Ross stays in SA and his phone number is 6125467 ==> output 

# 11.Add a not null constraint to the Lname field in Customer.
alter table customer modify Lname varchar(25) not null;
# 12.Display the customer’s name whose phone number is not recorded.
select fname,lname from customer where phone is null;
# 13.Add the phone number according to your own wish for the person mentioned in problem no 12.
update customer set phone = 99887766 where phone is null;
# 14.Display the unique customer ids from movie table.
select distinct Cust_id from movie;
# 15.Remove the not null constraint from Star column in movie table.
alter table movie modify Star varchar (2);
# 16.Delete any row from the Customer table. If you cannot delete, then note the error message displayed.
delete from customer where Cust_id ='A03'; # # WE CANNOT DELETE OR UPDATE A PARENT ROW: BECAUSE OF THIS IS A FOREIGN KEY CONSTRAINT.
# 17.Delete any row from the Movie table. If you cannot delete, then note the error message displayed.
delete from movie where Mv_no =5; # delete successfully done
# 18.Drop the Customer table. If you cannot drop, then note the error message displayed.
drop table customer;   # # WE cannot drop A PARENT ROW: BECAUSE OF THIS IS A FOREIGN KEY CONSTRAINT.
# 19.Drop the Movie table. If you cannot drop, then note the error message displayed
drop table movie;  # # drop successfully done
# 20.Drop the foreign key from Movie table.
alter table movie drop column cust_id;    
