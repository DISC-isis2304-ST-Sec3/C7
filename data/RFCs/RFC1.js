db.Reserva.aggregate([
    {
      $match: {
        fechaIngreso: {
          $gte: ISODate('2023-01-01'),
          $lt: ISODate('2024-01-01')
        }
      }
    },
    {
      $lookup: {
        from: "ReservaServicio",
        localField: "_id",
        foreignField: "idReserva",
        as: "servicios"
      }
    },
    {
      $unwind: "$servicios"
    },
    {
      $group: {
        _id: {
          habitacion: "$habitacion",
          nombreServicio: "$servicios.nombreServicio"
        },
        totalRecaudado: { $sum: "$servicios.precio" }
      }
    },
    {
      $sort: {
        "_id.habitacion": 1,
        "_id.nombreServicio": 1
      }
    }
  ])
  