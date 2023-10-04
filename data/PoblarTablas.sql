-- Poblar la tabla 'clientes'
INSERT INTO clientes (cedula, nombre, apellido, usuario_login, clave_login) VALUES (123456, 'Juan', 'Perez', 'juan12', '2023');
INSERT INTO clientes (cedula, nombre, apellido, usuario_login, clave_login) VALUES (234567, 'Maria', 'Gomez', 'maria23', '2023');
INSERT INTO clientes (cedula, nombre, apellido, usuario_login, clave_login) VALUES (345678, 'Juanita', 'Gomez', 'juanita34', '2023');
INSERT INTO clientes (cedula, nombre, apellido, usuario_login, clave_login) VALUES (456789, 'Sofia', 'Espinosa', 'sofia45', '2023');
INSERT INTO clientes (cedula, nombre, apellido, usuario_login, clave_login) VALUES (5678923, 'Andres', 'Pinzon', 'andres56', '2023');

-- Poblar la tabla 'hoteles'
INSERT INTO hoteles (nit, nombre) VALUES (104, 'Marriott');

-- Poblar la tabla 'servicios'
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (1, 'gimnasio', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (2, 'gimnasio', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (3, 'Restaurante italiano', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (4, 'Restaurante colombiano', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (5, 'Restaurante asiatico', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (6, 'supermercado', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (7, 'tienda moda', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (8, 'tienda joyas', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (9, 'Spa', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (10, 'Spa', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (11, 'Spa', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (12, 'salon conferencia', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (13, 'salon reunion', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (14, 'salon conferencia', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (15, 'piscina', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (16, 'internets', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (17, 'lavado', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (18, 'planchado', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (20, 'embolado', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (21, 'tijeras', '08:00', '22:00', 104);
INSERT INTO servicios (id, nombre, horario_inicio, horario_cierre, hotel_nit) VALUES (22, 'toallas', '08:00', '22:00', 104);
-- Poblar la tabla 'establecimientos'
INSERT INTO establecimientos (id, tipo, categoria) VALUES (6, 'supermercado', '');
INSERT INTO establecimientos (id, tipo, categoria) VALUES (7, 'tienda', 'moda');
INSERT INTO establecimientos (id, tipo, categoria) VALUES (8, 'tienda', 'joyas');

-- Poblar la tabla 'restaurantes'
INSERT INTO restaurantes (id, capacidad, estilo) VALUES (3, 100, 'Italiano');
INSERT INTO restaurantes (id, capacidad, estilo) VALUES (4, 150, 'Colombiano');
INSERT INTO restaurantes (id, capacidad, estilo) VALUES (5, 200, 'Asiatico');

-- Poblar la tabla 'gimnasios'
INSERT INTO gimnasios (id, costo, capacidad, horario) VALUES (1, 50, 30, '08:00 - 22:00');
INSERT INTO gimnasios (id, costo, capacidad, horario) VALUES (2, 60, 10, '09:00 - 21:00');

-- Poblar la tabla 'piscinas'
INSERT INTO piscinas (id, costo, capacidad, profundidad) VALUES (15, 20, 50, 1.5);

-- Poblar la tabla 'spas' 
INSERT INTO spas (id, capacidad, calificacion) VALUES (9, 10, 4.5);
INSERT INTO spas (id, capacidad, calificacion) VALUES (10, 10, 5);
INSERT INTO spas (id, capacidad, calificacion) VALUES (11, 10, 3.5);

-- Poblar la tabla 'salones_eventos'
INSERT INTO salones_eventos (id, costo, capacidad, tipo) VALUES (12, 500, 200, 'conferencia');
INSERT INTO salones_eventos (id, costo, capacidad, tipo) VALUES (13, 500, 200, 'reunion');
INSERT INTO salones_eventos (id, costo, capacidad, tipo) VALUES (14, 500, 200, 'conferencia');

-- Poblar la tabla 'facturas'
INSERT INTO facturas (num_factura, vendedor, costo_total) VALUES (1, 'gimnasio', 100);
INSERT INTO facturas (num_factura, vendedor, costo_total) VALUES (2, 'spa', 40 );
INSERT INTO facturas (num_factura, vendedor, costo_total) VALUES (3, 'restaurante italiano', 400);
INSERT INTO facturas (num_factura, vendedor, costo_total) VALUES (4, 'salon conferencia', 1500);
INSERT INTO facturas (num_factura, vendedor, costo_total) VALUES (5, 'salon reunion', 250);

-- Poblar la tabla 'reservas'
INSERT INTO reservas (id_reserva, fecha_entrada, fecha_salida, num_personas, clientes_cedula, factura_num) VALUES (001, '2023-10-01', '2023-10-05', 2, 123456, 1);
INSERT INTO reservas (id_reserva, fecha_entrada, fecha_salida, num_personas, clientes_cedula, factura_num) VALUES (002, '2023-10-01', '2023-10-05', 2, 234567, 2);
INSERT INTO reservas (id_reserva, fecha_entrada, fecha_salida, num_personas, clientes_cedula, factura_num) VALUES (003, '2023-10-01', '2023-10-05', 2, 345678, 3);
INSERT INTO reservas (id_reserva, fecha_entrada, fecha_salida, num_personas, clientes_cedula, factura_num) VALUES (004, '2023-10-01', '2023-10-05', 2, 456789, 4);
INSERT INTO reservas (id_reserva, fecha_entrada, fecha_salida, num_personas, clientes_cedula, factura_num) VALUES (005, '2023-10-01', '2023-10-05', 2, 5678923, 5);

-- Poblar la tabla 'habitaciones'
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (301, 'sencilla', 2, 100, 'true', 'true', 'true', 'false', 'false', 'false', 001, 104);
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (302, 'suite', 8, 450, 'true', 'true', 'true', 'true', 'true', 'true', 002, 104);
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (303, 'doble', 4, 250, 'true', 'true', 'true', 'false', 'true', 'true', 003, 104);
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (304, 'doble', 4, 250, 'true', 'true', 'true', 'false', 'true', 'true', 004, 104);
INSERT INTO habitaciones (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi, reserva_id, hotel_nit) VALUES (305, 'suite', 8, 450, 'true', 'true', 'true', 'true', 'true', 'true', 005, 104);

-- Poblar la tabla 'productos'
INSERT INTO productos (id_producto, nombre, costo, establecimiento_id, restaurante_id) VALUES (3, 'Producto 3', 30, 3, 3);
INSERT INTO productos (id_producto, nombre, costo, establecimiento_id, restaurante_id) VALUES (4, 'Producto 4', 40, 4, 4);
INSERT INTO productos (id_producto, nombre, costo, establecimiento_id, restaurante_id) VALUES (5, 'Producto 5', 50, 5, 5);

-- Poblar la tabla 'internets'
INSERT INTO internets (id, capacidad, precio_noche) VALUES (16, 100, 5);
INSERT INTO internets (id, capacidad, precio_noche) VALUES (17, 100, 5);

-- Poblar la tabla 'limpiezas'
INSERT INTO limpiezas (id, tipo, costo, numero_prendas) VALUES (18, 'lavado', 15, 5);
INSERT INTO limpiezas (id, tipo, costo, numero_prendas) VALUES (20, 'embolado', 35, 15);

-- Poblar la tabla 'planes_consumo'
INSERT INTO planes_consumo (id_plan, nombre, descuento, hotel_nit) VALUES (1, 'Plan 1', 10, 104);
INSERT INTO planes_consumo (id_plan, nombre, descuento, hotel_nit) VALUES (2, 'Plan 2', 20, 104);
INSERT INTO planes_consumo (id_plan, nombre, descuento, hotel_nit) VALUES (3, 'Plan 3', 30, 104);
INSERT INTO planes_consumo (id_plan, nombre, descuento, hotel_nit) VALUES (4, 'Plan 4', 40, 104);
INSERT INTO planes_consumo (id_plan, nombre, descuento, hotel_nit) VALUES (5, 'Plan 5', 50, 104);


-- Poblar la tabla 'reservas_servicio'
INSERT INTO reservas_servicio (id_reserva, fecha_inicio, fecha_fin, factura_num, servicio_id) VALUES (1, '2023-10-01', '2023-10-02', 1, 1);
INSERT INTO reservas_servicio (id_reserva, fecha_inicio, fecha_fin, factura_num, servicio_id) VALUES (2, '2023-10-01', '2023-10-02', 2, 2);
INSERT INTO reservas_servicio (id_reserva, fecha_inicio, fecha_fin, factura_num, servicio_id) VALUES (3, '2023-10-01', '2023-10-02', 3, 3);
INSERT INTO reservas_servicio (id_reserva, fecha_inicio, fecha_fin, factura_num, servicio_id) VALUES (4, '2023-10-01', '2023-10-02', 4, 4);
INSERT INTO reservas_servicio (id_reserva, fecha_inicio, fecha_fin, factura_num, servicio_id) VALUES (5, '2023-10-01', '2023-10-02', 5, 5);

-- Poblar la tabla 'usuarios'
INSERT INTO usuarios (cedula, nombre, apellido, usuario_login, clave_login, tipo_usuario, hotel_nit) VALUES (1, 'Laura', 'Herrera', 'admin1', '1234', 'administrador', 104);
INSERT INTO usuarios (cedula, nombre, apellido, usuario_login, clave_login, tipo_usuario, hotel_nit) VALUES (2, 'Andres', 'Gil', 'empleado1', '1234', 'empleado', 104);
INSERT INTO usuarios (cedula, nombre, apellido, usuario_login, clave_login, tipo_usuario, hotel_nit) VALUES (3, 'Gustavo', 'Calderon', 'empleado2', '1234', 'empleado', 104);
INSERT INTO usuarios (cedula, nombre, apellido, usuario_login, clave_login, tipo_usuario, hotel_nit) VALUES (4, 'Diana', 'Perez', 'recepcionista1', '1234', 'recepcionista', 104);
INSERT INTO usuarios (cedula, nombre, apellido, usuario_login, clave_login, tipo_usuario, hotel_nit) VALUES (5, 'Daniel', 'Alvarado', 'gerente1', '1234', 'gerente', 104);

-- Poblar la tabla 'utensilios'
INSERT INTO utensilios (id, nombre_u, costo) VALUES (21, 'Tijeras', 5);
INSERT INTO utensilios (id, nombre_u, costo) VALUES (22, 'Toalla', 10);

-- Poblar la tabla 'maquinas'
INSERT INTO maquinas (nombre_maquina, codigo_maquina, gimnasio_id) VALUES ('Caminadora', 101, 1);
INSERT INTO maquinas (nombre_maquina, codigo_maquina, gimnasio_id) VALUES ('Pesas', 102, 1);
INSERT INTO maquinas (nombre_maquina, codigo_maquina, gimnasio_id) VALUES ('Bicicleta estatica', 103, 1);
INSERT INTO maquinas (nombre_maquina, codigo_maquina, gimnasio_id) VALUES ('TRX', 104, 1);
INSERT INTO maquinas (nombre_maquina, codigo_maquina, gimnasio_id) VALUES ('Caminadora', 105, 2);
INSERT INTO maquinas (nombre_maquina, codigo_maquina, gimnasio_id) VALUES ('Pesas', 106, 2);


