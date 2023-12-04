package uniandes.edu.co.hotelAndes.modelo;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;

    @Temporal(TemporalType.DATE)
    private Date fechaSalida;

    private int numeroPersonas;
    private String habitacion;
    private ArrayList<Integer> acompanantes;

    public Reserva() {}

    public Reserva(Integer id, Date fechaIngreso, Date fechaSalida, int numeroPersonas, String habitacion, ArrayList<Integer> acompanantes) {
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.numeroPersonas = numeroPersonas;
        this.habitacion = habitacion;
        this.acompanantes = acompanantes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
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

    public ArrayList<Integer> getAcompanantes() {
        return acompanantes;
    }

    public void setAcompanantes(ArrayList<Integer> acompanantes) {
        this.acompanantes = acompanantes;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                ", numeroPersonas=" + numeroPersonas +
                ", habitacion='" + habitacion + '\'' +
                ", acompanantes=" + acompanantes +
                '}';
    }
}
