db.Reserva.insertOne(
    {
        _id: 6,
        fechaIngreso: "2023-12-24",
        fechaSalida: "2023-12-30",
        numeroPersonas: 2,
        habitacion: "Habitación Individual",
        idCliente: 6666 // Referencia al númeroDocumento del cliente "Andres Gil"
    })

// Buscar documentos-------------------------------------------------------------------------------

db.Reserva.find(
    {
        _id: 6
    })

// Actualizar documentos-------------------------------------------------------------------------------


db.Reserva.replaceOne(
    
    {
        _id: 6
    },
    {
        _id: 8,
        fechaIngreso: "2023-10-24",
        fechaSalida: "2023-10-30",
        numeroPersonas: 1,
        habitacion: "Habitación Individual",
        idCliente: 8888 
    })

// Eliminar documentos---------------------------------------------------------------------------------
db.Reserva.deleteOne(
    {
        _id: 8
    })