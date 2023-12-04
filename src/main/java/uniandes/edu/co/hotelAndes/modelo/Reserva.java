package uniandes.edu.co.hotelAndes.modelo;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Reserva")
public class Reserva {

    @Id
    private Integer id;


    private String fechaIngreso;

    private String fechaSalida;

    private int numeroPersonas;
    private String habitacion;
    private int idCliente;

    public Reserva() {}

    public Reserva(Integer id, String fechaIngreso, String fechaSalida, int numeroPersonas, String habitacion, int idCliente) {
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.numeroPersonas = numeroPersonas;
        this.habitacion = habitacion;
        this.idCliente = idCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                ", numeroPersonas=" + numeroPersonas +
                ", habitacion='" + habitacion + '\'' +
                ", idCliente=" + idCliente +
                '}';
    }
}
