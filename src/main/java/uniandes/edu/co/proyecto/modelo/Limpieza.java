package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LIMPIEZAS")

public class Limpieza {
    @Id
    private Integer id;
    private String tipo;
    private Integer costo;
    private Integer numero_prendas;

    public Limpieza(Integer id, String tipo, Integer costo, Integer numero_prendas) {
        this.id = id; 
        this.tipo = tipo;
        this.costo = costo;
        this.numero_prendas = numero_prendas;
    }
    public Limpieza()
    {;}
    public Integer getId() {
        return id;
    }
    public String getTipo() {
        return tipo;
    }
    public Integer getCosto() {
        return costo;
    }
    public Integer getNumero_prendas() {
        return numero_prendas;
    }
    public void setId(Integer id) {
        this.id = id;
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
