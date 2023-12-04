// COLECCION TIPOHABITACION
db.createCollection("TipoHabitacion",
{
    validator: 
    {
        $jsonSchema:
        {
            bsonType:"object",
            required: ["tipo"],
            properties:
            {
                tipo:{bsonType:"string"}
            }
        }
    }
});