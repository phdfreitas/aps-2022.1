package com.aps.clinica.odonto.controller;

import com.aps.clinica.odonto.negocio.Fachada;
import com.aps.clinica.odonto.negocio.paciente.Paciente;
import com.aps.clinica.odonto.negocio.recepcionista.Recepcionista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.IOException;

@Controller
public class RecepcionistaController {

    @Autowired
    private Fachada fachada;

    @GetMapping("recepcionista/novoRecepcionista")
    public String novoRecepcionista(){
        return "recepcionista/recepcionista-cadastro";
    }

    @PostMapping("recepcionista/novoRecepcionista")
    public String novoRecepcionista(@ModelAttribute("recepcionista")Recepcionista recepcionista) throws IOException {

        fachada.novoRecepcionista(recepcionista);
        fachada.criarConta(recepcionista);
        //fachada.enviarCredenciais(recepcionista.getConta()); -- Comentei pra não ficar enviando email toda hora
        return "redirect:/recepcionista/novoRecepcionista";
    }
}
