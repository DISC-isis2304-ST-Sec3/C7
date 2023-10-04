package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "UTENSILIOS")

public class Utensilio extends Servicio{
    private String nombre_u;
    private Integer costo;

    public Utensilio(Integer id, String nombre_u, String horario_inicio, String horario_cierre, Hotel hotel_nit,String nombre, Integer costo) {
        super(id, nombre, horario_inicio, horario_cierre, hotel_nit);
        this.nombre_u = nombre_u;
        this.costo = costo;
    }
    public Utensilio()
    {;}
    public String getNombre_u() {
        return nombre_u;
    }
    public void setNombre_u(String nombre_u) {
        this.nombre_u = nombre_u;
    }
    public Integer getCosto() {
        return costo;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }    
}
