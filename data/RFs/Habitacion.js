db.Habitacion.insertOne(
    {
        _id: 6,
        capacidad: 5,
        precio: 400,
        tipoHabitacion: {
            tipo: "familiar"
        },
        consumos: [
            {
                nombre: "Minibar",
                precio: 100,
                descripcion: "Bebidas y snacks",
                capacidad: 5
            }
        ]
    })

// Buscar documentos-------------------------------------------------------------------------------

db.Habitacion.find(
    {
        _id: 6
    })

// Actualizar documentos-------------------------------------------------------------------------------


db.Habitacion.replaceOne(
    
    {
        _id: 6
    },
    {
        _id: 8,
        capacidad: 3,
        precio: 300,
        tipoHabitacion: {
            tipo: "familiar"
        },
        consumos: [
            {
                nombre: "Minibar",
                precio: 50,
                descripcion: "Bebidas y snacks",
                capacidad: 5
            }
        ]
    })

// Eliminar documentos---------------------------------------------------------------------------------
db.Habitacion.deleteOne(
    {
        _id: 8
    })