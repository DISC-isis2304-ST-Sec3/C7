//crear

db.Reserva.updateOne(
    { _id: 6 },
    { $set: { "fechaIngreso": ISODate("2024-11-13")} }
)

// Buscar documentos-------------------------------------------------------------------------------
db.Reserva.find({ "fechaIngreso": ISODate("2023-12-25") })

// Actualizar documentos-------------------------------------------------------------------------------

db.Reserva.updateOne(
    { _id: 6 },
    { $set: { "fechaIngreso": ISODate("2024-11-13") } }
)


// Eliminar documentos---------------------------------------------------------------------------------
db.Reserva.updateOne(
    { _id: 6 },
    { $unset: { "fechaIngreso": "" } }
)
