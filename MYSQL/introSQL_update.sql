-- ACTUALIZAR

-- Agregar una columna 
ALTER TABLE mascota ADD COLUMN especie VARCHAR(255) NOT NULL;

-- Agregar una columna en una posicion especifica 
ALTER TABLE mascota ADD COLUMN cumpleanios DATE AFTER edad;

-- Modificar las caracteristicas de una columna 
ALTER TABLE mascota MODIFY cumpleanios VARCHAR(255);
ALTER TABLE mascota MODIFY especie VARCHAR(255);
ALTER TABLE mascota MODIFY edad int;

-- Cambiar nombre de una tabla
ALTER TABLE mascota RENAME Mascotita;

SELECT * FROM Mascotita;
SELECT * FROM persona;


-- Actualizar datos de una fila
UPDATE mascotita SET especie = "Gato" WHERE nombre= "Leo";



