package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

    @Query(value = "SELECT * FROM USUARIOS", nativeQuery = true)
    Collection<Usuario> darUsuarios();

    @Query(value = "SELECT * FROM USUARIOS WHERE cedula = :cedula", nativeQuery = true)
    Usuario darUsuario(@Param("cedula") int cedula);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO USUARIOS (cedula, nombre, apellido, usuario_login, clave_login, tipo_usuario) VALUES (:cedula, :nombre, :apellido, :usuario_login, :clave_login, :tipo_usuario)", nativeQuery = true)
    void insertarUsuario(@Param("cedula") Integer cedula, 
                        @Param("nombre") String nombre, 
                        @Param("apellido") String apellido,
                        @Param("usuario_login") String usuario_login, 
                        @Param("clave_login") String clave_login,
                        @Param("tipo_usuario") String tipo_usuario);

    @Modifying
    @Transactional
    @Query(value = "UPDATE USUARIOS SET nombre = :nombre, apellido = :apellido, usuario_login = :usuario_login, clave_login = :clave_login, tipo_usuario = :tipo_usuario WHERE cedula = :cedula", nativeQuery = true)
    void actualizarUsuario(@Param("cedula") int cedula,
                        @Param("nombre") String nombre, 
                        @Param("apellido") String apellido,
                        @Param("usuario_login") String usuario_login, 
                        @Param("clave_login") String clave_login,
                        @Param("tipo_usuario") String tipo_usuario);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM USUARIOS WHERE cedula = :cedula", nativeQuery = true)          
    void eliminarUsuario(@Param("cedula") int cedula);
}