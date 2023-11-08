package uniandes.edu.co.proyecto.modelo;


import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "consumos")
public class Consumos {
    
    @EmbeddedId
    private ConsumosPK pk;

    private String descripcion;
    private Double costo;



    
    public Consumos() {
        ;
    }

    public Consumos(Habitacion Habitacion_id, Servicios Servicios_tipo, String descripcion, Double costo) {
        this.pk = new ConsumosPK(Habitacion_id, Servicios_tipo);
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public ConsumosPK getPk() {
        return pk;
    }
    public void setPk(ConsumosPK pk) {
        this.pk = pk;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Double getCosto() {
        return costo;
    }
    public void setCosto(Double costo) {
        this.costo = costo;
    }

    
    
}
