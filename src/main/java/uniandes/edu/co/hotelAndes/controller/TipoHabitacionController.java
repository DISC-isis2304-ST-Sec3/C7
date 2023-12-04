package uniandes.edu.co.hotelAndes.controller;

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
import uniandes.edu.co.hotelAndes.repositorio.ServicioRepository;
import uniandes.edu.co.hotelAndes.repositorio.TipoHabitacionRepository;

@Controller
public class TipoHabitacionController {
    
    @Autowired
    private TipoHabitacionRepository servicioRepository;

    @GetMapping("/tipoHabitaciones")
    public String servicios(Model model) {
        model.addAttribute("tipoHabitaciones", servicioRepository.findAll());
        return "tipoHabitaciones";
    }

    @GetMapping("/tipoHabitaciones/new")
    public String servicioForm(Model model) {
        return "tipoHabitacionNueva";
    }

    @PostMapping("/tipoHabitaciones/new/save")
    public String serviciosGuardar( @RequestParam("nombre") String tipo 
            
                                  ) {



        servicioRepository.save(new TipoHabitacion(tipo));

        return "redirect:/tipoHabitaciones";
    }

    @GetMapping("/tipoHabitaciones/{tipo}/edit")
    public String reservaEditarForm(@PathVariable("tipo") String tipo, Model model) {

        TipoHabitacion tipoHabitacion = servicioRepository.findByTipo(tipo);
        if (tipoHabitacion != null) {
            model.addAttribute("tipoHabitaciones",tipoHabitacion);
            return "tipoHabitacionEditar";
        } else {
            return "redirect:/tipoHabitaciones";
        }
    }

    @GetMapping("/tipoHabitaciones/{tipo}/delete")
    public String reservaBorrar(@PathVariable("tipo") String tipo,@ModelAttribute Servicio servicio) {

        servicioRepository.deleteByTipo(tipo);
        return "redirect:/tipoHabitaciones";
    }
}
