package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SALONES_EVENTOS")   

public class Salon_eventos {
    @Id
    private Integer id;
    private Integer costo;
    private Integer capacidad;
    private String tipo;
    
    public Salon_eventos(Integer id, Integer costo, Integer capacidad, String tipo) {
        this.id = id;
        this.costo = costo;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    public Salon_eventos()
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
    public String getTipo() {
        return tipo;
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
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
