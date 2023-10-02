package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PISCINAS")

public class Piscina {
    @Id
    private Integer id;
    private Integer costo;
    private Integer capacidad;
    private Integer profundidad;

    public Piscina(Integer id, Integer costo, Integer capacidad, Integer profundidad) {
        this.id = id;
        this.costo = costo;
        this.capacidad = capacidad;
        this.profundidad = profundidad;
    }
    public Piscina()
    {;}
    public Integer getId() {
        return id;
    }
    public Integer getCosto() {
        return costo;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public Integer getProfundidad() {
        return profundidad;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public void setProfundidad(Integer profundidad) {
        this.profundidad = profundidad;
    }
    
    
}
