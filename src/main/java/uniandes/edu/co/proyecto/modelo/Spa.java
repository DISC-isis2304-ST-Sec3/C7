package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SPAS")

public class Spa {
    @Id
    private Integer id;
    private Integer capacidad;
    private Integer calificacion;

    public Spa(Integer id, Integer capacidad, Integer calificacion) {
        this.id = id;
        this.capacidad = capacidad;
        this.calificacion = calificacion;
    }
    public Spa()
    {;}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public Integer getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }    
}
