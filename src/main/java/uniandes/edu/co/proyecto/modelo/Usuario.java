package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIOS")

public class Usuario {
    @Id
    private Integer cedula;
    private String nombre;
    private String apellido;
    private String usuario_login;
    private String clave_login;
    private String tipo_usuario;
    private Integer hotel_nit;
    
    public Usuario(Integer cedula, String nombre, String apellido, String usuario_login, String clave_login, String tipo_usuario, Integer hotel_nit){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario_login = usuario_login;
        this.clave_login = clave_login;
        this.tipo_usuario = tipo_usuario;
        this.hotel_nit = hotel_nit;
    }
    public Usuario()
    {;}
    public Integer getCedula() {
        return cedula;
    }
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getUsuario_login() {
        return usuario_login;
    }
    public void setUsuario_login(String usuario_login) {
        this.usuario_login = usuario_login;
    }
    public String getClave_login() {
        return clave_login;
    }
    public void setClave_login(String clave_login) {
        this.clave_login = clave_login;
    }
    public String getTipo_usuario() {
        return tipo_usuario;
    }
    public void setTipo_usuario(String tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
    public Integer getHotel_nit() {
        return hotel_nit;
    }
    public void setHotel_nit(Integer hotel_nit) {
        this.hotel_nit = hotel_nit;
    }

}
