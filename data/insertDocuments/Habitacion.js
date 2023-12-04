db.Habitacion.insertMany([
    {
        _id: 1,
        capacidad: 2,
        precio: 100,
        tipoHabitacion: {
            tipo: "individual"
        },
        consumos: [
            {
                nombre: "Minibar",
                precio: 10,
                descripcion: "Bebidas y snacks",
                capacidad: 1
            }
        ]
    },
    {
        _id: 2,
        capacidad: 4,
        precio: 150,
        tipoHabitacion: {
            tipo: "doble"
        },
        consumos: [
            {
                nombre: "Desayuno buffet",
                precio: 15,
                descripcion: "Variedad de alimentos",
                capacidad: 2
            },
            {
                nombre: "Lavandería",
                precio: 30,
                descripcion: "Servicio de lavado y planchado",
                capacidad: 2
            }
        ]
    },
    {
        _id: 3,
        capacidad: 3,
        precio: 120,
        tipoHabitacion: {
            tipo: "triple"
        },
        consumos: [
            {
                nombre: "Wifi premium",
                precio: 10,
                descripcion: "Conexión de alta velocidad",
                capacidad: 3
            }
        ]
    },
    {
        _id: 4,
        capacidad: 6,
        precio: 200,
        tipoHabitacion: {
            tipo: "familiar"
        },
        consumos: [
            {
                nombre: "Acceso a piscina",
                precio: 25,
                descripcion: "Uso ilimitado de la piscina",
                capacidad: 4
            },
            {
                nombre: "Gimnasio",
                precio: 30,
                descripcion: "Acceso al gimnasio",
                capacidad: 4
            }
        ]
    },
    {
        _id: 5,
        capacidad: 1,
        precio: 80,
        tipoHabitacion: {
            tipo: "individual"
        },
        consumos: [
            {
                nombre: "Estacionamiento",
                precio: 5,
                descripcion: "Espacio de estacionamiento asignado",
                capacidad: 1
            }
        ]
    }
])