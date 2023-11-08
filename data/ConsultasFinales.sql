--RFC1 - MOSTRAR EL DINERO RECOLECTADO POR SERVICIOS EN CADA HABITACIÓN EN EL ÚLTIMO AÑO CORRIDO(2023).
SELECT habitaciones.id as habitacion_id , servicios.tipo as servicio, SUM(consumos.costo)dinero_recolectado 
FROM consumos
INNER JOIN habitaciones ON consumos.habitacion_id = habitaciones.id
INNER JOIN reservan ON habitaciones.id = reservan.habitacion_id
INNER JOIN servicios ON consumos.servicios_tipo = servicios.tipo
INNER JOIN reservas ON reservan.reservas_id = reservas.id
where reservas.fecha_inicio between TO_DATE('2023-01-01', 'YYYY-MM-DD') AND TO_DATE('2023-12-31', 'YYYY-MM-DD') 
GROUP BY habitaciones.id, servicios.tipo;

--RFC2 - MOSTRAR LOS 20 SERVICIOS MÁS POPULARES.
SELECT servicios.tipo AS servicio_tipo, COUNT(consumos.servicios_tipo) AS cantidad_consumos
FROM consumos
INNER JOIN habitaciones ON consumos.habitacion_id = habitaciones.id
INNER JOIN reservan ON habitaciones.id = reservan.habitacion_id
INNER JOIN servicios ON consumos.servicios_tipo = servicios.tipo
INNER JOIN reservas ON reservan.reservas_id = reservas.id
where reservas.fecha_inicio between TO_DATE(:fecha_inicial, 'YYYY-MM-DD') AND TO_DATE(:fecha_final, 'YYYY-MM-DD') 
GROUP BY servicios.tipo
ORDER BY cantidad_consumos DESC
FETCH FIRST 20 ROWS ONLY;

--RFC3 MOSTRAR EL ÍNDICE DE OCUPACIÓN DE CADA UNA DE LAS HABITACIONES DEL HOTEL
SELECT habitaciones.id AS habitacion_id, 
       habitaciones.capacidad AS capacidad_habitacion, 
       COUNT(reservan.reservas_id) AS total_reservas,
       SUM(reservas.fecha_salida - reservas.fecha_inicio) AS total_dias_ocupados,
       (SUM(reservas.fecha_salida - reservas.fecha_inicio) / 365) * 100 AS porcentaje_ocupacion
FROM habitaciones
LEFT JOIN reservan ON habitaciones.id = reservan.habitacion_id
LEFT JOIN reservas ON reservan.reservas_id = reservas.id
where reservas.fecha_inicio between TO_DATE('2023-01-01', 'YYYY-MM-DD') AND TO_DATE('2023-12-31', 'YYYY-MM-DD') and
reservas.fecha_salida between TO_DATE('2023-01-01', 'YYYY-MM-DD') AND TO_DATE('2023-12-31', 'YYYY-MM-DD') 
GROUP BY habitaciones.id, habitaciones.capacidad;

--RFC4 - MOSTRAR LOS SERVICIOS QUE CUMPLEN CON CIERTA CARACTERÍSTICA
SELECT *
FROM servicios
INNER JOIN consumos ON consumos.servicios_tipo = servicios.tipo
INNER JOIN habitaciones ON consumos.habitacion_id = habitaciones.id
INNER JOIN reservan ON habitaciones.id = reservan.habitacion_id
INNER JOIN reservas ON reservan.reservas_id = reservas.id
WHERE 
  consumos.costo BETWEEN : costo_minimo AND : costo_maximo
  AND reservas.fecha_inicio BETWEEN TO_DATE(:fecha_inicial, 'YYYY-MM-DD') AND TO_DATE(:fecha_final, 'YYYY-MM-DD')
  AND servicios.tipo = : tipo_servicio;
  
--RFC5 - MOSTRAR EL CONSUMO EN HOTELANDES POR UN USUARIO DADO, EN UN RANGO DE FECHAS INDICADO
SELECT
    clientes.nombre AS nombre_cliente,
    reservas.id AS reserva_id,
    SUM(consumos.costo) AS total_consumo
