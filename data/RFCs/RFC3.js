var numeroDocumentoCliente = 12345;

var fechaInicio = ISODate('2023-01-01');
var fechaFin = ISODate('2023-12-31');

db.Reserva.aggregate([
  {
    $match: {
      fechaIngreso: { $gte: fechaInicio, $lte: fechaFin },
      idCliente: numeroDocumentoCliente
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
    $project: {
      _id: 1,
      fechaIngreso: 1,
      fechaSalida: 1,
      habitacion: 1,
      servicio: "$servicios.nombreServicio",
      precioServicio: "$servicios.precio"
    }
  }
])
