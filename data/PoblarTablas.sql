-- Poblar la tabla 'clientes'
INSERT INTO clientes (cedula, nombre, apellido) VALUES (123456, 'Juan', 'Perez');
INSERT INTO clientes (cedula, nombre, apellido) VALUES (234567, 'Maria', 'Gomez');
INSERT INTO clientes (cedula, nombre, apellido) VALUES (345678, 'Juanita', 'Gomez');
INSERT INTO clientes (cedula, nombre, apellido) VALUES (456789, 'Sofia', 'Espinosa');
INSERT INTO clientes (cedula, nombre, apellido) VALUES (5678923, 'Andres', 'Pinzón');

-- Poblar la tabla 'establecimientos'
INSERT INTO establecimientos (id_servicio, tipo, categoria) VALUES (1, 'supermercado', '');
INSERT INTO establecimientos (id_servicio, tipo, categoria) VALUES (2, 'tienda', 'moda');
INSERT INTO establecimientos (id_servicio, tipo, categoria) VALUES (3, 'tienda', 'joyas');
INSERT INTO establecimientos (id_servicio, tipo, categoria) VALUES (4, 'supermercado', '');
INSERT INTO establecimientos (id_servicio, tipo, categoria) VALUES (5, 'tienda', 'Fitness');

-- Poblar la tabla 'facturas'
INSERT INTO facturas (num_factura, vendedor, costo_total, num_reserva_serv, id_reserva) VALUES (1, 'spa', 100, 1, 1);
INSERT INTO facturas (num_factura, vendedor, costo_total, num_reserva_serv, id_reserva) VALUES (2, 'internet', 150, 2, 2);
INSERT INTO facturas (num_factura, vendedor, costo_total, num_reserva_serv, id_reserva) VALUES (3, 'restaurante', 150, 2, 2);
INSERT INTO facturas (num_factura, vendedor, costo_total, num_reserva_serv, id_reserva) VALUES (4, 'servicio habitacion', 150, 2, 2);
INSERT INTO facturas (num_factura, vendedor, costo_total, num_reserva_serv, id_reserva) VALUES (5, 'bar', 150, 2, 2);

-- Agrega más tuplas según sea necesario

-- Poblar la tabla 'gimnasios'
INSERT INTO gimnasios (id_servicio, costo, capacidad, horario) VALUES (1, 50, 30, TO_DATE('2023-10-01', 'YYYY-MM-DD'));
INSERT INTO gimnasios (id_servicio, costo, capacidad, horario) VALUES (2, 60, 40, TO_DATE('2023-10-01', 'YYYY-MM-DD'));
-- Agrega más tuplas según sea necesario

-- Poblar la tabla 'habitaciones'
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id_reserva, hotel_nit, reserva_cedula) VALUES (1, 'sencilla', 2, 100, 'true', 'false', 'true', 'false', 'false', 'false', 1, 1, 12345);
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id_reserva, hotel_nit, reserva_cedula) VALUES (2, 'suite', 4, 250, 'true', 'true', 'true', 'true', 'true', 'true', 2, 2, 67890);
-- Agrega más tuplas según sea necesario

-- Poblar la tabla 'hoteles'
INSERT INTO hoteles (nit, nombre) VALUES (1, 'Hotel A');
INSERT INTO hoteles (nit, nombre) VALUES (2, 'Hotel B');
-- Agrega más tuplas según sea necesario

-- Continúa con las demás tablas y sus registros
