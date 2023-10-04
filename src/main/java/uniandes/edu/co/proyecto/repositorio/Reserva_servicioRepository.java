package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Reserva_servicio;

public interface Reserva_servicioRepository extends JpaRepository<Reserva_servicio, Integer>{

    @Query(value = "SELECT * FROM RESERVAS_SERVICIO", nativeQuery = true)
    Collection<Reserva_servicio> darReservas_servicio();

    @Query(value = "SELECT * FROM RESERVAS_SERVICIO WHERE id_reserva = :id_reserva", nativeQuery = true)
    Reserva_servicio darReserva_servicio(@Param("id_reserva") int id_reserva);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO RESERVAS_SERVICIO (id_reserva, fecha_inicio, fecha_fin) VALUES (:id_reserva, :fecha_inicio, :fecha_fin)", nativeQuery = true)
    void insertarReserva_servicio(@Param("id_reserva") Integer id_reserva, 
                            @Param("fecha_inicio") String fecha_inicio, 
                            @Param("fecha_fin") String fecha_fin);

    @Modifying
    @Transactional
    @Query(value = "UPDATE RESERVAS_SERVICIO SET id_reserva = :id_reserva, fecha_inicio = :fecha_inicio, fecha_fin = :fecha_fin WHERE id_reserva = :id_reserva", nativeQuery = true)
    void actualizarReserva_servicio(@Param("id_reserva") Integer id_reserva, 
                            @Param("fecha_inicio") String fecha_inicio, 
                            @Param("fecha_fin") String fecha_fin);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM RESERVAS_SERVICIO WHERE id_reserva = :id_reserva", nativeQuery = true)          
    void eliminarReserva_servicio(@Param("id_reserva") int id_reserva);
}