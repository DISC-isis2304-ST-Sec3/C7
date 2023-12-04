// COLLECCION CLIENTE

db.createCollection("Cliente",
{
    validator: 
    {
        $jsonSchema:
        {
            bsonType:"object",
            required: ["tipoDocumento", "numeroDocumento", "nombre","correo"],
            properties:
            {
                tipoDocumento:{bsonType:"string"},
                numeroDocumento:{bsonType:"int"},
                nombre:{bsonType:"string"},
                correo:{bsonType:"string"}
            }
        }
    }
});