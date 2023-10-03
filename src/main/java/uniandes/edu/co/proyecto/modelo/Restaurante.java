package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESTAURANTES")
@PrimaryKeyJoinColumn(name = "id")

public class Restaurante extends Servicio{
    private Integer capacidad;
    private String estilo;

    public Restaurante(Integer id, String nombre, String horario_inicio, String horario_cierre, Hotel hotel_nit,Integer capacidad, String estilo) {
        super(id, nombre, horario_inicio, horario_cierre, hotel_nit);
        this.capacidad = capacidad;
        this.estilo = estilo;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public String getEstilo() {
        return estilo;
    }
    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    

}
