package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PLANES_CONSUMO")

public class Plan_consumo {
    @Id
    private Integer id_plan;
    private String nombre;
    private Integer descuento;
    private Integer hotel_nit;

    public Plan_consumo(Integer id_plan, String nombre, Integer descuento, Integer hotel_nit) {
        this.id_plan = id_plan;
        this.nombre = nombre;
        this.descuento = descuento;
        this.hotel_nit = hotel_nit;
    }
    public Plan_consumo() 
    {;}
    public Integer getId_plan() {
        return id_plan;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getDescuento() {
        return descuento;
    }
    public Integer getHotel_nit() {
        return hotel_nit;
    }
    public void setId_plan(Integer id_plan) {
        this.id_plan = id_plan;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }
    public void setHotel_nit(Integer hotel_nit) {
        this.hotel_nit = hotel_nit;
    }
    
    
}
