-- CLIENTES
CREATE TABLE clientes (
    cedula   NUMBER NOT NULL,
    nombre   VARCHAR2(250) NOT NULL,
    apellido VARCHAR2(250) NOT NULL,
    CONSTRAINT clientes_pk PRIMARY KEY ( cedula )
);

-- ESTABLECIMIENTOS
CREATE TABLE establecimientos (
    id        NUMBER NOT NULL,
    tipo      VARCHAR2(250) NOT NULL CHECK (tipo IN ('supermercado', 'tienda')),
    categoria VARCHAR2(250) ,
    CONSTRAINT establecimiento_pk PRIMARY KEY ( id )
);

-- FACTURAS
CREATE TABLE facturas (
    num_factura         NUMBER NOT NULL,
    vendedor            VARCHAR2(250) NOT NULL,
    costo_total         NUMBER NOT NULL,
    reserva_servicio_id NUMBER NOT NULL,
    reserva_id          NUMBER NOT NULL,
    CONSTRAINT factura_pk PRIMARY KEY ( num_factura )
);

-- GIMNASIOS
CREATE TABLE gimnasios (
    id        NUMBER NOT NULL,
    costo     NUMBER NOT NULL,
    capacidad NUMBER NOT NULL,
    horario   DATE NOT NULL,
    CONSTRAINT gimnasio_pk PRIMARY KEY ( id )
);

-- HABITACIONES
CREATE TABLE habitaciones (
    id_habitacion   NUMBER NOT NULL,
    tipo_habitacion VARCHAR2(250) NOT NULL,
    capacidad       NUMBER NOT NULL,
    costo_noche     NUMBER NOT NULL,
    television      VARCHAR2(250) NOT NULL CHECK (television IN ('true', 'false')),
    minibar         VARCHAR2(250) NOT NULL CHECK (minibar IN ('true', 'false')),
    cafetera        VARCHAR2(250) NOT NULL CHECK (cafetera IN ('true', 'false')),
    comedor         VARCHAR2(250) NOT NULL CHECK (comedor IN ('true', 'false')),
    cocina          VARCHAR2(250) NOT NULL CHECK (cocina IN ('true', 'false')),
    jacuzzi         VARCHAR2(250) NOT NULL CHECK (jacuzzi IN ('true', 'false')),
    reserva_id      NUMBER NOT NULL,
    hotel_nit       NUMBER NOT NULL,
    CONSTRAINT habitacion_pk PRIMARY KEY ( id_habitacion )
);
ALTER TABLE habitaciones ADD CONSTRAINT tipo_habitacion CHECK (tipo_habitacion IN ('sencilla', 'suite', 'doble'));

-- HOTELES
CREATE TABLE hoteles (
    nit    NUMBER NOT NULL,
    nombre VARCHAR2(250) NOT NULL,
    CONSTRAINT hotel_pk PRIMARY KEY ( nit )
);

-- INTERNETS
CREATE TABLE internets (
    id           NUMBER NOT NULL,
    capacidad    NUMBER NOT NULL,
    precio_noche NUMBER,
    CONSTRAINT internet_pk PRIMARY KEY ( id )
);

-- LIMPIEZAS
CREATE TABLE limpiezas (
    id             NUMBER NOT NULL,
    tipo           VARCHAR2(250) NOT NULL CHECK (tipo IN ('planchado', 'lavado', 'embolado')),
    costo          NUMBER NOT NULL,
    numero_prendas NUMBER NOT NULL,
    CONSTRAINT limpieza_pk PRIMARY KEY ( id )
);

-- MAQUINAS
CREATE TABLE maquinas (
    nombre_maquina VARCHAR2(250) NOT NULL,
    codigo_maquina NUMBER NOT NULL,
    gimnasio_id    NUMBER NOT NULL,
    CONSTRAINT maquina_pk PRIMARY KEY ( nombre_maquina )
);

-- PISCINAS
CREATE TABLE piscinas (
    id          NUMBER NOT NULL,
    costo       NUMBER NOT NULL,
    capacidad   NUMBER NOT NULL,
    profundidad NUMBER NOT NULL, 
    CONSTRAINT piscina_pk PRIMARY KEY ( id )
);

