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

import uniandes.edu.co.hotelAndes.modelo.Reserva;
import uniandes.edu.co.hotelAndes.modelo.Servicio;
import uniandes.edu.co.hotelAndes.repositorio.ServicioRepository;

@Controller
public class ServicioController {

    @Autowired
    private ServicioRepository servicioRepository;

    @GetMapping("/servicios")
    public String servicios(Model model) {
        model.addAttribute("servicios", servicioRepository.findAll());
        return "servicios";
    }

    @GetMapping("/servicios/new")
    public String servicioForm(Model model) {
        return "servicioNueva";
    }

    @PostMapping("/servicios/new/save")
    public String serviciosGuardar( @RequestParam("nombre") String nombre, 
                                  @RequestParam(value = "precio", required = true) int precio,
                                  @RequestParam(value = "descripcion", required = true) String descripcion,
                                  @RequestParam(value = "capacidad", required = true) int capacidad
                                  
                                  ) {



        servicioRepository.save(new Servicio(nombre,precio,descripcion,capacidad));

        return "redirect:/servicios";
    }

    @GetMapping("/servicios/{nombre}/edit")
    public String reservaEditarForm(@PathVariable("nombre") String nombre, Model model) {

        Servicio servicio = servicioRepository.findByName(nombre);
        if (servicio != null) {
            model.addAttribute("servicio", servicio);
            return "servicioEditar";
        } else {
            return "redirect:/servicios";
        }
    }

    @GetMapping("/servicios/{nombre}/delete")
    public String reservaBorrar(@PathVariable("nombre") String nombre,@ModelAttribute Servicio servicio) {

        servicioRepository.deletByName(nombre);
        return "redirect:/servicios";
    }
    
}
