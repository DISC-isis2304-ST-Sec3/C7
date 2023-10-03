-- Registrar la fecha de salida de un cliente del hotel
DECLARE
   numero_cedula NUMERIC := 234567; -- El número de cédula del cliente
   nueva_fecha_salida DATE := '2023-10-10'; -- Nueva fecha de salida
BEGIN
   UPDATE Reserva
   SET fecha_salida = nueva_fecha_salida
   WHERE cliente_cedula = numero_cedula;
END;

-- Actualizar la fecha de salida de un cliente del hotel
DECLARE
   numero_cedula NUMERIC := 234567; -- El número de cédula del cliente
   nueva_fecha_salida DATE := '2023-11-15'; -- Nueva fecha de salida
BEGIN
   UPDATE Reserva
   SET fecha_salida = nueva_fecha_salida
   WHERE cliente_cedula = numero_cedula;
END;


-- Borrar la fecha de salida de un cliente del hotel
DECLARE
   numero_cedula NUMERIC := 234567; -- El número de cédula del cliente
BEGIN
   UPDATE Reserva
   SET fecha_salida = "null"
   WHERE cliente_cedula = numero_cedula;
END;

-- Consultar la fecha de salida de un cliente del hotel
SELECT fecha_salida
FROM Reserva
WHERE cliente_cedula = 234567;

