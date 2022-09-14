package com.aps.paciente.communication;

import com.aps.paciente.model.PacienteController;
import com.aps.paciente.model.PacienteDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/paciente")
@Slf4j
public class PacienteMVCController {

    @Autowired
    private PacienteController controller;


    @GetMapping("novoPaciente")
    public String novoPaciente(){
        return "cadastro";
    }

    @PostMapping("novoPaciente")
    public String novoPaciente(@ModelAttribute PacienteDTO pacienteDTO){

        controller.cadastrar(pacienteDTO);
        return "redirect:/paciente/novoPaciente";
    }

}
