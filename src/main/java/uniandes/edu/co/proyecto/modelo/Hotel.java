package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HOTELES")

public class Hotel {
    @Id
    private Integer nit;
    private String nombre;

    public Hotel(Integer nit, String nombre) {
        this.nit = nit;
        this.nombre = nombre;
    }
    public Hotel()
    {;}
    public Integer getNit() {
        return nit;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNit(Integer nit) {
        this.nit = nit;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
       
}
