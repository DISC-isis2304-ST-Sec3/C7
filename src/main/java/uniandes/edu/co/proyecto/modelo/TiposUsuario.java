package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipos_usuario")
public class TiposUsuario {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String tipo;

    public TiposUsuario(String tipo) {
        this.tipo = tipo;
    }

    public TiposUsuario() {
        ;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
