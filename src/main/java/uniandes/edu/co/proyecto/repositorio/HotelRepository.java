package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer>{

    @Query(value = "SELECT * FROM HOTELES", nativeQuery = true)
    Collection<Hotel> darHoteles();

    @Query(value = "SELECT * FROM HOTELES WHERE nit = :nit", nativeQuery = true)
    Hotel darHotel(@Param("nit") int nit);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO HOTELES (nit, nombre) VALUES (:nit, :nombre)", nativeQuery = true)
    void insertarHotel(@Param("nit") Integer nit, 
                        @Param("nombre") String nombre);

    @Modifying
    @Transactional
    @Query(value = "UPDATE HOTELES SET nombre = :nombre  WHERE nit = :nit", nativeQuery = true)
    void actualizarHotel(@Param("nit") int nit,
                        @Param("nombre") String nombre);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM HOTELES WHERE nit = :nit", nativeQuery = true)          
    void eliminarHotel(@Param("nit") int nit);
}