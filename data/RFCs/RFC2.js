db.Reserva.aggregate([
  {
    $group: {
      _id: "$habitacion",
      reservas: { $sum: 1 }
    }
  },
  {
    $project: {
      habitacion: "$_id",
      indiceOcupacion: { $multiply: [{ $divide: ["$reservas", db.Reserva.countDocuments()] }, 100] },
      _id: 0
    }
  },
  {
    $sort: {
      habitacion: 1
    }
  }
])
