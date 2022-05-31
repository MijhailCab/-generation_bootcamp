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



