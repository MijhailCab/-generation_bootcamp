-- CREAR

-- crear base de datos
CREATE DATABASE familia;
-- CREATE SCHEMA familia;

-- seleccionar la base de datos
USE familia;

-- Crear tabla de persona
-- no es necesario poner NOT NULL en la llave primaria, esto debido a que ya es AUTO INCREMENT
-- por defecto el valor asignado es NULL 
-- Debemos especificar cual es la llave primaría. con PRIMARY KEY
-- Para agregar valores unicos se utiliza UNIQUE


CREATE TABLE persona(
persona_id int AUTO_INCREMENT,
nombre VARCHAR(255) NOT NULL,
correo VARCHAR(255) NOT NULL,
edad int NOT NULL,
estado VARCHAR(255) DEFAULT "DESCONOCIDO",
cumpleanios DATE,
PRIMARY KEY(persona_id),
CONSTRAINT correo_unico UNIQUE(correo)

 );


-- Insertar datos en una tabla
-- Tienen que ser en el orden indicado
-- No se necesita colocar el id porque es auto incrementable 
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values 
("Mijhail",'mijhai cabrera@gmail.com',24,'Feliz','1997-12-09'),
('pepito','pepito@gmail.com',24,'Triste','1998-05-31');

-- Error 1062: Dato unico repetido
INSERT INTO persona(nombre, correo, edad, estado, cumpleanios) values 
('Pepe', 'yair@gmail.com', 34, 'Alegre', '1980-01-01');

-- Error 1364: No llenar un dato NOT NULL
INSERT INTO persona(correo, edad, estado, cumpleanios) values
('pepe@gmail.com',34,'Alegre','1980-01-01');

-- Ingresar datos que no son necesarios (No tiene el cumpleanios)
INSERT INTO persona(nombre, correo, edad, estado) values 
('Pepe', 'pepe@gmail.com', 34, 'Alegre');

-- Ingresar dato con valor por defecto (No tiene el estado)
INSERT INTO persona(nombre, correo, edad, cumpleanios) values
('Toño', 'ton@gmail.com', 40, '1970-10-10' );





SELECT * FROM persona;


CREATE TABLE mascota(
mascota_id int AUTO_INCREMENT,
nombre VARCHAR(255) NOT NULL,
edad int NOt NULL,
fk1_persona int NOT NULL,
PRIMARY KEY(mascota_id),
FOREIGN KEY(fk1_persona) REFERENCES persona(persona_id)
ON DELETE CASCADE
ON UPDATE CASCADE
);


SELECT * FROM mascota;

INSERT INTO mascota (nombre, edad, fk1_persona) values
('Rayson',3,1);

INSERT INTO mascota (nombre,edad, fk1_persona) values
('Sambu',6,1);

INSERT INTO mascota (nombre, edad, fk1_persona) values
('Canela',11,1),
('Subaru',3,2);

INSERT INTO mascotita(nombre, edad, fk1_persona) values
('Roy',2,3);
INSERT INTO mascotita(nombre, edad, fk1_persona) values
('Totoy',5,5);
INSERT INTO mascotita(nombre, edad, fk1_persona) values
('Lobo',6,4);

