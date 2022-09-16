package com.aps.consulta.consulta.communication;

import com.aps.consulta.consulta.model.ConsultaController;
import com.aps.consulta.consulta.model.ConsultaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consulta")
@Slf4j
public class ConsultaMVCControler {

    @Autowired
    private ConsultaController controller;

    @GetMapping("novaConsulta")
    public String novaConsulta(){
        return "cadastro-consulta";
    }

    @PostMapping("novaConsulta")
    public String novaConsulta(@ModelAttribute ConsultaDTO consultaDTO){

        controller.agendar(consultaDTO);
        return "redirect:/consulta/novaConsulta";
    }

}
