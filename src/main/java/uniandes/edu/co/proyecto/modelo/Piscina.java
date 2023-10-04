package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PISCINAS")

public class Piscina extends Servicio{

    private Integer costo;
    private Integer capacidad;
    private Integer profundidad;

    public Piscina(Integer id, String nombre, String horario_inicio, String horario_cierre, Hotel hotel_nit,Integer costo, Integer capacidad, Integer profundidad) {
        super(id, nombre, horario_inicio, horario_cierre, hotel_nit);
        this.costo = costo;
        this.capacidad = capacidad;
        this.profundidad = profundidad;
    }
    public Piscina()
    {;}
    public Integer getCosto() {
        return costo;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public Integer getProfundidad() {
        return profundidad;
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
