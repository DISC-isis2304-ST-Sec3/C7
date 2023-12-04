db.Usuario.insertMany(

    {
        nombre: "Nicolas López",
        tipoDocumento: "TI",
        numeroDocumento: 7777,
        rol: "Gerente",
        correo: "nicolas.lopez@example.com"
    }
)
// Buscar documentos-------------------------------------------------------------------------------

db.Usuario.find(
    {
        numeroDocumento: 7777
    })

// Actualizar documentos-------------------------------------------------------------------------------


db.Usuario.replaceOne(
    
    {
       numeroDocumento: 7777
    },
    {
        _id: 8,
        nombre: "Nicolas Gutierrez",
        tipoDocumento: "CC",
        numeroDocumento: 9999,
        rol: "Gerente",
        correo: "nicolas.gutierrez@example.com"
    })

// Eliminar documentos---------------------------------------------------------------------------------
db.Usuario.deleteOne(
    {
        numeroDocumento: 9999
    })