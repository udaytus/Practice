# Write your MySQL query statement below

select FirstName, LastName, City, State
from Person left join Address
on Person.PersonId = Address.PersonId
;  

#select columns to display from table then join with table using column 