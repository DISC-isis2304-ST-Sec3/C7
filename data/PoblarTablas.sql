-- Poblar la tabla 'clientes'
INSERT INTO clientes (cedula, nombre, apellido) VALUES (123456, 'Juan', 'Perez');
INSERT INTO clientes (cedula, nombre, apellido) VALUES (234567, 'Maria', 'Gomez');
INSERT INTO clientes (cedula, nombre, apellido) VALUES (345678, 'Juanita', 'Gomez');
INSERT INTO clientes (cedula, nombre, apellido) VALUES (456789, 'Sofia', 'Espinosa');
INSERT INTO clientes (cedula, nombre, apellido) VALUES (5678923, 'Andres', 'Pinzón');

-- Poblar la tabla 'establecimientos'
INSERT INTO establecimientos (id, tipo, categoria) VALUES (1, 'supermercado', '');
INSERT INTO establecimientos (id, tipo, categoria) VALUES (2, 'tienda', 'moda');
INSERT INTO establecimientos (id, tipo, categoria) VALUES (3, 'tienda', 'joyas');
INSERT INTO establecimientos (id, tipo, categoria) VALUES (4, 'supermercado', '');
INSERT INTO establecimientos (id, tipo, categoria) VALUES (5, 'tienda', 'Fitness');

-- Poblar la tabla 'facturas'
INSERT INTO facturas (num_factura, vendedor, costo_total, reserva_servicio_id, reserva_id) VALUES (1012, 'spa', 100, 1, 001);
INSERT INTO facturas (num_factura, vendedor, costo_total, reserva_servicio_id, reserva_id) VALUES (2123, 'internet', 40, 2, 002 );
INSERT INTO facturas (num_factura, vendedor, costo_total, reserva_servicio_id, reserva_id) VALUES (3234, 'restaurante', 400, 3, 003);
INSERT INTO facturas (num_factura, vendedor, costo_total, reserva_servicio_id, reserva_id) VALUES (4345, 'servicio habitacion', 1500, 4, 004);
INSERT INTO facturas (num_factura, vendedor, costo_total, reserva_servicio_id, reserva_id) VALUES (5456, 'bar', 250, 3, 005);

-- Poblar la tabla 'gimnasios'
INSERT INTO gimnasios (id, costo, capacidad, horario) VALUES (1, 50, 30, TO_DATE('2023-10-01', '2023-10-02'));
INSERT INTO gimnasios (id, costo, capacidad, horario) VALUES (2, 60, 10, TO_DATE('2023-10-04', '2023-10-05'));
INSERT INTO gimnasios (id, costo, capacidad, horario) VALUES (3, 70, 20, TO_DATE('2023-10-08', '2023-10-10'));
INSERT INTO gimnasios (id, costo, capacidad, horario) VALUES (4, 80, 14, TO_DATE('2023-10-24', '2023-10-26'));
INSERT INTO gimnasios (id, costo, capacidad, horario) VALUES (5, 90, 3, TO_DATE('2023-10-13', '2023-10-15'));

-- Poblar la tabla 'habitaciones'
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (301, 'sencilla', 2, 100, 'true', 'true', 'true', 'false', 'false', 'false', 001, 9876);
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (302, 'suite', 8, 450, 'true', 'true', 'true', 'true', 'true', 'true', 002, 8765);
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (303, 'doble', 4, 250, 'true', 'true', 'true', 'false', 'true', 'true', 003, 7654);
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (304, 'doble', 4, 250, 'true', 'true', 'true', 'false', 'true', 'true', 004, 6543);
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (305, 'suite', 8, 450, 'true', 'true', 'true', 'true', 'true', 'true', 005, 5432);

-- Poblar la tabla 'hoteles'
INSERT INTO hoteles (nit, nombre) VALUES (9876, 'Marriot');
INSERT INTO hoteles (nit, nombre) VALUES (8765, 'Hilton');
INSERT INTO hoteles (nit, nombre) VALUES (7654, 'Four seasons');
INSERT INTO hoteles (nit, nombre) VALUES (6543, 'Estelar');
INSERT INTO hoteles (nit, nombre) VALUES (5432, 'Decameron');

-- Agrega más tuplas según sea necesario

-- Continúa con las demás tablas y sus registros
