db.Reserva.updateOne(
    { _id: 6 },
    { $set: { "fechaSalida": ISODate("2024-11-13") } }
)


// Buscar documentos-------------------------------------------------------------------------------
db.Reserva.find({ "fechaSalida": ISODate("2023-12-25") })

// Actualizar documentos-------------------------------------------------------------------------------


db.Reserva.updateOne(
    { _id: 6 },
    { $set: { "fechaSalida": ISODate("2024-11-14") } }
)

// Eliminar documentos---------------------------------------------------------------------------------
db.Reserva.updateOne(
    { _id: 6 },
    { $unset: { "fechaSalida": "" } }
)
