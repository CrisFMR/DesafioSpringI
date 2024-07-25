package cl.praxis.HospitalPostPandemia.controller;

import cl.praxis.HospitalPostPandemia.HospitalPostPandemiaApplication;
import cl.praxis.HospitalPostPandemia.model.service.PacienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pacientes")
public class PacienteController {
    public static final Logger logger = LoggerFactory.getLogger(HospitalPostPandemiaApplication.class);

    PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @GetMapping()
    public String findAll(Model model){
        logger.warn("Construyendo listado de Pacientes...");
        model.addAttribute("pacientes", service.findAll());
        logger.warn("Pacientes han sido listados satisfactoriamente");
        return "PacientesList";

    }
}
