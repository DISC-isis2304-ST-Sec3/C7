-- Registrar la llegada de un cliente al hotel
DECLARE
   numero_cedula NUMERIC := 123456; -- El número de cédula del cliente
   nueva_fecha_entrada DATE := '2023-10-01'; -- Nueva fecha de entrada
BEGIN
   UPDATE Reserva
   SET fecha_entrada = nueva_fecha_entrada
   WHERE cliente_cedula = numero_cedula
   AND fecha_entrada IS NULL; -- Esto asegura que solo se actualice si la fecha de entrada aún no está establecida
END;

-- Actualizar la fecha de llegada de un cliente al hotel
DECLARE
   numero_cedula NUMERIC := 123456; -- El número de cédula del cliente
   nueva_fecha_entrada DATE := '2023-11-01'; -- Nueva fecha de llegada
BEGIN
   UPDATE Reserva
   SET fecha_entrada = nueva_fecha_entrada
   WHERE cliente_cedula = numero_cedula;
END;

-- Borrar la fecha de llegada de un cliente al hotel
DECLARE
   numero_cedula NUMERIC := 123456; -- El número de cédula del cliente
BEGIN
   UPDATE Reserva
   SET fecha_entrada = "null"
   WHERE cliente_cedula = numero_cedula;
END;


-- Consultar la fecha de llegada de un cliente al hotel
SELECT fecha_entrada
FROM Reserva
WHERE cliente_cedula = 123456;