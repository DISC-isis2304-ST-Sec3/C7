package uniandes.edu.co.hotelAndes.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uniandes.edu.co.hotelAndes.modelo.Habitacion;
import uniandes.edu.co.hotelAndes.modelo.Servicio;
import uniandes.edu.co.hotelAndes.modelo.TipoHabitacion;
import uniandes.edu.co.hotelAndes.repositorio.HabitacionRepository;
import uniandes.edu.co.hotelAndes.repositorio.TipoHabitacionRepository;

@Controller
public class HabitacionController {
    @Autowired
    private HabitacionRepository servicioRepository;

    @Autowired
    private TipoHabitacionRepository tipoHabitacionRepository;

    @GetMapping("/habitaciones")
    public String servicios(Model model) {
        model.addAttribute("habitaciones", servicioRepository.findAll());
        return "habitaciones";
    }

    @GetMapping("/habitaciones/new")
    public String servicioForm(Model model) {
        return "habitacionesNueva";
    }

    @PostMapping("/habitaciones/new/save")
    public String serviciosGuardar( 
                                    @RequestParam(value = "numeroPersonas", required = true) Integer capacidad,
                                    @RequestParam(value = "habitacion", required = true) Integer precio,
                                    @RequestParam(value = "idCliente", required = true) String tipo,
                                    @RequestParam(value = "id", required = true) Integer id
                                  ) {
                                    TipoHabitacion tipoHab=tipoHabitacionRepository.findByTipo(tipo);



        servicioRepository.save(new Habitacion(id,capacidad,precio,new ArrayList<>(),tipoHab));

        return "redirect:/habitaciones";
    }

    @GetMapping("/habitaciones/{id}/edit")
    public String reservaEditarForm(@PathVariable("id") Integer id, Model model) {

        Optional<Habitacion> habitacion = servicioRepository.findById(id);
        if (habitacion != null) {
            model.addAttribute("habitaciones",habitacion);
            return "habitacionesEditar";
        } else {
            return "redirect:/habitaciones";
        }
    }

    @GetMapping("/habitaciones/{id}/delete")
    public String reservaBorrar(@PathVariable("id") Integer id,@ModelAttribute Servicio servicio) {

        servicioRepository.deletById(id);
        return "redirect:/habitaciones";
    }
}
