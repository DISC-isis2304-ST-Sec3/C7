// COLECCION RESERVASERVICIO
db.createCollection("ReservaServicio",
{
    validator: 
    {
        $jsonSchema:
        {
            bsonType:"object",
            required: ["nombreServicio", "idReserva","precio"],
            properties:
            {
                nombreServicio:{bsonType:"string"},
                idReserva:{bsonType:"int"},
                precio:{bsonType:"int"}
            }
        }
    }
});