db.Reserva.insertMany([
    {
        _id: 1,
        fechaIngreso: ISODate("2023-12-15"),
        fechaSalida: ISODate("2023-12-20"),
        numeroPersonas: 2,
        habitacion: "Habitación Individual",
        idCliente: 12345 
    },
    {
        _id: 2,
        fechaIngreso: ISODate("2023-12-18"),
        fechaSalida: ISODate("2023-12-25"),
        numeroPersonas: 4,
        habitacion: "Habitación Doble",
        idCliente: 23451 
    },
    {
        _id: 3,
        fechaIngreso: ISODate("2023-12-20"),
        fechaSalida: ISODate("2023-12-22"),
        numeroPersonas: 1,
        habitacion: "Habitación Individual",
        idCliente: 34512 
    },
    {
        _id: 4,
        fechaIngreso: ISODate("2023-12-25"),
        fechaSalida: ISODate("2023-12-28"),
        numeroPersonas: 3,
        habitacion: "Habitación Doble",
        idCliente: 45123
    },
    {
        _id: 5,
        fechaIngreso: ISODate("2023-12-30"),
        fechaSalida: ISODate("2024-01-02"),
        numeroPersonas: 2,
        habitacion: "Habitación Individual",
        idCliente: 51234 
    },
    {
        _id: 6, 
        fechaIngreso: ISODate("2023-03-15"),  
        fechaSalida: ISODate("2023-03-20"),
        numeroPersonas: 2,
        habitacion: "Habitación Doble",
        idCliente: 12345, 
    }
])
