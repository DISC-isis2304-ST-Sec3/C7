// Insertar documentos-------------------------------------------------------------------------------
db.Habitacion.updateOne(
    { _id: 6 },
    { $set: { "tipoHabitacion.tipo": "suite" } }
)

// Buscar documentos-------------------------------------------------------------------------------

db.Habitacion.find({ "tipoHabitacion.tipo": "familiar" })

// Actualizar documentos-------------------------------------------------------------------------------


db.Habitacion.updateOne(
    { _id: 6 },
    { $set: { "tipoHabitacion.tipo": "individual" } }
)

// Eliminar documentos---------------------------------------------------------------------------------
db.Habitacion.updateOne(
    { _id: 6 },
    { $unset: { "tipoHabitacion": "" } }
)
