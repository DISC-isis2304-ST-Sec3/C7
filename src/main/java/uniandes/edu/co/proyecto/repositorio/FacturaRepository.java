package uniandes.edu.co.proyecto.repositorio;
import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import uniandes.edu.co.proyecto.modelo.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Integer>{

    @Query(value = "SELECT * FROM FACTURAS", nativeQuery = true)
    Collection<Factura> darFacturas();

    @Query(value = "SELECT * FROM FACTURAS WHERE num_factura = :num_factura", nativeQuery = true)
    Factura darFactura(@Param("num_factura") int num_factura);
    
    @Modifying
    @Transactional
    @Query(value = "INSERT INTO FACTURAS (num_factura, vendedor, costo_total) VALUES (:num_factura, :vendedor, :costo_total)", nativeQuery = true)
    void insertarFactura(@Param("num_factura") Integer num_factura, 
                            @Param("vendedor") String vendedor, 
                            @Param("costo_total") String costo_total);

    @Modifying
    @Transactional
    @Query(value = "UPDATE FACTURAS SET num_factura = :num_factura, vendedor = :vendedor, costo_total = :costo_total WHERE num_factura = :num_factura", nativeQuery = true)
    void actualizarFactura(@Param("num_factura") Integer num_factura, 
                            @Param("vendedor") String vendedor, 
                            @Param("costo_total") String costo_total);

    @Modifying
    @Transactional    
    @Query(value = "DELETE FROM FACTURAS WHERE num_factura = :num_factura", nativeQuery = true)          
    void eliminarFactura(@Param("num_factura") int num_factura);
}