package com.aps.paciente.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PacienteCollection {

    @Autowired
    private IPacienteRepository pacienteRepository;

    public void cadastrar(Paciente paciente){
        pacienteRepository.cadastrar(paciente);
    }

    public boolean existe(Long id){
        return pacienteRepository.existe(id);
    }

}
