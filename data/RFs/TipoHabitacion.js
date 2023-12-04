db.TipoHabitacion.insertMany(

    {
        _id: 5,
        tipo: "Suite"
    }
)

// Buscar documentos-------------------------------------------------------------------------------

db.TipoHabitacion.find(
    {
        _id: 5
    })

// Actualizar documentos-------------------------------------------------------------------------------


db.TipoHabitacion.replaceOne(
    
    {
        _id: 5
    },
    {
        _id: 8,
        tipo: "Suite Individual"
    })

// Eliminar documentos---------------------------------------------------------------------------------
db.TipoHabitacion.deleteOne(
    {
        _id: 8
    })