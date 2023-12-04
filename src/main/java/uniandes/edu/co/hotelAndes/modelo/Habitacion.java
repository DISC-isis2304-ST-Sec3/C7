package uniandes.edu.co.hotelAndes.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document("Habitacion")
public class Habitacion {

    private int id;
    private int capacidad;
    private int precio;
    private ArrayList<Servicio> consumos;
    private TipoHabitacion tipoHabitacion;

    public Habitacion() {
        // Constructor vacío requerido por Spring Data MongoDB
    }

    public Habitacion(int id, int capacidad, int precio, ArrayList<Servicio> consumos, TipoHabitacion tipoHabitacion) {
        this.id = id;
        this.capacidad = capacidad;
        this.precio = precio;
        this.consumos = consumos;
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Servicio> getConsumos() {
        return consumos;
    }

    public void setConsumos(ArrayList<Servicio> consumos) {
        this.consumos = consumos;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "id=" + id +
                ", capacidad=" + capacidad +
                ", precio=" + precio +
                ", consumos=" + consumos +
                ", tipoHabitacion=" + tipoHabitacion +
                '}';
    }
}
