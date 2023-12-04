package uniandes.edu.co.hotelAndes.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.hotelAndes.modelo.TipoHabitacion;
import uniandes.edu.co.hotelAndes.modelo.Usuario;

import java.util.Collection;

public interface TipoHabitacionRepository extends JpaRepository<TipoHabitacion, Integer> {

    @Query(value = "SELECT * FROM TIPOS_HABITACIONES", nativeQuery = true)
    Collection<TipoHabitacion> darTiposHabitaciones();

    @Query(value = "SELECT * FROM TIPOS_HABITACIONES WHERE id = :id", nativeQuery = true)
    TipoHabitacion darTipoHabitacion(@Param("id") long id);


    @Modifying
    @Transactional
    @Query(value = "INSERT INTO TIPOS_HABITACIONES (id, tipo, capacidad, dotacion) VALUES ( hotel_andes_sequence.nextval, :tipo, :capacidad, :dotacion)", nativeQuery = true)
    void insertarTipoHabitacion(@Param("tipo") String tipo, @Param("capacidad") long capacidad,
                         @Param("dotacion") String dotacion);

    @Modifying
    @Transactional
    @Query(value = "UPDATE TIPOS_HABITACIONES SET  tipo = :tipo, capacidad = :capacidad, dotacion = :dotacion WHERE id = :id", nativeQuery = true)
    void actualizarTipoHabitacion(@Param("id") long id, @Param("tipo") String tipo, @Param("capacidad") long capacidad,
                               @Param("dotacion") String dotacion);


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM TIPOS_HABITACIONES WHERE id = :id", nativeQuery = true)
    void eliminarTipoHabitacion(@Param("id") long id);
}
