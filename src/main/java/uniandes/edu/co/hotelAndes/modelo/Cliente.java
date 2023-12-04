package uniandes.edu.co.hotelAndes.modelo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("Cliente")
public class Cliente {

    private String tipoDocumento;
    private int numeroDocumento;
    private String nombre;
    private String correo;

    public Cliente() {
        // Constructor vacío requerido por Spring Data MongoDB
    }

    public Cliente(String tipoDocumento, int numeroDocumento, String nombre, String correo) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento=" + numeroDocumento +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
