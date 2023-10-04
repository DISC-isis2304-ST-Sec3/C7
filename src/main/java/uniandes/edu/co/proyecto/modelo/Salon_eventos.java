package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "SALONES_EVENTOS")   

public class Salon_eventos extends Servicio{
    private Integer costo;
    private Integer capacidad;
    private String tipo;
    
    public Salon_eventos(Integer id, String nombre, String horario_inicio, String horario_cierre, Hotel hotel_nit,Integer costo, Integer capacidad, String tipo) {
        super(id, nombre, horario_inicio, horario_cierre, hotel_nit);
        this.costo = costo;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }
    public Salon_eventos()
    {;}
    public Integer getCosto() {
        return costo;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public String getTipo() {
        return tipo;
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
