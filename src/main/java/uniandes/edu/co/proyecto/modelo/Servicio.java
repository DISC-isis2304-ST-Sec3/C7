package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SERVICIOS")

public class Servicio{
    @Id
    private Integer id;
    private String nombre;
    private String horario_inicio;
    private String horario_cierre;
    private Integer hotel_nit;

    public Servicio(Integer id, String nombre, String horario_inicio, String horario_cierre, Integer hotel_nit) {
        this.id = id;
        this.nombre = nombre;
        this.horario_inicio = horario_inicio;
        this.horario_cierre = horario_cierre;
        this.hotel_nit = hotel_nit;
    }
    public Servicio()
    {;}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getHorario_inicio() {
        return horario_inicio;
    }
    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }
    public String getHorario_cierre() {
        return horario_cierre;
    }
    public void setHorario_cierre(String horario_cierre) {
        this.horario_cierre = horario_cierre;
    }
    public Integer getHotel_nit() {
        return hotel_nit;
    }
    public void setHotel_nit(Integer hotel_nit) {
        this.hotel_nit = hotel_nit;
    }
    
}
