-- Borrar

SELECT * FROM mascota;

-- Borrar una fila 
DELETE FROM mascota WHERE mascota_id = 2;

-- Borrar una columna
ALTER TABLE mascota DROP COLUMN cumpleanios;
ALTER TABLE mascota DROP COLUMN especie;

-- Borrar una tabla
DROP TABLE persona;
-- error3730 cuando se tiene relacion con otra tabla de manera directa no se podra


-- Borrar la base de datos
DROP DATABASE familia;