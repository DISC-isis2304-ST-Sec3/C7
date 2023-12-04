package uniandes.edu.co.hotelAndes.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import uniandes.edu.co.hotelAndes.modelo.TipoHabitacion;
import uniandes.edu.co.hotelAndes.modelo.Usuario;
import uniandes.edu.co.hotelAndes.repositorio.TipoHabitacionRepository;

@Controller
public class TiposHabitacionesController {

    @Autowired
    private TipoHabitacionRepository tipoHabitacionRepository;

    @GetMapping("/tiposHabitaciones")
    public String tiposHabitaciones(Model model) {
        model.addAttribute("tiposHabitaciones", tipoHabitacionRepository.darTiposHabitaciones());
        return "tiposHabitaciones";
    }

    @GetMapping("/tiposHabitaciones/new")
    public String tiposHabitacionesForm(Model model) {
        model.addAttribute("tipoHabitacion", new TipoHabitacion());
        return "tipoHabitacionNuevo";
    }

    @PostMapping("/tiposHabitaciones/new/save")
    public String tiposHabitacionesGuardar(@ModelAttribute TipoHabitacion tipoHabitacion) {

        tipoHabitacionRepository.insertarTipoHabitacion(tipoHabitacion.getTipo(), tipoHabitacion.getCapacidad(), tipoHabitacion.getDotacion());

        return "redirect:/tiposHabitaciones";
    }

    @GetMapping("/tiposHabitaciones/{id}/edit")
    public String tipoHabitacionEditarForm(@PathVariable("id") long id, Model model) {

        TipoHabitacion tipoHabitacion = tipoHabitacionRepository.darTipoHabitacion(id);
        if (tipoHabitacion != null) {
            model.addAttribute("tipoHabitacion", tipoHabitacion);
            return "tipoHabitacionEditar";
        } else {
            return "redirect:/tiposHabitaciones";
        }
    }

    @PostMapping("/tiposHabitaciones/{id}/edit/save")
    public String tipoHabitacionEditarGuardar(@PathVariable("id") long id, @ModelAttribute TipoHabitacion tipoHabitacion) {

        tipoHabitacionRepository.actualizarTipoHabitacion( id, tipoHabitacion.getTipo(),
                tipoHabitacion.getCapacidad(), tipoHabitacion.getDotacion());
        return "redirect:/tiposHabitaciones";
    }

    @GetMapping("/tiposHabitaciones/{id}/delete")
    public String tipoHabitacionBorrar(@PathVariable("id") long id) {

        tipoHabitacionRepository.eliminarTipoHabitacion(id);
        return "redirect:/tiposHabitaciones";
    }
}
