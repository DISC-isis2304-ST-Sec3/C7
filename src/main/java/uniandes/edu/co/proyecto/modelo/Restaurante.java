package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESTAURANTES")

public class Restaurante {
    @Id
    private Integer id;
    private Integer capacidad;
    private String estilo;

    public Restaurante(Integer id, Integer capacidad, String estilo) {
        this.id = id;
        this.capacidad = capacidad;
        this.estilo = estilo;
    }
    public Restaurante()
    {;}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
