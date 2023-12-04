// COLECCION HABITACION

db.createCollection("Habitacion",
{
    validator: 
    {
        $jsonSchema:
        {
            bsonType:"object",
            required: ["capacidad", "precio","tipoHabitacion"],
            properties:
            {
                capacidad:{bsonType:"int"},
                precio:{bsonType:"int"},
                tipoHabitacion:
                {            
                    bsonType:"object",
                    required: ["tipo"],
                    properties:
                    {
                        tipo:{bsonType:"string"}
                    }
                },
                consumos:
                {
                    bsonType:"array",
                    items:{bsonType:"object"},
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
        }
    }
});