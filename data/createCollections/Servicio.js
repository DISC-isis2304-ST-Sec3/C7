// COLECCION SERVICIO
db.createCollection("Servicio",
{
    validator: 
    {
        $jsonSchema:
        {
            bsonType:"object",
            required: ["nombre", "precio","descripcion", "capacidad"],
            properties:
            {
                nombre:{bsonType:"string"},
                precio:{bsonType:"int"},
                descripcion:{bsonType:"string"},
                capacidad:{bsonType:"int"}
            }
        }
    }
});