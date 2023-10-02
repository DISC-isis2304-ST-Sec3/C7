package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UTENSILIOS")

public class Utensilio {
    @Id
    private Integer id;
    private String nombre;
    private Integer costo;

    public Utensilio(Integer id, String nombre, Integer costo) {
        this.id = id;
        this.nombre = nombre;
        this.costo = costo;
    }
    public Utensilio()
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
    public Integer getCosto() {
        return costo;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }    
}
