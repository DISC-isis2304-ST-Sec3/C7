package uniandes.edu.co.hotelAndes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uniandes.edu.co.hotelAndes.modelo.Reserva;
import uniandes.edu.co.hotelAndes.repositorio.ReservaRepository;

import java.util.Date;

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
        model.addAttribute("reserva", new Reserva());
        return "reservaNueva";
    }

    @PostMapping("/reservas/new/save")
    public String reservasGuardar(@ModelAttribute("hora") String hora,
                                  @ModelAttribute("inicio") String inicio, @ModelAttribute("fin") String fin,
                                  @ModelAttribute Reserva reserva) {

        Date inicioDate = new Date(inicio);
        Date finDate = new Date(fin);

        reservaRepository.save(reserva);

        return "redirect:/reservas";
    }

    @GetMapping("/reservas/{id}/edit")
    public String reservaEditarForm(@PathVariable("id") Long id, Model model) {

        Reserva reserva = reservaRepository.findById(id);
        if (reserva != null) {
            model.addAttribute("reserva", reserva);
            return "reservaEditar";
        } else {
            return "redirect:/reservas";
        }
    }

    @PostMapping("/reservas/{id}/edit/save")
    public String reservaEditarGuardar(@PathVariable("id") long id,@ModelAttribute("hora") String hora,
                                       @ModelAttribute("inicio") Date inicio, @ModelAttribute("fin") Date fin,
                                       @ModelAttribute Reserva reserva) {

        reservaRepository.saveAndFlush( reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/reservas/{id}/delete")
    public String reservaBorrar(@PathVariable("id") long id,@ModelAttribute Reserva reserva) {

        reservaRepository.delete(reserva);
        return "redirect:/reservas";
    }
}
