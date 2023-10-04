package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Habitacion;

public interface HabitacionRepository extends JpaRepository<Habitacion, Integer>{

    @Query(value = "SELECT * FROM HABITACIONES", nativeQuery = true)
    Collection<Habitacion> darHabitaciones();

    @Query(value = "SELECT * FROM HABITACIONES WHERE id_habitacion = :id_habitacion", nativeQuery = true)
    Habitacion darHabitacion(@Param("id_habitacion") int id_habitacion);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO HABITACIONES (id_habitacion, tipo_habitacion, capacidad, costo_noche, television, minibar, cafetera, comedor, cocina, jacuzzi) VALUES (:id_habitacion, :tipo_habitacion, :capacidad, :costo_noche, :television, :minibar, :cafetera, :comedor, :cocina, :jacuzzi)", nativeQuery = true)
    void insertarHabitacion(@Param("id_habitacion") Integer id_habitacion, 
                            @Param("tipo_habitacion") String tipo_habitacion, 
                            @Param("capacidad") Integer capacidad,
                            @Param("costo_noche") Integer costo_noche,
                            @Param("television") Boolean television,
                            @Param("minibar") Boolean minibar,
                            @Param("cafetera") Boolean cafetera,
                            @Param("comedor") Boolean comedor,
                            @Param("cocina") Boolean cocina,
                            @Param("jacuzzi") Boolean jacuzzi);

    @Modifying
    @Transactional
    @Query(value = "UPDATE HABITACIONES SET id_habitacion = :id_habitacion, tipo_habitacion = : tipo_habitacion, capacidad = :capacidad, costo_noche = :costo_noche, television = :television, minibar = :minibar, cafetera = :cafetera, comedor = :comedor, cocina = :cocina, jacuzzi = :jacuzzi WHERE id_habitacion = :id_habitacion", nativeQuery = true)
    void actualizarHabitacion(@Param("id_habitacion") Integer id_habitacion, 
                            @Param("tipo_habitacion") String tipo_habitacion, 
                            @Param("capacidad") Integer capacidad,
                            @Param("costo_noche") Integer costo_noche,
                            @Param("television") Boolean television,
                            @Param("minibar") Boolean minibar,
                            @Param("cafetera") Boolean cafetera,
                            @Param("comedor") Boolean comedor,
                            @Param("cocina") Boolean cocina,
                            @Param("jacuzzi") Boolean jacuzzi);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM HABITACIONES WHERE id_habitacion = :id_habitacion", nativeQuery = true)          
    void eliminarHabitacion(@Param("id_habitacion") int id_habitacion);
}