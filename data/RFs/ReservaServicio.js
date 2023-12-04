db.ReservaServicio.insertOne(
    {
        _id: 6,
        nombreServicio: "Servicio de habitación",
        idReserva: 6, // Referencia al _id de la reserva correspondiente
        precio: 500
    })
    
// Buscar documentos-------------------------------------------------------------------------------

db.ReservaServicio.find(
    {
        _id: 6
    })

// Actualizar documentos-------------------------------------------------------------------------------


db.ReservaServicio.replaceOne(
    
    {
        _id: 6
    },
    {
        _id: 8,
        nombreServicio: "Servicio de habitación",
        idReserva: 8, 
        precio: 300
    })

// Eliminar documentos---------------------------------------------------------------------------------
db.ReservaServicio.deleteOne(
    {
        _id: 8
    })