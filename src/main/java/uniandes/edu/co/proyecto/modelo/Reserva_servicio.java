package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESERVAS_SERVICIO")

public class Reserva_servicio {
    @Id
    private Integer id_reserva;
    private String fecha_inicio;
    private String fecha_fin;
    private Integer factura_num;
    private Integer servicio_id;

    public Reserva_servicio(Integer id_reserva, String fecha_inicio, String fecha_fin, Integer factura_num, Integer servicio_id) {
        this.id_reserva = id_reserva;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.factura_num = factura_num;
        this.servicio_id = servicio_id;
    }
    public Reserva_servicio()
    {;}
    public Integer getId_reserva() {
        return id_reserva;
    }
    public String getFecha_inicio() {
        return fecha_inicio;
    }
    public String getFecha_fin() {
        return fecha_fin;
    }
    public Integer getFactura_num() {
        return factura_num;
    }
    public Integer getServicio_id() {
        return servicio_id;
    }
    public void setId_reserva(Integer id_reserva) {
        this.id_reserva = id_reserva;
    }
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    public void setFactura_num(Integer factura_num) {
        this.factura_num = factura_num;
    }
    public void setServicio_id(Integer servicio_id) {
        this.servicio_id = servicio_id;
    }
    
    
}
