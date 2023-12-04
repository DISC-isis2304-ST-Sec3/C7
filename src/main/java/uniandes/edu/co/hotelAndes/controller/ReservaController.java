package uniandes.edu.co.hotelAndes.controller;


import org.bson.codecs.jsr310.LocalDateCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import uniandes.edu.co.hotelAndes.modelo.Reserva;
import uniandes.edu.co.hotelAndes.repositorio.ReservaRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Controller
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping("/reservas")
    public String reservas(Model model) {
        model.addAttribute("reservas", reservaRepository.findAll());
        return "reservas";
    }

    @GetMapping("/reservas/new")
    public String reservaForm(Model model) {
        return "reservaNueva";
    }

    @PostMapping("/reservas/new/save")
    public String reservasGuardar( @RequestParam("fechaIngreso") String fechaIngreso, @RequestParam("fechaSalida") String fechaSalida,
                                  @RequestParam(value = "numeroPersonas", required = true) int numeroPersonas,
                                  @RequestParam(value = "habitacion", required = true) String habitacion,
                                  @RequestParam(value = "idCliente", required = true) Integer idCliente,
                                  @RequestParam(value = "id", required = true) Integer id
                                  
                                  ) {



        reservaRepository.save(new Reserva(id, fechaIngreso,fechaSalida,numeroPersonas,habitacion,idCliente));

        return "redirect:/reservas";
    }

    @GetMapping("/reservas/{id}/edit")
    public String reservaEditarForm(@PathVariable("id") Integer id, Model model) {

        Optional<Reserva> reserva = reservaRepository.findById(id);
        if (reserva != null) {
            model.addAttribute("reserva", reserva);
            return "reservaEditar";
        } else {
            return "redirect:/reservas";
        }
    }

    @GetMapping("/reservas/{id}/delete")
    public String reservaBorrar(@PathVariable("id") Integer id,@ModelAttribute Reserva reserva) {

        reservaRepository.deletById(id);
        return "redirect:/reservas";
    }
}
