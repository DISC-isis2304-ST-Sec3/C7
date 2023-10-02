--Registrar 

DECLARE
   cliente_cedula NUMERIC := 123456; 
   servicio_id NUMERIC := 1;         
   fecha_inicio DATE := '2023-10-01';
   fecha_fin DATE := '2023-10-03';    
   factura_num NUMERIC := 5;       
BEGIN
   INSERT INTO Reserva_Servicio (fecha_inicio, fecha_fin, Factura_num, Servicio_id)
   VALUES (fecha_inicio, fecha_fin, factura_num, servicio_id)
   WHERE id_reserva IN (
      SELECT id_reserva
      FROM Reservas
      WHERE Cliente_cedula = cliente_cedula
   );
END;

--Actualizar

DECLARE
   cliente_cedula NUMERIC := 456789; 
   servicio_id NUMERIC := 3;         
   fecha_inicio DATE := '2023-10-01';
   fecha_fin DATE := '2023-10-03';    
   factura_num NUMERIC := 3;     
BEGIN
   UPDATE Reserva_Servicio
   SET fecha_inicio = nueva_fecha_inicio, fecha_fin = nueva_fecha_fin
   WHERE Servicio_id = servicio_id
   AND id_reserva IN (
      SELECT id_reserva
      FROM Reservas
      WHERE Cliente_cedula = cliente_cedula
   );
END;

--Eliminar

DECLARE
   cliente_cedula NUMERIC := 5678923; 
   servicio_id NUMERIC := 6;        
BEGIN
   DELETE FROM Reserva_Servicio
   WHERE Servicio_id = servicio_id
   AND id_reserva IN (
      SELECT id_reserva
      FROM Reservas
      WHERE Cliente_cedula = cliente_cedula
   );
END;

--Consultar


SELECT RS.id_reserva, S.nombre AS nombre_servicio, RS.fecha_inicio, RS.fecha_fin
FROM Reserva_Servicio RS
INNER JOIN Servicio S ON RS.Servicio_id = S.id
WHERE id_reserva IN (
   SELECT id_reserva
   FROM Reservas
   WHERE Cliente_cedula = 5678923
);

------------------

SELECT *
FROM RESERVAS
    INNER JOIN FACTURAS
    ON RESERVAS.ID_RESERVA = FACTURAS.ID_RESERVA
    INNER JOIN RESERVAS_SERVICIO
    ON FACTURA.NUM_FACTURA = RESERVAS_SERVICIO.FACTURA_NUM
    INNER JOIN SERVICIOS
    ON RESERVAS_SERVICIO.SERVICIO.ID = SERVICIOS.ID
WHERE RESERVAS.CLIENTE_CEDULA = 1 AND SERVICIOS.ID = 1;
