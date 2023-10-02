package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "MAQUINAS")

public class Maquina {
    @Id
    private String nombre_maquina;
    private Integer codigo_maquina;
    private Integer gimnasio_id;
    
    public Maquina(String nombre_maquina, Integer codigo_maquina, Integer gimnasio_id) {
        this.nombre_maquina = nombre_maquina;
        this.codigo_maquina = codigo_maquina;
        this.gimnasio_id = gimnasio_id;
    }
    public Maquina()
    {;}
    public String getNombre_maquina() {
        return nombre_maquina;
    }
    public Integer getCodigo_maquina() {
        return codigo_maquina;
    }
    public Integer getGimnasio_id() {
        return gimnasio_id;
    }
    public void setNombre_maquina(String nombre_maquina) {
        this.nombre_maquina = nombre_maquina;
    }
    public void setCodigo_maquina(Integer codigo_maquina) {
        this.codigo_maquina = codigo_maquina;
    }
    public void setGimnasio_id(Integer gimnasio_id) {
        this.gimnasio_id = gimnasio_id;
    }    
}
