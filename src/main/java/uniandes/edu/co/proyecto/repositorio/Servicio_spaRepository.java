package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Servicio_spa;

public interface Servicio_spaRepository extends JpaRepository<Servicio_spa, Integer>{

    @Query(value = "SELECT * FROM SERVICIOS_SPA", nativeQuery = true)
    Collection<Servicio_spa> darServicios_spa();

    @Query(value = "SELECT * FROM SERVICIOS_SPA WHERE id_serv_spa = :id_serv_spa", nativeQuery = true)
    Servicio_spa darServicio_spa(@Param("id_serv_spa") int id_serv_spa);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO SERVICIOS_SPA (id_serv_spa, servicio, duracion, costo, spa_id) VALUES (:id_serv_spa, :servicio, :duracion, :costo, :spa_id)", nativeQuery = true)
    void insertarServicio_spa(@Param("id_serv_spa") Integer id_serv_spa, 
                            @Param("servicio") String servicio, 
                            @Param("duracion") Integer duracion,
                            @Param("costo") Integer costo, 
                            @Param("spa_id") Integer spa_id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE SERVICIOS_SPA SET servicio = :servicio, duracion = :duracion, costo = :costo, spa_id = :spa_id WHERE id_serv_spa = :id_serv_spa", nativeQuery = true)
    void actualizarServicio_spa(@Param("id_serv_spa") int id_serv_spa,
                            @Param("servicio") String servicio, 
                            @Param("duracion") Integer duracion,
                            @Param("costo") Integer costo, 
                            @Param("spa_id") Integer spa_id);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM SERVICIOS_SPA WHERE id_serv_spa = :id_serv_spa", nativeQuery = true)          
    void eliminarServicio_spa(@Param("id_serv_spa") int id_serv_spa);
}