db.Servicio.insertOne(
    {
        _id: 6,
        nombre: "Minibar",
        precio: 100,
        descripcion: "Bebidas y snacks",
        capacidad: 5
        
    })
// Buscar documentos-------------------------------------------------------------------------------

db.Servicio.find(
    {
        _id: 6
    })

// Actualizar documentos-------------------------------------------------------------------------------


db.Servicio.replaceOne(
    
    {
        _id: 6
    },
    {
        _id: 8,
        nombre: "Minibar",
        precio: 100,
        descripcion: "Bebidas y snacks",
        capacidad: 5
        
    })

// Eliminar documentos---------------------------------------------------------------------------------
db.Servicio.deleteOne(
    {
        _id: 8
    })