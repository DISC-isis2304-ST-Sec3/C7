package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Maquina;

public interface MaquinaRepository extends JpaRepository<Maquina, Integer>{

    @Query(value = "SELECT * FROM MAQUINAS", nativeQuery = true)
    Collection<Maquina> darMaquinas();

    @Query(value = "SELECT * FROM MAQUINAS WHERE codigo_maquina = :codigo_maquina", nativeQuery = true)
    Maquina darMaquina(@Param("codigo_maquina") int codigo_maquina);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO MAQUINAS (codigo_maquina, nombre_maquina) VALUES (:codigo_maquina, :nombre_maquina)", nativeQuery = true)
    void insertarMaquina(@Param("codigo_maquina") Integer codigo_maquina, 
                        @Param("nombre_maquina") String nombre_maquina);

    @Modifying
    @Transactional
    @Query(value = "UPDATE MAQUINAS SET nombre_maquina = :nombre_maquina  WHERE codigo_maquina = :codigo_maquina", nativeQuery = true)
    void actualizarMaquina(@Param("codigo_maquina") int codigo_maquina,
                        @Param("nombre_maquina") String nombre_maquina);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM MAQUINAS WHERE codigo_maquina = :codigo_maquina", nativeQuery = true)          
    void eliminarMaquina(@Param("codigo_maquina") int codigo_maquina);
}