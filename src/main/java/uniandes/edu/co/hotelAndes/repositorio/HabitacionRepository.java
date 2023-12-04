package uniandes.edu.co.hotelAndes.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.hotelAndes.modelo.Habitacion;
import uniandes.edu.co.hotelAndes.modelo.Reserva;
import uniandes.edu.co.hotelAndes.modelo.TipoHabitacion;

public interface HabitacionRepository extends MongoRepository<Habitacion, Integer> {

        //CREATE
    Habitacion save(TipoHabitacion tipoHabitacion);

    //READ
    @Query("{ 'id' : ?0}")
    Optional<Habitacion> findById(Integer id);

    @Query("{}")
    List<Habitacion> findAll(); // Consulta que retorna todas las reservas

   //DELETE
    @Query(value="{'id':?0}",delete = true)
    void deletById(Integer id);

    //Update
    @Query("{ 'id' : ?0}")
    Habitacion updateHabitacion(Integer id,Habitacion tipoHabitacion);

    
} 