--PLANES CONSUMO
CREATE TABLE planes_consumo (
    id_plan   NUMBER NOT NULL,
    nombre    VARCHAR2(250) NOT NULL,
    descuento NUMBER,
    hotel_nit NUMBER NOT NULL,
    CONSTRAINT plan_consumo_pk PRIMARY KEY ( id_plan )
);

-- PRODUCTOS
CREATE TABLE productos (
    id_producto        NUMBER NOT NULL,
    nombre             VARCHAR2(250) NOT NULL,
    costo              NUMBER NOT NULL,
    establecimiento_id NUMBER NOT NULL,
    restaurante_id     NUMBER NOT NULL,
    CONSTRAINT producto_pk PRIMARY KEY ( id_producto )
);

-- RESERVAS
CREATE TABLE reservas (
    id_reserva     NUMBER NOT NULL,
    fecha_entrada  DATE NOT NULL,
    fecha_salida   DATE NOT NULL,
    num_personas   NUMBER NOT NULL,
    clientes_cedula NUMBER NOT NULL,
    factura_num    NUMBER NOT NULL,
    CONSTRAINT reserva_pk PRIMARY KEY ( id_reserva )
);

-- RESERVAS SERVICIOS
CREATE TABLE reservas_servicio (
    id_reserva   NUMBER NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin    DATE NOT NULL,
    factura_num  NUMBER NOT NULL,
    servicio_id  NUMBER,
    CONSTRAINT reserva_servicio_pk PRIMARY KEY ( id_reserva )
);

-- RESTAURANTES
CREATE TABLE restaurantes (
    id        NUMBER NOT NULL,
    capacidad NUMBER NOT NULL,
    estilo    VARCHAR2(250) NOT NULL,
    CONSTRAINT restaurante_pk PRIMARY KEY ( id )
);

-- SALONES EVENTOS
CREATE TABLE salones_eventos (
    id        NUMBER NOT NULL,
    costo     NUMBER NOT NULL,
    capacidad NUMBER NOT NULL,
    tipo      VARCHAR2(250) NOT NULL,
    CONSTRAINT salon_eventos_pk PRIMARY KEY ( id )
);

-- SERVICIOS
CREATE TABLE servicios (
    id             NUMBER NOT NULL,
    nombre         VARCHAR2(250) NOT NULL,
    horario_inicio DATE NOT NULL,
    horario_cierre DATE NOT NULL,
    hotel_nit      NUMBER NOT NULL,
    CONSTRAINT servicio_pk PRIMARY KEY ( id )
);

-- SERVICIOS SPAS
CREATE TABLE servicios_spa (
    id_serv_spa NUMBER NOT NULL,
    servicios    VARCHAR2(250) NOT NULL,
    duracion    NUMBER,
    costo       NUMBER NOT NULL,
    spa_id      NUMBER NOT NULL,
    CONSTRAINT servicio_spa_pk PRIMARY KEY ( id_serv_spa )
);

-- SPAS
CREATE TABLE spas (
    id           NUMBER NOT NULL,
    capacidad    NUMBER NOT NULL,
    calificacion NUMBER,
    CONSTRAINT spa_pk PRIMARY KEY ( id )
);

-- USUARIOS
CREATE TABLE usuarios (
    cedula           NUMBER NOT NULL,
    nombre           VARCHAR2(250) NOT NULL,
    apellido         VARCHAR2(250) NOT NULL,
    usuario_login    VARCHAR2(250) NOT NULL,
    contraseña_login VARCHAR2(250) NOT NULL,
    tipo_usuario     VARCHAR2(250) NOT NULL,
    hotel_nit        NUMBER NOT NULL,
    CONSTRAINT usuario_pk PRIMARY KEY ( cedula )
);

-- UTENSILIOS
CREATE TABLE utensilios (
    id     NUMBER NOT NULL,
    nombre VARCHAR2(250) NOT NULL,
    costo  NUMBER NOT NULL,
    CONSTRAINT utensillo_pk PRIMARY KEY ( id )
);
-- ALTER TABLE factura DISABLE CONSTRAINT factura_reserva_fk;

-- ESTABLECIMIENTOS
ALTER TABLE establecimientos
    ADD CONSTRAINT establecimiento_servicio_fk FOREIGN KEY ( id )
        REFERENCES servicios ( id );

