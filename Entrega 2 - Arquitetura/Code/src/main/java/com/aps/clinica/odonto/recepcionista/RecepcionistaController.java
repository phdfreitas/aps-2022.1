package com.aps.clinica.odonto.recepcionista;

import com.aps.clinica.odonto.fachada.Fachada;
import com.aps.clinica.odonto.recepcionista.negocio.Recepcionista;
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
        return "redirect:/recepcionista/novoRecepcionista";
    }
}
