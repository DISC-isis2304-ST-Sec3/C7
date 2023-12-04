db.Usuario.insertMany([
    {
        _id: 1,
        nombre: "Juan Pérez",
        tipoDocumento: "CC",
        numeroDocumento: 1111,
        rol: "Administrador",
        correo: "juan.perez@example.com"
    },
    {
        _id: 2,
        nombre: "María Gómez",
        tipoDocumento: "CC",
        numeroDocumento: 2222,
        rol: "Empleado",
        correo: "maria.gomez@example.com"
    },
    {
        _id: 3,
        nombre: "Pedro Rodríguez",
        tipoDocumento: "TI",
        numeroDocumento: 3333,
        rol: "Recepcionista",
        correo: "pedro.rodriguez@example.com"
    },
    {
        _id: 4,
        nombre: "Laura Martínez",
        tipoDocumento: "CC",
        numeroDocumento: 4444,
        rol: "Supervisor",
        correo: "laura.martinez@example.com"
    },
    {
        _id: 5,
        nombre: "Ana López",
        tipoDocumento: "TI",
        numeroDocumento: 5555,
        rol: "Gerente",
        correo: "ana.lopez@example.com"
    }
]);
