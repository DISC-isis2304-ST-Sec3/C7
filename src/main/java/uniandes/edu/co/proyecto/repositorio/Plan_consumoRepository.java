package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Plan_consumo;

public interface Plan_consumoRepository extends JpaRepository<Plan_consumo, Integer>{

    @Query(value = "SELECT * FROM PLANES_CONSUMO", nativeQuery = true)
    Collection<Plan_consumo> darPlanes_consumo();

    @Query(value = "SELECT * FROM PLANES_CONSUMO WHERE id_plan = :id_plan", nativeQuery = true)
    Plan_consumo darPlan_consumo(@Param("id_plan") int id_plan);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO PLANES_CONSUMO (id_plan, nombre, descuento) VALUES (:id_plan, :nombre, :descuento)", nativeQuery = true)
    void insertarPlan_consumo(@Param("id_plan") Integer id_plan, 
                            @Param("nombre") String nombre, 
                            @Param("descuento") Integer descuento);

    @Modifying
    @Transactional
    @Query(value = "UPDATE PLANES_CONSUMO SET id_plan = :id_plan, nombre = :nombre, descuento = :descuento WHERE id_plan = :id_plan", nativeQuery = true)
    void actualizarPlan_consumo(@Param("id_plan") Integer id_plan, 
                            @Param("nombre") String nombre, 
                            @Param("descuento") Integer descuento);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM PLANES_CONSUMO WHERE id_plan = :id_plan", nativeQuery = true)          
    void eliminarPlan_consumo(@Param("id_plan") int id_plan);
}