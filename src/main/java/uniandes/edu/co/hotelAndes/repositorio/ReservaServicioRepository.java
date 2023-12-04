package uniandes.edu.co.hotelAndes.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.hotelAndes.modelo.Reserva;
import uniandes.edu.co.hotelAndes.modelo.ReservaServicio;

public interface ReservaServicioRepository extends MongoRepository<ReservaServicio, Integer> {
    
        //CREATE
    ReservaServicio save(ReservaServicio reservaServicio);

    //READ
    @Query("{ 'idReserva' : ?0}")
    Optional<ReservaServicio> findById(Integer id);

    @Query("{}")
    List<ReservaServicio> findAll(); // Consulta que retorna todas las reservas

   //DELETE
    @Query(value="{'idReserva':?0}",delete = true)
    void deletById(Integer id);

    //Update
    @Query("{ 'idReserva' : ?0}")
    ReservaServicio updateReservaServicio(Integer id,ReservaServicio tipoReservaServicio);


}
