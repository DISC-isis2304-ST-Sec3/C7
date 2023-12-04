package uniandes.edu.co.hotelAndes.repositorio;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.hotelAndes.modelo.TipoHabitacion;

import java.util.List;

public interface TipoHabitacionRepository extends MongoRepository<TipoHabitacion, Integer> {

    // CREATE
    TipoHabitacion save(TipoHabitacion tipoHabitacion);

    // READ
    @Query(value = "{ tipo : ?0 }")
    TipoHabitacion findByTipo(String tipo);

    @Query("{}")
    List<TipoHabitacion> findAllTiposHabitacion();

    // DELETE
    @Query(value = "{ 'tipo' : ?0 }", delete = true)
    void deleteByTipo(String tipo);

    // UPDATE
    @Query("{ 'tipo' : ?0 }")
    TipoHabitacion updateTipoHabitacion(String tipo, TipoHabitacion tipoHabitacion);

}