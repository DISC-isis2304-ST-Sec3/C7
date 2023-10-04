package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

    @Query(value = "SELECT * FROM CLIENTES", nativeQuery = true)
    Collection<Cliente> darClientes();

    @Query(value = "SELECT * FROM CLIENTES WHERE cedula = :cedula", nativeQuery = true)
    Cliente darCliente(@Param("cedula") int cedula);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO CLIENTES (cedula, nombre, apellido, usuario_login, clave_login) VALUES (:cedula, :nombre, :apellido, :usuario_login, :clave_login)", nativeQuery = true)
    void insertarCliente(@Param("cedula") Integer cedula, 
                            @Param("nombre") String nombre, 
                            @Param("apellido") String apellido,
                             @Param("usuario_login") String usuario_login, 
                             @Param("clave_login") String clave_login);

    @Modifying
    @Transactional
    @Query(value = "UPDATE CLIENTES SET nombre = :nombre, apellido = :apellido, usuario_login = :usuario_login, clave_login = :clave_login WHERE cedula = :cedula", nativeQuery = true)
    void actualizarCliente(@Param("cedula") int cedula,
                            @Param("nombre") String nombre, 
                            @Param("apellido") String apellido,
                            @Param("usuario_login") String usuario_login, 
                            @Param("clave_login") String clave_login);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM CLIENTES WHERE cedula = :cedula", nativeQuery = true)          
    void eliminarCliente(@Param("cedula") int cedula);
}