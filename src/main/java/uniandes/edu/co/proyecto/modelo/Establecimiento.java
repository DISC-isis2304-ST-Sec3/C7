package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESTABLECIMIENTOS")

public class Establecimiento {
    @Id
    private Integer id;
    private String tipo;
    private String categoria;
    
    public Establecimiento(Integer id, String tipo, String categoria) {
        this.id = id;
        this.tipo = tipo;
        this.categoria = categoria;
    }
    public Establecimiento()
    {;}
    
    public Integer getId() {
        return id;
    }
    
    public String getTipo() {
        return tipo; 
    }
    public String getCategoria() {
        return categoria;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
        
}
