// COLECCION USUARIO
db.createCollection("Usuario",
{
    validator: 
    {
        $jsonSchema:
        {
            bsonType:"object",
            required: ["nombre","tipoDocumento","numeroDocumento", "rol", "correo"],
            properties:
            {
                nombre:{bsonType:"string"},
                tipoDocumento:{bsonType:"string"},
                numeroDocumento:{bsonType:"int"},
                rol:{bsonType:"string"},
                correo:{bsonType:"string"}
            }
        }
    }
});