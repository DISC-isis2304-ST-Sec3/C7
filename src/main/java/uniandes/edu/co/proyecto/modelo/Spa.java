package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "SPAS")
public class Spa extends Servicio{

    private Integer capacidad;
    private Integer calificacion;

    public Spa(Integer id, String nombre, String horario_inicio, String horario_cierre, Hotel hotel_nit, Integer capacidad, Integer calificacion) {
        super(id, nombre, horario_inicio, horario_cierre, hotel_nit);
        this.capacidad = capacidad;
        this.calificacion = calificacion;
    }

    public Spa()
    {;}

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