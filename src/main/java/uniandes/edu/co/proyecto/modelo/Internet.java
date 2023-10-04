package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "INTERNETS")

public class Internet extends Servicio {

    private Integer capacidad;
    private Integer precio_noche;
    
    public Internet(Integer id, String nombre, String horario_inicio, String horario_cierre, Hotel hotel_nit,Integer capacidad, Integer precio_noche) {
        super(id, nombre, horario_inicio, horario_cierre, hotel_nit);
        this.capacidad = capacidad;
        this.precio_noche = precio_noche;
    }
    public Internet()
    {;}
    public Integer getCapacidad() {
        return capacidad;
    }
    public Integer getPrecio_noche() {
        return precio_noche;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public void setPrecio_noche(Integer precio_noche) {
        this.precio_noche = precio_noche;
    }    
}
