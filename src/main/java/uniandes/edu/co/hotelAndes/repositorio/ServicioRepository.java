package uniandes.edu.co.hotelAndes.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import uniandes.edu.co.hotelAndes.modelo.Reserva;
import uniandes.edu.co.hotelAndes.modelo.Servicio;

public interface ServicioRepository extends MongoRepository<Servicio,Integer>{
    
        //CREATE
    Servicio save(Servicio servicio);

    //READ
    @Query("{ 'nombre' : ?0}")
    Servicio findByName(String nombre);

    @Query("{}")
    List<Servicio> findAll(); // Consulta que retorna todas las reservas

   //DELETE
    @Query(value="{'nombre':?0}",delete = true)
    void deletByName(String nombre);

    //Update
    @Query("{ 'nombre' : ?0}")
    Servicio updateServicio(String nombre,Servicio tipoServicio);


}


