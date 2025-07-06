DROP DATABASE zona_fit_db;
CREATE DATABASE zona_fit_db;

USE zona_fit_db;

CREATE TABLE cliente (
    id INT AUTO_INCREMENT,
    nombre VARCHAR(45),
    apellido VARCHAR(45),
    membresia INT UNIQUE,
    PRIMARY KEY (id)
);


INSERT INTO cliente(nombre, apellido, membresia) VALUES
    ('Gabriel', 'Flores', 100),
    ('Paola', 'Castillo', 200),
    ('Carlos', 'Moreno', 300);


SELECT * FROM cliente;

UPDATE cliente
SET apellido = 'Juárez', membresia = 300
WHERE(id = 2);


UPDATE cliente
SET membresia = 200
WHERE(id = 2);

SELECT * FROM cliente;

DELETE FROM cliente WHERE(id = 3);

SELECT * FROM cliente;
