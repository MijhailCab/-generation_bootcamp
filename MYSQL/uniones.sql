-- mostrar las direcciones de cada pais
/*
adress - address / city_id
city - city_id/city / country_id
country - country / country_id
*/
USE tienda;
-- JOIN
select
country.country_id as clave_de_Pais,
country.country as Pais,
city.city_id as Clave_de_ciudad,
city.city as Ciudad,
address.address as Direccion
from country
inner join city on city.country_id = country.country_id
inner join address on address.city_id = city.city_id;

-- LEFT JOIN
select
cliente.nombre as nombre, 
factura.idFactura
from cliente 
left join factura on cliente.idCliente = factura.idCliente
order by nombre;

-- Right JOIN
select
cliente.nombre as nombre, 
factura.idFactura
from cliente 
right join factura on cliente.idCliente = factura.idCliente
order by idFactura;

