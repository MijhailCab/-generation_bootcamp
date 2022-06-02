USE world;
SELECT 5 + 5;
SELECT * from country;
-- Buscar categorias de una tabla
SELECT `Name`, population FROM country order by population DESC;
-- Buscar algun elemento dentro de la tabla en especifico.
SELECT * FROM country where `Name`= 'Mexico';
-- Buscar un rango
SELECT * FROM country WHERE population > 50000000 AND population < 70000000 order by population;
-- Seleccionar los valores dentro de un rango BETWEEN
-- Between 
SELECT * FROM country WHERE population between 50000000 AND  70000000 order by population;

-- IN Para especificar valores.
SELECT * FROM country WHERE continet = 'Asia' or Continent = 'North America' or continet ;
SELECT `code`, `name`, region, continent, surfacearea, LifeExpectancy, GNP FROM country WHERE continent IN ('North America', 'Asia', 'Oceania') OR region IN ('Caribean', 'Central America') ORDER BY GNP ASC;


-- like buscar un patrón especifico 
SELECT * FROM country WHERE `Name` like '%and';
SELECT * FROM country WHERE `Name` like '%e__a';



