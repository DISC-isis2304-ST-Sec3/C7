package uniandes.edu.co.hotelAndes.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import uniandes.edu.co.hotelAndes.modelo.Reserva;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface ReservaRepository extends MongoRepository<Reserva, Integer> {


    //CREATE
    Reserva save(Reserva reserva);

    //READ
    @Query("{ 'id' : ?0}")
    Optional<Reserva> findById(Integer id);

    @Query("{}")
    List<Reserva> findAll(); // Consulta que retorna todas las reservas

   //DELETE
    @Query(value="{'id':?0}",delete = true)
    void deletById(Integer id);

    //Update
    @Query("{ 'id' : ?0}")
    Reserva updateReserva(Integer id,Reserva tipoReserva);


}