FROM
    clientes
    JOIN reservas ON clientes.num_documento = reservas.usuarios_num_documento
    JOIN reservan ON reservas.id = reservan.reservas_id
    JOIN consumos ON reservan.habitacion_id = consumos.habitacion_id
WHERE
    clientes.num_documento = : id_usuario 
    AND reservas.fecha_inicio BETWEEN TO_DATE(:fecha_inicial, 'YYYY-MM-DD') AND TO_DATE(:fecha_final, 'YYYY-MM-DD')
GROUP BY
    clientes.nombre,
    reservas.id,
    reservas.fecha_inicio,
    reservas.fecha_salida
ORDER BY
    reservas.fecha_inicio;

--RFC6 - ANALIZAR LA OPERACIÓN DE HOTELANDES

--Mayor ocupacion
SELECT checkin.fecha_ingreso AS fecha, COUNT(distinct checkin.reservas_id) AS habitaciones_ocupadas
FROM checkin
GROUP BY checkin.fecha_ingreso
ORDER BY habitaciones_ocupadas DESC;

--Mayores ingresos
SELECT checkin.fecha_ingreso AS fecha, SUM(consumos.costo) AS ingresos
FROM checkin
JOIN reservan ON checkin.reservas_id = reservan.reservas_id
JOIN consumos ON consumos.habitacion_id = reservan.habitacion_id
GROUP BY checkin.fecha_ingreso
ORDER BY ingresos DESC;

--Menor ocupacion
SELECT checkin.fecha_ingreso AS fecha, COUNT(distinct checkin.reservas_id) AS habitaciones_ocupadas
FROM checkin
GROUP BY checkin.fecha_ingreso
ORDER BY habitaciones_ocupadas ASC;

--RFC7 - ENCONTRAR LOS BUENOS CLIENTES
SELECT
    clientes.nombre AS nombre_cliente,
    clientes.correo AS correo_cliente,
    SUM(DISTINCT (reservas.fecha_salida - reservas.fecha_inicio)) AS total_dias_estadia,
    SUM(consumos.costo) AS total_consumos
FROM clientes 
inner JOIN reservas ON clientes.num_documento = reservas.usuarios_num_documento
inner JOIN checkin ON clientes.num_documento = checkin.clientes_num_documento
INNER JOIN reservan ON reservan.reservas_id = reservas.id
INNER JOIN habitaciones ON habitaciones.id = reservan.habitacion_id
INNER JOIN consumos ON consumos.habitacion_id = habitaciones.id

WHERE reservas.fecha_inicio between TO_DATE('2023-01-01', 'YYYY-MM-DD') AND TO_DATE('2023-12-31', 'YYYY-MM-DD')
GROUP BY clientes.num_documento, clientes.nombre, clientes.correo
HAVING SUM(DISTINCT (reservas.fecha_salida - reservas.fecha_inicio)) >= 14 OR SUM(consumos.costo) > 15000000; --El costo debe ser 15 millones

--RFC8 - ENCONTRAR LOS SERVICIOS QUE NO TIENEN MUCHA DEMANDA

SELECT servicios.tipo AS tipo_servicio, COUNT(DISTINCT TO_DATE(reservas_serv.dia, 'YYYY-MM-DD')) / 7 AS solicitudes_semanales
FROM servicios
LEFT JOIN consumos ON servicios.tipo = consumos.servicios_tipo
left join habitaciones on consumos.habitacion_id=habitaciones.id
left join reservas_serv on reservas_serv.habitacion_id = habitaciones.id

WHERE reservas_serv.dia between TO_DATE('2023-01-01', 'YYYY-MM-DD') AND TO_DATE('2023-12-31', 'YYYY-MM-DD')
GROUP BY servicios.tipo
HAVING (COUNT(DISTINCT reservas_serv.dia) / 7) < 3;



