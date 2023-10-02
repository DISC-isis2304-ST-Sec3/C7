package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTOS")

public class Producto {
    @Id
    private Integer id_producto;
    private String nombre;
    private Integer costo;
    
    @ManyToOne
    @JoinColumn(name = "establecimiento_id" , referencedColumnName = "id")
    private Establecimiento establecimiento_id;
    @JoinColumn(name = "restaurante_id" , referencedColumnName = "id")
    private Restaurante restaurante_id;
    
    public Producto(Integer id_producto, String nombre, Integer costo, Establecimiento establecimiento_id, Restaurante restaurante_id) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.costo = costo;
        this.establecimiento_id = establecimiento_id;
        this.restaurante_id = restaurante_id;
    }
    public Producto()
    {;}
    public Integer getId_producto() {
        return id_producto;
    }
    public String getNombre() {
        return nombre;
    }
    public Integer getCosto() {
        return costo;
    }
    public Establecimiento getEstablecimiento_id() {
        return establecimiento_id;
    }
    public Restaurante getRestaurante_id() {
        return restaurante_id;
    }
    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }
    public void setEstablecimiento_id(Establecimiento establecimiento_id) {
        this.establecimiento_id = establecimiento_id;
    }
    public void setRestaurante_id(Restaurante restaurante_id) {
        this.restaurante_id = restaurante_id;
    }
    

}
