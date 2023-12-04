var servicioBuscado = "Gimnasio";


var fechaInicio = ISODate('2023-01-01');
var fechaFin = ISODate('2023-12-31');

// Clasificación por número de veces que se utilizó el servicio
var clasificacion = "numeroVecesUtilizado"; 

db.Reserva.aggregate([
  {
    $match: {
      fechaIngreso: { $gte: fechaInicio, $lte: fechaFin }
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
    $match: {
      "servicios.nombreServicio": servicioBuscado
    }
  },
  {
    $group: {
      _id: "$idCliente",
      cliente: { $first: "$idCliente" },
      numeroVecesUtilizado: { $sum: 1 }
    }
  },
  {
    $sort: {
      [clasificacion]: -1 
    }
  }
])
