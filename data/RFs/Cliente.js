// Insertar documentos-------------------------------------------------------------------------------
db.Cliente.insertOne(
    {
        tipoDocumento: "CC",
        numeroDocumento: 6666,
        nombre: "Juan Arango",
        correo: "juan.arango@gmail.com"
    })

// Buscar documentos-------------------------------------------------------------------------------

db.Cliente.find(
    {
        numeroDocumento: 6666
    })

// Actualizar documentos-------------------------------------------------------------------------------


db.Cliente.replaceOne(
    
    {
        numeroDocumento: 6666
    },
    {
        tipoDocumento: "TI",
        numeroDocumento: 8888,
        nombre: "ANDRES Arango",
        correo: "ANDRES.arango@gmail.com"
    })

// Eliminar documentos---------------------------------------------------------------------------------
db.Cliente.deleteOne(
    {
        numeroDocumento: 8888
    })