package uniandes.edu.co.hotelAndes.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document("ReservaServicio")
public class ReservaServicio {


    @Id
    private Integer id;
    
    private String nombreServicio;
    private int idReserva;
    private int precio;

    public ReservaServicio() {
        // Constructor vacío requerido por Spring Data MongoDB
    }

    public ReservaServicio(String nombreServicio, int idReserva, int precio) {
        this.nombreServicio = nombreServicio;
        this.idReserva = idReserva;
        this.precio = precio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "ReservaServicio{" +
                "nombreServicio='" + nombreServicio + '\'' +
                ", idReserva=" + idReserva +
                ", precio=" + precio +
                '}';
    }
}
