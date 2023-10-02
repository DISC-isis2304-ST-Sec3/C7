package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "INTERNETS")

public class Internet {
    @Id
    private Integer id;
    private Integer capacidad;
    private Integer precio_noche;
    
    public Internet(Integer id, Integer capacidad, Integer precio_noche) {
        this.id = id;
        this.capacidad = capacidad;
        this.precio_noche = precio_noche;
    }
    public Internet()
    {;}
    public Integer getId() {
        return id;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public Integer getPrecio_noche() {
        return precio_noche;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public void setPrecio_noche(Integer precio_noche) {
        this.precio_noche = precio_noche;
    }    
}
