package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Integer>{

    @Query(value = "SELECT * FROM RESERVAS", nativeQuery = true)
    Collection<Reserva> darReservas();

    @Query(value = "SELECT * FROM RESERVAS WHERE id_reserva = :id_reserva", nativeQuery = true)
    Reserva darReserva(@Param("id_reserva") int id_reserva);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO RESERVAS (id_reserva, fecha_entrada, fecha_salida, num_personas) VALUES (:id_reserva, :fecha_entrada, :fecha_salida, :num_personas)", nativeQuery = true)
    void insertarReserva(@Param("id_reserva") Integer id_reserva, 
                            @Param("fecha_entrada") String fecha_entrada, 
                            @Param("fecha_salida") String fecha_salida,
                             @Param("num_personas") Integer num_personas, 
                             @Param("clave_login") String clave_login);

    @Modifying
    @Transactional
    @Query(value = "UPDATE RESERVAS SET fecha_entrada = :fecha_entrada, fecha_salida = :fecha_salida, num_personas = :num_personas WHERE id_reserva = :id_reserva", nativeQuery = true)
    void actualizarReserva(@Param("id_reserva") int id_reserva,
                            @Param("fecha_entrada") String fecha_entrada, 
                            @Param("fecha_salida") String fecha_salida,
                            @Param("num_personas") Integer num_personas);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM RESERVAS WHERE id_reserva = :id_reserva", nativeQuery = true)          
    void eliminarReserva(@Param("id_reserva") int id_reserva);
}