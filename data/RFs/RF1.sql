
--Actualizar y registrar

UPDATE Usuarios
SET tipo_usuario = 'nuevo_tipo_usuario'
WHERE cedula = valor_de_cedula;

UPDATE Usuarios
SET tipo_usuario = 'Empleado'
WHERE cedula = 5;

--Eliminar

UPDATE Usuarios
SET tipo_usuario = 'nuevo_tipo_usuario'
WHERE cedula = valor_de_cedula;

UPDATE Usuarios
SET tipo_usuario = 'null'
WHERE cedula = 2 ;

--Consultar

SELECT tipo_usuario
FROM Usuarios
WHERE cedula = valor_de_cedula;

SELECT tipo_usuario
FROM Usuarios
WHERE cedula = 4;
