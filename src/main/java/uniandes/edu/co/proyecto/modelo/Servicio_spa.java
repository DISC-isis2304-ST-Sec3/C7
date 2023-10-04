package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "SERVICIOS_SPA")

public class Servicio_spa {
    @Id
    private Integer id_serv_spa;
    private String servicio;
    private Integer duracion;
    private Integer costo;
    
    @ManyToOne
    @JoinColumn(name = "spa_id" , referencedColumnName = "id")
    private Spa spa_id;
    
    public Servicio_spa(Integer id_serv_spa, String servicio, Integer duracion, Integer costo, Spa spa_id) {
        this.id_serv_spa = id_serv_spa;
        this.servicio = servicio;
        this.duracion = duracion;
        this.costo = costo;
        this.spa_id = spa_id;
    }
    public Servicio_spa()
    {;}
    public Integer getId_serv_spa() {
        return id_serv_spa;
    }
    public void setId_serv_spa(Integer id_serv_spa) {
        this.id_serv_spa = id_serv_spa;
    }
    public String getServicio() {
        return servicio;
    }
    public void setServicio(String servicio) {
        this.servicio = servicio;
    }
    public Integer getDuracion() {
        return duracion;
    }
    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }
    public Integer getCosto() {
        return costo;
    }
    public void setCosto(Integer costo) {
        this.costo = costo;
    }
    public Spa getSpa_id() {
        return spa_id;
    }
    public void setSpa_id(Spa spa_id) {
        this.spa_id = spa_id;
    }
    
}
