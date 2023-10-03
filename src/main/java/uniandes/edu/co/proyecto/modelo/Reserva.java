package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESERVAS")

public class Reserva {

    @Id
    private Integer id_reserva;
    private String fecha_entrada;
    private String fecha_salida;
    private Integer num_personas;
    private Integer clientes_cedula;
    private Integer factura_num;

    public Reserva(Integer id_reserva, String fecha_entrada, String fecha_salida, Integer num_personas, Integer clientes_cedula, Integer factura_num) {
        this.id_reserva = id_reserva;
        this.fecha_entrada = fecha_entrada;
        this.fecha_salida = fecha_salida;
        this.num_personas = num_personas;
        this.clientes_cedula = clientes_cedula;
        this.factura_num = factura_num;
    }
    public Reserva()
    {;}
    public Integer getId_reserva() {
        return id_reserva;
    }
    public void setId_reserva(Integer id_reserva) {
        this.id_reserva = id_reserva;
    }
    public String getFecha_entrada() {
        return fecha_entrada;
    }
    public void setFecha_entrada(String fecha_entrada) {
        this.fecha_entrada = fecha_entrada;
    }
    public String getFecha_salida() {
        return fecha_salida;
    }
    public void setFecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;
    }
    public Integer getNum_personas() {
        return num_personas;
    }
    public void setNum_personas(Integer num_personas) {
        this.num_personas = num_personas;
    }
    public Integer getClientes_cedula() {
        return clientes_cedula;
    }
    public void setClientes_cedula(Integer clientes_cedula) {
        this.clientes_cedula = clientes_cedula;
    }
    public Integer getFactura_num() {
        return factura_num;
    }
    public void setFactura_num(Integer factura_num) {
        this.factura_num = factura_num;
    }
    
    
}