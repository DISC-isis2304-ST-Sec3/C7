package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FACTURAS")

public class Factura {
    @Id
    private Integer num_factura;
    private String vendedor;
    private Integer costo_total;

    public Factura(Integer num_factura, String vendedor, Integer costo_total) {
        this.num_factura = num_factura;
        this.vendedor = vendedor;
        this.costo_total = costo_total;
    }
    public Factura()
    {;}
    public Integer getNum_factura() {
        return num_factura;
    }
    public String getVendedor() {
        return vendedor;
    }
    public Integer getCosto_total() {
        return costo_total;
    }
    public void setNum_factura(Integer num_factura) {
        this.num_factura = num_factura;
    }
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }
    public void setCosto_total(Integer costo_total) {
        this.costo_total = costo_total;
    }
    
}
