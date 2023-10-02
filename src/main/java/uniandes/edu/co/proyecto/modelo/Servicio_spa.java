package uniandes.edu.co.proyecto.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SERVICIOS_SPA")

public class Servicio_spa {
    @Id
    private Integer id_serv_spa;
    private String servicios;
    private Integer duracion;
    private Integer costo;
    private Integer spa_id;
    
    public Servicio_spa(Integer id_serv_spa, String servicios, Integer duracion, Integer costo, Integer spa_id) {
        this.id_serv_spa = id_serv_spa;
        this.servicios = servicios;
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
    public String getServicios() {
        return servicios;
    }
    public void setServicios(String servicios) {
        this.servicios = servicios;
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
    public Integer getSpa_id() {
        return spa_id;
    }
    public void setSpa_id(Integer spa_id) {
        this.spa_id = spa_id;
    }
    
}
