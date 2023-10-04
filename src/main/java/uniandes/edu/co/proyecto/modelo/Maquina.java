package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MAQUINAS")

public class Maquina {
   
    private String nombre_maquina;
    @Id
    private Integer codigo_maquina;
        
    @ManyToOne
    @JoinColumn(name = "gimnasio_id" , referencedColumnName = "id")
    private Gimnasio gimnasio_id;
    
    public Maquina(String nombre_maquina, Integer codigo_maquina, Gimnasio gimnasio_id) {
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
    public Gimnasio getGimnasio_id() {
        return gimnasio_id;
    }
    public void setNombre_maquina(String nombre_maquina) {
        this.nombre_maquina = nombre_maquina;
    }
    public void setCodigo_maquina(Integer codigo_maquina) {
        this.codigo_maquina = codigo_maquina;
    }
    public void setGimnasio_id(Gimnasio gimnasio_id) {
        this.gimnasio_id = gimnasio_id;
    }    
}
