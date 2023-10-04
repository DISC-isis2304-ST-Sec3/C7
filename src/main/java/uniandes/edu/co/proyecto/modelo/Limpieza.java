package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIMPIEZAS")

public class Limpieza extends Servicio {
    private String tipo;
    private Integer costo;
    private Integer numero_prendas;

    public Limpieza(Integer id, String nombre, String horario_inicio, String horario_cierre, Hotel hotel_nit,String tipo, Integer costo, Integer numero_prendas) {
        super(id, nombre, horario_inicio, horario_cierre, hotel_nit);
        this.tipo = tipo;
        this.costo = costo;
        this.numero_prendas = numero_prendas;
    }
    public Limpieza()
    {;}
    public String getTipo() {
        return tipo;
    }
    public Integer getCosto() {
        return costo;
    }
    public Integer getNumero_prendas() {
        return numero_prendas;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }
    public void setNumero_prendas(Integer numero_prendas) {
        this.numero_prendas = numero_prendas;
    }
    
}
