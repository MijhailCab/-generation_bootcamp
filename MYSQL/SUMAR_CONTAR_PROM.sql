-- COUNT(), AVG(), SUM()
-- COUNT sirve para contar 
-- AVG PROMEDIAR
-- SUM Sumar


USE sakila;

SELECT * FROM payment;

-- COUNT() contar los elementos o las celdas de una columna.
SELECT count(*) AS cantidad_filas from payment;
-- AS puede dar un nombre temporal a la consulta, como su alias temporal.
SELECT count(*) AS cantidad_filas from payment where staff_id = 2;

SELECT count(distinct customer_id) AS cantidad_usuarios from payment;


-- SUM ()
SELECT sum(amount) as total from payment where staff_id = 2;







-- Saber cual es el cliente que gasto más en rentas 
SELECT * FROM payment ORDER BY amount DESC;
SELECT customer_id, SUM(amount) AS total FROM payment GROUP BY customer_id;
SELECT SUM(amount), customer_id from payment GROUP BY customer_id ORDER BY sum(amount) DESC;



-- contar filas de la table world.country
select count(*) from world.country;



-- AVG
select avg(amount) as Promedio from payment where customer_id = 248 ;