--RFC9 - CONSULTAR CONSUMO EN HOTELANDES
SELECT clientes.nombre AS nombre_cliente, clientes.num_documento AS num_documento_cliente, servicios.tipo AS servicio_consumido,
COUNT(consumos.habitacion_id) AS cantidad_consumos, reservas.fecha_inicio as fecha
FROM clientes
INNER JOIN reservas ON clientes.num_documento = reservas.usuarios_num_documento
INNER JOIN reservan ON reservas.id = reservan.reservas_id
INNER JOIN consumos ON reservan.habitacion_id = consumos.habitacion_id
INNER JOIN servicios ON consumos.servicios_tipo = servicios.tipo
WHERE
    reservas.fecha_inicio BETWEEN TO_DATE(:fecha_inicial, 'YYYY-MM-DD') AND TO_DATE(:fecha_final, 'YYYY-MM-DD')
    and servicios.tipo= : servicio --Este tambien varia
GROUP BY
    clientes.nombre,clientes.num_documento,servicios.tipo, reservas.fecha_inicio
ORDER BY
    --nombre_cliente
    --cantidas_consumos
    fecha;
    
--RFC10 - CONSULTAR CONSUMO EN HOTELANDES – RFC9-V2
SELECT clientes.nombre AS nombre_cliente,clientes.num_documento AS num_documento_cliente
FROM clientes
WHERE clientes.num_documento NOT IN (
    SELECT DISTINCT reservas.usuarios_num_documento
    FROM reservas
    INNER JOIN reservan ON reservas.id = reservan.reservas_id
    INNER JOIN consumos ON reservan.habitacion_id = consumos.habitacion_id
    WHERE
        reservas.fecha_inicio BETWEEN TO_DATE(:fecha_inicial, 'YYYY-MM-DD') AND TO_DATE(:fecha_final, 'YYYY-MM-DD')
      
)
ORDER BY
    nombre_cliente;
    
    
--RFC11 - CONSULTAR FUNCIONAMIENTO

SELECT
  TO_CHAR(reservas.fecha_inicio, 'IYYY-IW') AS semana,
  MAX(servicios.tipo) AS servicio_mas_consumido,
  MIN(servicios.tipo) AS servicio_menos_consumido,
  MAX(habitaciones.id) AS habitacion_mas_solicitada,
  MIN(habitaciones.id) AS habitacion_menos_solicitada
FROM reservas
JOIN reservan ON reservas.id = reservan.reservas_id
JOIN consumos ON reservan.habitacion_id = consumos.habitacion_id
JOIN servicios ON consumos.servicios_tipo = servicios.tipo
JOIN habitaciones ON reservan.habitacion_id = habitaciones.id
WHERE reservas.fecha_inicio >= TO_DATE('2023-01-01', 'YYYY-MM-DD')
  AND reservas.fecha_inicio <= TO_DATE('2023-12-31', 'YYYY-MM-DD')
GROUP BY TO_CHAR(reservas.fecha_inicio, 'IYYY-IW')
ORDER BY semana;


--RFC12 - CONSULTAR LOS CLIENTES EXCELENTES
SELECT DISTINCT
    clientes.num_documento AS numero_documento,
    clientes.nombre AS nombre_cliente,
    clientes.correo AS correo_cliente,
    consumos.costo as gastos
FROM clientes
inner JOIN reservas ON clientes.num_documento = reservas.usuarios_num_documento
inner JOIN reservan ON reservas.id = reservan.reservas_id
inner JOIN reservas_serv ON reservan.habitacion_id = reservas_serv.habitacion_id
inner JOIN reservas_spa on reservas_spa.reservaserv_id = reservas_serv.id
inner JOIN consumos ON consumos.habitacion_id = reservan.habitacion_id
WHERE
    (
        
       (TRUNC(reservas.fecha_salida) - TRUNC(reservas.fecha_inicio)) <= 90
    )
    OR
    (
   
        consumos.costo > 300000
    )
    OR
    (
        
        (
            consumos.servicios_tipo IN ('SPA', 'Salones de Reuniones')
            AND reservas_serv.duracion_hora > 4
        )
   
    )
    order by consumos.costo
