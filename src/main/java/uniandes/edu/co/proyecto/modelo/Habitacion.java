package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HABITACIONES")

public class Habitacion {

    @Id
    private Integer id_habitacion;
    private String tipo_habitacion;
    private Integer capacidad;
    private Integer costo_noche;
    private String television;
    private String minibar;
    private String cafetera;
    private String comedor;
    private String cocina;
    private String jacuzzi;
    private String reserva_id;
    private Integer hotel_nit;

    public Habitacion(Integer id_habitacion, String tipo_habitacion, Integer capacidad, Integer costo_noche, String television, String minibar, String cafetera, String comedor, String cocina, String jacuzzi, String reserva_id, Integer hotel_nit) {
        this.id_habitacion = id_habitacion;
        this.tipo_habitacion = tipo_habitacion;
        this.capacidad = capacidad;
        this.costo_noche = costo_noche;
        this.television = television;
        this.minibar = minibar;
        this.cafetera = cafetera;
        this.comedor = comedor;
        this.cocina = cocina;
        this.jacuzzi = jacuzzi;
        this.reserva_id = reserva_id;
        this.hotel_nit = hotel_nit;
    }

    public Integer getId_habitacion() {
        return id_habitacion;
    }

    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public Integer getCosto_noche() {
        return costo_noche;
    }

    public String getTelevision() {
        return television;
    }

    public String getMinibar() {
        return minibar;
    }

    public String getCafetera() {
        return cafetera;
    }

    public String getComedor() {
        return comedor;
    }

    public String getCocina() {
        return cocina;
    }

    public String getJacuzzi() {
        return jacuzzi;
    }

    public String getReserva_id() {
        return reserva_id;
    }

    public Integer getHotel_nit() {
        return hotel_nit;
    }

    public void setId_habitacion(Integer id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public void setCosto_noche(Integer costo_noche) {
        this.costo_noche = costo_noche;
    }

    public void setTelevision(String television) {
        this.television = television;
    }

    public void setMinibar(String minibar) {
        this.minibar = minibar;
    }

    public void setCafetera(String cafetera) {
        this.cafetera = cafetera;
    }

    public void setComedor(String comedor) {
        this.comedor = comedor;
    }

    public void setCocina(String cocina) {
        this.cocina = cocina;
    }

    public void setJacuzzi(String jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public void setReserva_id(String reserva_id) {
        this.reserva_id = reserva_id;
    }

    public void setHotel_nit(Integer hotel_nit) {
        this.hotel_nit = hotel_nit;
    }
    

}
    
