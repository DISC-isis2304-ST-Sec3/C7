--Instertar

INSERT INTO Servicios (id, nombre, horario_inicio, horario_cierre, hotel_NIT)
VALUES (id, 'nombre_servicio', TO_DATE('fecha', 'YYYY-MM-DD'), TO_DATE('fecha', 'YYYY-MM-DD'), hotel_NIT);

INSERT INTO Servicios (id, nombre, horario_inicio, horario_cierre, hotel_NIT)
VALUES (22, 'Servicio A', TO_DATE('2023-10-01', 'YYYY-MM-DD'), TO_DATE('2023-10-03', 'YYYY-MM-DD'), 104);

--Actualizar

UPDATE Servicios
SET nombre = 'NuevoNombreServicio', 
    horario_inicio = TO_DATE('fecha', 'YYYY-MM-DD'), 
    horario_cierre = TO_DATE('fecha', 'YYYY-MM-DD'), 
    hotel_NIT = 'NuevoNITHotel'
WHERE id = id_Servicio_a_actualizar;

UPDATE Servicios
SET nombre = 'Serivico abc', 
    horario_inicio = TO_DATE('2023-11-01', 'YYYY-MM-DD'), 
    horario_cierre = TO_DATE('2023-12-04', 'YYYY-MM-DD'), 
    hotel_NIT = 104
WHERE id = 5;

--Eliminar

DELETE FROM Servicios
WHERE id = id_Servicio_a_eliminar;

DELETE FROM Servicio
WHERE id = 10;

--Consultar

SELECT * FROM Servicios
WHERE id = id_Servicio_a_consultar;

SELECT * FROM Servicio
WHERE id = 4;
