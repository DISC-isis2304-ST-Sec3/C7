package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "GIMNASIOS")

public class Gimnasio {

    @Id
    private Integer id;
    private Integer costo;
    private Integer capacidad;
    private String horario;
    
    public Gimnasio(Integer id, Integer costo, Integer capacidad, String horario) {
        this.id = id;
        this.costo = costo;
        this.capacidad = capacidad;
        this.horario = horario;
    }
    public Gimnasio()
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
    public String getHorario() {
        return horario;
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
    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