ALTER TABLE facturas
    ADD CONSTRAINT factura_reserva_fk FOREIGN KEY ( reserva_id )
        REFERENCES reservas ( id_reserva );

ALTER TABLE facturas
    ADD CONSTRAINT factura_reserva_servicio_fk FOREIGN KEY ( reserva_servicio_id )
        REFERENCES reservas_servicio ( id_reserva );

ALTER TABLE gimnasios
    ADD CONSTRAINT gimnasio_servicio_fk FOREIGN KEY ( id )
        REFERENCES servicios ( id );

ALTER TABLE habitaciones
    ADD CONSTRAINT habitacion_hotel_fk FOREIGN KEY ( hotel_nit )
        REFERENCES hoteles ( nit );

ALTER TABLE habitaciones
    ADD CONSTRAINT habitacion_reserva_fk FOREIGN KEY ( reserva_id )
        REFERENCES reservas ( id_reserva );

ALTER TABLE internets
    ADD CONSTRAINT internet_servicio_fk FOREIGN KEY ( id )
        REFERENCES servicios ( id );

ALTER TABLE limpiezas
    ADD CONSTRAINT limpieza_servicio_fk FOREIGN KEY ( id )
        REFERENCES servicios ( id );

ALTER TABLE maquinas
    ADD CONSTRAINT maquina_gimnasio_fk FOREIGN KEY ( gimnasio_id )
        REFERENCES gimnasios ( id );

ALTER TABLE piscinas
    ADD CONSTRAINT piscina_servicio_fk FOREIGN KEY ( id )
        REFERENCES servicios ( id );

ALTER TABLE planes_consumo
    ADD CONSTRAINT plan_consumo_hotel_fk FOREIGN KEY ( hotel_nit )
        REFERENCES hoteles ( nit );

ALTER TABLE productos
    ADD CONSTRAINT producto_establecimiento_fk FOREIGN KEY ( establecimiento_id )
        REFERENCES establecimientos ( id );
    
ALTER TABLE productos
DISABLE CONSTRAINT producto_establecimiento_fk;


ALTER TABLE productos
    ADD CONSTRAINT producto_restaurante_fk FOREIGN KEY ( restaurante_id )
        REFERENCES restaurantes ( id );

ALTER TABLE reservas
    ADD CONSTRAINT reserva_clientes_fk FOREIGN KEY ( clientes_cedula )
        REFERENCES clientes ( cedula );

ALTER TABLE reservas
    ADD CONSTRAINT reserva_factura_fk FOREIGN KEY ( factura_num )
        REFERENCES facturas ( num_factura );

ALTER TABLE reservas_servicio
    ADD CONSTRAINT reserva_servicio_factura_fk FOREIGN KEY ( factura_num )
        REFERENCES facturas ( num_factura );

ALTER TABLE reservas_servicio
    ADD CONSTRAINT reserva_servicio_servicio_fk FOREIGN KEY ( servicio_id )
        REFERENCES servicios ( id );

ALTER TABLE restaurantes
    ADD CONSTRAINT restaurante_servicio_fk FOREIGN KEY ( id )
        REFERENCES servicios ( id );

ALTER TABLE salones_eventos
    ADD CONSTRAINT salon_eventos_servicio_fk FOREIGN KEY ( id )
        REFERENCES servicios ( id );

ALTER TABLE servicios
    ADD CONSTRAINT servicio_hotel_fk FOREIGN KEY ( hotel_nit )
        REFERENCES hoteles ( nit );

ALTER TABLE servicios_spa
    ADD CONSTRAINT servicio_spa_spa_fk FOREIGN KEY ( spa_id )
        REFERENCES spas ( id );

ALTER TABLE spas
    ADD CONSTRAINT spa_servicio_fk FOREIGN KEY ( id )
        REFERENCES servicios ( id );

ALTER TABLE usuarios
    ADD CONSTRAINT usuario_hotel_fk FOREIGN KEY ( hotel_nit )
        REFERENCES hoteles ( nit );

ALTER TABLE utensilios
    ADD CONSTRAINT utensillo_servicio_fk FOREIGN KEY ( id )
        REFERENCES servicios ( id );
