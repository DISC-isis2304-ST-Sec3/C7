package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

    @Query(value = "SELECT * FROM PRODUCTOS", nativeQuery = true)
    Collection<Producto> darProductos();

    @Query(value = "SELECT * FROM PRODUCTOS WHERE id_producto = :id_producto", nativeQuery = true)
    Producto darProducto(@Param("id_producto") int id_producto);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO PRODUCTOS (id_producto, nombre, costo) VALUES (:id_producto, :nombre, :costo)", nativeQuery = true)
    void insertarProducto(@Param("id_producto") Integer id_producto, 
                            @Param("nombre") String nombre, 
                            @Param("costo") Integer costo);

    @Modifying
    @Transactional
    @Query(value = "UPDATE PRODUCTOS SET id_producto = :id_producto, nombre = :nombre, costo = :costo WHERE id_producto = :id_producto", nativeQuery = true)
    void actualizarProducto(@Param("id_producto") Integer id_producto, 
                            @Param("nombre") String nombre, 
                            @Param("costo") Integer costo);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM PRODUCTOS WHERE id_producto = :id_producto", nativeQuery = true)          
    void eliminarProducto(@Param("id_producto") int id_producto);
}