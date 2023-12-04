package uniandes.edu.co.hotelAndes.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators.In;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uniandes.edu.co.hotelAndes.modelo.ReservaServicio;
import uniandes.edu.co.hotelAndes.repositorio.ReservaServicioRepository;

@Controller
public class ReservaServicioController {

    @Autowired
    private ReservaServicioRepository servicioRepository;

    @GetMapping("/reservasServicios")
    public String reservaServicios(Model model) {
        model.addAttribute("reservasServicios", servicioRepository.findAll());
        return "reservasServicios";
    }

    @GetMapping("/reservasServicios/new")
    public String reservaServicioForm(Model model) {
        return "reservasServiciosNueva";
    }

    @PostMapping("/reservasServicios/new/save")
    public String reservaServicioGuardar( @RequestParam("nombreServicio") String nombreServicio, 
                                  @RequestParam(value = "idReserva", required = true) int idReserva,
                                  @RequestParam(value = "precio", required = true) int precio
                                  
                                  ) {



        servicioRepository.save(new ReservaServicio(nombreServicio,idReserva,precio));

        return "redirect:/reservasServicios";
    }

    @GetMapping("/reservasServicios/{id}/edit")
    public String reservaServiciosEditarForm(@PathVariable("id") Integer id, Model model) {

        Optional<ReservaServicio> reservaServicio = servicioRepository.findById(id);
        if (reservaServicio != null) {
            model.addAttribute("reservasServicios", reservaServicio);
            return "reservasServiciosEditar";
        } else {
            return "redirect:/reservasServicios";
        }
    }

    @GetMapping("/reservasServicios/{id}/delete")
    public String reservaServicioBorrar(@PathVariable("id") Integer id,@ModelAttribute ReservaServicio reservaServicio) {

        servicioRepository.deletById(id);
        return "redirect:/reservasServicios";
    }
    
}
