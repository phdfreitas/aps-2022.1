package com.aps.clinica.odonto.controller;

import com.aps.clinica.odonto.negocio.Fachada;
import com.aps.clinica.odonto.negocio.paciente.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PacienteController {

    @Autowired
    private Fachada fachada;

    @GetMapping("/paciente")
    public String getPacientes(Model model) {
        model.addAttribute("pacientes", fachada.getAllPacientes());
        return "paciente/pacientes";
    }

    @GetMapping("paciente/novoPaciente")
    public String novoPaciente(){
        return "paciente/paciente-cadastro";
    }

    @PostMapping("paciente/novoPaciente")
    public String novoPaciente(@ModelAttribute("paciente") Paciente paciente){

//        Paciente paciente = new Paciente(null, cpf, nome, telefone);
        fachada.novoPaciente(paciente);
        return "redirect:/paciente";
    }

    @GetMapping("paciente/atualizar/{id}")
    public String atualizarPaciente(
            @PathVariable(value = "id") Long id,
            Model model){

        Paciente paciente = fachada.existe(id);
        model.addAttribute("paciente", paciente);
        return "paciente/paciente-atualizar";
    }

    @GetMapping("paciente/excluir/{id}")
    public String exluirPaciente(@PathVariable(value = "id") Long id){
        fachada.excluirPaciente(id);
        return "redirect:/paciente";
    }

}
