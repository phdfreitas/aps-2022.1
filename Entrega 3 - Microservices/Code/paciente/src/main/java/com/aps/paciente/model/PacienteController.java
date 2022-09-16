package com.aps.paciente.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PacienteController {

    @Autowired
    private PacienteCollection pacienteCollection;

    public void cadastrar(PacienteDTO pacienteDTO){
        pacienteCollection.cadastrar(pacienteDTO.toEntity());
    }

    public boolean existe(Long id){
        return pacienteCollection.existe(id);
    }
}
