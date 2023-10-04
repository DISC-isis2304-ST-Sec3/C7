package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESTABLECIMIENTOS")

public class Establecimiento extends Servicio{

    private String tipo;
    private String categoria;
    
    public Establecimiento(Integer id, String nombre, String horario_inicio, String horario_cierre, Hotel hotel_nit, String tipo, String categoria) {
        super(id, nombre, horario_inicio, horario_cierre, hotel_nit);
        this.tipo = tipo;
        this.categoria = categoria;
    }
    public Establecimiento()
    {;}
    
    public String getTipo() {
        return tipo; 
    }
    public String getCategoria() {
        return categoria;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
        
}
