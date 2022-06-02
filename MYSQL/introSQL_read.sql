-- LEER 
-- muestra las bases de datos que tenemos 
SHOW DATABASES;

-- seleccionar la base de datos a usar. 
USE sakila;

-- leer todos los datos de una tabla 
SELECT * FROM actor;
SELECT * FROM city; 

-- leer partes de una tabla

SELECT city, city_id FROM city;
-- Estas son las consultas más frecuentes.


-- Limitar la cantidad de datos 
SELECT * FROM actor LIMIT 10;

-- Ordenar los dados dependiendo de una columna
SELECT * FROM city ORDER BY city ASC;

-- Ordenar los dados dependiendo de una columna
SELECT * FROM city ORDER BY country_id DESC;

/*
Operadores de comparación 
    
  1  Igual                ""
  2  Distinto             !=
  3  Mayor                >
  4  Menor                <
  5  Mayor o igual        >=
  6  Menor o igual que    <=
  7  Como                 LIKE
  
*/
-- 1
SELECT * FROM city WHERE city = "Cuman";
SELECT * FROM actor WHERE first_name = "penelope";
-- 2
SELECT * FROM actor WHERE first_name != 'penelope';
-- 3 
SELECT * FROM actor WHERE actor_id > 50;
-- 4
SELECT * FROM actor WHERE actor_id < 100;
-- 5
SELECT * FROM actor WHERE actor_id >= 50;
-- 6
SELECT * FROM actor WHERE actor_id <= 100;
-- 7
SELECT * FROM actor WHERE first_name lIKE 'PENELOPE';
-- Se utiliza para realizar bsuquedas 
-- Selecciona de la tabla de las personas que terminen en sus fisrts name con "ope" ej
SELECT * FROM actor WHERE first_name LIKE '%ope';
-- Seleccionar de la tabla todas las personas cuyo fisrt name omiencse en "an"
SELECT * FROM actor WHERE first_name LIKE 'an%';
-- Seleccionar de la tabla todas las personas cuyo first_name contengan "n"
SELECT * FROM actor WHERE first_name LIKE "%nn%";
-- Seleccionar de la tabla todas las personas que contengam "lope"
SELECT * FROM actor WHERE first_name LIKE "%lope%";
-- Seleccionar un patron 
SELECT * FROM actor WHERE first_name LIKE "%a__e%";

-- NOT LIKE 
SELECT * FROM actor WHERE first_name NOT LIKE "%a______e%";

-- uniendo todo
SELECT * FROM actor WHERE first_name LIKE "%nn%" ORDER BY last_name ASC LIMIT 5;

/*
OPERADORES LOGICOS
1 AND      Debe cumplir ambas condiciones
OR       Basta con que cumpla una de ellas
*/
-- 1
SELECT * FROM actor WHERE actor_id > 50 AND first_name LIKE "%n%";
-- 2
SELECT * FROM actor WHERE first_name LIKE "%k%" OR  first_name LIKE "%k%" ;



