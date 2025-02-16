# Write your MySQL query statement below
select P.product_name, S.year, S.price
from Sales S
Inner Join Product P
on P.product_id = S.product_id