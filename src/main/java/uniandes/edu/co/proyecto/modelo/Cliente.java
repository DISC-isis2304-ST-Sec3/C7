package uniandes.edu.co.proyecto.modelo;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CLIENTE")

public class Cliente {
    @Id
    private Integer cedula;
    private String nombre;
    private String apellido;
    private String usuario_login;
    private String clave_login;    

    public Cliente(Integer cedula, String nombre, String apellido, String usuario_login, String clave_login){
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario_login = usuario_login;
        this.clave_login = clave_login;
    }
    public Cliente()
    {;}
    public Integer getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getUsuario_login() {
        return usuario_login;
    }
    public String getClave_login() {
        return clave_login;
    }
    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setUsuario_login(String usuario_login) {
        this.usuario_login = usuario_login;
    }
    public void setClave_login(String clave_login) {
        this.clave_login = clave_login;
    }
        
}
