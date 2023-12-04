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

   

    @Query("{ 'hora' : ?0, 'inicio' : ?1, 'fin' : ?2 }")
    List<Reserva> findByHoraAndInicioAndFin(String hora, Date inicio, Date fin);
    // Consulta con múltiples parámetros

    void deleteById(String id); // Eliminar una reserva por su ID

    // Insertar una nueva reserva
    // Nota: en MongoDB, el ID se genera automáticamente, no necesitas especificarlo en la consulta
    // Se asume que la estructura de Reserva en MongoDB maneja este comportamiento


    // Actualizar una reserva por su ID
    @Query("{ '_id' : ?0 }")
    Reserva saveAndFlush(Reserva reserva); // Guardar y actualizar

    // Eliminar una reserva por su ID
    void delete(Reserva reserva);

}
