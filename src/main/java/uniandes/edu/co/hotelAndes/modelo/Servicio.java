package uniandes.edu.co.hotelAndes.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Servicio")
public class Servicio {

    private String nombre;
    private int precio;
    private String descripcion;
    private int capacidad;

    public Servicio() {
        // Constructor vacío requerido por Spring Data MongoDB
    }

    public Servicio(String nombre, int precio, String descripcion, int capacidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }
}
