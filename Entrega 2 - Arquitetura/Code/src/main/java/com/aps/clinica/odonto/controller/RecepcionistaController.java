package com.aps.clinica.odonto.controller;

import com.aps.clinica.odonto.negocio.Fachada;
import com.aps.clinica.odonto.negocio.paciente.Paciente;
import com.aps.clinica.odonto.negocio.recepcionista.Recepcionista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecepcionistaController {

    @Autowired
    private Fachada fachada;

    @GetMapping("recepcionista/novoRecepcionista")
    public String novoPaciente(){
        return "recepcionista/recepcionista-cadastro";
    }

    @PostMapping("recepcionista/novoRecepcionista")
    public String novoPaciente(@ModelAttribute("recepcionista")Recepcionista recepcionista){

        fachada.novoRecepcionista(recepcionista);
        return "redirect:/recepcionista/novoRecepcionista";
    }
}
