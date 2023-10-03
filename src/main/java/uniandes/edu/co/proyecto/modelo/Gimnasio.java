package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "GIMNASIOS")
@PrimaryKeyJoinColumn(name = "id")

public class Gimnasio extends Servicio{

    private Integer costo;
    private Integer capacidad;
    private String horario;
    
    public Gimnasio(Integer id, String nombre, String horario_inicio, String horario_cierre, Hotel hotel_nit,Integer costo, Integer capacidad, String horario) {
        super(id, nombre, horario_inicio, horario_cierre, hotel_nit);
        this.costo = costo;
        this.capacidad = capacidad;
        this.horario = horario;
    }
    public Gimnasio()
    {;}
    public Integer getCosto() {
        return costo;
    }
    public Integer getCapacidad() {
        return capacidad;
    }
    public String getHorario() {
        return horario;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
