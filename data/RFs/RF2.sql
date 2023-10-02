--registrar
INSERT INTO Usuarios (cedula, nombre, apellido, tipo_usuario)
        VALUES (nueva_cedula, nuevo_nombre, nuevo_apellido, nuevo_tipo_usuario);

INSERT INTO Usuarios (cedula, nombre, apellido, tipo_usuario)
        VALUES (8, 'pedro', 'murillo', 'Administrador');

--Actualizar

UPDATE Usuarios
SET cedula = nueva_cedula, 
    nombre = 'nuevo_nombre', 
    apellido = 'nuevo_apellido', 
    tipo_usuario = 'nuevo_tipo_usuario'
WHERE cedula = valor_cedula_actual;

UPDATE Usuarios
SET cedula = 6, 
    nombre = 'nombrenuevo', 
    apellido = 'nuevoapellido', 
    tipo_usuario = 'gerente'
WHERE cedula = 5;

--Eliminar

DELETE FROM Usuarios
WHERE cedula = valor_cedula;

DELETE FROM Usuarios
WHERE cedula = 1;

--Consultar#

SELECT *
FROM Usuarios
WHERE cedula = valor_cedula;

SELECT *
FROM Usuarios
WHERE cedula = 4;